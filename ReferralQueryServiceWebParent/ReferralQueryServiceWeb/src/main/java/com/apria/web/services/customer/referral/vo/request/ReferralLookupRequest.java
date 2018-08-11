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

package com.apria.web.services.customer.referral.vo.request;

/**
 * Request VO class to take from client.
 * 
 * @author Thakur_Vikas_Kumar_S
 *
 */
public class ReferralLookupRequest {
	
	private String name;
	private String city;
	private String state;
	
	public ReferralLookupRequest() {
	}
	
	public ReferralLookupRequest(String name,
			String city, String state) {
		this.name = name;
		this.city      = city;
		this.state     = state;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("name=").append(name);
		sb.append(", city=").append(city);
		sb.append(", state=").append(state);
		return sb.toString();
	}
	
}
