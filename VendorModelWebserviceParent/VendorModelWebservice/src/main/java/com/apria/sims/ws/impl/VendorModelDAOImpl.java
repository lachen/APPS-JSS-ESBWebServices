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
package com.apria.sims.ws.impl;

import java.sql.SQLException;

import org.apache.log4j.Logger;

import com.apria.sims.ws.bean.VendorModelBean;
import com.apria.sims.ws.dao.VendorModelDAO;
import com.apria.sims.ws.logger.WSFaultType;
import com.apria.sims.ws.simsinterface.VendorModelInterface;

/**
 * @author jainadit
 * Implement class for Vendor Model Web service
 */
public class VendorModelDAOImpl  implements VendorModelInterface  {
	private VendorModelDAO daoobj = new VendorModelDAO();
	private static final Logger logger = Logger.getLogger(VendorModelDAOImpl.class);
	
	public VendorModelDAOImpl() {		
		super();
	}
	public VendorModelBean[] loadVendorNames() throws java.rmi.RemoteException, com.apria.sims.ws.logger.WSFaultType, SQLException {
		logger.info("In the loadVendorNames() of the VendorModelDAOImpl()");
		return daoobj.loadVendorNames();
	}
	public VendorModelBean[] searchVendor(java.lang.String vendorName, java.lang.String vendorModelNumber, int vndr_sk) throws java.rmi.RemoteException, com.apria.sims.ws.logger.WSFaultType, SQLException {
		logger.info("In the searchVendor() of the VendorModelDAOImpl()");
		VendorModelBean[] tempbean = null;
		if(vendorName != null || vendorModelNumber != null){
			tempbean = daoobj.searchVendor(vendorName, vendorModelNumber, vndr_sk);
		}
		return tempbean;
	}
	public long checkVendorModel(String vendorName, String vendorModel, String productID, int vndorsk, String operation) throws WSFaultType,java.rmi.RemoteException, SQLException{
		logger.info("In the checkVendorModel() of the VendorModelDAOImpl()");
		long tmpvar = 0;
		if(!(vendorName == null && vendorModel == null)){
			tmpvar = daoobj.checkVendorModel(vendorName, vendorModel, productID, vndorsk, operation);
		}
		return tmpvar;
	}
	public long checkVendorName(String vendorName) throws WSFaultType, SQLException{
		logger.info("In the checkVendorName() of the VendorModelDAOImpl()");
		long tmpvar = 0;
		if(vendorName != null){
			tmpvar = daoobj.checkVendorName(vendorName);
		}
		return tmpvar;
	}
}
