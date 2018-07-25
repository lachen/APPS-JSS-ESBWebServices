package com.apria.sims.ws.impl;


public interface EquipmentDetailsDAOImpl_SEI extends java.rmi.Remote
{
  public com.apria.sims.ws.bean.EquipmentDetailsBean getMaskCodes(java.lang.String modelNumber,int vendorsk,java.lang.String productid) throws com.apria.sims.ws.logger.WSFaultType,java.sql.SQLException;
  public com.apria.sims.ws.bean.EquipmentDetailsBean[] getEquipmentHistory(java.lang.String modelNumber,java.lang.String serialNumber,long eqpmtsk,long vendorsk) throws java.rmi.RemoteException,com.apria.sims.ws.logger.WSFaultType,java.sql.SQLException;
  public com.apria.sims.ws.bean.EquipmentDetailsBean[] searchEquipmentParameters(java.lang.String vendorName,java.lang.String modelNumber,java.lang.String serialNumber,java.lang.String productID,java.lang.String function) throws java.rmi.RemoteException,com.apria.sims.ws.logger.WSFaultType,java.sql.SQLException;
  public com.apria.sims.ws.bean.EquipmentDetailsBean[] getEquipmentNotes(java.lang.String modelNumber,java.lang.String serialNumber,int vendorsk) throws java.rmi.RemoteException,com.apria.sims.ws.logger.WSFaultType,java.sql.SQLException;
  public com.apria.sims.ws.bean.EquipmentDetailsBean[] searchEquipment(java.lang.String vendorName,java.lang.String modelNumber,java.lang.String serialNumber,java.lang.String productID,int vendorsk,int eqpmtsk) throws java.rmi.RemoteException,com.apria.sims.ws.logger.WSFaultType,java.sql.SQLException;
  public com.apria.sims.ws.bean.EquipmentDetailsBean[] loadVendorNames() throws java.rmi.RemoteException,com.apria.sims.ws.logger.WSFaultType,java.sql.SQLException;
  public int[] checkSerialNumber(int Vendorsk,java.lang.String serialnumber,java.lang.String modelnumber) throws java.rmi.RemoteException,com.apria.sims.ws.logger.WSFaultType,java.sql.SQLException;
}