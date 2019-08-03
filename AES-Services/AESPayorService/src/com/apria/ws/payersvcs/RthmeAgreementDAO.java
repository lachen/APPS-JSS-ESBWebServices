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
public class RthmeAgreementDAO {
	
	public static final String _JNDI_NAME = "java:comp/env/jdbc/PPI";
	

	/**
	 * Retrieves the payor benefits from the DB.
	 * 
	 * @param payorId
	 * @return PayorBenefits
	 */
	public RthmeAgreement getRthmeAgreementDetails( String agrmtId ) {
		
		Connection con = getConnection();
		PreparedStatement ps = null;
		RthmeAgreement raResults = null;
		
		try {

			String statement = "SELECT AGRMT_ID, AGRMT_NM, MSTR_AGRMT_UNQ_SK FROM PPI.M_RTHME_AGRMT WHERE AGRMT_ID = ? ";
			
			ps = con.prepareStatement(statement);
			ps.setString( 1, agrmtId );
			ResultSet rs = ps.executeQuery();
			
			if ( rs.next() ) 
		    {   
				raResults = new RthmeAgreement();
				raResults.setAgrmtId(rs.getString("AGRMT_ID"));
				raResults.setAgrmtNm(rs.getString("AGRMT_NM"));
				raResults.setAgrmtUnqSk(rs.getString("MSTR_AGRMT_UNQ_SK"));
				raResults.setIsRthmeAgrmtValid(true);				
			} else {
				raResults = new RthmeAgreement();
				raResults.setAgrmtId(rs.getString(""));
				raResults.setAgrmtNm(rs.getString(""));
				raResults.setAgrmtUnqSk(rs.getString(""));
				raResults.setIsRthmeAgrmtValid(false);				
			}

		} catch (SQLException e) {
			e.printStackTrace(System.err);
			raResults = null;
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
		return raResults;
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
