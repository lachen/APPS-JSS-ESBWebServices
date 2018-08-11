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

import com.apria.web.services.acis.vo.ProductPreference;

/**
 * Model class to represent the Agent Product Preference Response.
 * 
 * @author BRANGANA
 */
@XmlRootElement
public class ProductPreferenceResponse {

	private int count;
	private Collection<ProductPreference> productPreferenceList;

	public ProductPreferenceResponse() {

	}

	public ProductPreferenceResponse(
		Collection<ProductPreference> productPreferenceList) {

		this.productPreferenceList = productPreferenceList;

		if (productPreferenceList != null) {
			this.count = productPreferenceList.size();
		}
	}

	/**
	 * @return the count
	 */
	public int getCount() {

		return count;
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
	 * @param count the count to set
	 */
	public void setCount(int count) {

		this.count = count;
	}

	/**
	 * @param productPreferenceList the productPreferenceList to set
	 */
	public void setProductPreferenceList(
		Collection<ProductPreference> productPreferenceList) {

		this.productPreferenceList = productPreferenceList;
	}
}
