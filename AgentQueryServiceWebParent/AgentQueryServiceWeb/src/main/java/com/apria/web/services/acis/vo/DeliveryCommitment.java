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
 * Model Class to represent Delivery Commitment for an Agent.
 * 
 * @author BRANGANA
 */
public class DeliveryCommitment {

	private String agentId;
	private String commitment;
	private String effectiveDate;
	private String endDate;
	private String notes;
	private String numberOfDays;
	private String opsClass;
	private String productCategory;

	/**
	 * @return the agentId
	 */
	public String getAgentId() {

		return agentId;
	}

	/**
	 * @return the commitment
	 */
	public String getCommitment() {

		return commitment;
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
	 * @return the notes
	 */
	public String getNotes() {

		return notes;
	}

	/**
	 * @return the numberOfDays
	 */
	public String getNumberOfDays() {

		return numberOfDays;
	}

	/**
	 * @return the opsClass
	 */
	public String getOpsClass() {

		return opsClass;
	}

	/**
	 * @return the productCategory
	 */
	public String getProductCategory() {

		return productCategory;
	}

	/**
	 * @param agentId the agentId to set
	 */
	public void setAgentId(String agentId) {

		this.agentId = agentId;
	}

	/**
	 * @param commitment the commitment to set
	 */
	public void setCommitment(String commitment) {

		this.commitment = commitment;
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
	 * @param notes the notes to set
	 */
	public void setNotes(String notes) {

		this.notes = notes;
	}

	/**
	 * @param numberOfDays the numberOfDays to set
	 */
	public void setNumberOfDays(String numberOfDays) {

		this.numberOfDays = numberOfDays;
	}

	/**
	 * @param opsClass the opsClass to set
	 */
	public void setOpsClass(String opsClass) {

		this.opsClass = opsClass;
	}

	/**
	 * @param productCategory the productCategory to set
	 */
	public void setProductCategory(String productCategory) {

		this.productCategory = productCategory;
	}

}
