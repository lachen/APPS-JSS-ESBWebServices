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
 * Model Class to represent product preferences for an Agent.
 * 
 * @author BRANGANA
 */
public class ProductPreference {

	private String agentId;
	private String effectiveDate;
	private String endDate;
	private String model;
	private String notes;
	private String opsClass;
	private String product;
	private String vendor;

	/**
	 * @return the agentId
	 */
	public String getAgentId() {

		return agentId;
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
	 * @return the model
	 */
	public String getModel() {

		return model;
	}

	/**
	 * @return the notes
	 */
	public String getNotes() {

		return notes;
	}

	/**
	 * @return the opsClass
	 */
	public String getOpsClass() {

		return opsClass;
	}

	/**
	 * @return the product
	 */
	public String getProduct() {

		return product;
	}

	/**
	 * @return the vendor
	 */
	public String getVendor() {

		return vendor;
	}

	/**
	 * @param agentId the agentId to set
	 */
	public void setAgentId(String agentId) {

		this.agentId = agentId;
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
	 * @param model the model to set
	 */
	public void setModel(String model) {

		this.model = model;
	}

	/**
	 * @param notes the notes to set
	 */
	public void setNotes(String notes) {

		this.notes = notes;
	}

	/**
	 * @param opsClass the opsClass to set
	 */
	public void setOpsClass(String opsClass) {

		this.opsClass = opsClass;
	}

	/**
	 * @param product the product to set
	 */
	public void setProduct(String product) {

		this.product = product;
	}

	/**
	 * @param vendor the vendor to set
	 */
	public void setVendor(String vendor) {

		this.vendor = vendor;
	}

}
