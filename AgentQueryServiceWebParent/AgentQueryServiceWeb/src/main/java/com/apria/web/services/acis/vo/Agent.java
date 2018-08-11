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

import java.util.Collection;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;

/**
 * Model class to represent the Agent (Referral/Physician) from ACIS.
 * 
 * @author BRANGANA
 */
public class Agent {

	private String acisId;
	private String attributeFlag = "N";
	private Collection<Attribute> attributeList;
	private String contactPreferenceFlag = "N";
	private Collection<ContactPreference> contactPreferenceList;
	private String deliveryCommitmentFlag = "N";
	private Collection<DeliveryCommitment> deliveryCommitmentList;
	private String firstName;
	private String lastName;
	private String productPreferenceFlag = "N";
	private Collection<ProductPreference> productPreferenceList;

	/**
	 * @return the acisId
	 */
	public String getAcisId() {

		return acisId;
	}

	/**
	 * @return the attributeFlag
	 */
	public String getAttributeFlag() {

		return attributeFlag;
	}

	/**
	 * @return the attributeList
	 */
	@XmlElementWrapper(name = "attributeList")
	@XmlElement(name = "attribute")
	public Collection<Attribute> getAttributeList() {

		return attributeList;
	}

	/**
	 * @return the contactPreferenceFlag
	 */
	public String getContactPreferenceFlag() {

		return contactPreferenceFlag;
	}

	/**
	 * @return the contactPreferenceList
	 */
	@XmlElementWrapper(name = "contactPreferenceList")
	@XmlElement(name = "contactPreference")
	public Collection<ContactPreference> getContactPreferenceList() {

		return contactPreferenceList;
	}

	/**
	 * @return the deliveryCommitmentFlag
	 */
	public String getDeliveryCommitmentFlag() {

		return deliveryCommitmentFlag;
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
	 * @return the firstName
	 */
	public String getFirstName() {

		return firstName;
	}

	/**
	 * @return the lastName
	 */
	public String getLastName() {

		return lastName;
	}

	/**
	 * @return the productPreferenceFlag
	 */
	public String getProductPreferenceFlag() {

		return productPreferenceFlag;
	}

	/**
	 * @return the productPreferenceList
	 */
	@XmlElementWrapper(name = "productPreferenceList")
	@XmlElement(name = "productPreference")
	public Collection<ProductPreference> getProductPreferenceList() {

		return productPreferenceList;
	}

	/**
	 * @param acisId the acisId to set
	 */
	public void setAcisId(String acisId) {

		this.acisId = acisId;
	}

	/**
	 * @param attributeFlag the attributeFlag to set
	 */
	public void setAttributeFlag(String attributeFlag) {

		this.attributeFlag = attributeFlag;
	}

	/**
	 * @param attributeList the attributeList to set
	 */
	public void setAttributeList(Collection<Attribute> attributeList) {

		this.attributeList = attributeList;
	}

	/**
	 * @param contactPreferenceFlag the contactPreferenceFlag to set
	 */
	public void setContactPreferenceFlag(String contactPreferenceFlag) {

		this.contactPreferenceFlag = contactPreferenceFlag;
	}

	/**
	 * @param contactPreferenceList the contactPreferenceList to set
	 */
	public void setContactPreferenceList(
		Collection<ContactPreference> contactPreferenceList) {

		this.contactPreferenceList = contactPreferenceList;
	}

	/**
	 * @param deliveryCommitmentFlag the deliveryCommitmentFlag to set
	 */
	public void setDeliveryCommitmentFlag(String deliveryCommitmentFlag) {

		this.deliveryCommitmentFlag = deliveryCommitmentFlag;
	}

	/**
	 * @param deliveryCommitmentList the deliveryCommitmentList to set
	 */
	public void setDeliveryCommitmentList(
		Collection<DeliveryCommitment> deliveryCommitmentList) {

		this.deliveryCommitmentList = deliveryCommitmentList;
	}

	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {

		this.firstName = firstName;
	}

	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {

		this.lastName = lastName;
	}

	/**
	 * @param productPreferenceFlag the productPreferenceFlag to set
	 */
	public void setProductPreferenceFlag(String productPreferenceFlag) {

		this.productPreferenceFlag = productPreferenceFlag;
	}

	/**
	 * @param productPreferenceList the productPreferenceList to set
	 */
	public void setProductPreferenceList(
		Collection<ProductPreference> productPreferenceList) {

		this.productPreferenceList = productPreferenceList;
	}

}
