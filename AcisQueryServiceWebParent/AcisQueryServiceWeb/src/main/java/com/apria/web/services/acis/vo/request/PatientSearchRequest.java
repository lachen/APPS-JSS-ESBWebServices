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

package com.apria.web.services.acis.vo.request;

/**
 * Request class to get the patient details.
 * 
 * @author anil_kumar_mittur_ve
 */
public class PatientSearchRequest {

	private String firstName;
	private String middleName;
	private String lastName;
	private String dob;
	private String patientId;
	private String deliveryZipCode;
	private String deliveryPhoneNo;

	public PatientSearchRequest() {
		
	}
	
	/**
	 * @param firstName
	 * @param middleName
	 * @param lastName
	 * @param dob
	 * @param patientId
	 * @param deliveryZipcode
	 * @param deliveryPhoneNo
	 */
	public PatientSearchRequest(String firstName, String middleName, String lastName, String dob, String patientId,
			String deliveryZipCode, String deliveryPhoneNo) {
		super();
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.dob = dob;
		this.patientId = patientId;
		this.deliveryZipCode = deliveryZipCode;
		this.deliveryPhoneNo = deliveryPhoneNo;
	}

	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @param firstName
	 *            the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * @param middleName the middleName to set
	 */
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	/**
	 * @return the middleName
	 */
	public String getMiddleName() {
		return middleName;
	}

	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * @param lastName
	 *            the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * @param dob the dob to set
	 */
	public void setDob(String dob) {
		this.dob = dob;
	}

	/**
	 * @return the dob
	 */
	public String getDob() {
		return dob;
	}

	/**
	 * @return the patientId
	 */
	public String getPatientId() {
		return patientId;
	}

	/**
	 * @param patientId
	 *            the patientId to set
	 */
	public void setPatientId(String patientId) {
		this.patientId = patientId;
	}

	/**
	 * @param deliveryZipcode the deliveryZipCode to set
	 */
	public void setDeliveryZipCode(String deliveryZipCode) {
		this.deliveryZipCode = deliveryZipCode;
	}

	/**
	 * @return the deliveryZipCode
	 */
	public String getDeliveryZipCode() {
		return deliveryZipCode;
	}

	/**
	 * @param deliveryPhoneNo the deliveryPhoneNo to set
	 */
	public void setDeliveryPhoneNo(String deliveryPhoneNo) {
		this.deliveryPhoneNo = deliveryPhoneNo;
	}

	/**
	 * @return the deliveryPhoneNo
	 */
	public String getDeliveryPhoneNo() {
		return deliveryPhoneNo;
	}

}
