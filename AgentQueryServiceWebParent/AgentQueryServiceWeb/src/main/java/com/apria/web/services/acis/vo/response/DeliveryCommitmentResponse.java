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

package com.apria.web.services.acis.vo.response;

import java.util.Collection;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

import com.apria.web.services.acis.vo.DeliveryCommitment;

/**
 * Model class to represent the Agent Delivery Commitment Response.
 * 
 * @author BRANGANA
 */
@XmlRootElement
public class DeliveryCommitmentResponse {

	private int count;
	private Collection<DeliveryCommitment> deliveryCommitmentList;

	public DeliveryCommitmentResponse() {

	}

	public DeliveryCommitmentResponse(
		Collection<DeliveryCommitment> deliveryCommitmentList) {

		this.deliveryCommitmentList = deliveryCommitmentList;

		if (deliveryCommitmentList != null) {
			this.count = deliveryCommitmentList.size();
		}
	}

	/**
	 * @return the count
	 */
	public int getCount() {

		return count;
	}

	/**
	 * @return the deliveryCommitmentList
	 */
	@XmlElementWrapper(name = "deliveryCommitmentList")
	@XmlElement(name = "deliveryCommitment")
	public Collection<DeliveryCommitment> getDeliveryCommitmentList() {

		return deliveryCommitmentList;
	}

	/**
	 * @param count the count to set
	 */
	public void setCount(int count) {

		this.count = count;
	}

	/**
	 * @param deliveryCommitmentList the deliveryCommitmentList to set
	 */
	public void setDeliveryCommitmentList(
		Collection<DeliveryCommitment> deliveryCommitmentList) {

		this.deliveryCommitmentList = deliveryCommitmentList;
	}
}
