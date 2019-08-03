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
public class PayorBenefiesDAO {
	
	public static final String _JNDI_NAME = "java:comp/env/jdbc/PPI";
	

	/**
	 * Retrieves the payor benefits from the DB.
	 * 
	 * @param payorId
	 * @return PayorBenefits
	 */
	public PayorBenefits getPayorBenefits( String payorId ) {
		
		Connection con = getConnection();
		PreparedStatement ps = null;
		PayorBenefits pbResult = null;
		
		try {

			StringBuffer statement = new StringBuffer(); 
			statement.append("SELECT PPI.M_PYR_BNFT.PYR_BNFT_UNQ_SK, PPI.M_PYR_BNFT.PYR_BNFT_ID, PPI.M_PYR_BNFT.RTHME_AGRMT_UNQ_SK, ");
			statement.append("PPI.M_PYR_BNFT.PYR_BNFT_NM, PPI.M_PYR_BNFT.RPTG_PYR_BNFT_IN, PPI.M_PYR_BNFT.PYR_BNFT_SUB_GRP_UNQ_SK, ");
			statement.append("PPI.M_PYR_BNFT.RPTG_PYR_BNFT_ID, PPI.M_PYR_BNFT.RPTG_PYR_BNFT_NM, PPI.M_RTHME_AGRMT.AGRMT_ID, ");
			statement.append("PPI.M_RTHME_AGRMT.AGRMT_NM, PPI.M_PYR_BNFT_ADDR.PYR_BNFT_ADDR_UNQ_SK, ");
			statement.append("PPI.M_PYR_BNFT_ADDR.ADDR_LINE_1_TX, PPI.M_PYR_BNFT_ADDR.ADDR_LINE_2_TX, ");
			statement.append("PPI.M_PYR_BNFT_ADDR.CITY_NM, PPI.M_PYR_BNFT_ADDR.ST_CD, PPI.M_PYR_BNFT_ADDR.ZIP_CD, ");
			statement.append("PPI.M_PYR_BNFT_ADDR.ZIP_EXT_CD, PPI.M_PYR_BNFT_ADDR.TLPHN_AREA_NR, ");
			statement.append("substr(digits(PPI.M_PYR_BNFT_ADDR.TLPHN_PREFIX_NR),8,3) as TLPHN_PREFIX_NR, ");
			statement.append("substr(digits(PPI.M_PYR_BNFT_ADDR.TLPHN_LAST_NR),7,4) as TLPHN_LAST_NR, PPI.M_MSTR_AGRMT.MSTR_AGRMT_UNQ_SK, ");
			statement.append("PPI.M_MSTR_AGRMT.MSTR_AGRMT_ID, PPI.M_MSTR_AGRMT.MSTR_AGRMT_NM ");
			statement.append("FROM PPI.M_PYR_BNFT LEFT OUTER JOIN PPI.M_PYR_BNFT_ADDR ON PPI.M_PYR_BNFT.PYR_BNFT_UNQ_SK = PPI.M_PYR_BNFT_ADDR.PYR_BNFT_UNQ_SK ");
			statement.append("LEFT OUTER JOIN PPI.M_RTHME_AGRMT ON PPI.M_PYR_BNFT.RTHME_AGRMT_UNQ_SK = PPI.M_RTHME_AGRMT.RTHME_AGRMT_UNQ_SK LEFT OUTER ");
			statement.append("JOIN PPI.M_MSTR_AGRMT ON PPI.M_RTHME_AGRMT.MSTR_AGRMT_UNQ_SK = PPI.M_MSTR_AGRMT.MSTR_AGRMT_UNQ_SK ");
			statement.append("WHERE PPI.M_PYR_BNFT.PYR_BNFT_ID = ? ");
			
			ps = con.prepareStatement(statement.toString());
			ps.setString( 1, payorId );
			
			PayorBenefitsLogger.log("SQL Statement ===> " + ps.toString());
			
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {

				pbResult = new PayorBenefits();
				pbResult.setPyr_bnft_unq_sk(rs.getString("PYR_BNFT_UNQ_SK"));
				pbResult.setPyr_bnft_id(rs.getString("PYR_BNFT_ID"));
				pbResult.setRthme_agrmt_unq_sk(rs.getString("RTHME_AGRMT_UNQ_SK"));
				pbResult.setPyr_bnft_nm(rs.getString("PYR_BNFT_NM"));
				pbResult.setRptg_pyr_bnft_in(rs.getString("RPTG_PYR_BNFT_IN"));
				pbResult.setPyr_bnft_sub_grp_unq_sk(rs.getString("PYR_BNFT_SUB_GRP_UNQ_SK"));
				pbResult.setRptg_pyr_bnft_id(rs.getString("RPTG_PYR_BNFT_ID"));
				pbResult.setRptg_pyr_bnft_nm(rs.getString("RPTG_PYR_BNFT_NM"));
				pbResult.setAgrmt_id(rs.getString("AGRMT_ID"));
				pbResult.setAgrmt_nm(rs.getString("AGRMT_NM"));
				pbResult.setPyr_bnft_addr_unq_sk(rs.getString("PYR_BNFT_ADDR_UNQ_SK"));
				pbResult.setAddr_line_1_tx(rs.getString("ADDR_LINE_1_TX"));
				pbResult.setAddr_line_2_tx(rs.getString("ADDR_LINE_2_TX"));
				pbResult.setCity_nm(rs.getString("CITY_NM"));
				pbResult.setSt_cd(rs.getString("ST_CD"));
				pbResult.setZip_cd(rs.getString("ZIP_CD"));
				pbResult.setZip_ext_cd(rs.getString("ZIP_EXT_CD"));
				pbResult.setTlphn_area_nr(rs.getString("TLPHN_AREA_NR"));
				pbResult.setTlphn_prefix_nr(rs.getString("TLPHN_PREFIX_NR"));
				pbResult.setTlphn_last_nr(rs.getString("TLPHN_LAST_NR"));
				pbResult.setMstr_agrmt_unq_sk(rs.getString("MSTR_AGRMT_UNQ_SK"));
				pbResult.setMstr_agrmt_id(rs.getString("MSTR_AGRMT_ID"));
				pbResult.setMstr_agrmt_nm(rs.getString("MSTR_AGRMT_NM"));
				
			}
		} catch (SQLException e) {
			e.printStackTrace(System.err);
			pbResult = null;
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
		return pbResult;
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
