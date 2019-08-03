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
package com.apria.ws.payersvcs;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;


/**
 * PayorBenefitsDAO - Responsible for connecting to the DB and obtaining the 
 * PayorBenefits data.
 * 
 * @author BMARTINEZ - July 21, 2009 - Initial Code Completion
 */
public class MasterAgreementDAO {
	
	public static final String _JNDI_NAME = "java:comp/env/jdbc/PPI";
	

	/**
	 * Retrieves the payor benefits from the DB.
	 * 
	 * @param payorId
	 * @return PayorBenefits
	 */
	public MasterAgreement getMasterAgreementDetails( String agrmtId ) {
		
		Connection con = getConnection();
		PreparedStatement ps = null;
		MasterAgreement maResults = null;
		
		try {
			StringBuffer statement = new StringBuffer(); 
			statement.append("SELECT MSTR_AGRMT_UNQ_SK, MSTR_AGRMT_ID, MSTR_AGRMT_NM FROM PPI.M_MSTR_AGRMT ");
			statement.append("WHERE MSTR_AGRMT_ID = ? ");
			
			ps = con.prepareStatement(statement.toString());
			ps.setString( 1, agrmtId );
			ResultSet rs = ps.executeQuery();
			
			if ( rs.next() ) 
		    {   
				maResults = new MasterAgreement();
				maResults.setMstrAgrmtUnqSk(rs.getString("MSTR_AGRMT_UNQ_SK"));
				maResults.setMstrAgrmtId(rs.getString("MSTR_AGRMT_ID"));
				maResults.setMstrAgrmtNm(rs.getString("MSTR_AGRMT_NM"));
				maResults.setIsMstrAgrmtValid(true);				
			} else {
				maResults = new MasterAgreement();
				maResults.setMstrAgrmtUnqSk("");
				maResults.setMstrAgrmtId("");
				maResults.setMstrAgrmtNm("");
				maResults.setIsMstrAgrmtValid(false);
			}

		} catch (SQLException e) {
			e.printStackTrace(System.err);
			maResults = null;
		} finally {
			try {
				if (ps != null)
					ps.close();
				if (con != null)
					con.close();
			} catch (Exception e) {
				e.printStackTrace(System.err);
			}
		}
		return maResults;
	}

	/**
	 * Utility method used to obtain a connection to the DB.
	 * 
	 * @return Connection
	 */
	private Connection getConnection() {
		Connection con = null;
		try {
			InitialContext ic = new InitialContext();
			DataSource ds = (DataSource) ic.lookup(_JNDI_NAME);
			con = ds.getConnection();
		} catch (NamingException e) {
			e.printStackTrace(System.err);
		} catch (SQLException e) {
			e.printStackTrace(System.err);
		}
		return con;
	}
	
}
