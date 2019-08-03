package com.apria.svcs.acis;


public interface CustSummaryForCustIdSvcsImpl_SEI extends java.rmi.Remote
{
  public com.apria.svcs.acis.CustSummary getCustSummaryForCustId(java.lang.String custId,java.lang.String acisCPU,java.lang.String returnMax) throws java.rmi.RemoteException,com.apria.svcs.acis.WSFaultType;
}