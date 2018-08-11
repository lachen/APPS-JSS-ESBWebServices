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
 * Model class to represent the search request to get the delivery details.
 * 
 * @author BRANGANA
 */
public class DeliveryRequest {

	private String businessUnit;
	private String driver;
	private String routeDateFrom;
	private String routeDateTo;
	private String status;
	private String workOrder;

	/**
	 * @return the businessUnit
	 */
	public String getBusinessUnit() {

		return businessUnit;
	}

	/**
	 * @return the driver
	 */
	public String getDriver() {

		return driver;
	}

	/**
	 * @return the routeDateFrom
	 */
	public String getRouteDateFrom() {

		return routeDateFrom;
	}

	/**
	 * @return the routeDateTo
	 */
	public String getRouteDateTo() {

		return routeDateTo;
	}

	/**
	 * @return the status
	 */
	public String getStatus() {

		return status;
	}

	/**
	 * @return the workOrder
	 */
	public String getWorkOrder() {

		return workOrder;
	}

	/**
	 * @param businessUnit the businessUnit to set
	 */
	public void setBusinessUnit(String businessUnit) {

		this.businessUnit = businessUnit;
	}

	/**
	 * @param driver the driver to set
	 */
	public void setDriver(String driver) {

		this.driver = driver;
	}

	/**
	 * @param routeDateFrom the routeDateFrom to set
	 */
	public void setRouteDateFrom(String routeDateFrom) {

		this.routeDateFrom = routeDateFrom;
	}

	/**
	 * @param routeDateTo the routeDateTo to set
	 */
	public void setRouteDateTo(String routeDateTo) {

		this.routeDateTo = routeDateTo;
	}

	/**
	 * @param status the status to set
	 */
	public void setStatus(String status) {

		this.status = status;
	}

	/**
	 * @param workOrder the workOrder to set
	 */
	public void setWorkOrder(String workOrder) {

		this.workOrder = workOrder;
	}
}
