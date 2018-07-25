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

import com.apria.sims.ws.bean.VendorModelBean;
import com.apria.sims.ws.logger.WSFaultType;

/**
 * @author aditya_jain2
 * Vendor Model Web service Interface class to create web services
 */
public interface VendorModelInterface extends Remote {
	public VendorModelBean[] searchVendor(java.lang.String vendorName, java.lang.String vendorModelNumber,  int vndr_sk) throws java.rmi.RemoteException, com.apria.sims.ws.logger.WSFaultType, SQLException ;	
	public VendorModelBean[] loadVendorNames() throws java.rmi.RemoteException, com.apria.sims.ws.logger.WSFaultType, SQLException ;
	public long checkVendorModel(String vendorName, String vendorModel, String productID, int vndorsk, String operation) throws WSFaultType,java.rmi.RemoteException, SQLException;
	public long checkVendorName(String vendorName) throws WSFaultType, SQLException ;
}
