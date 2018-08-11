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

import com.apria.web.services.acis.vo.Email;

/**
 * Model class to represent the Response for the Email Request.
 * 
 * @author BRANGANA
 */
@XmlRootElement
public class EmailResponse {

	private int emailCount;
	private Collection<Email> emailList;

	public EmailResponse() {

	}

	public EmailResponse(Collection<Email> emailList) {

		this.emailList = emailList;
		this.emailCount = emailList.size();
	}

	/**
	 * @return the emailCount
	 */
	public int getEmailCount() {

		return emailCount;
	}

	/**
	 * @return the emailList
	 */
	@XmlElementWrapper(name = "emailList")
	@XmlElement(name = "email")
	public Collection<Email> getEmailList() {

		return emailList;
	}

	/**
	 * @param emailCount the emailCount to set
	 */
	public void setEmailCount(int emailCount) {

		this.emailCount = emailCount;
	}

	/**
	 * @param emailList the emailList to set
	 */
	public void setEmailList(Collection<Email> emailList) {

		this.emailList = emailList;
	}
}
