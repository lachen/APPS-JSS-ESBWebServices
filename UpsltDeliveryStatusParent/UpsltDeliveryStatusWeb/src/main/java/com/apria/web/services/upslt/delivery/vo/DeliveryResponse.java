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

import java.util.Collection;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Model class to represent the search response for the delivery status.
 * 
 * @author BRANGANA
 */
@XmlRootElement
public class DeliveryResponse {

	private int deliveryCount;
	private Collection<Delivery> deliveryList;

	/**
	 * @return the deliveryCount
	 */
	public int getDeliveryCount() {

		return deliveryCount;
	}

	/**
	 * @return the deliverList
	 */
	@XmlElementWrapper(name = "deliveryList")
	@XmlElement(name = "delivery")
	public Collection<Delivery> getDeliveryList() {

		return deliveryList;
	}

	/**
	 * @param deliveryCount the deliveryCount to set
	 */
	public void setDeliveryCount(int deliveryCount) {

		this.deliveryCount = deliveryCount;
	}

	/**
	 * @param deliveryList the deliveryList to set
	 */
	public void setDeliveryList(Collection<Delivery> deliveryList) {

		this.deliveryList = deliveryList;
	}

}
