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
package com.apria.sims.ws.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

import org.apache.log4j.Logger;

import com.apria.sims.ws.bean.Constant;
import com.apria.sims.ws.bean.VendorBean;
import com.apria.sims.ws.logger.WSFaultType;

/**
 * @author jainadit
 * This is the web service to search the vendor details and a specific vendor name
 */
public class VendorDAO {
	private static final Logger logger = Logger.getLogger(VendorDAO.class);
	
	public String searchVendorName(java.lang.String vendorNameVendor, java.lang.String srcvndrcd) throws WSFaultType, SQLException{//search the vendor using the vendor name
		String name = "";
		PreparedStatement ps = null;
		ResultSet rs = null;
		Connection con = null;
		logger.info("In the searchVendorName() of vendor Web Service searching for vendor name: "+vendorNameVendor);
		name = "";
		con = getConnection();//making connection to the DB
		logger.info("In the searchVendorName() of vendor Web Service with Query "+ Constant.SQL_SEARCH_VENDOR_NAME);//logging the query
		try {
		ps = con.prepareStatement(Constant.SQL_SEARCH_VENDOR_NAME.toString());
		ps.setString( 1, vendorNameVendor.trim().toUpperCase().trim() );//vendor name is the first parameter
		ps.setString( 2, srcvndrcd.trim().toUpperCase().trim() );//vendor src code the second
		rs = ps.executeQuery();
		while(rs.next()){
			name = rs.getString("VNDR_NM");
		}
		}catch (SQLException e) {//throw the SQLException as that is thrown by RS,PS,CON
			name = "";		
			logger.error("\nVendorDAO:Exception Log:searchVendor( VendorBean:  )",e);
            throw new WSFaultType(e.getMessage(),"SQLException"," "," "," "," ");			
	}catch (Exception e) {//any other general exception
		name = "";
		throw new WSFaultType(e.getMessage(),"Exception"," "," "," "," ");
	}  finally {
		closeSqlObjects(rs, ps, con);
	}
	return name;
	}
	public VendorBean[] searchVendor(java.lang.String vendorNameVendor, java.lang.String srcvndrcd) throws java.rmi.RemoteException, com.apria.sims.ws.logger.WSFaultType, SQLException{//search vendor details using the vendor name or vendor src code or both
		PreparedStatement ps = null;
		ResultSet rs = null;
		Connection con = null;
		logger.info("In the searchVendor() of vendor Web Service with Vendor: "+vendorNameVendor +" and src vendr code: "+srcvndrcd);
		con = getConnection();
		VendorBean[] vndrlist;  
		VendorBean vbresult = null;		
		try {
			StringBuffer statement = new StringBuffer();
			//code when only SRC_VNDR_CD is entered to search
			if(srcvndrcd != null && vendorNameVendor == null){
				statement.append(Constant.SQL_SEARCH_VENDOR);
				statement.append(" AND B.SRC_VNDR_CD LIKE ?");
				ps = con.prepareStatement(statement.toString());
				ps.setString( 1, "%"+srcvndrcd.trim().toUpperCase()+"%" );
			}//code if only VNDR_NM is searched
			else if(vendorNameVendor != null && srcvndrcd == null){
				statement.append(Constant.SQL_SEARCH_VENDOR);
				statement.append(" AND A.VNDR_NM LIKE ?");
				ps = con.prepareStatement(statement.toString());
				ps.setString( 1, "%"+vendorNameVendor.trim().toUpperCase()+"%" );
			}//if both the fields are searched
			else if(srcvndrcd != null && vendorNameVendor != null){
				statement.append(Constant.SQL_SEARCH_VENDOR);
				statement.append(" AND A.VNDR_NM LIKE ? AND B.SRC_VNDR_CD LIKE ?");
				ps = con.prepareStatement(statement.toString());
				ps.setString( 1, "%"+vendorNameVendor.trim().toUpperCase()+"%" );
				ps.setString( 2, "%"+srcvndrcd.trim().toUpperCase()+"%" );
			}
			else{
				logger.error("Returning from Vendor DAO a Null object for Vendor Search");
				return null;
			}
			statement.append(" WITH UR ");
			logger.info("In the searchVendor() of vendor Web Service with Query: "+statement.toString());
			rs = ps.executeQuery();
			ArrayList<VendorBean> tempvbarraylist = new ArrayList<VendorBean>();
			while (rs.next()) {
				vbresult = new VendorBean();
				vbresult.setVendorNameVendor(rs.getString("VNDR_NM").trim().toUpperCase());
				vbresult.setSrcvndrcd(rs.getString("SRC_VNDR_CD").trim().toUpperCase());
				vbresult.setVndrsk(rs.getInt("VNDR_SK"));		       
		      	tempvbarraylist.add(vbresult);
			}
			vndrlist = (VendorBean[]) tempvbarraylist.toArray(new VendorBean[tempvbarraylist.size()]);
			}catch (SQLException e) {
				vbresult = null;
				logger.error("\nVendorDAO:Exception Log:searchVendor() SQLException exception",e);
				throw new WSFaultType(e.getMessage(),"SQLException"," "," "," "," ");		
		}catch (Exception e) {
			vbresult = null;
			throw new WSFaultType(e.getMessage(),"Exception","","","","");			 
		}  finally {
			closeSqlObjects(rs, ps, con);
			}
		return vndrlist;
	}
	
	//close all sql objects which are open
	public static void closeSqlObjects(ResultSet rs, PreparedStatement stmt,Connection con) {
    if (rs != null) {
            try {
                    rs.close();
            } catch (SQLException e) {
            }
    }
    if (stmt != null) {
            try {
                    stmt.close();
            } catch (SQLException e) {
            }
    }
    if (con != null) {
            try {
                    con.close();
            } catch (SQLException e) {
            }
    }
	}
	
	/*Method to create a connection to use in Dao*/
	private Connection getConnection() throws WSFaultType {//create a connection obj
		logger.error("\nConnection created");
		Connection con1 = null;
		try {
			InitialContext ic = new InitialContext();
			DataSource ds = (DataSource) ic.lookup(Constant._JNDI_NAME);
			con1 = ds.getConnection();
		} catch (NamingException e) {
			logger.error("\nVendorDAO:Exception Log:getConnection( VendorBean: ) in the connection",e);
			throw new WSFaultType(e.getMessage(),"NamingException","","","","");
		} catch (SQLException e) {
			logger.error("\nVendorDAO:Exception Log:getConnection( VendorBean: ) in the connection",e);
			throw new WSFaultType(e.getMessage(),"SQLException","","","","");
		}
		return con1;
	}
}
