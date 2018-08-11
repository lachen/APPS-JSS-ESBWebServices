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

import com.apria.web.services.acis.vo.Attribute;

/**
 * Model class to represent the Agent Attribute Response.
 * 
 * @author BRANGANA
 */
@XmlRootElement
public class AttributeResponse {

	private Collection<Attribute> attributeList;
	private int count;

	public AttributeResponse() {

	}

	public AttributeResponse(Collection<Attribute> attributeList) {

		this.attributeList = attributeList;

		if (attributeList != null) {
			this.count = attributeList.size();
		}
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
	 * @return the count
	 */
	public int getCount() {

		return count;
	}

	/**
	 * @param attributeList the attributeList to set
	 */
	public void setAttributeList(Collection<Attribute> attributeList) {

		this.attributeList = attributeList;
	}

	/**
	 * @param count the count to set
	 */
	public void setCount(int count) {

		this.count = count;
	}
}
