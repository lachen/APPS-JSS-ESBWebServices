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
 * Model class to represent the Patient from ACIS.
 * 
 * @author BRANGANA
 */
public class Patient {

	private String arBalance;
	private Address billingAddress;
	private String businessUnit;
	private Address deliveryAddress;
	private String dob;
	private String emergencyContact;
	private String emergencyContactPhone;
	private String firstName;
	private String height;
	private String lastName;
	private String middleName;
	private String patientId;
	private Address permanentAddress;
	private Address primaryAddress;
	private String ssn;
	private String weight;
	private String cpu;

	/**
	 * @return the arBalance
	 */
	public String getArBalance() {

		return arBalance;
	}

	/**
	 * @return the billingAddress
	 */
	public Address getBillingAddress() {

		return billingAddress;
	}

	/**
	 * @return the businessUnit
	 */
	public String getBusinessUnit() {

		return businessUnit;
	}

	/**
	 * @return the deliveryAddress
	 */
	public Address getDeliveryAddress() {

		return deliveryAddress;
	}

	/**
	 * @return the dob
	 */
	public String getDob() {

		return dob;
	}

	/**
	 * @return the emergencyContact
	 */
	public String getEmergencyContact() {

		return emergencyContact;
	}

	/**
	 * @return the emergencyContactPhone
	 */
	public String getEmergencyContactPhone() {

		return emergencyContactPhone;
	}

	/**
	 * @return the firstName
	 */
	public String getFirstName() {

		return firstName;
	}

	/**
	 * @return the height
	 */
	public String getHeight() {

		return height;
	}

	/**
	 * @return the lastName
	 */
	public String getLastName() {

		return lastName;
	}

	/**
	 * @return the middleName
	 */
	public String getMiddleName() {

		return middleName;
	}

	/**
	 * @return the patientId
	 */
	public String getPatientId() {

		return patientId;
	}

	/**
	 * @return the permanentAddress
	 */
	public Address getPermanentAddress() {

		return permanentAddress;
	}

	/**
	 * @return the primaryAddress
	 */
	public Address getPrimaryAddress() {

		return primaryAddress;
	}

	/**
	 * @return the ssn
	 */
	public String getSsn() {

		return ssn;
	}

	/**
	 * @return the weight
	 */
	public String getWeight() {

		return weight;
	}

	/**
	 * @param arBalance the arBalance to set
	 */
	public void setArBalance(String arBalance) {

		this.arBalance = arBalance;
	}

	/**
	 * @param billingAddress the billingAddress to set
	 */
	public void setBillingAddress(Address billingAddress) {

		this.billingAddress = billingAddress;
	}

	/**
	 * @param businessUnit the businessUnit to set
	 */
	public void setBusinessUnit(String businessUnit) {

		this.businessUnit = businessUnit;
	}

	/**
	 * @param deliveryAddress the deliveryAddress to set
	 */
	public void setDeliveryAddress(Address deliveryAddress) {

		this.deliveryAddress = deliveryAddress;
	}

	/**
	 * @param dob the dob to set
	 */
	public void setDob(String dob) {

		this.dob = dob;
	}

	/**
	 * @param emergencyContact the emergencyContact to set
	 */
	public void setEmergencyContact(String emergencyContact) {

		this.emergencyContact = emergencyContact;
	}

	/**
	 * @param emergencyContactPhone the emergencyContactPhone to set
	 */
	public void setEmergencyContactPhone(String emergencyContactPhone) {

		this.emergencyContactPhone = emergencyContactPhone;
	}

	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {

		this.firstName = firstName;
	}

	/**
	 * @param height the height to set
	 */
	public void setHeight(String height) {

		this.height = height;
	}

	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {

		this.lastName = lastName;
	}

	/**
	 * @param middleName the middleName to set
	 */
	public void setMiddleName(String middleName) {

		this.middleName = middleName;
	}

	/**
	 * @param patientId the patientId to set
	 */
	public void setPatientId(String patientId) {

		this.patientId = patientId;
	}

	/**
	 * @param permanentAddress the permanentAddress to set
	 */
	public void setPermanentAddress(Address permanentAddress) {

		this.permanentAddress = permanentAddress;
	}

	/**
	 * @param primaryAddress the primaryAddress to set
	 */
	public void setPrimaryAddress(Address primaryAddress) {

		this.primaryAddress = primaryAddress;
	}

	/**
	 * @param ssn the ssn to set
	 */
	public void setSsn(String ssn) {

		this.ssn = ssn;
	}

	/**
	 * @param weight the weight to set
	 */
	public void setWeight(String weight) {

		this.weight = weight;
	}

	/**
	 * @param cpu the cpu to set
	 */
	public void setCpu(String cpu) {
		this.cpu = cpu;
	}

	/**
	 * @return the cpu
	 */
	public String getCpu() {
		return cpu;
	}

}
