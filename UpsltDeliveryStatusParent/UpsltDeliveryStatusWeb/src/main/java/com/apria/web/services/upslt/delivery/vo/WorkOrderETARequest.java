package com.apria.web.services.upslt.delivery.vo;

public class WorkOrderETARequest {

	private String cpu;
	private String businessUnit;
	private String patientId;
	private String workOrderNumber;
	private String zipCode;

	/**
	 * @return the cpu
	 */
	public String getCpu() {
		return cpu;
	}

	/**
	 * @param cpu
	 *            the cpu to set
	 */
	public void setCpu(String cpu) {
		this.cpu = cpu;
	}

	/**
	 * @return the patientId
	 */
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
	 * @return the workOrderNumber
	 */
	public String getWorkOrderNumber() {
		return workOrderNumber;
	}

	/**
	 * @param workOrderNumber
	 *            the workOrderNumber to set
	 */
	public void setWorkOrderNumber(String workOrderNumber) {
		this.workOrderNumber = workOrderNumber;
	}

	/**
	 * @param businessUnit
	 *            the businessUnit to set
	 */
	public void setBusinessUnit(String businessUnit) {
		this.businessUnit = businessUnit;
	}

	/**
	 * @return the businessUnit
	 */
	public String getBusinessUnit() {
		return businessUnit;
	}

	/**
	 * @param zipCode the zipCode to set
	 */
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	/**
	 * @return the zipCode
	 */
	public String getZipCode() {
		return zipCode;
	}

}
