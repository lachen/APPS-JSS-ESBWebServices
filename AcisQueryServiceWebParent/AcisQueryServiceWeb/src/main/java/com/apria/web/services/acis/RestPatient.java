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

package com.apria.web.services.acis;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import com.apria.web.services.acis.vo.request.PatientRequest;
import com.apria.web.services.acis.vo.request.PatientSearchRequest;
import com.apria.web.services.acis.vo.response.PatientResponse;
import com.apria.web.services.acis.vo.response.PatientSearchResponse;

/**
 * Class provide restful access to patient email Query services.
 * 
 * @author anil_kumar_mittur_ve
 */
@Path(value = "/patient")
public class RestPatient {

	/**
	 * Get the patient response for the given inputs. the response will be in
	 * JSON format.
	 * 
	 * @param businessUnit
	 *            to find the ACIS CPU.
	 * @param acisId
	 *            patient id in ACIS.
	 * @return PatientResponse
	 * @throws Exception
	 */
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public PatientResponse getPatientDetails(@QueryParam(value = "businessunit") String businessUnit,
			@QueryParam(value = "acisid") String acisId) throws Exception {

		PatientRequest request = new PatientRequest();
		request.setAcisId(acisId);
		request.setBusinessUnit(businessUnit);

		return new PatientServiceImpl().getPatientDetails(request);
	}

	/**
	 * Get the patient response for the given inputs. the response will be in
	 * XML format.
	 * 
	 * @param businessUnit
	 *            to find the ACIS CPU.
	 * @param acisId
	 *            patient id in ACIS.
	 * @return PatientResponse
	 * @throws Exception
	 */
	@GET
	@Path(value = "/xml")
	@Produces(MediaType.APPLICATION_XML)
	public PatientResponse getPatientDetailsXml(@QueryParam(value = "businessunit") String businessUnit,
			@QueryParam(value = "acisid") String acisId) throws Exception {

		return getPatientDetails(businessUnit, acisId);
	}

	/**
	 * Search the patient response for the given inputs. the response will be in
	 * JSON format.
	 * 
	 * @param firstName
	 * @param middleName
	 * @param lastName
	 * @param dob
	 * @param patientId
	 * @param deliveryZip
	 * @param deliveryPhone
	 * @return PatientResponse
	 * @throws Exception
	 */
	@GET
	@Path(value = "searchpatients")
	@Produces(MediaType.APPLICATION_JSON)
	public PatientSearchResponse searchPatients(@QueryParam(value = "firstName") String firstName,
			@QueryParam(value = "middleName") String middleName, @QueryParam(value = "lastName") String lastName,
			@QueryParam(value = "dob") String dob, @QueryParam(value = "patientId") String patientId,
			@QueryParam(value = "deliveryZipCode") String deliveryZipCode,
			@QueryParam(value = "deliveryPhoneNo") String deliveryPhoneNo) throws Exception {

		PatientSearchRequest request = new PatientSearchRequest(firstName, middleName, lastName, dob, patientId, deliveryZipCode,
				deliveryPhoneNo);

		return new PatientServiceImpl().searchPatients(request);
	}

	/**
	 * Get the patient response for the given inputs. the response will be in
	 * XML format.
	 * 
	 * @param businessUnit
	 *            to find the ACIS CPU.
	 * @param acisId
	 *            patient id in ACIS.
	 * @return PatientResponse
	 * @throws Exception
	 */
	@GET
	@Path(value = "searchpatients/xml")
	@Produces(MediaType.APPLICATION_XML)
	public PatientSearchResponse searchPatientsXml(@QueryParam(value = "firstName") String firstName,
			@QueryParam(value = "middleName") String middleName, @QueryParam(value = "lastName") String lastName,
			@QueryParam(value = "dob") String dob, @QueryParam(value = "patientId") String patientId,
			@QueryParam(value = "deliveryZipCode") String deliveryZipCode,
			@QueryParam(value = "deliveryPhoneNo") String deliveryPhoneNo) throws Exception {

		return searchPatients(firstName, middleName, lastName, dob, patientId, deliveryZipCode, deliveryPhoneNo);
	}

}
