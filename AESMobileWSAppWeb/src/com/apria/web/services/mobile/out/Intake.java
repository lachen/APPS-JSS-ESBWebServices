/**
 * 
 */
package com.apria.web.services.mobile.out;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * @author srinivas4
 *
 */
public class Intake implements Serializable{
    private java.lang.String associate;
    private java.lang.String followpCode;
    private java.lang.String IIntakeCreateDate;
    private java.lang.String intakeCreateTime;
    private java.lang.String intakeStatus;
    private java.lang.String intakeStatusDate;
    private java.lang.String intakeStatusTime;
    private java.lang.String intakeNo;
    private java.lang.String patientFirstName;
    private java.lang.String patientID;
    private java.lang.String patientLastName;
    private java.lang.String patientMI;
    private java.lang.String physicianID;
    private java.lang.String physicianName;
    private java.lang.String referralID;
    private java.lang.String referralName;
    private java.lang.String referralZipCode;
//    private ArrayList<WorkOrder> workOrder = new ArrayList<WorkOrder>();
    private WorkOrder[] workOrderList;
	/**
	 * 
	 */
	public Intake() {
		// TODO Auto-generated constructor stub
	}
	/**
	 * @return the associate
	 */
	public java.lang.String getAssociate() {
		return associate;
	}
	/**
	 * @param associate the associate to set
	 */
	public void setAssociate(java.lang.String associate) {
		this.associate = associate;
	}
	/**
	 * @return the followpCode
	 */
	public java.lang.String getFollowpCode() {
		return followpCode;
	}
	/**
	 * @param followpCode the followpCode to set
	 */
	public void setFollowpCode(java.lang.String followpCode) {
		this.followpCode = followpCode;
	}
	/**
	 * @return the iIntakeCreateDate
	 */
	public java.lang.String getIIntakeCreateDate() {
		return IIntakeCreateDate;
	}
	/**
	 * @param intakeCreateDate the iIntakeCreateDate to set
	 */
	public void setIIntakeCreateDate(java.lang.String intakeCreateDate) {
		IIntakeCreateDate = intakeCreateDate;
	}
	/**
	 * @return the intakeCreateTime
	 */
	public java.lang.String getIntakeCreateTime() {
		return intakeCreateTime;
	}
	/**
	 * @param intakeCreateTime the intakeCreateTime to set
	 */
	public void setIntakeCreateTime(java.lang.String intakeCreateTime) {
		this.intakeCreateTime = intakeCreateTime;
	}
	/**
	 * @return the intakeStatus
	 */
	public java.lang.String getIntakeStatus() {
		return intakeStatus;
	}
	/**
	 * @param intakeStatus the intakeStatus to set
	 */
	public void setIntakeStatus(java.lang.String intakeStatus) {
		this.intakeStatus = intakeStatus;
	}
	/**
	 * @return the intakeStatusDate
	 */
	public java.lang.String getIntakeStatusDate() {
		return intakeStatusDate;
	}
	/**
	 * @param intakeStatusDate the intakeStatusDate to set
	 */
	public void setIntakeStatusDate(java.lang.String intakeStatusDate) {
		this.intakeStatusDate = intakeStatusDate;
	}
	/**
	 * @return the intakeStatusTime
	 */
	public java.lang.String getIntakeStatusTime() {
		return intakeStatusTime;
	}
	/**
	 * @param intakeStatusTime the intakeStatusTime to set
	 */
	public void setIntakeStatusTime(java.lang.String intakeStatusTime) {
		this.intakeStatusTime = intakeStatusTime;
	}

	/**
	 * @return the patientFirstName
	 */
	public java.lang.String getPatientFirstName() {
		return patientFirstName;
	}
	/**
	 * @param patientFirstName the patientFirstName to set
	 */
	public void setPatientFirstName(java.lang.String patientFirstName) {
		this.patientFirstName = patientFirstName;
	}
	/**
	 * @return the patientID
	 */
	public java.lang.String getPatientID() {
		return patientID;
	}
	/**
	 * @param patientID the patientID to set
	 */
	public void setPatientID(java.lang.String patientID) {
		this.patientID = patientID;
	}
	/**
	 * @return the patientLastName
	 */
	public java.lang.String getPatientLastName() {
		return patientLastName;
	}
	/**
	 * @param patientLastName the patientLastName to set
	 */
	public void setPatientLastName(java.lang.String patientLastName) {
		this.patientLastName = patientLastName;
	}
	/**
	 * @return the patientMI
	 */
	public java.lang.String getPatientMI() {
		return patientMI;
	}
	/**
	 * @param patientMI the patientMI to set
	 */
	public void setPatientMI(java.lang.String patientMI) {
		this.patientMI = patientMI;
	}
	/**
	 * @return the physicianID
	 */
	public java.lang.String getPhysicianID() {
		return physicianID;
	}
	/**
	 * @param physicianID the physicianID to set
	 */
	public void setPhysicianID(java.lang.String physicianID) {
		this.physicianID = physicianID;
	}
	/**
	 * @return the physicianName
	 */
	public java.lang.String getPhysicianName() {
		return physicianName;
	}
	/**
	 * @param physicianName the physicianName to set
	 */
	public void setPhysicianName(java.lang.String physicianName) {
		this.physicianName = physicianName;
	}
	/**
	 * @return the referralID
	 */
	public java.lang.String getReferralID() {
		return referralID;
	}
	/**
	 * @param referralID the referralID to set
	 */
	public void setReferralID(java.lang.String referralID) {
		this.referralID = referralID;
	}
	/**
	 * @return the referralName
	 */
	public java.lang.String getReferralName() {
		return referralName;
	}
	/**
	 * @param referralName the referralName to set
	 */
	public void setReferralName(java.lang.String referralName) {
		this.referralName = referralName;
	}
	/**
	 * @return the referralZipCode
	 */
	public java.lang.String getReferralZipCode() {
		return referralZipCode;
	}
	/**
	 * @param referralZipCode the referralZipCode to set
	 */
	public void setReferralZipCode(java.lang.String referralZipCode) {
		this.referralZipCode = referralZipCode;
	}

	/**
	 * @return the intakeNo
	 */
	public java.lang.String getIntakeNo() {
		return intakeNo;
	}
	/**
	 * @param intakeNo the intakeNo to set
	 */
	public void setIntakeNo(java.lang.String intakeNo) {
		this.intakeNo = intakeNo;
	}
	/**
	 * @return the workOrderList
	 */
	public WorkOrder[] getWorkOrderList() {
		return workOrderList;
	}
	/**
	 * @param workOrderList the workOrderList to set
	 */
	public void setWorkOrderList(WorkOrder[] workOrderList) {
		this.workOrderList = workOrderList;
	}

	

}
