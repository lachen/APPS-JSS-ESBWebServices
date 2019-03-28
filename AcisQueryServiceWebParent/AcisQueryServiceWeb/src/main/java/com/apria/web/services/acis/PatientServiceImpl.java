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

import com.apria.framework.common.util.logging.ApriaLogger;
import com.apria.web.services.acis.dao.PatientDao;
import com.apria.web.services.acis.vo.request.PatientRequest;
import com.apria.web.services.acis.vo.request.PatientSearchRequest;
import com.apria.web.services.acis.vo.response.PatientResponse;
import com.apria.web.services.acis.vo.response.PatientSearchResponse;
import com.apria.web.services.common.ServiceStatus;

/**
 * Implementation class for the EmailService interface.
 * 
 * @author BRANGANA
 */
public class PatientServiceImpl implements PatientService {

	private static ApriaLogger logger = ApriaLogger.getLogger(PatientServiceImpl.class);
	private ServiceStatus serviceStatus = new ServiceStatusImpl();

	@Override
	public PatientResponse getPatientDetails(PatientRequest request) throws Exception {

		PatientResponse response = null;

		try {
			response = new PatientDao().getPatientDetails(request);
		} catch (Exception e) {
			logger.error("Error in getPatientDetails", e);
			throw e;
		}

		return response;
	}

	@Override
	public PatientSearchResponse searchPatients(PatientSearchRequest request) throws Exception {

		PatientSearchResponse response = null;

		try {
			response = new PatientSearchResponse(new PatientDao().searchPatients(request));
			response.setStatusCode("SUCCESS");
		} catch (Exception e) {
			logger.error("Error in getPatientDetails", e);
			if ("CPU not found for the given Zip.".equals(e.getMessage())) {
				response = new PatientSearchResponse();
				response.setStatusCode("INVALIDZIP");
			} else {
				throw e;
			}
		}

		return response;
	}

	@Override
	public String getStatusMessage() {

		return serviceStatus.getStatusMessage();
	}

	@Override
	public String isServiceActive() {
		return serviceStatus.isServiceActive();
	}

	@Override
	public String setServiceStatus(boolean active) {
		return serviceStatus.setServiceStatus(active);
	}
}
