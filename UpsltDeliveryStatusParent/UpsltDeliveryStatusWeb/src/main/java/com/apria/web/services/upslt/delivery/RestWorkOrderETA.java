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

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import com.apria.web.services.upslt.delivery.vo.PatientWorkOrdersETAResponse;
import com.apria.web.services.upslt.delivery.vo.WorkOrderETARequest;
import com.apria.web.services.upslt.delivery.vo.WorkOrderETAResponse;

/**
 * Class to add restful methods to DeliveryStatus service interface.
 * 
 * @author Anil_Kumar_Mittur_Ve 
 */
@Path(value = "/workordereta")
public class RestWorkOrderETA {

	public RestWorkOrderETA() {
		
	}
	
	/**
	 * Get the delivery status for the given request.
	 * 
	 * @param cpu
	 * @param businessUnit
	 * @param patientId
	 * @param workOrderNumber
	 * @return
	 * @throws Exception
	 */
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public WorkOrderETAResponse getWorkOrderETA(
		@QueryParam(value = "cpu") String cpu,
		@QueryParam(value = "businessunit") String businessUnit,
		@QueryParam(value = "patientId") String patientId,
		@QueryParam(value = "workOrderNumber") String workOrderNumber) throws Exception {

		WorkOrderETAServiceImpl service = new WorkOrderETAServiceImpl();
		WorkOrderETARequest request = new WorkOrderETARequest();

		request.setCpu(cpu);
		request.setBusinessUnit(businessUnit);
		request.setPatientId(patientId);
		request.setWorkOrderNumber(workOrderNumber);

		return service.getWorkOrderETA(request);
	}

	/**
	 * Get the delivery status for the given request.
	 * 
	 * @param cpu
	 * @param businessUnit
	 * @param patientId
	 * @param workOrderNumber
	 * @return
	 * @throws Exception
	 */
	@GET
	@Path(value = "/xml")
	@Produces(MediaType.APPLICATION_XML)
	public WorkOrderETAResponse getWorkOrderETAXml(
			@QueryParam(value = "cpu") String cpu,
			@QueryParam(value = "businessunit") String businessUnit,
			@QueryParam(value = "patientId") String patientId,
			@QueryParam(value = "workOrderNumber") String workOrderNumber) throws Exception {

		return getWorkOrderETA(cpu, businessUnit, patientId, workOrderNumber);
	}

	/**
	 * Get the delivery status for the given request.
	 * 
	 * @param cpu
	 * @param businessUnit
	 * @param patientId
	 * @return
	 * @throws Exception
	 */
	@GET
	@Path(value = "getpatientworkorderseta")
	@Produces(MediaType.APPLICATION_JSON)
	public PatientWorkOrdersETAResponse getPatientWorkOrdersETA(
		@QueryParam(value = "cpu") String cpu,
		@QueryParam(value = "businessunit") String businessUnit,
		@QueryParam(value = "patientId") String patientId,
		@QueryParam(value = "zipCode") String zipCode) throws Exception {

		WorkOrderETAServiceImpl service = new WorkOrderETAServiceImpl();
		WorkOrderETARequest request = new WorkOrderETARequest();

		request.setCpu(cpu);
		request.setBusinessUnit(businessUnit);
		request.setPatientId(patientId);
		request.setZipCode(zipCode);

		return service.getPatientWorkOrdersETA(request);
	}

	/**
	 * Get the delivery status for the given request.
	 * 
	 * @param cpu
	 * @param businessUnit
	 * @param patientId
	 * @param workOrderNumber
	 * @return
	 * @throws Exception
	 */
	@GET
	@Path(value = "getpatientworkorderseta/xml")
	@Produces(MediaType.APPLICATION_XML)
	public PatientWorkOrdersETAResponse getPatientWorkOrdersETAXml(
			@QueryParam(value = "cpu") String cpu,
			@QueryParam(value = "businessunit") String businessUnit,
			@QueryParam(value = "patientId") String patientId,
			@QueryParam(value = "zipCode") String zipCode) throws Exception {

		return getPatientWorkOrdersETA(cpu, businessUnit, patientId, zipCode);
	}

}
