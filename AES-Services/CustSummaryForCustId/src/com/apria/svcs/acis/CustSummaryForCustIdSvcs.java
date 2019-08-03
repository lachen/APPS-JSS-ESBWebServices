/*******************************************************************************
 * Copyright (c) 2008 Apria Healthcare                                          *
 * As an unpublished work. All Rights Reserved.                                 *
 * This media contains an authorized copy or copies of material copyrighted by  *
 * Apria Healthcare and is the unpublished, confidential property of            *
 * Apria Healthcare. You may not disclose, copy or use any portion of           *
 * these materials for any purpose without the express written consent of Apria *
 * Healthcare.  You must reproduce this copyright notice and any other          *
 * copyright notices included in machine-readable copies on all authorized      *
 * copies.                                                                      *
 *******************************************************************************/

package com.apria.svcs.acis;
/**
 * Interface definition for CustDtlsForCustId Web Services
 * @author Aravind Nandanan
 *
 */
public interface CustSummaryForCustIdSvcs {
	public CustSummary getCustSummaryForCustId(String custId, String acisCpu, String returnMax) throws java.rmi.RemoteException, com.apria.svcs.acis.WSFaultType;
}
