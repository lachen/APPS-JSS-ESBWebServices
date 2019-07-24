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
 * Constant Class for Vendor Queries
 */
public class Constant {
	public static final String _JNDI_NAME = "java:comp/env/jdbc/SIMSODS";//jndi name to search
	public static final String SQL_SEARCH_VENDOR = "SELECT A.VNDR_NM, " +//Query to Search Vendor Name
												"A.VNDR_SK, B.SRC_VNDR_CD "+ 
												"FROM VNDR AS A , " +
													"SRC_VNDR_XREF AS B "+
												"WHERE A.REC_ACTV_IN = 'Y' " +
												"AND A.VNDR_SK = B.VNDR_SK ";
	public static final String SQL_SEARCH_VENDOR_NAME = "SELECT A.VNDR_NM, " +
												"A.VNDR_SK, " +
												"B.SRC_VNDR_CD "+ 
												"FROM VNDR AS A , " +
													"SRC_VNDR_XREF AS B "+
												"WHERE A.REC_ACTV_IN = 'Y' " +
												"AND A.VNDR_SK = B.VNDR_SK " +
												"AND A.VNDR_NM = ? " +
												"OR B.SRC_VNDR_CD = ? ";
}
