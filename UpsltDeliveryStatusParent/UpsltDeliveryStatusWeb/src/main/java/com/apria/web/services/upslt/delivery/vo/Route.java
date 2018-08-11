package com.apria.web.services.upslt.delivery.vo;

import java.util.Collection;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;

/**
 * Model class to represent the delivery route.
 * 
 * @author BRANGANA
 */
public class Route {

	private String deliveredDate;
	private String deliveryStatus;
	private String deliveryType;
	private String deliveryWindow;
	private String eta;
	private Collection<LineItem> lineItemList;
	private String routeDate;
	private String routeId;
	private String sequence;
	private String stopId;

	@Override
	public boolean equals(Object obj) {

		if (this == obj)
			return true;
		if ((obj == null) || (obj.getClass() != this.getClass()))
			return false;

		Route input = (Route) obj;
		return this.getRouteId().equals(input.getRouteId())
			&& this.getStopId().equals(input.getStopId());
	}

	/**
	 * @return the deliveredDate
	 */
	public String getDeliveredDate() {

		return deliveredDate;
	}

	/**
	 * @return the deliveryStatus
	 */
	public String getDeliveryStatus() {

		return deliveryStatus;
	}

	/**
	 * @return the deliveryType
	 */
	public String getDeliveryType() {

		return deliveryType;
	}

	/**
	 * @return the deliveryWindow
	 */
	public String getDeliveryWindow() {

		return deliveryWindow;
	}

	/**
	 * @return the eta
	 */
	public String getEta() {

		return eta;
	}

	/**
	 * @return the lineItemList
	 */
	@XmlElementWrapper(name = "lineItemList")
	@XmlElement(name = "lineItem")
	public Collection<LineItem> getLineItemList() {

		return lineItemList;
	}

	/**
	 * @return the routeDate
	 */
	public String getRouteDate() {

		return routeDate;
	}

	/**
	 * @return the routeId
	 */
	public String getRouteId() {

		return routeId;
	}

	/**
	 * @return the sequence
	 */
	public String getSequence() {

		return sequence;
	}

	/**
	 * @return the stopId
	 */
	public String getStopId() {

		return stopId;
	}

	@Override
	public int hashCode() {

		int hash = 7;
		hash = 31 * hash + this.getRouteId().hashCode()
			+ this.getStopId().hashCode();
		return hash;
	}

	/**
	 * @param deliveredDate the deliveredDate to set
	 */
	public void setDeliveredDate(String deliveredDate) {

		this.deliveredDate = deliveredDate;
	}

	/**
	 * @param deliveryStatus the deliveryStatus to set
	 */
	public void setDeliveryStatus(String deliveryStatus) {

		this.deliveryStatus = deliveryStatus;
	}

	/**
	 * @param deliveryType the deliveryType to set
	 */
	public void setDeliveryType(String deliveryType) {

		this.deliveryType = deliveryType;
	}

	/**
	 * @param deliveryWindow the deliveryWindow to set
	 */
	public void setDeliveryWindow(String deliveryWindow) {

		this.deliveryWindow = deliveryWindow;
	}

	/**
	 * @param eta the eta to set
	 */
	public void setEta(String eta) {

		this.eta = eta;
	}

	/**
	 * @param lineItemList the lineItemList to set
	 */
	public void setLineItemList(Collection<LineItem> lineItemList) {

		this.lineItemList = lineItemList;
	}

	/**
	 * @param routeDate the routeDate to set
	 */
	public void setRouteDate(String routeDate) {

		this.routeDate = routeDate;
	}

	/**
	 * @param routeId the routeId to set
	 */
	public void setRouteId(String routeId) {

		this.routeId = routeId;
	}

	/**
	 * @param sequence the sequence to set
	 */
	public void setSequence(String sequence) {

		this.sequence = sequence;
	}

	/**
	 * @param stopId the stopId to set
	 */
	public void setStopId(String stopId) {

		this.stopId = stopId;
	}
}
