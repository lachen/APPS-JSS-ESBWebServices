package com.apria.web.services.upslt.delivery.dao;

import static com.apria.web.services.common.util.CommonUtil.isNotEmpty;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.TimeZone;

import com.apria.framework.common.util.logging.ApriaLogger;
import com.apria.web.services.common.util.DataSourceConnection;
import com.apria.web.services.common.util.FileUtil;
import com.apria.web.services.upslt.delivery.vo.PatientWorkOrdersETAResponse;
import com.apria.web.services.upslt.delivery.vo.WorkOrderETA;
import com.apria.web.services.upslt.delivery.vo.WorkOrderETARequest;
import com.apria.web.services.upslt.delivery.vo.WorkOrderETAResponse;

public class WorkOrderETADao {
	private static ApriaLogger logger = ApriaLogger.getLogger(WorkOrderETADao.class);

	private static String TIME_FORMAT = "HH:mm:ss";

	private String getWorkOrderETASql(WorkOrderETARequest request) throws Exception {
		String sql = FileUtil.getFileFromCache("workorder_eta.sql");
		StringBuilder where = new StringBuilder();

		where.append(" AND S.LOCATION_ID = ? ");

		if (isNotEmpty(request.getWorkOrderNumber())) {
			where.append(" AND O.ORDER_NUMBER LIKE ? ");
		}
		
		if (isNotEmpty(request.getZipCode())) {
			where.append(" AND L.POSTAL_CODE LIKE ? ");
		}

		return sql.replace("[CONDITION]", where.toString());
	}

	public WorkOrderETAResponse getWorkOrderETA(WorkOrderETARequest request) throws Exception {
		Connection conn = null;
		PreparedStatement pst = null;
		ResultSet rs = null;
		WorkOrderETAResponse response = null;
		logger.entry("getWorkOrderETA");
		try {
			conn = DataSourceConnection.getConnection("upslt");
			pst = conn.prepareStatement(getWorkOrderETASql(request));

			pst.setString(1, request.getCpu() + "-" + request.getPatientId());
			if (isNotEmpty(request.getWorkOrderNumber())) {
				pst.setString(2, request.getWorkOrderNumber() + "%");
			}

			rs = pst.executeQuery();
			while (rs.next()) {
				response = new WorkOrderETAResponse();
				SimpleDateFormat format = new SimpleDateFormat(TIME_FORMAT);
				String timeZone = rs.getString("TIME_ZONE");
				format.setTimeZone(TimeZone.getTimeZone(timeZone));
				Calendar cal = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
				if (rs.getTimestamp("TW1_CLOSE_TIME") != null) {
					response.setCommitmentEndTime(format.format(rs.getTimestamp("TW1_CLOSE_TIME", cal)));
				}
				if (rs.getTimestamp("TW1_OPEN_TIME") != null) {
					response.setCommitmentStartTime(format.format(rs.getTimestamp("TW1_OPEN_TIME", cal)));
				}
				if (rs.getTimestamp("PROJECTED_ARRIVAL") != null) {
					response.setDeliveryTime(format.format(rs.getTimestamp("PROJECTED_ARRIVAL", cal)));
				}
				response.setStatus("S");
				response.setTimeZone(rs.getString("TIME_ZONE").replaceAll("US/", ""));
				break;
			}
		} finally {
			DataSourceConnection.closeStmtAndConnection(pst, conn);
		}
		logger.exit("getWorkOrderETA");
		return response;
	}

	public PatientWorkOrdersETAResponse getPatientWorkOrdersETA(WorkOrderETARequest request) throws Exception {
		Connection conn = null;
		PreparedStatement pst = null;
		ResultSet rs = null;
		PatientWorkOrdersETAResponse response = new PatientWorkOrdersETAResponse();
		logger.entry("getPatientWorkOrdersETA");
		try {
			conn = DataSourceConnection.getConnection("upslt");
			pst = conn.prepareStatement(getWorkOrderETASql(request));

			pst.setString(1, request.getCpu() + "-" + request.getPatientId());
			if (isNotEmpty(request.getZipCode())) {
				pst.setString(2, request.getZipCode() + "%");
			}

			rs = pst.executeQuery();
			response.setWorkOrderETAList(new ArrayList<WorkOrderETA>());
			while (rs.next()) {
				WorkOrderETA eta = new WorkOrderETA();
				SimpleDateFormat format = new SimpleDateFormat(TIME_FORMAT);
				String timeZone = rs.getString("TIME_ZONE");
				format.setTimeZone(TimeZone.getTimeZone(timeZone));
				Calendar cal = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
				if (rs.getTimestamp("TW1_CLOSE_TIME") != null) {
					eta.setCommitmentEndTime(format.format(rs.getTimestamp("TW1_CLOSE_TIME", cal)));
				}
				if (rs.getTimestamp("TW1_OPEN_TIME") != null) {
					eta.setCommitmentStartTime(format.format(rs.getTimestamp("TW1_OPEN_TIME", cal)));
				}
				if (rs.getTimestamp("PROJECTED_ARRIVAL") != null) {
					eta.setDeliveryTime(format.format(rs.getTimestamp("PROJECTED_ARRIVAL", cal)));
				}
				eta.setTimeZone(rs.getString("TIME_ZONE").replaceAll("US/", ""));
				eta.setWorkOrderNumber(rs.getString("ORDER_NUMBER"));
				response.getWorkOrderETAList().add(eta);
			}
		} finally {
			DataSourceConnection.closeStmtAndConnection(pst, conn);
		}
		logger.exit("getPatientWorkOrdersETA");
		return response;
	}

}
