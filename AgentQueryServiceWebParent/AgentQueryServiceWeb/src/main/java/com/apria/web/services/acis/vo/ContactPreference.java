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
 * Model Class to represent Contact Preference for an Agent.
 * 
 * @author BRANGANA
 */
public class ContactPreference {

	private String agentId;
	private String contact;
	private String contactReason;
	private String department;
	private String effectiveDate;
	private String email;
	private String endDate;
	private String fax;
	private String notes;
	private String phone;
	private String phoneExt;
	private String preferedContactMethod;
	private String title;

	/**
	 * @return the agentId
	 */
	public String getAgentId() {

		return agentId;
	}

	/**
	 * @return the contact
	 */
	public String getContact() {

		return contact;
	}

	/**
	 * @return the contactReason
	 */
	public String getContactReason() {

		return contactReason;
	}

	/**
	 * @return the department
	 */
	public String getDepartment() {

		return department;
	}

	/**
	 * @return the effectiveDate
	 */
	public String getEffectiveDate() {

		return effectiveDate;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {

		return email;
	}

	/**
	 * @return the endDate
	 */
	public String getEndDate() {

		return endDate;
	}

	/**
	 * @return the fax
	 */
	public String getFax() {

		return fax;
	}

	/**
	 * @return the notes
	 */
	public String getNotes() {

		return notes;
	}

	/**
	 * @return the phone
	 */
	public String getPhone() {

		return phone;
	}

	/**
	 * @return the phoneExt
	 */
	public String getPhoneExt() {

		return phoneExt;
	}

	/**
	 * @return the preferedContactMethod
	 */
	public String getPreferedContactMethod() {

		return preferedContactMethod;
	}

	/**
	 * @return the title
	 */
	public String getTitle() {

		return title;
	}

	/**
	 * @param agentId the agentId to set
	 */
	public void setAgentId(String agentId) {

		this.agentId = agentId;
	}

	/**
	 * @param contact the contact to set
	 */
	public void setContact(String contact) {

		this.contact = contact;
	}

	/**
	 * @param contactReason the contactReason to set
	 */
	public void setContactReason(String contactReason) {

		this.contactReason = contactReason;
	}

	/**
	 * @param department the department to set
	 */
	public void setDepartment(String department) {

		this.department = department;
	}

	/**
	 * @param effectiveDate the effectiveDate to set
	 */
	public void setEffectiveDate(String effectiveDate) {

		this.effectiveDate = effectiveDate;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {

		this.email = email;
	}

	/**
	 * @param endDate the endDate to set
	 */
	public void setEndDate(String endDate) {

		this.endDate = endDate;
	}

	/**
	 * @param fax the fax to set
	 */
	public void setFax(String fax) {

		this.fax = fax;
	}

	/**
	 * @param notes the notes to set
	 */
	public void setNotes(String notes) {

		this.notes = notes;
	}

	/**
	 * @param phone the phone to set
	 */
	public void setPhone(String phone) {

		this.phone = phone;
	}

	/**
	 * @param phoneExt the phoneExt to set
	 */
	public void setPhoneExt(String phoneExt) {

		this.phoneExt = phoneExt;
	}

	/**
	 * @param preferedContactMethod the preferedContactMethod to set
	 */
	public void setPreferedContactMethod(String preferedContactMethod) {

		this.preferedContactMethod = preferedContactMethod;
	}

	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {

		this.title = title;
	}

}
