/*******************************************************************************
 * Copyright (c) 2013 Apria Healthcare                                          *
 * As an unpublished work. All Rights Reserved.                                 *
 * This media contains an authorized copy or copies of material copyrighted by  *
 * Apria Healthcare and is the unpublished, confidential property of            *
 * Apria Healthcare. You may not disclose, copy or use any portion of           *
 * these materials for any purpose without the express written consent of Apria *
 * Healthcare.  You must reproduce this copyright notice and any other          *
 * copyright notices included in machine-readable copies on all authorized      *
 * copies.                                                                      *
 *******************************************************************************/

package com.apria.web.services.upslt.delivery.dao;

import static com.apria.web.services.common.util.CommonUtil.*;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;

import com.apria.framework.common.util.logging.ApriaLogger;
import com.apria.web.services.common.util.DataSourceConnection;
import com.apria.web.services.common.util.FileUtil;
import com.apria.web.services.upslt.delivery.vo.Delivery;
import com.apria.web.services.upslt.delivery.vo.DeliveryRequest;
import com.apria.web.services.upslt.delivery.vo.LineItem;
import com.apria.web.services.upslt.delivery.vo.Route;
import com.apria.web.services.upslt.gmtconv.GmtConversion;
import com.apria.web.services.upslt.gmtconv.GmtConversionImpl;
import com.apria.web.services.upslt.gmtconv.vo.ConversionRequest;
import com.apria.web.services.upslt.gmtconv.vo.ConversionResponse;

/**
 * Dao class to get the delviery status from the UPSLT DB.
 * 
 * @author BRANGANA
 */
public class DeliveryStatusDao {

	private static SimpleDateFormat dateFormat = new SimpleDateFormat(
		"MM/dd/yyyy");

	private static ApriaLogger logger = ApriaLogger
		.getLogger(DeliveryStatusDao.class);

	private static String getDeliveryStatusSql(DeliveryRequest request)
		throws Exception {

		String sql = FileUtil.getFileFromCache("delivery_status.sql");
		StringBuilder where = new StringBuilder();

		if (isNotEmpty(request.getBusinessUnit())) {
			where.append(" AND S.ROUTE_ID LIKE ? ");
		}

		if (isNotEmpty(request.getDriver())) {

			/* Default route date to current date if it is empty. */
			if (isEmpty(request.getRouteDateFrom())) {
				request.setRouteDateFrom(dateFormat.format(new Date()));
			}

			where.append(" AND D.REGION_ID = ? AND D.DRIVER_ID = ? ");
			where.append(" AND S.CANCELLED ='F' ");

			if (isNotEmpty(request.getStatus())) {
				if("delivered".equals(request.getStatus())) {
					where.append(" AND S.ACTUAL_DEPARTURE IS NOT NULL ");
					where.append(" AND S.UNDELIVERABLE = 'F' ");
				}
			} else {
				where.append(" AND S.ACTUAL_DEPARTURE IS NULL ");				
			}
		}

		if (isNotEmpty(request.getRouteDateFrom())) {
			where.append(" AND R.ROUTE_DATE >= to_date(?,'MM/DD/YYYY') ");
		}

		if (isNotEmpty(request.getRouteDateTo())) {
			where.append(" AND R.ROUTE_DATE <= to_date(?,'MM/DD/YYYY') ");
		}

		if (isNotEmpty(request.getWorkOrder())) {
			where.append(" AND O.ORDER_NUMBER LIKE ? ");
		}

		return sql.replace("[CONDITION]", where.toString());
	}

	private SimpleDateFormat format = new SimpleDateFormat(
		"yyyy-MM-dd HH:mm:ss");

	/**
	 * Get the delivery status for given delivery request.
	 * 
	 * @param request
	 * @return
	 * @throws Exception
	 */
	public Collection<Delivery> getDeliveryStatus(DeliveryRequest request)
		throws Exception {

		Calendar calender = Calendar.getInstance();
		logger.entry("getDeliveryStatus");
		Connection conn = null;
		PreparedStatement pst = null;
		ResultSet rs = null;
		Map<String, Delivery> deliveryMap = new LinkedHashMap<String, Delivery>();
		Map<String, Route> routeMap = new HashMap<String, Route>();
		Delivery delivery = null;
		LineItem lineItem = null;
		Route route = null;
		Collection<LineItem> lineItemList = null;
		Collection<Route> routeList = null;
		GmtConversion gmtConversion = new GmtConversionImpl();
		ConversionRequest conversionRequest = new ConversionRequest();
		conversionRequest.setBusinessUnit(request.getBusinessUnit());
		ConversionResponse conversionResponse = null;

		int x = 1;

		try {
			conn = DataSourceConnection.getConnection("upslt");
			pst = conn.prepareStatement(getDeliveryStatusSql(request));

			if (isNotEmpty(request.getBusinessUnit())) {
				pst.setString(x++, request.getBusinessUnit() + "%");
			}

			/* The driver should be in region-id format */
			String driver = request.getDriver();

			if (isNotEmpty(driver)) {
				String[] driverArr = driver.split("-");
				pst.setString(x++, driverArr[0]);
				pst.setString(x++, driverArr[1]);
			}

			if (isNotEmpty(request.getRouteDateFrom())) {
				pst.setString(x++, request.getRouteDateFrom());
			}

			if (isNotEmpty(request.getRouteDateTo())) {
				pst.setString(x++, request.getRouteDateTo());
			}

			if (isNotEmpty(request.getWorkOrder())) {
				pst.setString(x++, request.getWorkOrder() + "%");
			}

			rs = pst.executeQuery();

			while (rs.next()) {
				String workOrder = rs.getString("ORDER_NUMBER");
				delivery = deliveryMap.get(workOrder);

				String bu = rs.getString("BU");
				conversionRequest.setBusinessUnit(bu);
				conversionResponse = gmtConversion
					.getGmtOffset(conversionRequest);

				if (delivery == null) {
					delivery = new Delivery();
					routeList = new HashSet<Route>();
					delivery.setRouteList(routeList);
					deliveryMap.put(workOrder, delivery);

					delivery.setBusinessUnit(bu);
					delivery.setCity(rs.getString("CITY"));
					delivery.setAddress1(rs.getString("ADDR_LINE1"));
					delivery.setAddress2(rs.getString("ADDR_LINE2"));
					delivery.setDriverName(rs.getString("DRIVER_NAME"));
					delivery.setLatitude(rs.getString("LATITUDE"));
					delivery.setLongitude(rs.getString("LONGITUDE"));
					delivery.setPatientId(rs.getString("PATIENT_ID"));
					delivery.setPatientName(rs.getString("PATIENT_NAME"));
					delivery.setPhone(rs.getString("PHONE_NUMBER"));
					delivery.setState(rs.getString("STATE_CD"));
					delivery.setWorkOrder(workOrder);
					delivery.setZipcode(rs.getString("POSTAL_CODE"));
				} else {
					routeList = delivery.getRouteList();
				}

				lineItem = new LineItem();
				lineItem.setItemNumber(rs.getString("LINE_ITEM"));
				lineItem.setComments(rs.getString("COMMENTS"));
				lineItem.setProductCode(rs.getString("PRODUCT_CODE"));
				lineItem.setProductDesc(rs.getString("PRODUCT_DESC"));

				String key = workOrder + "_" + rs.getString("ROUTE_ID") + "_"
					+ rs.getString("INTERNAL_STOP_ID");
				route = routeMap.get(key);

				if (route == null) {
					route = new Route();
					lineItemList = new ArrayList<LineItem>();
					route.setLineItemList(lineItemList);
					route.setRouteId(rs.getString("ROUTE_ID"));
					route.setStopId(rs.getString("INTERNAL_STOP_ID"));
					route.setSequence(rs.getString("STOP_IX"));
					route.setRouteDate(rs.getString("ROUTE_DATE"));
					route.setDeliveryType(rs.getString("DELIVERY_TYPE"));
					route.setDeliveryStatus(rs.getString("DELIVERY_STATUS"));

					Date eta = rs.getTimestamp("ETA");

					if (eta != null) {
						calender.setTime(eta);
						calender.add(Calendar.HOUR_OF_DAY,
							(int) conversionResponse.getOffsetHours());
						route.setEta(format.format(calender.getTime()));
					}

					Date deliveryStart = rs
						.getTimestamp("DELIVERY_WINDOW_START_DT");

					if (deliveryStart != null) {
						calender.setTime(deliveryStart);
						calender.add(Calendar.HOUR_OF_DAY,
							(int) conversionResponse.getOffsetHours());
						String windowStart = format.format(calender.getTime());
						calender.setTime(rs
							.getTimestamp("DELIVERY_WINDOW_END_DT"));
						calender.add(Calendar.HOUR_OF_DAY,
							(int) conversionResponse.getOffsetHours());
						route.setDeliveryWindow(windowStart + " - "
							+ format.format(calender.getTime()));
					}

					Date deliveredDate = rs.getTimestamp("ACTUAL_ARRIVAL");

					if (deliveredDate != null) {
						calender.setTime(deliveredDate);
						calender.add(Calendar.HOUR_OF_DAY,
							(int) conversionResponse.getOffsetHours());
						route
							.setDeliveredDate(format.format(calender.getTime()));
					}

					routeList.add(route);
					routeMap.put(key, route);
				} else {
					lineItemList = route.getLineItemList();
				}
				lineItemList.add(lineItem);
			}
		} finally {
			DataSourceConnection.closeStmtAndConnection(pst, conn);

		}
		logger.exit("getDeliveryStatus");
		return deliveryMap.values();
	}
}
