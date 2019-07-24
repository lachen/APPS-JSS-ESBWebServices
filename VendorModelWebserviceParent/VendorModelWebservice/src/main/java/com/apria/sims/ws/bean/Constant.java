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
 * Constant class for Queries
 */
public class Constant {
	public static String SQL_SEARCH_VENDOR = "SELECT B.VNDR_NM "+// Query To Search Vendor Details
										      ", B.VNDR_SK "+    
										      ", A.RETEST_OFFSET_DAYS_NR "+
										      ", A.MODEL_NR "+
										      ", A.MFG_DT_CALC_CD "+
										      ", A.MFG_DT_CALC_NM "+
										      ", A.MFG_DT_OFFSET_MTH_NR "+
										      ", A.NEXT_TEST_MTH_NR "+
										      ", A.HOLD_DLVRY_CNFRM_IN "+
										      ", A.SRC_PROD_ID "+
										      ", A.EFF_DT "+
										      ", A.END_DT "+
											   "FROM VNDR AS B "+
											    "  , VNDR_MODEL AS A "+
											" WHERE B.REC_ACTV_IN = 'Y' "+
											  " AND B.VNDR_SK=A.VNDR_SK "+
											  " AND  ";
	public static String SQL_GET_MASK_CODES = "SELECT A.MODEL_MASK_CD," +//Query to Get Mask Codes
												" A.MODEL_MASK_SK "+
												"FROM (" +
												"SELECT B.VNDR_SK " +
												",B.MODEL_NR " +
												"FROM VNDR_MODEL AS B " +
												"WHERE B.VNDR_SK = ? " +
												"AND B.MODEL_NR = ? " +
												"AND B.REC_ACTV_IN = 'Y'" +
												") AS VMDL "+
												"INNER JOIN VNDR_MODEL_MASK AS A " +
												"ON A.VNDR_SK = VMDL.VNDR_SK " +
												"AND A.MODEL_NR = VMDL.MODEL_NR " +
												"AND A.REC_ACTV_IN = 'Y' ";
	public static String SQL_GET_MASK_CODES_INACTIVE = "SELECT A.MODEL_MASK_CD," +//Query to get inactive mask codes
														" A.MODEL_MASK_SK "+
														"FROM (" +
														"SELECT B.VNDR_SK ,B.MODEL_NR " +
														"FROM VNDR_MODEL AS B " +
														"WHERE B.VNDR_SK = ? " +
														"AND B.MODEL_NR = ? " +
														"AND B.REC_ACTV_IN = 'Y') AS VMDL "+
														"INNER JOIN VNDR_MODEL_MASK AS A " +
														"ON A.VNDR_SK = VMDL.VNDR_SK " +
														"AND A.MODEL_NR = VMDL.MODEL_NR " +
														"AND A.REC_ACTV_IN = 'N' ";
	public static String LOAD_VENDOR_NAMES = "SELECT VNDR_SK , " +//Load Vendor Names
												"VNDR_NM " +
												"FROM VNDR " +
												"WHERE REC_ACTV_IN = 'Y' ";
	public static String CHECK_VENDOR_NAME = "SELECT A.VNDR_SK " +//Check for existing Vendor
												"FROM VNDR A " +
												"WHERE A.VNDR_NM = ? ";
	public static String CHECK_VENDOR_MODEL = "SELECT A.VNDR_SK " +//Check for existing Vendor model
												"FROM (" +
												"SELECT B.VNDR_SK " +
												"FROM VNDR AS B " +
												"WHERE B.VNDR_NM = ? " +
												"AND B.REC_ACTV_IN = 'Y'" +
												") AS TEMP " +
												"INNER JOIN VNDR_MODEL AS A " +
												"ON A.VNDR_SK=TEMP.VNDR_SK ";
	public static String CHECK_VENDOR_PRODUCTID = "SELECT A.VNDR_SK " +//Check for existing Vendor model
													"FROM VNDR_MODEL A " +
													" WHERE A.SRC_PROD_ID = ?" +
													" AND A.REC_ACTV_IN = 'Y' ";
	public static final String _JNDI_NAME = "java:comp/env/jdbc/SIMSODS";//jndi name to search
}
