package com.apria.web.services.upslt.delivery.vo;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author Anil_Kumar_Mittur_Ve
 *
 */
@XmlRootElement
public class WorkOrderETAResponse {

	private String deliveryTime;
	private String commitmentStartTime;
	private String commitmentEndTime;
	private String timeZone;
	private String status;

	/**
	 * @return the deliveryTime
	 */
	public String getDeliveryTime() {
		return deliveryTime;
	}

	/**
	 * @param deliveryTime
	 *            the deliveryTime to set
	 */
	public void setDeliveryTime(String deliveryTime) {
		this.deliveryTime = deliveryTime;
	}

	/**
	 * @return the commitmentStartTime
	 */
	public String getCommitmentStartTime() {
		return commitmentStartTime;
	}

	/**
	 * @param commitmentStartTime
	 *            the commitmentStartTime to set
	 */
	public void setCommitmentStartTime(String commitmentStartTime) {
		this.commitmentStartTime = commitmentStartTime;
	}

	/**
	 * @return the commitmentEndTime
	 */
	public String getCommitmentEndTime() {
		return commitmentEndTime;
	}

	/**
	 * @param commitmentEndTime
	 *            the commitmentEndTime to set
	 */
	public void setCommitmentEndTime(String commitmentEndTime) {
		this.commitmentEndTime = commitmentEndTime;
	}

	/**
	 * @return the timeZone
	 */
	public String getTimeZone() {
		return timeZone;
	}

	/**
	 * @param timeZone
	 *            the timeZone to set
	 */
	public void setTimeZone(String timeZone) {
		this.timeZone = timeZone;
	}

	/**
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * @param status
	 *            the status to set
	 */
	public void setStatus(String status) {
		this.status = status;
	}

}
