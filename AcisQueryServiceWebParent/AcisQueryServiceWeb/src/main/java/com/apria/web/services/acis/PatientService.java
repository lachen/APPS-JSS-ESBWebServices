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

import com.apria.web.services.acis.vo.request.PatientRequest;
import com.apria.web.services.acis.vo.request.PatientSearchRequest;
import com.apria.web.services.acis.vo.response.PatientResponse;
import com.apria.web.services.acis.vo.response.PatientSearchResponse;
import com.apria.web.services.common.ServiceStatus;

/**
 * Service that defines the patient search.
 * 
 * @author anil_kumar_mittur_ve
 */
public interface PatientService extends ServiceStatus {

	/**
	 * Get the patient details for the given patient id.
	 * 
	 * @param request PatientRequest
	 * @return PatientResponse
	 * @throws Exception
	 */
	PatientResponse getPatientDetails(PatientRequest request) throws Exception;
	
	/**
	 * Search the patient details for the given patient search params.
	 * 
	 * @param request PatientSearchRequest
	 * @return PatientSearchResponse
	 * @throws Exception
	 */
	PatientSearchResponse searchPatients(PatientSearchRequest request) throws Exception;
}
