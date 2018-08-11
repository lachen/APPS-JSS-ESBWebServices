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

package com.apria.web.services.upslt.delivery;

import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.apria.web.services.upslt.delivery.vo.DeliveryRequest;
import com.apria.web.services.upslt.delivery.vo.DeliveryResponse;

/**
 * Class to add restful methods to DeliveryStatus service interface.
 * 
 * @author BRANGANA
 */
@Path(value = "/deliverylist")
public class RestDeliveryStatus {

	public RestDeliveryStatus() {
		
	}
	
	/**
	 * Get the delivery status for the given request.
	 * 
	 * @param businessUnit
	 * @param fromDate
	 * @param toDate
	 * @param patientId
	 * @param workOrder
	 * @return
	 * @throws Exception
	 */
	@GET
	@Path("businessunit/{businessunit}/workorder/{workorder}/fromdate/{fromdate}/todate/{todate}/driver/{driver}/status/{status}")
	@Produces(MediaType.APPLICATION_JSON)
	public DeliveryResponse getDeliveryStatus(
		@PathParam(value = "businessunit") String businessUnit,
		@PathParam(value = "fromdate") String fromDate,
		@PathParam(value = "todate") String toDate,
		@PathParam(value = "workorder") String workOrder,
		@PathParam(value = "driver") String driver,
		@PathParam(value = "status") String status) throws Exception {

		DeliveryStatus service = new DeliveryStatusImpl();
		DeliveryRequest request = new DeliveryRequest();

		if (fromDate != null) {
			fromDate = fromDate.replaceAll(":", "/");
			request.setRouteDateFrom(fromDate);
		}

		if (toDate != null) {
			toDate = toDate.replaceAll(":", "/");
			request.setRouteDateTo(toDate);
		}

		request.setWorkOrder(workOrder);
		request.setBusinessUnit(businessUnit);
		request.setDriver(driver);
		request.setStatus(status);

		return service.getDeliveryStatus(request);
	}

	/**
	 * Get the delivery status for the given request.
	 * 
	 * @param businessUnit
	 * @param fromDate
	 * @param toDate
	 * @param patientId
	 * @param workOrder
	 * @return
	 * @throws Exception
	 */
	@GET
	@Path(value = "/xml")
	@Produces(MediaType.APPLICATION_XML)
	public DeliveryResponse getDeliveryStatusXml(
		@QueryParam(value = "businessunit") String businessUnit,
		@QueryParam(value = "fromdate") String fromDate,
		@QueryParam(value = "todate") String toDate,
		@QueryParam(value = "workorder") String workOrder,
		@QueryParam(value = "driver") String driver,
		@QueryParam(value = "status") String status) throws Exception {

		return getDeliveryStatus(businessUnit, fromDate, toDate, workOrder,
			driver, status);
	}

	@GET
	@Path(value = "/statusmessage")
	@Produces(MediaType.TEXT_PLAIN)
	public String getStatusMessage() {

		DeliveryStatus service = new DeliveryStatusImpl();
		return service.getStatusMessage();
	}

	@GET
	@Path(value = "/status")
	@Produces(MediaType.TEXT_PLAIN)
	public String isServiceActive(@Context final HttpServletResponse response) {

		DeliveryStatus service = new DeliveryStatusImpl();
		String status = service.isServiceActive();

		if ("OFF".equals(status)) {
			response.setStatus(Response.Status.NOT_FOUND.getStatusCode());
		}

		return status;
	}

	@GET
	@Path(value = "/status/{status}")
	@Produces(MediaType.TEXT_PLAIN)
	public String setServiceStatus(@PathParam(value = "status") String active) {

		DeliveryStatus service = new DeliveryStatusImpl();

		boolean status = false;
		if ("true".equalsIgnoreCase(active)) {
			status = true;
		}
		return service.setServiceStatus(status);
	}

}
