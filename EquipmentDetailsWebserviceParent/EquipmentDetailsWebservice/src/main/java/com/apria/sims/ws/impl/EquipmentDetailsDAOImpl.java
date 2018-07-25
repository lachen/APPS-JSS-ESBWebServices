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

import java.rmi.RemoteException;
import java.sql.SQLException;

import com.apria.sims.ws.bean.EquipmentDetailsBean;
import com.apria.sims.ws.dao.EquipmentDetailsDAO;
import org.apache.log4j.Logger;
import com.apria.sims.ws.logger.WSFaultType;
import com.apria.sims.ws.simsinterface.EquipmentDetailsInterface;

/**
 * @author jainadit
 * Impl class for Equipment Details Web Service
 */
public class EquipmentDetailsDAOImpl implements EquipmentDetailsInterface {
	private EquipmentDetailsDAO daoobj = new EquipmentDetailsDAO();
	private static final Logger logger = Logger.getLogger(EquipmentDetailsDAOImpl.class);
	
	public EquipmentDetailsDAOImpl() {
		super();
	}
	public EquipmentDetailsBean[] searchEquipment(String vendorName, String modelNumber,
			String serialNumber, String productID, int vendorsk,int eqpmtsk )
	throws java.rmi.RemoteException, com.apria.sims.ws.logger.WSFaultType, SQLException {
		logger.info("\n In searchEquipment() of EquipmentDetailsDAOImpl");		
		return daoobj.searchEquipment(vendorName, modelNumber, serialNumber, productID, vendorsk, eqpmtsk);		
	}//method to get all the details for the selected parameter criteria selected
	public EquipmentDetailsBean[] searchEquipmentParameters(String vendorName,
			String modelNumber, String serialNumber, String productID, String function )
	throws java.rmi.RemoteException, com.apria.sims.ws.logger.WSFaultType, SQLException {
		logger.info("\n In searchEquipmentParameters() of EquipmentDetailsDAOImpl");
		EquipmentDetailsBean[] temparray =null;
		//if(vendorName !=null){//check name as this is the mandatory field
			logger.info("\n In searchEquipmentParameters() of EquipmentDetailsDAOImpl, vendorName: "+vendorName);
			temparray = daoobj.searchEquipmentParameters(vendorName, modelNumber, serialNumber, productID, function);
		//}
		return temparray;
	}//method to get the in for search parameters 
	public EquipmentDetailsBean[] loadVendorNames() throws java.rmi.RemoteException, com.apria.sims.ws.logger.WSFaultType, SQLException {
		logger.info("\n In loadVendorNames() of EquipmentDetailsDAOImpl");
		return daoobj.loadVendorNames();
	}//load the names of the vendor in the drop down
	public EquipmentDetailsBean[] getEquipmentHistory(String modelNumber,
			String serialNumber, long eqpmtsk, long vendorsk)
			throws RemoteException, WSFaultType, SQLException {
		logger.info("\n In getEquipmentHistory() of EquipmentDetailsDAOImpl");
		EquipmentDetailsBean[] temparray =null;
		if(modelNumber != null && serialNumber != null){//model number and serial number should not be null
			temparray = daoobj.getEquipmentHistory(modelNumber, serialNumber, eqpmtsk, vendorsk);
		}
		return temparray ; 
	}
	public EquipmentDetailsBean[] getEquipmentNotes(String modelNumber,
			String serialNumber, int vendorsk) throws RemoteException,
			WSFaultType, SQLException {
		logger.info("\n In getEquipmentNotes() of EquipmentDetailsDAOImpl");
		EquipmentDetailsBean[] temparray =null;
		if(modelNumber != null && serialNumber != null){//model number and serial number should not be null
			temparray = daoobj.getEquipmentNotes(modelNumber, serialNumber, vendorsk);
		}
		return temparray; 
	}
	public int[] checkSerialNumber(int Vendorsk,String serialnumber, String modelnumber) throws java.rmi.RemoteException, com.apria.sims.ws.logger.WSFaultType, SQLException{
		logger.info("\n In checkSerialNumber() of EquipmentDetailsDAOImpl");
		return daoobj.checkSerialNumber(Vendorsk, serialnumber, modelnumber);
	}
	public EquipmentDetailsBean getMaskCodes(String modelNumber, int vendorsk, String productid) throws WSFaultType, SQLException {
		logger.info("\n In getMaskCodes() of EquipmentDetailsDAOImpl");
		EquipmentDetailsBean tempmbean = null;
		if(modelNumber != null){//model number should not be null
			tempmbean = daoobj.getMaskCodes(modelNumber, vendorsk,productid);
		}
		return tempmbean;
	}
}