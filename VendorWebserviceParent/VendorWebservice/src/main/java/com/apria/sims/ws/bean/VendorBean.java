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
 * Vendor Bean for Vendor Web Service
 */
public class VendorBean implements Serializable {
	private static final long serialVersionUID = 1057705632980575721L;
	private java.lang.String srcvndrcd;// Vendor SRC code
    private java.lang.String vendorNameVendor;// Vendor Name
    private int vndrsk;

    public VendorBean() {
    }

	/**
	 * @return the srcvndrcd
	 */
	public java.lang.String getSrcvndrcd() {
		return srcvndrcd;
	}

	/**
	 * @return the vendorNameVendor
	 */
	public java.lang.String getVendorNameVendor() {
		return vendorNameVendor;
	}

	/**
	 * @return the vndrsk
	 */
	public int getVndrsk() {
		return vndrsk;
	}

	/**
	 * @param srcvndrcd the srcvndrcd to set
	 */
	public void setSrcvndrcd(java.lang.String srcvndrcd) {
		this.srcvndrcd = srcvndrcd;
	}

	/**
	 * @param vendorNameVendor the vendorNameVendor to set
	 */
	public void setVendorNameVendor(java.lang.String vendorNameVendor) {
		this.vendorNameVendor = vendorNameVendor;
	}

	/**
	 * @param vndrsk the vndrsk to set
	 */
	public void setVndrsk(int vndrsk) {
		this.vndrsk = vndrsk;
	}

}
