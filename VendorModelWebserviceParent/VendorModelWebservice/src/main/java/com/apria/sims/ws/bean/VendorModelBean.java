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
 * @author aditya_jain2
 * VendorModel Bean class
 */
public class VendorModelBean implements Serializable{
	
	private static final long serialVersionUID = -3104102083613098788L;
	private String vendorName;//vendor name
	private String vendorModel;//vendor model
	private String serialNumberMask;//serial number mask code
	private String mfgDateCalcCode;//manufacturing calc code
	private String mfgDateCalcCodeDesc;//manufacturing calc code description
	private int offsetMonth;//no of days to test
	private int pmPaintDueMonths;//maintenance due in
	private int vndr_sk;//vendor PK
	private int dayspriortotrigger;//days prior to trigger the maintenance
	private String hlddlvrycnfrmin;//hold delivery confirmation date
	private String srcprodid;//source product id
	private String effdt;//effective begin date by default to current date if not there
	private String enddt;//effective end date
	private MaskCodeBean[] maskcodes;//array of mask codes to check the mask codes for a serial number
	private MaskCodeBean[] inactmaskcodes;//array of mask codes to check the mask codes for a serial number
	/**
	 * @return the vendorName
	 */
	public String getVendorName() {
		return vendorName;
	}
	/**
	 * @param vendorName the vendorName to set
	 */
	public void setVendorName(String vendorName) {
		this.vendorName = vendorName;
	}
	/**
	 * @return the vendorModel
	 */
	public String getVendorModel() {
		return vendorModel;
	}
	/**
	 * @param vendorModel the vendorModel to set
	 */
	public void setVendorModel(String vendorModel) {
		this.vendorModel = vendorModel;
	}
	/**
	 * @return the serialNumberMask
	 */
	public String getSerialNumberMask() {
		return serialNumberMask;
	}
	/**
	 * @param serialNumberMask the serialNumberMask to set
	 */
	public void setSerialNumberMask(String serialNumberMask) {
		this.serialNumberMask = serialNumberMask;
	}
	/**
	 * @return the mfgDateCalcCode
	 */
	public String getMfgDateCalcCode() {
		return mfgDateCalcCode;
	}
	/**
	 * @param mfgDateCalcCode the mfgDateCalcCode to set
	 */
	public void setMfgDateCalcCode(String mfgDateCalcCode) {
		this.mfgDateCalcCode = mfgDateCalcCode;
	}
	/**
	 * @return the mfgDateCalcCodeDesc
	 */
	public String getMfgDateCalcCodeDesc() {
		return mfgDateCalcCodeDesc;
	}
	/**
	 * @param mfgDateCalcCodeDesc the mfgDateCalcCodeDesc to set
	 */
	public void setMfgDateCalcCodeDesc(String mfgDateCalcCodeDesc) {
		this.mfgDateCalcCodeDesc = mfgDateCalcCodeDesc;
	}
	/**
	 * @return the offsetMonth
	 */
	public int getOffsetMonth() {
		return offsetMonth;
	}
	/**
	 * @param offsetMonth the offsetMonth to set
	 */
	public void setOffsetMonth(int offsetMonth) {
		this.offsetMonth = offsetMonth;
	}
	/**
	 * @return the pmPaintDueMonths
	 */
	public int getPmPaintDueMonths() {
		return pmPaintDueMonths;
	}
	/**
	 * @param pmPaintDueMonths the pmPaintDueMonths to set
	 */
	public void setPmPaintDueMonths(int pmPaintDueMonths) {
		this.pmPaintDueMonths = pmPaintDueMonths;
	}
	/**
	 * @return the vndr_sk
	 */
	public int getVndr_sk() {
		return vndr_sk;
	}
	/**
	 * @param vndr_sk the vndr_sk to set
	 */
	public void setVndr_sk(int vndr_sk) {
		this.vndr_sk = vndr_sk;
	}
	/**
	 * @return the dayspriortotrigger
	 */
	public int getDayspriortotrigger() {
		return dayspriortotrigger;
	}
	/**
	 * @param dayspriortotrigger the dayspriortotrigger to set
	 */
	public void setDayspriortotrigger(int dayspriortotrigger) {
		this.dayspriortotrigger = dayspriortotrigger;
	}
	/**
	 * @return the hlddlvrycnfrmin
	 */
	public String getHlddlvrycnfrmin() {
		return hlddlvrycnfrmin;
	}
	/**
	 * @param hlddlvrycnfrmin the hlddlvrycnfrmin to set
	 */
	public void setHlddlvrycnfrmin(String hlddlvrycnfrmin) {
		this.hlddlvrycnfrmin = hlddlvrycnfrmin;
	}
	/**
	 * @return the srcprodid
	 */
	public String getSrcprodid() {
		return srcprodid;
	}
	/**
	 * @param srcprodid the srcprodid to set
	 */
	public void setSrcprodid(String srcprodid) {
		this.srcprodid = srcprodid;
	}
	/**
	 * @return the effdt
	 */
	public String getEffdt() {
		return effdt;
	}
	/**
	 * @param effdt the effdt to set
	 */
	public void setEffdt(String effdt) {
		this.effdt = effdt;
	}
	/**
	 * @return the enddt
	 */
	public String getEnddt() {
		return enddt;
	}
	/**
	 * @param enddt the enddt to set
	 */
	public void setEnddt(String enddt) {
		this.enddt = enddt;
	}
	/**
	 * @return the maskcodes
	 */
	public MaskCodeBean[] getMaskcodes() {
		return maskcodes;
	}
	/**
	 * @param maskcodes the maskcodes to set
	 */
	public void setMaskcodes(MaskCodeBean[] maskcodes) {
		this.maskcodes = maskcodes;
	}
	/**
	 * @return the inactmaskcodes
	 */
	public MaskCodeBean[] getInactmaskcodes() {
		return inactmaskcodes;
	}
	/**
	 * @param inactmaskcodes the inactmaskcodes to set
	 */
	public void setInactmaskcodes(MaskCodeBean[] inactmaskcodes) {
		this.inactmaskcodes = inactmaskcodes;
	}
}
