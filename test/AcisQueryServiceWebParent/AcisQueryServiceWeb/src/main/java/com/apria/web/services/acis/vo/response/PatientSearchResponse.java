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

import com.apria.web.services.acis.vo.Patient;

/**
 * Model class to represent the Response for the Email Request.
 * 
 * @author anil_kumar_mittur_ve
 */
@XmlRootElement
public class PatientSearchResponse {

	private int count;
	private String statusCode;
	private Collection<Patient> patientList;

	public PatientSearchResponse() {

	}

	public PatientSearchResponse(Collection<Patient> patientList) {
		this.patientList = patientList;

		if (patientList != null) {
			this.count = patientList.size();
		}
	}

	/**
	 * @return the count
	 */
	public int getCount() {
		return count;
	}

	/**
	 * @return the patientList
	 */
	@XmlElementWrapper(name = "patientList")
	@XmlElement(name = "patient")
	public Collection<Patient> getPatientList() {
		return patientList;
	}

	/**
	 * @param count
	 *            the count to set
	 */
	public void setCount(int count) {
		this.count = count;
	}

	/**
	 * @param patientList
	 *            the patientList to set
	 */
	public void setPatientList(Collection<Patient> patientList) {
		this.patientList = patientList;
	}

	/**
	 * @param statusCode the statusCode to set
	 */
	public void setStatusCode(String statusCode) {
		this.statusCode = statusCode;
	}

	/**
	 * @return the statusCode
	 */
	public String getStatusCode() {
		return statusCode;
	}
}
