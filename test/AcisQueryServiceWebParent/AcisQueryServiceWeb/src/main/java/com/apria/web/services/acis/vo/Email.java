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

package com.apria.web.services.acis.vo;

/**
 * Vo class that represent email address for patient.
 * 
 * @author BRANGANA
 */
public class Email {

	private String acisId;
	private String address;
	private String effectiveDate;
	private String endDate;
	private String type;
	private String typeCode;

	/**
	 * @return the acisId
	 */
	public String getAcisId() {

		return acisId;
	}

	/**
	 * @return the address
	 */
	public String getAddress() {

		return address;
	}

	/**
	 * @return the effectiveDate
	 */
	public String getEffectiveDate() {

		return effectiveDate;
	}

	/**
	 * @return the endDate
	 */
	public String getEndDate() {

		return endDate;
	}

	/**
	 * @return the type
	 */
	public String getType() {

		return type;
	}

	/**
	 * @return the typeCode
	 */
	public String getTypeCode() {

		return typeCode;
	}

	/**
	 * @param acisId the acisId to set
	 */
	public void setAcisId(String acisId) {

		this.acisId = acisId;
	}

	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {

		this.address = address;
	}

	/**
	 * @param effectiveDate the effectiveDate to set
	 */
	public void setEffectiveDate(String effectiveDate) {

		this.effectiveDate = effectiveDate;
	}

	/**
	 * @param endDate the endDate to set
	 */
	public void setEndDate(String endDate) {

		this.endDate = endDate;
	}

	/**
	 * @param type the type to set
	 */
	public void setType(String type) {

		this.type = type;
	}

	/**
	 * @param typeCode the typeCode to set
	 */
	public void setTypeCode(String typeCode) {

		this.typeCode = typeCode;
	}

}
