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

import com.apria.sims.ws.bean.VendorBean;
import com.apria.sims.ws.dao.VendorDAO;
import com.apria.sims.ws.logger.WSFaultType;
import com.apria.sims.ws.simsinterface.VendorInterface;

/**
 * @author jainadit
 * Implemen Class for Vendor Web Service
 */
public class VendorDAOImpl implements VendorInterface {
	private static final Logger logger = Logger.getLogger(VendorDAOImpl.class);
	public VendorDAO vendorDAO = new VendorDAO();//dao object
	
	public VendorDAOImpl() {
		super();
	}
	public VendorBean[] searchVendor(java.lang.String vendorNameVendor, java.lang.String srcvndrcd) throws java.rmi.RemoteException, SQLException, WSFaultType {
		logger.info("\nVendorDAOImpl: searchVendor()");
		VendorBean[] tempbean = null;
		logger.info("In Vendor Web service and in searchVendor() searching for Vendor Name:"+vendorNameVendor+" and srcvndr code"+srcvndrcd);
		if(!(vendorNameVendor == null || srcvndrcd == null)){
			tempbean = vendorDAO.searchVendor( vendorNameVendor,srcvndrcd );
		}
		return tempbean;
	}
	public String searchVendorName(java.lang.String vendorNameVendor, java.lang.String srcvndrcd) throws SQLException, WSFaultType{
		logger.info("\nVendorDAOImpl: searchVendorName() and searching for VendorName: "+vendorNameVendor);
		String tempstring="";
		if(!(vendorNameVendor == null && srcvndrcd == null)){
			tempstring = vendorDAO.searchVendorName(vendorNameVendor,srcvndrcd);
		}
		return tempstring;
	}
}
