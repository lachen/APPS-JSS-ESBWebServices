package com.apria.sims.ws.impl;


public interface VendorModelDAOImpl_SEI extends java.rmi.Remote
{
  public long checkVendorModel(java.lang.String vendorName,java.lang.String vendorModel,java.lang.String productID,int vndorsk,java.lang.String operation) throws com.apria.sims.ws.logger.WSFaultType,java.rmi.RemoteException,java.sql.SQLException;
  public com.apria.sims.ws.bean.VendorModelBean[] searchVendor(java.lang.String vendorName,java.lang.String vendorModelNumber,int vndr_sk) throws java.rmi.RemoteException,com.apria.sims.ws.logger.WSFaultType,java.sql.SQLException;
  public long checkVendorName(java.lang.String vendorName) throws com.apria.sims.ws.logger.WSFaultType,java.sql.SQLException;
  public com.apria.sims.ws.bean.VendorModelBean[] loadVendorNames() throws java.rmi.RemoteException,com.apria.sims.ws.logger.WSFaultType,java.sql.SQLException;
}