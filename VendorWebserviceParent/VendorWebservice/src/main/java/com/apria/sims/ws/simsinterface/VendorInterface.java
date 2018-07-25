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
package com.apria.sims.ws.simsinterface;

import java.rmi.Remote;
import java.sql.SQLException;

import com.apria.sims.ws.bean.VendorBean;
import com.apria.sims.ws.logger.WSFaultType;

/**
 * @author jainadit
 * Interface for Vendor Web Service
 */
public interface VendorInterface extends Remote {
	public VendorBean[] searchVendor(java.lang.String vendorNameVendor, java.lang.String srcvndrcd) throws java.rmi.RemoteException, SQLException, WSFaultType ;
	public String searchVendorName(java.lang.String vendorNameVendor, java.lang.String srcvndrcd) throws  SQLException, WSFaultType ;
}
