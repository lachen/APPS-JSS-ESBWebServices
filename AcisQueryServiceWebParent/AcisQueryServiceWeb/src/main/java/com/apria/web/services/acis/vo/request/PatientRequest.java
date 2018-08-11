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

package com.apria.web.services.acis.vo.request;

/**
 * Request class to get the patient details.
 * 
 * @author anil_kumar_mittur_ve
 */
public class PatientRequest {

	private String acisId;
	private String businessUnit;

	/**
	 * @return the acisId
	 */
	public String getAcisId() {

		return acisId;
	}

	/**
	 * @return the businessUnit
	 */
	public String getBusinessUnit() {

		return businessUnit;
	}

	/**
	 * @param acisId
	 *            the acisId to set
	 */
	public void setAcisId(String acisId) {

		this.acisId = acisId;
	}

	/**
	 * @param businessUnit
	 *            the businessUnit to set
	 */
	public void setBusinessUnit(String businessUnit) {

		this.businessUnit = businessUnit;
	}

}
