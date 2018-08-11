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

package com.apria.web.services.upslt.delivery.vo;

import java.util.Collection;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;

/**
 * Model class to represent the delivery details.
 * 
 * @author BRANGANA
 */
public class Delivery {

	private String address1;
	private String address2;
	private String businessUnit;
	private String city;
	private String driverName;
	private String latitude;
	private String longitude;
	private String patientId;
	private String patientName;
	private String phone;
	private Collection<Route> routeList;
	private String state;
	private String workOrder;
	private String zipcode;

	@Override
	public boolean equals(Object obj) {

		if (this == obj)
			return true;
		if ((obj == null) || (obj.getClass() != this.getClass()))
			return false;

		Delivery input = (Delivery) obj;
		return this.getWorkOrder().equals(input.getWorkOrder());
	}

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
	 * @return the businessUnit
	 */
	public String getBusinessUnit() {

		return businessUnit;
	}

	/**
	 * @return the city
	 */
	public String getCity() {

		return city;
	}

	/**
	 * @return the driverName
	 */
	public String getDriverName() {

		return driverName;
	}

	/**
	 * @return the latitude
	 */
	public String getLatitude() {

		return latitude;
	}

	/**
	 * @return the longitude
	 */
	public String getLongitude() {

		return longitude;
	}

	/**
	 * @return the patientId
	 */
	public String getPatientId() {

		return patientId;
	}

	/**
	 * @return the patientName
	 */
	public String getPatientName() {

		return patientName;
	}

	/**
	 * @return the phone
	 */
	public String getPhone() {

		return phone;
	}

	/**
	 * @return the routeList
	 */
	@XmlElementWrapper(name = "routeList")
	@XmlElement(name = "route")
	public Collection<Route> getRouteList() {

		return routeList;
	}

	/**
	 * @return the state
	 */
	public String getState() {

		return state;
	}

	/**
	 * @return the workOrder
	 */
	public String getWorkOrder() {

		return workOrder;
	}

	/**
	 * @return the zipcode
	 */
	public String getZipcode() {

		return zipcode;
	}

	@Override
	public int hashCode() {

		int hash = 7;
		hash = 31 * hash + this.getWorkOrder().hashCode();
		return hash;
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
	 * @param businessUnit the businessUnit to set
	 */
	public void setBusinessUnit(String businessUnit) {

		this.businessUnit = businessUnit;
	}

	/**
	 * @param city the city to set
	 */
	public void setCity(String city) {

		this.city = city;
	}

	/**
	 * @param driverName the driverName to set
	 */
	public void setDriverName(String driverName) {

		this.driverName = driverName;
	}

	/**
	 * @param latitude the latitude to set
	 */
	public void setLatitude(String latitude) {

		this.latitude = latitude;
	}

	/**
	 * @param longitude the longitude to set
	 */
	public void setLongitude(String longitude) {

		this.longitude = longitude;
	}

	/**
	 * @param patientId the patientId to set
	 */
	public void setPatientId(String patientId) {

		this.patientId = patientId;
	}

	/**
	 * @param patientName the patientName to set
	 */
	public void setPatientName(String patientName) {

		this.patientName = patientName;
	}

	/**
	 * @param phone the phone to set
	 */
	public void setPhone(String phone) {

		this.phone = phone;
	}

	/**
	 * @param routeList the routeList to set
	 */
	public void setRouteList(Collection<Route> routeList) {

		this.routeList = routeList;
	}

	/**
	 * @param state the state to set
	 */
	public void setState(String state) {

		this.state = state;
	}

	/**
	 * @param workOrder the workOrder to set
	 */
	public void setWorkOrder(String workOrder) {

		this.workOrder = workOrder;
	}

	/**
	 * @param zipcode the zipcode to set
	 */
	public void setZipcode(String zipcode) {

		this.zipcode = zipcode;
	}
}
