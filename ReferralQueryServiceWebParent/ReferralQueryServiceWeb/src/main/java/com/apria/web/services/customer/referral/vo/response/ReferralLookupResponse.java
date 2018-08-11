/*******************************************************************************
 * Copyright (c) 2014 Apria Healthcare                                          *
 * As an unpublished work. All Rights Reserved.                                 *
 * This media contains an authorized copy or copies of material copyrighted by  *
 * Apria Healthcare and is the unpublished, confidential property of            *
 * Apria Healthcare. You may not disclose, copy or use any portion of           *
 * these materials for any purpose without the express written consent of Apria *
 * Healthcare.  You must reproduce this copyright notice and any other          *
 * copyright notices included in machine-readable copies on all authorized      *
 * copies.                                                                      *
 *******************************************************************************/

package com.apria.web.services.customer.referral.vo.response;

import java.util.Collection;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

import com.apria.web.services.customer.referral.vo.Referral;

/**
 * Response VO to send it to client.
 * 
 * @author Thakur_Vikas_Kumar_S
 *
 */
@XmlRootElement
public class ReferralLookupResponse {
	
	private Collection<Referral> referralList;
	private int count;

	public ReferralLookupResponse() {
		// TODO Auto-generated constructor stub
	}
	
	public ReferralLookupResponse(Collection<Referral> referralList) {
		this.referralList = referralList;
		
		if (referralList!=null) {
			this.count = referralList.size();
		}
	}
	
	/**
	 * @return the referralList
	 */
	@XmlElementWrapper(name = "referralList")
	@XmlElement(name = "referral")
	public Collection<Referral> getReferralList() {
		return referralList;
	}

	public void setReferralList(Collection<Referral> referralList) {
		this.referralList = referralList;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

}
