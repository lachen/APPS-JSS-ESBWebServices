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

import com.apria.web.services.acis.vo.ContactPreference;

/**
 * Model class to represent the Agent Contact Preference Response.
 * 
 * @author BRANGANA
 */
@XmlRootElement
public class ContactPreferenceResponse {

	private Collection<ContactPreference> contactPreferenceList;
	private int count;

	public ContactPreferenceResponse() {

	}

	public ContactPreferenceResponse(
		Collection<ContactPreference> contactPreferenceList) {

		this.contactPreferenceList = contactPreferenceList;

		if (contactPreferenceList != null) {
			this.count = contactPreferenceList.size();
		}
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
	 * @return the count
	 */
	public int getCount() {

		return count;
	}

	/**
	 * @param contactPreferenceList the contactPreferenceList to set
	 */
	public void setContactPreferenceList(
		Collection<ContactPreference> contactPreferenceList) {

		this.contactPreferenceList = contactPreferenceList;
	}

	/**
	 * @param count the count to set
	 */
	public void setCount(int count) {

		this.count = count;
	}
}
