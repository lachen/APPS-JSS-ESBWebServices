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
 * Model Class to represent Attributes for an Agent.
 * 
 * @author BRANGANA
 */
public class Attribute {

	private String agentId;
	private String code;
	private String description;
	private String effectiveDate;
	private String endDate;

	/**
	 * @return the agentId
	 */
	public String getAgentId() {

		return agentId;
	}

	/**
	 * @return the code
	 */
	public String getCode() {

		return code;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {

		return description;
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
	 * @param agentId the agentId to set
	 */
	public void setAgentId(String agentId) {

		this.agentId = agentId;
	}

	/**
	 * @param code the code to set
	 */
	public void setCode(String code) {

		this.code = code;
	}

	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {

		this.description = description;
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

}
