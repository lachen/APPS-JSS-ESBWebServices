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

package com.apria.web.services.upslt.delivery.vo;

/**
 * Model class to represent the Product Line Item.
 * 
 * @author BRANGANA
 */
public class LineItem {

	private String comments;
	private String itemNumber;
	private String productCode;
	private String productDesc;

	/**
	 * @return the instructions
	 */
	public String getComments() {

		return comments;
	}

	/**
	 * @return the itemNumber
	 */
	public String getItemNumber() {

		return itemNumber;
	}

	/**
	 * @return the productCode
	 */
	public String getProductCode() {

		return productCode;
	}

	/**
	 * @return the productDesc
	 */
	public String getProductDesc() {

		return productDesc;
	}

	/**
	 * @param comments the instructions to set
	 */
	public void setComments(String comments) {

		this.comments = comments;
	}

	/**
	 * @param itemNumber the itemNumber to set
	 */
	public void setItemNumber(String itemNumber) {

		this.itemNumber = itemNumber;
	}

	/**
	 * @param productCode the productCode to set
	 */
	public void setProductCode(String productCode) {

		this.productCode = productCode;
	}

	/**
	 * @param productDesc the productDesc to set
	 */
	public void setProductDesc(String productDesc) {

		this.productDesc = productDesc;
	}

}
