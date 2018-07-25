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
import com.apria.sims.ws.bean.EquipmentDetailsBean;
import com.apria.sims.ws.logger.WSFaultType;

/**
 * @author jainadit
 * Interface class for Equipment Details Web service
 */
public interface EquipmentDetailsInterface extends Remote {
	public EquipmentDetailsBean[] searchEquipment(String vendorName, String modelNumber, String serialNumber, String productID, int vendorsk,int eqpmtsk) throws java.rmi.RemoteException, com.apria.sims.ws.logger.WSFaultType, SQLException;
	public EquipmentDetailsBean[] loadVendorNames() throws java.rmi.RemoteException, com.apria.sims.ws.logger.WSFaultType, SQLException ;
	public EquipmentDetailsBean[] searchEquipmentParameters(String vendorName, String modelNumber, String serialNumber, String productID, String function) throws java.rmi.RemoteException, com.apria.sims.ws.logger.WSFaultType, SQLException ;
	public EquipmentDetailsBean[] getEquipmentNotes(String modelNumber, String serialNumber, int vendorsk ) throws java.rmi.RemoteException, com.apria.sims.ws.logger.WSFaultType, SQLException;
	public EquipmentDetailsBean[] getEquipmentHistory(String modelNumber, String serialNumber, long eqpmtsk, long vendorsk ) throws java.rmi.RemoteException, com.apria.sims.ws.logger.WSFaultType, SQLException;
	public int[] checkSerialNumber(int Vendorsk,String serialnumber, String modelnumber) throws java.rmi.RemoteException, com.apria.sims.ws.logger.WSFaultType, SQLException;
	public EquipmentDetailsBean getMaskCodes(String modelNumber, int vendorsk, String productid) throws WSFaultType, SQLException ;
}
