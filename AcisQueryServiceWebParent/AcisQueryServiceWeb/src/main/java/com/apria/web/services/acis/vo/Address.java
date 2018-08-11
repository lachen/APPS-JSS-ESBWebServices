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
 * Model class to represent any Address.
 * 
 * @author BRANGANA
 */
public class Address {

	private String address1;
	private String address2;
	private String city;
	private String state;
	private String zip;
	private String zip2;
	private String phone;

	/**
	 * @return the address1
	 */
	public String getAddress1() {

		return address1;
	}

	/**
	 * @return the address2
	 */
	public String getAddress2() {

		return address2;
	}

	/**
	 * @return the city
	 */
	public String getCity() {

		return city;
	}

	/**
	 * @return the state
	 */
	public String getState() {

		return state;
	}

	/**
	 * @return the zip
	 */
	public String getZip() {

		return zip;
	}

	/**
	 * @return the zip2
	 */
	public String getZip2() {

		return zip2;
	}

	/**
	 * @param address1 the address1 to set
	 */
	public void setAddress1(String address1) {

		this.address1 = address1;
	}

	/**
	 * @param address2 the address2 to set
	 */
	public void setAddress2(String address2) {

		this.address2 = address2;
	}

	/**
	 * @param city the city to set
	 */
	public void setCity(String city) {

		this.city = city;
	}

	/**
	 * @param state the state to set
	 */
	public void setState(String state) {

		this.state = state;
	}

	/**
	 * @param zip the zip to set
	 */
	public void setZip(String zip) {

		this.zip = zip;
	}

	/**
	 * @param zip2 the zip2 to set
	 */
	public void setZip2(String zip2) {

		this.zip2 = zip2;
	}


	/**
	 * @return the phone
	 */
	public String getPhone() {

		return phone;
	}


	/**
	 * @param phone the phone to set
	 */
	public void setPhone(String phone) {

		this.phone = phone;
	}
}
