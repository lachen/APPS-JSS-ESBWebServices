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
import java.util.Calendar;
import java.util.Date;

import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

import com.apria.sims.ws.bean.Constant;
import com.apria.sims.ws.bean.EquipmentDetailsBean;
import com.apria.sims.ws.bean.MaskCodeBean;
import com.apria.sims.ws.logger.WSFaultType;
import org.apache.log4j.Logger;

/**
 * @author jainadit
 * Equipment details web service to get all the equipment related details
 */
public class EquipmentDetailsDAO {
	private static final Logger logger = Logger.getLogger(EquipmentDetailsDAO.class);
	private static String REC_ACTV_IN ="Y";
	private DateFormat dfforDB2 = new SimpleDateFormat("yyyy-MM-dd");
	private DateFormat dfforUser = new SimpleDateFormat("MM-dd-yyyy");
	private DateFormat notesandstatus = new SimpleDateFormat("MM-dd-yyyy hh:mm");
	
	public EquipmentDetailsBean[] searchEquipmentParameters(String vendorName, String modelNumber, String serialNumber, String productID, String function ) throws java.rmi.RemoteException, com.apria.sims.ws.logger.WSFaultType, SQLException{
		int psparam1 = 0;//changed the scope to methods of the variables as they are used in  this method only
		int psparam2 = 0;
		int psparam3 = 0;
		int psparam4 = 0;
		int incrementer = 0;
			
		logger.info("start time for searching or adding : "+Calendar.getInstance().getTimeInMillis());//added to check response time
		PreparedStatement ps = null;
		ResultSet rs = null;
		Connection con = null;
		con = getConnection();
		EquipmentDetailsBean[] eqprlist;  
		EquipmentDetailsBean eqresult = null;
		StringBuffer statement = new StringBuffer();
		statement.append(Constant.SQL_LOAD_SEARCH_EQUIPMENT_PARAMETER);//queries are defined in the constant file
		incrementer = 0;//variable to create dynamic queries by incrementing for the field that is not null
		try {
			if(vendorName != null && vendorName.length()>0){//if we have vendor name
				psparam1 = ++incrementer;
				statement.append(" A.VNDR_NM = ? ");
				if((serialNumber != null && serialNumber.length()>0) || (productID != null && productID.length()>0) || (modelNumber != null && modelNumber.length()>0)){//check if we have any other field as we dont want and in the begining 
					statement.append(" AND ");
				}
			}
			if(modelNumber != null && modelNumber.length()>0){//check the model number
				psparam2 = ++incrementer;
				statement.append(" B.MODEL_NR = ? ");
				if((serialNumber != null && serialNumber.length()>0) || (productID != null && productID.length()>0)){
					statement.append(" AND ");
				}
			}
			if(serialNumber != null && serialNumber.length()>0){//check the serial number
				psparam3 = ++incrementer;
				statement.append(" C.SERIAL_NR = ? ");
				if(productID != null && productID.length()>0){
					statement.append(" AND ");
				}
			}
			if(productID != null && productID.length()>0){
				psparam4 = ++incrementer;
				statement.append(" B.SRC_PROD_ID = ? ");
			}
			if(!"".equals(function)){
				statement.append(" FETCH FIRST 1 ROW ONLY ");
			}
			//statement.append(" WITH UR "); Commented for DB Migration from DB2 to SQL
			ps = con.prepareStatement(statement.toString());
			if(vendorName != null && vendorName.length()>0){
				ps.setString( psparam1, vendorName.trim().toUpperCase());
			}
			if(modelNumber != null && modelNumber.length()>0){
				ps.setString( psparam2, modelNumber.toUpperCase().trim());
			}
			if(serialNumber != null && serialNumber.length()>0){
				ps.setString( psparam3, serialNumber.toUpperCase().trim() );
			}
			if(productID != null && productID.length()>0){
				ps.setString( psparam4, productID.toUpperCase().trim());
			}
			logger.info("Search parameters in equipment dao web service and Query is : "+statement.toString());
			rs = ps.executeQuery();
			ArrayList<EquipmentDetailsBean> eqtemparray = new ArrayList<EquipmentDetailsBean>();
			while (rs.next()) {				
				eqresult = new EquipmentDetailsBean();
				eqresult.setVendorName(rs.getString("VNDR_NM").trim());
				eqresult.setVendorsk(rs.getInt("VNDR_SK"));
				eqresult.setProductID(rs.getString("SRC_PROD_ID"));
				eqresult.setModelNumber(rs.getString("MODEL_NR"));
				if(rs.getString("SERIAL_NR") != null){
					eqresult.setSerialNumber(rs.getString("SERIAL_NR"));
					eqresult.setEqpmtsk(rs.getInt("EQPMT_SK"));
					eqresult.setManufacturSerialNumber(rs.getString("MFG_SERIAL_NR"));
					eqresult.setManufatureDate(dfforUser.format((Date)dfforDB2.parse(rs.getString("MFG_DT"))).toString());
					eqresult.setNextTestDate(dfforUser.format((Date)dfforDB2.parse(rs.getString("NEXT_TEST_DT"))).toString());
					eqresult.setEqpmtstatus(rs.getString("EQPMT_STS_CD"));		
					eqresult.setBuid(rs.getString("BU_ID"));
				}
				eqtemparray.add(eqresult);
			}
			eqprlist = (EquipmentDetailsBean[]) eqtemparray.toArray(new EquipmentDetailsBean[eqtemparray.size()]);//dynamic memory allocation and converting to bean array so as to make it RPC compatible
		} catch (SQLException e) {//SQL related exceptions
			eqprlist = null;
			logger.error("\nEquipmentDetailsDao:Exception Log:searchEquipment( EquipmentDetailsBean:  )",e);
            throw new WSFaultType(e.getMessage(),"SQLException"," "," "," "," ");
		}catch (Exception e) {//general exceptions
			logger.error("\nEquipmentDetailsDAO:Exception Log:loadVendorNames( )",e);
			throw new WSFaultType(e.getMessage(),"Exception"," "," "," "," ");
		} finally {
			closeSqlObjects(rs, ps, con);
		}
		logger.info("end time is : "+Calendar.getInstance().getTimeInMillis()+ " when we are leaving the method to search equipment");//check response time
		return eqprlist;	
	}
	
	public EquipmentDetailsBean[] getEquipmentNotes(String modelNumber, String serialNumber, int vendorsk ) throws java.rmi.RemoteException, com.apria.sims.ws.logger.WSFaultType, SQLException{//to get the notes for a equipment
		PreparedStatement ps = null;
		ResultSet rs = null;
		Connection con = null;
		con = getConnection();
		EquipmentDetailsBean[] eqprlist;  
		EquipmentDetailsBean eqresult = null;
		StringBuffer statement = new StringBuffer();
		statement.append(Constant.SQL_GET_EQUIPMENT_NOTES);
		try {
			//statement.append("ORDER BY D.LAST_UPDT_TS ASC WITH UR "); Commented for Migrating DB2 to SQL
			statement.append("ORDER BY D.LAST_UPDT_TS ASC");
			ps = con.prepareStatement(statement.toString());
			ps.setString(1, REC_ACTV_IN );
			ps.setInt(2, vendorsk );
			ps.setString(3, modelNumber.trim().toUpperCase());
			ps.setString(4, serialNumber.trim().toUpperCase());
			rs = ps.executeQuery();
			ArrayList<EquipmentDetailsBean> eqtemparray = new ArrayList<EquipmentDetailsBean>();
			DateFormat formatter ; 
			Date date12 ;
			while (rs.next()) {
				eqresult = new EquipmentDetailsBean();
				formatter = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");//converting dates to stad and comparable for mats
				date12 = (Date)formatter.parse(rs.getString("LAST_UPDT_TS"));
				eqresult.setNotesHistoryDate(notesandstatus.format(date12));
				eqresult.setNotesHistorySystemUser(rs.getString("LAST_UPDT_USR").trim());
				eqresult.setNotesHistoryText(rs.getString("EQPMT_NOTE_TX".trim()));
				eqresult.setBuid(rs.getString("BU_ID".trim()));
				eqtemparray.add(eqresult);
			}
			eqprlist = (EquipmentDetailsBean[]) eqtemparray.toArray(new EquipmentDetailsBean[eqtemparray.size()]);
		} catch (SQLException e) {
			eqresult = null;
			logger.error("\nEquipmentDetailsDao:Exception Log:getEquipmentNotes( EquipmentDetailsBean:  )",e);
            throw new WSFaultType(e.getMessage(),"SQLException"," "," "," "," ");
		}catch (Exception e) {
			logger.error("\nEquipmentDetailsDAO:Exception Log:loadVendorNames( )",e);
			throw new WSFaultType(e.getMessage(),"Exception"," "," "," "," ");
		} finally {
			closeSqlObjects(rs, ps, con);
		}
		return eqprlist;	
	}
	public EquipmentDetailsBean[] getEquipmentHistory(String modelNumber, String serialNumber, long eqpmtsk, long vendorsk ) throws java.rmi.RemoteException, com.apria.sims.ws.logger.WSFaultType, SQLException{//this gives the status changes for an equipment or history of that equipment
		PreparedStatement ps = null;
		ResultSet rs = null;
		Connection con = null;
		con = getConnection();
		EquipmentDetailsBean[] eqprlist;  
		EquipmentDetailsBean eqresult = null;
		StringBuffer statement = new StringBuffer();
		statement.append(Constant.SQL_GET_EQUIPMENT_HISTORY);
		try {
			//statement.append("ORDER BY EQPMT_HIST_TS ASC WITH UR "); Commented for Migrating DB2 to SQL
			statement.append("ORDER BY EQPMT_HIST_TS ASC");
			ps = con.prepareStatement(statement.toString());
			ps.setString(1, REC_ACTV_IN );
			ps.setString(2, modelNumber.trim().toUpperCase());
			ps.setString(3, serialNumber.trim().toUpperCase());
			ps.setLong(4, vendorsk);
			rs = ps.executeQuery();
			ArrayList<EquipmentDetailsBean> eqtemparray = new ArrayList<EquipmentDetailsBean>();
			DateFormat formatter ; 
			Date date12 ;
			while (rs.next()) {
				eqresult = new EquipmentDetailsBean();
				formatter = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");//converting dates to stad and comparable for mats
				date12 = (Date)formatter.parse(rs.getString("EQPMT_HIST_TS").trim());
				eqresult.setStatusHistoryDate(notesandstatus.format(date12));
				eqresult.setStatusHistoryStatusCode(rs.getString("EQPMT_STS_CD").trim());
				eqresult.setStatusHistorySystemUser(rs.getString("LAST_UPDT_USR"));
				eqresult.setBuid(rs.getString("BU_ID"));
				eqresult.setAcisbuid(rs.getString("ACIS_BU_ID"));
				eqresult.setSystemid(rs.getString("SRC_SYS_ID"));
				eqresult.setCustomerId(rs.getString("CUST_ID"));
				eqresult.setDlvWorkOrder(rs.getString("DLVRY_WRK_ORD_ID"));
				eqresult.setPkpWorkOrder(rs.getString("PCKUP_WRK_ORD_ID"));	
				eqtemparray.add(eqresult);
			}

			eqprlist = (EquipmentDetailsBean[]) eqtemparray.toArray(new EquipmentDetailsBean[eqtemparray.size()]);
		} catch (SQLException e) {
			eqresult = null;
			logger.error("\nEquipmentDetailsDao:Exception Log:getEquipmentNotes( EquipmentDetailsBean:  )",e);
            throw new WSFaultType(e.getMessage(),"SQLException"," "," "," "," ");
		}catch (Exception e) {
			logger.error("\nEquipmentDetailsDAO:Exception Log:loadVendorNames( )",e);
			throw new WSFaultType(e.getMessage(),"Exception"," "," "," "," ");
		} finally {
			closeSqlObjects(rs, ps, con);
		}
		return eqprlist;	
	}
	public EquipmentDetailsBean getMaskCodes(String modelNumber, int vendorsk, String productid) throws WSFaultType, SQLException {//get all the mask code for that model . used while adding new equipment to a vendor model
		EquipmentDetailsBean eqbean = new EquipmentDetailsBean();
		MaskCodeBean[] maskbean ;
		PreparedStatement ps = null;
		ResultSet rs = null;
		Connection con = null;
		con = getConnection();
		String REC_ACTV_IN = "Y";
		StringBuffer statementmaskcodes = new StringBuffer();
		statementmaskcodes.append(Constant.GET_MASK_CODES);
		try {
			//statementmaskcodes.append(" WITH UR "); Commented for Migrating DB2 to SQL
			ps = con.prepareStatement(statementmaskcodes.toString());
			ps.setInt( 1, vendorsk);
			ps.setString( 2, modelNumber.trim().toUpperCase());
			ps.setString( 3, REC_ACTV_IN);
			rs = ps.executeQuery();
		ArrayList<MaskCodeBean> masktemparray = new ArrayList<MaskCodeBean>();
		while(rs.next()){
			MaskCodeBean bean = new MaskCodeBean();
			bean.setModelmaskcode(rs.getString("MODEL_MASK_CD").toUpperCase().trim());
			bean.setModelmasksk(rs.getInt("MODEL_MASK_SK"));
			masktemparray.add(bean);
		}
		maskbean = (MaskCodeBean[]) masktemparray.toArray(new MaskCodeBean[masktemparray.size()]);
		eqbean.setMaskcodes(maskbean);
		StringBuffer vendordetails = new StringBuffer();
		vendordetails.append(Constant.GET_VALUES_FOR_NEXT_T_DT);
		ps = con.prepareStatement(vendordetails.toString());
		ps.setInt( 1, vendorsk);
		ps.setString( 2, modelNumber.trim().toUpperCase());
		ps.setString( 3, productid.trim().toUpperCase());
		rs = ps.executeQuery();
		while(rs.next()){
			eqbean.setOffsetMonth(rs.getInt("MFG_DT_OFFSET_MTH_NR"));
			eqbean.setPmPaintDueMonths(rs.getInt("NEXT_TEST_MTH_NR"));
		}
		} catch (SQLException e) {
			logger.error("\nEquipmentDetailsDao:Exception Log:getMaskCodes( MaskCodeBean:  )",e);
            throw new WSFaultType(e.getMessage(),"SQLException"," "," "," "," ");
		}catch (Exception e) {
			logger.error("\nEquipmentDetailsDAO:Exception Log:getmaskcodes( )",e);
			throw new WSFaultType(e.getMessage(),"Exception"," "," "," "," ");
		} finally {
			closeSqlObjects(rs, ps, con);
		}
		return eqbean;
	}
	public EquipmentDetailsBean[] searchEquipment(String vendorName, String modelNumber, String serialNumber, String productID, int vendorsk,int eqpmtsk ) throws java.rmi.RemoteException, com.apria.sims.ws.logger.WSFaultType, SQLException{//search for a specific equipment for a model
		logger.info("\n In searchEquipment() of EquipmentDetailsDAO");
		PreparedStatement ps = null;
		ResultSet rs = null;
		Connection con = null;
		con = getConnection();//creating the db connection
		EquipmentDetailsBean[] eqprlist;
		EquipmentDetailsBean eqresult = null;
		StringBuffer statement = new StringBuffer();//String buffer to store the query.
		statement.append(Constant.SQL_GET_SEARCH_EQUIPMENTS);
		try {
			//statement.append(" WITH UR "); Commented for Migrating DB2 to SQL
			ps = con.prepareStatement(statement.toString());
			ps.setString( 1, vendorName.trim().toUpperCase());
			ps.setString( 2, modelNumber.trim().toUpperCase());
			ps.setString( 3, serialNumber.trim().toUpperCase());
			ps.setString( 4, productID.trim().toUpperCase());
			ps.setInt( 5, vendorsk);
			ps.setInt( 6, eqpmtsk);
			rs = ps.executeQuery();
			ArrayList<EquipmentDetailsBean> eqtemparray = new ArrayList<EquipmentDetailsBean>();
			while (rs.next()) {
				eqresult = new EquipmentDetailsBean();
				eqresult.setVendorName(rs.getString("VNDR_NM").trim().toUpperCase());
				eqresult.setVendorsk(rs.getInt("VNDR_SK"));
				eqresult.setProductID(rs.getString("SRC_PROD_ID"));
				eqresult.setModelNumber(rs.getString("MODEL_NR"));
				eqresult.setSerialNumber(rs.getString("SERIAL_NR"));
				eqresult.setEqpmtsk(rs.getInt("EQPMT_SK"));
				eqresult.setManufacturSerialNumber(rs.getString("MFG_SERIAL_NR"));
				eqresult.setManufatureDate(dfforUser.format((Date)dfforDB2.parse(rs.getString("MFG_DT"))).toString());
				eqresult.setNextTestDate(dfforUser.format((Date)dfforDB2.parse(rs.getString("NEXT_TEST_DT"))).toString());
				eqresult.setEqpmtstatus(rs.getString("EQPMT_STS_CD"));
				eqresult.setBuid(rs.getString("BU_ID"));
				eqtemparray.add(eqresult);
			}
			eqprlist = (EquipmentDetailsBean[]) eqtemparray.toArray(new EquipmentDetailsBean[eqtemparray.size()]);
		} catch (SQLException e) {
			eqresult = null;
			logger.error("\nEquipmentDetailsDao:Exception Log:searchEquipment( EquipmentDetailsBean:  )",e);
            throw new WSFaultType(e.getMessage(),"SQLException"," "," "," "," ");
		}catch (Exception e) {
			logger.error("\nEquipmentDetailsDAO:Exception Log:loadVendorNames( )",e);
			throw new WSFaultType(e.getMessage(),"Exception"," "," "," "," ");
		}finally {
			closeSqlObjects(rs, ps, con);
		}
		return eqprlist;
	}	
	public EquipmentDetailsBean[] loadVendorNames() throws java.rmi.RemoteException, com.apria.sims.ws.logger.WSFaultType, SQLException{//load the vendor names
		logger.info("\n Loading Vendor names");
		EquipmentDetailsBean[] vndrlist;
		ResultSet rs = null;
		Connection con = null;
		PreparedStatement ps =null;//added as code review part
		con = getConnection();
		EquipmentDetailsBean vbresult = null;
		String statement;
		try {
		statement = Constant.SQL_LOAD_VENDORNAMES;
		logger.info("\n Loading Vendor names with query " + statement.toString());
		//Statement stmt = con.createStatement();//commented to change to Prepared statement
		ps = con.prepareStatement(statement.toString());
		rs = ps.executeQuery();//added as code review part
		//rs = stmt.executeQuery(statement.toString());//commented as code review part
		ArrayList<EquipmentDetailsBean> eqtemparray = new ArrayList<EquipmentDetailsBean>();
		while (rs.next()) {
			vbresult = new EquipmentDetailsBean();
			vbresult.setVendorName(rs.getString("VNDR_NM").trim());
			vbresult.setVendorsk(rs.getInt("VNDR_SK"));		       
			eqtemparray.add(vbresult);
		}
		vndrlist = (EquipmentDetailsBean[]) eqtemparray.toArray(new EquipmentDetailsBean[eqtemparray.size()]);
		} catch (SQLException e) {
			vndrlist = null;			
			logger.error("\nEquipmentDetailsDAO:Exception Log:loadVendorNames( )",e);
            throw new WSFaultType(e.getMessage(),"SQLException"," "," "," "," ");			
	}catch (Exception e) {
		vndrlist = null;
		logger.error("\nEquipmentDetailsDAO:Exception Log:loadVendorNames( )",e);
		throw new WSFaultType(e.getMessage(),"Exception"," "," "," "," ");
	} finally {
		closeSqlObjects(rs, ps, con);
	}
		
		return vndrlist;
	}
	public int[] checkSerialNumber(int Vendorsk,String serialnumber, String modelnumber) throws java.rmi.RemoteException, com.apria.sims.ws.logger.WSFaultType, SQLException{//to check theserial number of the model
		logger.info("\n Check existing serial number");	
		int STARTMAX = 1;
		PreparedStatement ps = null;
		ResultSet rs = null;
		Connection con = null;
		con = getConnection();
		int[] eqpmtsks = new int[STARTMAX];
		StringBuffer statement = new StringBuffer();
		try {
		statement.append(Constant.SQL_CHECK_SERIALNUMBER);		
		//statement.append(" WITH UR "); Commented for Migrating DB2 to SQL
		logger.info("\n Loading Vendor names with query " + statement.toString());
		ps = con.prepareStatement(statement.toString());
		ps.setInt(1, Vendorsk);
		ps.setString(2, modelnumber.trim().toUpperCase());
		ps.setString(3, serialnumber.trim().toUpperCase());		
		rs = ps.executeQuery();
		int i = 0;
		while (rs.next()) {
			 if (i >= eqpmtsks.length) {	            	
				 int[] tmp = new int[eqpmtsks.length + STARTMAX];
	                System.arraycopy(eqpmtsks, 0, tmp, 0, eqpmtsks.length);
	                eqpmtsks = tmp;
	            }
			 eqpmtsks[i] = rs.getInt("EQPMT_SK");
			i++;
		}
		} catch (SQLException e) {//sql exception
			logger.error("\nEquipmentDetailsDAO:Exception Log:Check existing serial number( )",e);
            throw new WSFaultType(e.getMessage(),"SQLException"," "," "," "," ");			
	}catch (Exception e) {//General exception
		logger.error("\nEquipmentDetailsDAO:Exception Log:Check existing serial number( )",e);
		throw new WSFaultType(e.getMessage(),"Exception"," "," "," "," ");
	} finally {
		closeSqlObjects(rs, ps, con);
	}
		return eqpmtsks;
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
	private Connection getConnection() throws WSFaultType {
		Connection con = null;
		try {
			InitialContext ic = new InitialContext();
			DataSource ds = (DataSource) ic.lookup(Constant._JNDI_NAME);//look up for the db jndi name defined in the constant file
			con = ds.getConnection();
		} catch (NamingException e) {
			logger.error("error in EquipmentDetailsDAO in creating the connection in getConnection()",e);
			throw new WSFaultType(e.getMessage(),"NamingException"," "," "," "," ");
		} catch (SQLException e) {
			logger.error("error in EquipmentDetailsDAO in creating the connection in getConnection()",e);
			throw new WSFaultType(e.getMessage(),"SQLException"," "," "," "," ");
		}
		return con;
	}
}