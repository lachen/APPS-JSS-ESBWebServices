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
package com.apria.sims.ws.bean;

/**
 * @author jainadit
 * Constant class for Equipment details web service
 */
public class Constant {

	public final static String SQL_GET_EQUIPMENT_NOTES = "SELECT D.LAST_UPDT_TS, " +//get notes history from the table
													"D.LAST_UPDT_USR, " +//for equipments
													"D.EQPMT_NOTE_TX, " +
													"D.BU_ID "+
													"FROM SIMS.EQPMT_TRKNG_NOTE D " +
													"WHERE D.REC_ACTV_IN = ? " +
													"AND D.VNDR_SK = ? " +
													"AND D.MODEL_NR = ? " +
													"AND D.SERIAL_NR = ? ";
	
	public final static String SQL_GET_EQUIPMENT_HISTORY = "SELECT EQPMT_HIST_TS, " +
											       "EQPMT_STS_CD, " +
											       "LAST_UPDT_USR, " +
											       "BU_ID, " +                                   
											       "ACIS_BU_ID, " +
											       "SRC_SYS_ID, " +
											       "CUST_ID, " +                                                                            
											       "DLVRY_WRK_ORD_ID, " +                                                                             
											       "PCKUP_WRK_ORD_ID " +
												   "FROM (SELECT D.EQPMT_HIST_TS, " + 
											       "D.EQPMT_STS_CD, " +
											       "D.LAST_UPDT_USR, " + 
											       "D.BU_ID AS BU_ID, " +                                                           
											       "C.BU_ID AS ACIS_BU_ID, " +
											       "C.SRC_SYS_ID, " +
											       "C.CUST_ID, " +                                                                           
											       "C.DLVRY_WRK_ORD_ID, " +                                                                             
											       "C.PCKUP_WRK_ORD_ID, " +
											       "RANK()OVER(PARTITION BY  " +
											       "DATE(D.EQPMT_HIST_TS), " + 
											       "D.EQPMT_STS_CD, " +
											       "D.LAST_UPDT_USR,  " +
											       "D.BU_ID, " +                                                        
											       "C.BU_ID, " +
											       "C.SRC_SYS_ID, " +
											       "C.CUST_ID, " +                                                                           
											       "C.DLVRY_WRK_ORD_ID, " +                                                                             
											       "C.PCKUP_WRK_ORD_ID ORDER BY D.EQPMT_HIST_TS ASC) RNK " +                                                                          
											       "FROM SIMS.EQPMT_TRKNG_HIST D  " +                                                                             
											       "LEFT OUTER JOIN SIMS.SRC_ACIS_EQPMT_TRKNG C " +                                                    
											       "ON D.EQPMT_SK = C.EQPMT_SK " +                                                                             
											       "WHERE D.REC_ACTV_IN = ?  AND D.MODEL_NR = ?  AND D.SERIAL_NR = ?  AND D.VNDR_SK = ?) " +
												   "WHERE RNK =1 ";
	
	public final static String GET_MASK_CODES = "SELECT MODEL_MASK_SK, " + //get list of mask codes
											"MODEL_MASK_CD " +
											"FROM SIMS.VNDR_MODEL_MASK " +
											"WHERE VNDR_SK = ? " +
											"AND MODEL_NR = ? " +
											"AND REC_ACTV_IN = ?";
	public final static String GET_VALUES_FOR_NEXT_T_DT = "SELECT MFG_DT_OFFSET_MTH_NR, " + //get offset month values to do the 
													"NEXT_TEST_MTH_NR "+ //date calculation in the equipment 
													"FROM SIMS.VNDR_MODEL "+ //details page while modifying the 
													"WHERE VNDR_SK = ? " + // equipment Details
													"AND MODEL_NR = ? " +
													"AND SRC_PROD_ID = ? " +
													"AND REC_ACTV_IN = 'Y'";
	public final static String SQL_GET_SEARCH_EQUIPMENTS = "SELECT A.VNDR_SK, " + //search equipments
														"A.VNDR_NM, " +
														"B.SRC_PROD_ID, " +
														"C.MODEL_NR, " +
														"C.SERIAL_NR, " +
														"C.EQPMT_SK, "+
														"C.MFG_SERIAL_NR, " +
														"C.MFG_DT, " +
														"C.NEXT_TEST_DT, " +
														"C.EQPMT_STS_CD, "+
														"C.BU_ID "+
														"FROM SIMS.EQPMT_TRKNG C "+
														"INNER JOIN SIMS.VNDR A " +
														"ON A.VNDR_SK = C.VNDR_SK  "+
														"INNER JOIN SIMS.VNDR_MODEL B " +
														"ON B.VNDR_SK = A.VNDR_SK  "+
														"WHERE A.VNDR_NM = ? " +
														"AND C.MODEL_NR = ? " +
														"AND C.SERIAL_NR = ? "+
														"AND B.SRC_PROD_ID = ? " +
														"AND C.VNDR_SK = ? " +
														"AND C.EQPMT_SK = ? ";
	
	public final static String SQL_CHECK_SERIALNUMBER = "SELECT EQPMT_SK " +//check serial number befor adding
													"FROM SIMS.EQPMT_TRKNG " +
													"WHERE VNDR_SK = ? " +
													"AND MODEL_NR = ? " +
													"AND SERIAL_NR = ?";
	public final static String SQL_LOAD_VENDORNAMES = "SELECT VNDR_SK , " + //load all the vendor names in the 
												"VNDR_NM " +// drop down
												"FROM SIMS.VNDR " +
												"WHERE REC_ACTV_IN = 'Y' WITH UR";
	public final static String SQL_LOAD_SEARCH_EQUIPMENT_PARAMETER = "SELECT A.VNDR_SK, " + //search equipment details
																"A.VNDR_NM, " +
																"B.SRC_PROD_ID, " +
																"B.MODEL_NR, " +
																"C.SERIAL_NR, " +
																"C.EQPMT_SK, "+
																"C.MFG_SERIAL_NR, " +
																"C.MFG_DT, " +
																"C.NEXT_TEST_DT, " +
																"C.EQPMT_STS_CD, "+
																"C.BU_ID "+
																"FROM SIMS.VNDR A  "+
																"INNER JOIN SIMS.VNDR_MODEL B " +
																"ON  A.VNDR_SK = B.VNDR_SK "+
																" LEFT OUTER JOIN SIMS.EQPMT_TRKNG C " +
																"ON A.VNDR_SK = C.VNDR_SK " +
																"AND B.MODEL_NR = C.MODEL_NR" +
																" WHERE ";
	public static final String _JNDI_NAME = "java:comp/env/jdbc/SIMSODS";//jndi name to search

}
