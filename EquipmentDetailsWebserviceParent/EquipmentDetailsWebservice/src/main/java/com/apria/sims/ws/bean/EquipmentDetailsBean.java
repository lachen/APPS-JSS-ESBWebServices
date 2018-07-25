/*******************************************************************************
 * Copyright (c) 2011 Apria Healthcare                                          *
 * As an unpublished work. All Rights Reserved.                                 *
 * This media contains an authorized copy or copies of material copyrighted by  *
 * Apria Healthcare and is the unpublished, confidential property of            *
 * Apria Healthcare. You may not disclose, copy or use any portion of           *
 * these materials for any purpose without the express written consent of Apria *
 * Healthcare.  You must reproduce this copyright notice and any other          *
 * copyright notices included in machine-readable copies on all authorized      *
 * copies.                                                                      *
 *******************************************************************************/
package com.apria.sims.ws.bean;

import java.io.Serializable;



/**
 * @author jainadit
 * Equipment Details Bean
 */
public class EquipmentDetailsBean implements Serializable{
	/*Aprial Logger for logging */
	
	private static final long serialVersionUID = -5151608241795932438L;
	private String vendorName;//vendor name
	private int vendorsk;//vendor sk (PK)
	private int eqpmtsk;//equipment primary key
	private String modelNumber;	// model number of that vendor
	private String serialNumber;//serial number of the model
	private String productID;//product id of the vendor and vendor model
	private String eqpmtstatus;//status code of the equipment
	private String manufatureDate;//manufacture date
	private String manufacturSerialNumber;//manufacture serial number of the equipment
	private String nextTestDate;//next test date for the equipment
	private String generalNotes;//the notes for the equipment
	private String eqpmtnotetxt;//
	private String statusHistoryDate;//history last updated date
	private String statusHistoryStatusCode;//last saved status code
	private String statusHistorySystemUser;//last saved user who did the update
	private String notesHistoryDate;//date of the notes for the equipment
	private String notesHistoryText;//notes saved
	private String notesHistorySystemUser;//the user who saved the last note
	private MaskCodeBean[] maskcodes;//mask codes for the model number
	private String buid;//business unit
	private String systemid;//CPU
	private String customerId;//paitent id
	private String dlvWorkOrder;//Delivery Work Order 
	private String pkpWorkOrder;//Pickup Work Order 
	private int offsetMonth;//no of days to test
	private int pmPaintDueMonths;//maintenance due in
	private String nexttestmonth;
	private String buName;
	private String acisbuid;
	
	/**
	 * @return the vendorName
	 */
	public String getVendorName() {
		return vendorName;
	}
	/**
	 * @return the vendorsk
	 */
	public int getVendorsk() {
		return vendorsk;
	}
	/**
	 * @return the eqpmtsk
	 */
	public int getEqpmtsk() {
		return eqpmtsk;
	}
	/**
	 * @return the modelNumber
	 */
	public String getModelNumber() {
		return modelNumber;
	}
	/**
	 * @return the serialNumber
	 */
	public String getSerialNumber() {
		return serialNumber;
	}
	/**
	 * @return the productID
	 */
	public String getProductID() {
		return productID;
	}
	/**
	 * @return the eqpmtstatus
	 */
	public String getEqpmtstatus() {
		return eqpmtstatus;
	}
	/**
	 * @return the manufatureDate
	 */
	public String getManufatureDate() {
		return manufatureDate;
	}
	/**
	 * @return the manufacturSerialNumber
	 */
	public String getManufacturSerialNumber() {
		return manufacturSerialNumber;
	}
	/**
	 * @return the nextTestDate
	 */
	public String getNextTestDate() {
		return nextTestDate;
	}
	/**
	 * @return the generalNotes
	 */
	public String getGeneralNotes() {
		return generalNotes;
	}
	/**
	 * @return the eqpmtnotetxt
	 */
	public String getEqpmtnotetxt() {
		return eqpmtnotetxt;
	}
	/**
	 * @return the statusHistoryDate
	 */
	public String getStatusHistoryDate() {
		return statusHistoryDate;
	}
	/**
	 * @return the statusHistoryStatusCode
	 */
	public String getStatusHistoryStatusCode() {
		return statusHistoryStatusCode;
	}
	/**
	 * @return the statusHistorySystemUser
	 */
	public String getStatusHistorySystemUser() {
		return statusHistorySystemUser;
	}
	/**
	 * @return the notesHistoryDate
	 */
	public String getNotesHistoryDate() {
		return notesHistoryDate;
	}
	/**
	 * @return the notesHistoryText
	 */
	public String getNotesHistoryText() {
		return notesHistoryText;
	}
	/**
	 * @return the notesHistorySystemUser
	 */
	public String getNotesHistorySystemUser() {
		return notesHistorySystemUser;
	}
	/**
	 * @return the maskcodes
	 */
	public MaskCodeBean[] getMaskcodes() {
		return maskcodes;
	}
	/**
	 * @return the buid
	 */
	public String getBuid() {
		return buid;
	}
	/**
	 * @return the systemid
	 */
	public String getSystemid() {
		return systemid;
	}
	/**
	 * @return the customerId
	 */
	public String getCustomerId() {
		return customerId;
	}
	/**
	 * @return the dlvWorkOrder
	 */
	public String getDlvWorkOrder() {
		return dlvWorkOrder;
	}
	/**
	 * @return the pkpWorkOrder
	 */
	public String getPkpWorkOrder() {
		return pkpWorkOrder;
	}
	/**
	 * @return the offsetMonth
	 */
	public int getOffsetMonth() {
		return offsetMonth;
	}
	/**
	 * @return the pmPaintDueMonths
	 */
	public int getPmPaintDueMonths() {
		return pmPaintDueMonths;
	}
	/**
	 * @return the nexttestmonth
	 */
	public String getNexttestmonth() {
		return nexttestmonth;
	}
	/**
	 * @param vendorName the vendorName to set
	 */
	public void setVendorName(String vendorName) {
		this.vendorName = vendorName;
	}
	/**
	 * @param vendorsk the vendorsk to set
	 */
	public void setVendorsk(int vendorsk) {
		this.vendorsk = vendorsk;
	}
	/**
	 * @param eqpmtsk the eqpmtsk to set
	 */
	public void setEqpmtsk(int eqpmtsk) {
		this.eqpmtsk = eqpmtsk;
	}
	/**
	 * @param modelNumber the modelNumber to set
	 */
	public void setModelNumber(String modelNumber) {
		this.modelNumber = modelNumber;
	}
	/**
	 * @param serialNumber the serialNumber to set
	 */
	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}
	/**
	 * @param productID the productID to set
	 */
	public void setProductID(String productID) {
		this.productID = productID;
	}
	/**
	 * @param eqpmtstatus the eqpmtstatus to set
	 */
	public void setEqpmtstatus(String eqpmtstatus) {
		this.eqpmtstatus = eqpmtstatus;
	}
	/**
	 * @param manufatureDate the manufatureDate to set
	 */
	public void setManufatureDate(String manufatureDate) {
		this.manufatureDate = manufatureDate;
	}
	/**
	 * @param manufacturSerialNumber the manufacturSerialNumber to set
	 */
	public void setManufacturSerialNumber(String manufacturSerialNumber) {
		this.manufacturSerialNumber = manufacturSerialNumber;
	}
	/**
	 * @param nextTestDate the nextTestDate to set
	 */
	public void setNextTestDate(String nextTestDate) {
		this.nextTestDate = nextTestDate;
	}
	/**
	 * @param generalNotes the generalNotes to set
	 */
	public void setGeneralNotes(String generalNotes) {
		this.generalNotes = generalNotes;
	}
	/**
	 * @param eqpmtnotetxt the eqpmtnotetxt to set
	 */
	public void setEqpmtnotetxt(String eqpmtnotetxt) {
		this.eqpmtnotetxt = eqpmtnotetxt;
	}
	/**
	 * @param statusHistoryDate the statusHistoryDate to set
	 */
	public void setStatusHistoryDate(String statusHistoryDate) {
		this.statusHistoryDate = statusHistoryDate;
	}
	/**
	 * @param statusHistoryStatusCode the statusHistoryStatusCode to set
	 */
	public void setStatusHistoryStatusCode(String statusHistoryStatusCode) {
		this.statusHistoryStatusCode = statusHistoryStatusCode;
	}
	/**
	 * @param statusHistorySystemUser the statusHistorySystemUser to set
	 */
	public void setStatusHistorySystemUser(String statusHistorySystemUser) {
		this.statusHistorySystemUser = statusHistorySystemUser;
	}
	/**
	 * @param notesHistoryDate the notesHistoryDate to set
	 */
	public void setNotesHistoryDate(String notesHistoryDate) {
		this.notesHistoryDate = notesHistoryDate;
	}
	/**
	 * @param notesHistoryText the notesHistoryText to set
	 */
	public void setNotesHistoryText(String notesHistoryText) {
		this.notesHistoryText = notesHistoryText;
	}
	/**
	 * @param notesHistorySystemUser the notesHistorySystemUser to set
	 */
	public void setNotesHistorySystemUser(String notesHistorySystemUser) {
		this.notesHistorySystemUser = notesHistorySystemUser;
	}
	/**
	 * @param maskcodes the maskcodes to set
	 */
	public void setMaskcodes(MaskCodeBean[] maskcodes) {
		this.maskcodes = maskcodes;
	}
	/**
	 * @param buid the buid to set
	 */
	public void setBuid(String buid) {
		this.buid = buid;
	}
	/**
	 * @param systemid the systemid to set
	 */
	public void setSystemid(String systemid) {
		this.systemid = systemid;
	}
	/**
	 * @param customerId the customerId to set
	 */
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}
	/**
	 * @param dlvWorkOrder the dlvWorkOrder to set
	 */
	public void setDlvWorkOrder(String dlvWorkOrder) {
		this.dlvWorkOrder = dlvWorkOrder;
	}
	/**
	 * @param pkpWorkOrder the pkpWorkOrder to set
	 */
	public void setPkpWorkOrder(String pkpWorkOrder) {
		this.pkpWorkOrder = pkpWorkOrder;
	}
	/**
	 * @param offsetMonth the offsetMonth to set
	 */
	public void setOffsetMonth(int offsetMonth) {
		this.offsetMonth = offsetMonth;
	}
	/**
	 * @param pmPaintDueMonths the pmPaintDueMonths to set
	 */
	public void setPmPaintDueMonths(int pmPaintDueMonths) {
		this.pmPaintDueMonths = pmPaintDueMonths;
	}
	/**
	 * @param nexttestmonth the nexttestmonth to set
	 */
	public void setNexttestmonth(String nexttestmonth) {
		this.nexttestmonth = nexttestmonth;
	}
	
	/**
	 * 
	 * @return buName
	 */
	public String getBuName() {
		return buName;
	}
	
	/**
	 * 
	 * @param buName
	 */
	public void setBuName(String buName) {
		this.buName = buName;
	}
	
	/**
	 * 
	 * @param acisbuid
	 */
	public void setAcisbuid(String acisbuid) {
		this.acisbuid = acisbuid;
	}
	
	/**
	 * 
	 * @return acisbuid
	 */
	public String getAcisbuid() {
		return acisbuid;
	}	
	
}
