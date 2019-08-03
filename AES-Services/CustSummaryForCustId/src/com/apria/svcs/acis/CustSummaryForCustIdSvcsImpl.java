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

import java.sql.SQLException;

import com.ibm.db.beans.DBException;
import com.ibm.db.beans.DBParameterMetaData;
import com.ibm.db.beans.DBProcedureCall;

/**
 * Implementation class for CustDtlsForCustId - Connects to ACIS and invokes the
 * SP to get back the customer name dtls for the customer id
 * 
 * @author Aravind Nandanan
 */
public class CustSummaryForCustIdSvcsImpl implements CustSummaryForCustIdSvcs
{

    private DBProcedureCall  procCall;
    private static final int iRetryCount = 2;

    /**
     * getCustDtlsForCustId
     * 
     * @param custId
     * @param acisCPU
     * @param returnMax
     * @return CustDetails
     */
    public CustSummary getCustSummaryForCustId(String custId, String acisCPU,
            String returnMax) throws java.rmi.RemoteException,
            com.apria.svcs.acis.WSFaultType {
        if (acisCPU != null && !acisCPU.equals("")) {
            try {
                initializer(acisCPU);
                // Set stored procedure input parameters.
                procCall.setParameter("CUST_ID", custId);
                long startTimeQuery = System.currentTimeMillis();
                procCall.execute();
                Logger.info("time to run SQL is "
                        + (System.currentTimeMillis() - startTimeQuery)
                        + " milliseconds.");
                CustSummary custDtls = new CustSummary();
                Logger.info("row count is " + procCall.getRowCount());
                if (procCall.getRowCount() > 0) {
                    custDtls.setCustFirstName((String) procCall.getCacheValueAt(1,
                                                                                1));
                    custDtls.setCustMidItl((String) procCall.getCacheValueAt(1,
                                                                             2));
                    custDtls.setCustLastName((String) procCall.getCacheValueAt(1,
                                                                               3));
                    custDtls.setCustDOB((String) procCall.getCacheValueAt(1,4));
                }
                procCall.close();
                return custDtls;
            }
            catch (SQLException ex) {
            	ex.printStackTrace();
                Logger.error("\nCUSTSUMMARYFORCUSTID:Exception Log:getCustDtlsForCustIdSvcs( Parameters: "
                        + custId + " " + acisCPU + " " + " " + returnMax + " )");
                throw new WSFaultType(ex.getMessage(),
                                      "SQL",
                                      " ",
                                      " ",
                                      " ",
                                      " ");
            }
            catch (Exception ex) {
            	ex.printStackTrace();
                Logger.error("\nCUSTSUMMARYFORCUSTID:Exception Log:getCUSTDTLSUMMARYFORCUSTIDSvcs( Parameters: "
                        + custId + " " + acisCPU + " " + " " + returnMax + " )");
                throw new WSFaultType(ex.getMessage(),
                                      "SQL",
                                      " ",
                                      " ",
                                      " ",
                                      " ");
            }
            finally {
                try {
                    if (procCall != null) {
                        procCall.close();
                    }
                }
                catch (DBException dbe) {
                    Logger.error("CUSTSUMMARYFORCUSTID:DBException closing procCall in finally"
                            + dbe.getErrorCode() + "||" + dbe.getMessage());
                }
                catch (SQLException ex) {
                    Logger.error("CUSTSUMMARYFORCUSTID:SQLException closing procCall in finally"
                            + ex.getErrorCode() + "||" + ex.getMessage());
                }
            }
        }
        return null;
    }

    /**
     * initializer - initializes the DBProcedureCall object
     * 
     * @param inJndiName
     * @throws WSFaultType
     */
    protected void initializer(String inJndiName) throws WSFaultType {
        String jndiName = "jdbc/" + inJndiName;
        int numOfRetries = 0;
        boolean retry = false;
        do {
            try {
                procCall = new DBProcedureCall();
                procCall.setDataSourceName(jndiName);
                procCall.setCommand("{ CALL OBJPDBRC.GET_CUST_SUMMARY_1_0_0 (?, ?, ?, ?, ?, ?) }");

                DBParameterMetaData parmMetaData = procCall.getParameterMetaData();

                parmMetaData.setParameter(1,
                                          "CUST_ID",
                                          java.sql.DatabaseMetaData.procedureColumnIn,
                                          java.sql.Types.VARCHAR,
                                          String.class);

                parmMetaData.setParameter(2,
                                          "SYS_SQLSTATE_OUT",
                                          java.sql.DatabaseMetaData.procedureColumnOut,
                                          java.sql.Types.CHAR,
                                          String.class);
                parmMetaData.setParameter(3,
                                          "SYS_SQLCODE_OUT",
                                          java.sql.DatabaseMetaData.procedureColumnOut,
                                          java.sql.Types.VARCHAR,
                                          String.class);
                parmMetaData.setParameter(4,
                                          "SYS_EXCEPTSTATE_OUT",
                                          java.sql.DatabaseMetaData.procedureColumnOut,
                                          java.sql.Types.CHAR,
                                          String.class);
                parmMetaData.setParameter(5,
                                          "SYS_MSGTXT_OUT",
                                          java.sql.DatabaseMetaData.procedureColumnOut,
                                          java.sql.Types.VARCHAR,
                                          String.class);
                parmMetaData.setParameter(6,
                                          "SYS_MSGTXTLEN_OUT",
                                          java.sql.DatabaseMetaData.procedureColumnOut,
                                          java.sql.Types.VARCHAR,
                                          String.class);
                retry = false;
            }
            catch (com.ibm.websphere.ce.cm.StaleConnectionException sce) {
                if (numOfRetries < iRetryCount) {
                    retry = true;
                    numOfRetries++;
                }
                else {
                    retry = false;
                    throw new WSFaultType(sce.getMessage(),
                                          "SQL",
                                          " ",
                                          " ",
                                          " ",
                                          " ");
                }
            }
            catch (SQLException ex) {
                Logger.error("CUSTSUMMARYFORCUSTID:SQLException in initialize DBProcedure object"
                        + ex.getMessage() + "|| ex");
                retry = false;
            }
        } while (retry);
    }
}