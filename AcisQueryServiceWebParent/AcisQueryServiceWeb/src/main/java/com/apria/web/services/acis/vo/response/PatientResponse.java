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

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Model class to represent the Response for the Email Request.
 * 
 * @author anil_kumar_mittur_ve
 */
@XmlRootElement
public class PatientResponse {

	private String patientId;

	private String patientFirstName;

	private String patientMiddleName;

	private String patientLastName;

	private String patientDOB;

	private String zipCd;

	private String cpuId;

	/**
	 * @return the patientId
	 */
	@XmlElement(name = "patientId")
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
	 * @return the patientFirstName
	 */
	@XmlElement(name = "patientFirstName")
	public String getPatientFirstName() {
		return patientFirstName;
	}

	/**
	 * @param patientFirstName
	 *            the patientFirstName to set
	 */
	public void setPatientFirstName(String patientFirstName) {
		this.patientFirstName = patientFirstName;
	}

	/**
	 * @return the patientMiddleName
	 */
	@XmlElement(name = "patientMiddleName")
	public String getPatientMiddleName() {
		return patientMiddleName;
	}

	/**
	 * @param patientMiddleName
	 *            the patientMiddleName to set
	 */
	public void setPatientMiddleName(String patientMiddleName) {
		this.patientMiddleName = patientMiddleName;
	}

	/**
	 * @return the patientLastName
	 */
	@XmlElement(name = "patientLastName")
	public String getPatientLastName() {
		return patientLastName;
	}

	/**
	 * @param patientLastName
	 *            the patientLastName to set
	 */
	public void setPatientLastName(String patientLastName) {
		this.patientLastName = patientLastName;
	}

	/**
	 * @return the zipCd
	 */
	@XmlElement(name = "zipCd")
	public String getZipCd() {
		return zipCd;
	}

	/**
	 * @param zipCd
	 *            the zipCd to set
	 */
	public void setZipCd(String zipCd) {
		this.zipCd = zipCd;
	}

	/**
	 * @return the patientDOB
	 */
	@XmlElement(name = "patientDOB")
	public String getPatientDOB() {
		return patientDOB;
	}

	/**
	 * @param patientDOB
	 *            the patientDOB to set
	 */
	public void setPatientDOB(String patientDOB) {
		this.patientDOB = patientDOB;
	}

	/**
	 * @param cpuId
	 */
	public void setCpuId(String cpuId) {
		this.cpuId = cpuId;
	}

	/**
	 * @return
	 */
	@XmlElement(name = "cpuId")
	public String getCpuId() {
		return cpuId;
	}

}
