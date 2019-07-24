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
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import org.apache.log4j.Logger;

import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

import com.apria.sims.ws.bean.Constant;
import com.apria.sims.ws.bean.MaskCodeBean;
import com.apria.sims.ws.bean.VendorModelBean;
import com.apria.sims.ws.logger.WSFaultType;

/**
 * @author jainadit
 * Vendor Model web service to get the vendor model details
 */
public class VendorModelDAO {
	private final Logger logger = Logger.getLogger(VendorModelDAO.class);
	
	
	public VendorModelBean[] searchVendor(java.lang.String vendorName, java.lang.String vendorModelNumber, int vndr_sk) throws java.rmi.RemoteException, com.apria.sims.ws.logger.WSFaultType, SQLException{
		//to search the vendor details
		int param1 = 0;
		int param2 = 0;
		int param3 = 0;
		DateFormat dfforDB2 = new SimpleDateFormat("yyyy-MM-dd");
		DateFormat dfforUser = new SimpleDateFormat("MM-dd-yyyy");	
		logger.info("In the searchVendor() of the Vendor Model Web service");
		logger.info("Searching for vendor :"+vendorName);
		PreparedStatement ps = null;
		ResultSet rs = null;
		Connection con = null;
		VendorModelBean[] vndrlist;
		VendorModelBean vbresult = null;
		con = getConnection();//crating connection with DB
		try {
			int incrementer=0;
			StringBuffer statement = new StringBuffer();
			statement.append(Constant.SQL_SEARCH_VENDOR);//all the queries are in the constant file
			if(vendorName != null){
				param1 = ++incrementer;
				statement.append(" B.VNDR_NM = ? ");
				if(vendorModelNumber != null ){
					statement.append(" AND ");
				}
			}
			if(vendorModelNumber != null ){
				param2 = ++incrementer;
				statement.append(" A.MODEL_NR LIKE ?");
			}
			if(vndr_sk>0){
				param3 = ++incrementer;
				statement.append(" AND A.VNDR_SK = ?");
			}
			//statement.append(" WITH UR ");
			ps = con.prepareStatement(statement.toString());
			if(vendorName != null){
				ps.setString(param1, vendorName.toUpperCase().trim());
			}
			if(vendorModelNumber != null){
				ps.setString(param2, "%"+vendorModelNumber.toUpperCase().trim()+"%");
			}
			if(vndr_sk >0){
				ps.setInt(param3, vndr_sk);
			}
			logger.info("Searching for vendor with Query in vendor model web service:"+statement.toString());
			rs = ps.executeQuery();
			ArrayList<VendorModelBean> vndtemparray = new ArrayList<VendorModelBean>();
			while (rs.next()) {//getting the values from the result set and setting to the bean
				vbresult = new VendorModelBean();
				vbresult.setVendorName(rs.getString("VNDR_NM").trim());
				vbresult.setVendorModel(rs.getString("MODEL_NR").trim());
				vbresult.setVndr_sk(rs.getInt("VNDR_SK"));
				vbresult.setMfgDateCalcCode(rs.getString("MFG_DT_CALC_CD"));
				vbresult.setMfgDateCalcCodeDesc(rs.getString("MFG_DT_CALC_NM"));				
				vbresult.setOffsetMonth(rs.getInt("MFG_DT_OFFSET_MTH_NR"));
				vbresult.setPmPaintDueMonths(rs.getInt("NEXT_TEST_MTH_NR"));
				vbresult.setDayspriortotrigger(rs.getInt("RETEST_OFFSET_DAYS_NR"));
				vbresult.setHlddlvrycnfrmin(rs.getString("HOLD_DLVRY_CNFRM_IN"));				
				vbresult.setSrcprodid(rs.getString("SRC_PROD_ID"));
				vbresult.setEffdt(dfforUser.format((Date)dfforDB2.parse(rs.getString("EFF_DT"))).toString());
				vbresult.setEnddt(dfforUser.format((Date)dfforDB2.parse(rs.getString("END_DT"))).toString());
				vndtemparray.add(vbresult);
			}
			vndrlist = (VendorModelBean[]) vndtemparray.toArray(new VendorModelBean[vndtemparray.size()]);
			if(vndr_sk>0){//if we have vndr_sk then we will mask codes
				logger.info("Geting the mask code for the vendor model: "+vendorModelNumber);
				MaskCodeBean[] vndrmasklist;
				StringBuffer statement1 = new StringBuffer();
				statement1.append(Constant.SQL_GET_MASK_CODES);
				//statement1.append(" WITH UR");
				ps = con.prepareStatement(statement1.toString());
				ps.setInt(1, vndr_sk );
				ps.setString( 2, vendorModelNumber.trim().toUpperCase() );
				rs = ps.executeQuery();
				ArrayList<MaskCodeBean> tempmaskarray = new ArrayList<MaskCodeBean>();
				while (rs.next()) {
					MaskCodeBean bean = new MaskCodeBean();
					bean.setModelmaskcode(rs.getString("MODEL_MASK_CD"));
					bean.setModelmasksk(rs.getInt("MODEL_MASK_SK"));
					tempmaskarray.add(bean);
				}
				vndrmasklist = (MaskCodeBean[]) tempmaskarray.toArray(new MaskCodeBean[tempmaskarray.size()]);
				vndtemparray.get(0).setMaskcodes(vndrmasklist);
				MaskCodeBean[] vndrmasklistinactive;
				StringBuffer statement2 = new StringBuffer();
				statement2.append(Constant.SQL_GET_MASK_CODES_INACTIVE);
				ps = con.prepareStatement(statement2.toString());
				ps.setInt(1, vndr_sk );
				ps.setString( 2, vendorModelNumber.trim().toUpperCase() );
				rs = ps.executeQuery();
				ArrayList<MaskCodeBean> tempmaskarrayinactive = new ArrayList<MaskCodeBean>();
				while (rs.next()) {
					MaskCodeBean bean = new MaskCodeBean();
					bean.setModelmaskcode(rs.getString("MODEL_MASK_CD"));
					bean.setModelmasksk(rs.getInt("MODEL_MASK_SK"));
					tempmaskarrayinactive.add(bean);
				}
				if(tempmaskarrayinactive.size()>0){//if we have in active mask code as well
					vndrmasklistinactive = (MaskCodeBean[]) tempmaskarrayinactive.toArray(new MaskCodeBean[tempmaskarrayinactive.size()]);
					vndtemparray.get(0).setInactmaskcodes(vndrmasklistinactive);
				}
			}
		}  catch (SQLException e) {//for all SQLExceptions
			vbresult = null;
			logger.error("\nVendorModelDAO:SQLException Log:searchVendor( Vendor Model Bean:  )",e);
            throw new WSFaultType(e.getMessage(),"SQLException"," "," "," "," ");			
	}catch (Exception e) {//for any other general exception
		logger.error("\nVendorModelDAO:Exception Log:searchVendor( Vendor Model Bean:  )",e);
		vbresult = null;
		 throw new WSFaultType(e.getMessage(),"Exception"," "," "," "," ");
	}finally {
		closeSqlObjects(rs, ps, con);
	}
		return vndrlist;
	}
	
	public VendorModelBean[] loadVendorNames() throws java.rmi.RemoteException, com.apria.sims.ws.logger.WSFaultType, SQLException{//loading the all the vendor names in the DB  
		VendorModelBean[] vndrlist;
		ResultSet rs = null;
		Connection con = null;
		PreparedStatement ps= null;
		con = getConnection();
		VendorModelBean vbresult = null;
		String statement;
		try {
		statement = Constant.LOAD_VENDOR_NAMES;
		//Statement stmt = con.createStatement();
		ps = con.prepareStatement(statement.toString());
		rs = ps.executeQuery();
		ArrayList<VendorModelBean> vndtemparray = new ArrayList<VendorModelBean>();
		while (rs.next()) {
			vbresult = new VendorModelBean();
			vbresult.setVendorName(rs.getString("VNDR_NM").trim().toUpperCase());
			vbresult.setVndr_sk(rs.getInt("VNDR_SK"));		       
			vndtemparray.add(vbresult);
		}
		vndrlist = (VendorModelBean[]) vndtemparray.toArray(new VendorModelBean[vndtemparray.size()]);
		} catch (SQLException e) {
			vbresult = null;
			logger.error("\nVendorModelDAO:Exception Log:loadVendorNames( VendorModelBean:  )",e);
            throw new WSFaultType(e.getMessage(),"SQLException"," "," "," "," ");			
	}catch (Exception e) {
		logger.error("Error in the loadVendorNames of vendor web service: ",e);
		vbresult = null;
		 throw new WSFaultType(e.getMessage(),"Exception"," "," "," "," ");
	} finally {
		closeSqlObjects(rs, ps, con);
	}
		return vndrlist;
	}
	public long checkVendorName(String vendorName) throws WSFaultType, SQLException{//check for the vendor name, this method is not currently used
		long returnvariable = -1;
		PreparedStatement ps = null;
		ResultSet rs = null;
		Connection con = null;
		con = getConnection();
		String SQL_VN_QUERY = Constant.CHECK_VENDOR_NAME;
		try {
		ps = con.prepareStatement(SQL_VN_QUERY.toString());
		ps.setString( 1, vendorName.trim().toUpperCase());
		rs = ps.executeQuery();
		while(rs.next()) {
			returnvariable = rs.getLong("VNDR_SK");
		}
		}catch (SQLException e) {
			logger.error("Error in the checkVendorName of vendor web service: ",e);
		 throw new WSFaultType(e.getMessage(),"SQLException"," "," "," "," ");
		} finally {
			closeSqlObjects(rs, ps, con);
		}
		return returnvariable;
	}
	public boolean checkProductID(String vendorName, String vendorModel, String productID, int vndorsk, String operation) throws WSFaultType, SQLException{
		boolean existFlag= false;
		PreparedStatement ps = null;
		ResultSet rs = null;
		Connection con = null;
		con = getConnection();
		long returnvariable1 = -1;
		String CHECK_VENDOR_PRODUCTID = Constant.CHECK_VENDOR_PRODUCTID;
		if(operation.equalsIgnoreCase("insert")){
			try{
				//CHECK_VENDOR_PRODUCTID = CHECK_VENDOR_PRODUCTID + " WITH UR";
				//CHECK_VENDOR_PRODUCTID = CHECK_VENDOR_PRODUCTID;
				ps = con.prepareStatement(CHECK_VENDOR_PRODUCTID.toString());
				ps.setString( 1, productID.trim().toUpperCase());
			
			rs = ps.executeQuery();
			
			while(rs.next()) {
				returnvariable1 = rs.getLong("VNDR_SK");
				if(returnvariable1>0)
					break;
			}
			}catch (SQLException e) {
				logger.error("Error in the checkVendorModel of vendor web service: ",e);
				 throw new WSFaultType(e.getMessage(),"SQLException"," "," "," "," ");
			} finally {
				closeSqlObjects(rs, ps, con);
			}
		}
		if(operation.equalsIgnoreCase("update")){
			//CHECK_VENDOR_PRODUCTID = CHECK_VENDOR_PRODUCTID + " AND (A.VNDR_SK !=? OR A.MODEL_NR !=?) WITH UR";
			CHECK_VENDOR_PRODUCTID = CHECK_VENDOR_PRODUCTID + " AND (A.VNDR_SK !=? OR A.MODEL_NR !=?)";
			try{
				ps = con.prepareStatement(CHECK_VENDOR_PRODUCTID.toString());
				ps.setString( 1, productID.trim().toUpperCase());
				ps.setInt( 2, vndorsk);
				ps.setString( 3, vendorModel.trim().toUpperCase());
				rs = ps.executeQuery();
			
			while(rs.next()) {
				returnvariable1 = rs.getLong("VNDR_SK");
				if(returnvariable1>0)
					break;
			}
			}catch (SQLException e) {
				logger.error("Error in the checkVendorModel of vendor web service: ",e);
				 throw new WSFaultType(e.getMessage(),"SQLException"," "," "," "," ");
			} finally {
				closeSqlObjects(rs, ps, con);
			}
		}
		if(returnvariable1>0)
		existFlag=true;
		
		return existFlag;
	}
	public long checkVendorModel(String vendorName, String vendorModel, String productID, int vndorsk, String operation) throws WSFaultType, SQLException {//check for the vendor model
		PreparedStatement ps = null;
		ResultSet rs = null;
		Connection con = null;
		con = getConnection();
		long returnvariable = -1;
		String SQL_CHECK_VENDOR_MODEL = Constant.CHECK_VENDOR_MODEL;
		if(operation.equalsIgnoreCase("update")){
			boolean flag = false;
			flag = checkProductID( vendorName,  vendorModel,  productID,  vndorsk, operation);
			if(flag)
				returnvariable =  1;
			else
				returnvariable = -1;
		}
		if(operation.equalsIgnoreCase("insert") ){
			boolean flag = false;
			flag = checkProductID( vendorName,  vendorModel,  productID,  vndorsk, operation);
			
			//SQL_CHECK_VENDOR_MODEL = SQL_CHECK_VENDOR_MODEL + " AND A.MODEL_NR = ? WITH UR";
			SQL_CHECK_VENDOR_MODEL = SQL_CHECK_VENDOR_MODEL + " AND A.MODEL_NR = ? ";
		
		try {
			ps = con.prepareStatement(SQL_CHECK_VENDOR_MODEL.toString());
			ps.setString( 1, vendorName.trim().toUpperCase());
			ps.setString( 2, vendorModel.trim().toUpperCase());
			rs = ps.executeQuery();
			while(rs.next()) {
				returnvariable = rs.getLong("VNDR_SK");
			}
		} catch (SQLException e) {
			logger.error("Error in the checkVendorModel of vendor web service: ",e);
		 throw new WSFaultType(e.getMessage(),"SQLException"," "," "," "," ");
	} finally {
		closeSqlObjects(rs, ps, con);
	}
	if(flag || returnvariable>0)
		returnvariable =  1;
		}
	return returnvariable;
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
	private Connection getConnection() throws WSFaultType {//creating the connection
		logger.error("\nConnection created for Vendor Model Dao");
		Connection con1 = null;
		try {
			InitialContext ic = new InitialContext();
			DataSource ds = (DataSource)ic.lookup(Constant._JNDI_NAME);
			con1 = ds.getConnection();			
		} catch (NamingException e) {
			logger.error("error in VendorModelDAO in creating the connection in getConnection()",e);
			throw new WSFaultType(e.getMessage(),"NamingException"," "," "," "," ");
		} catch (SQLException e) {
			logger.error("error in VendorModelDAO in creating the connection in getConnection()",e);
			throw new WSFaultType(e.getMessage(),"SQLException"," "," "," "," ");
		}
		return con1;
	}
}