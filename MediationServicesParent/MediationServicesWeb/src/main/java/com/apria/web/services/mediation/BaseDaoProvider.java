/*******************************************************************************
 * Copyright (c) 2014 Apria Healthcare                                          *
 * As an unpublished work. All Rights Reserved.                                 *
 * This media contains an authorized copy or copies of material copyrighted by  *
 * Apria Healthcare and is the unpublished, confidential property of            *
 * Apria Healthcare. You may not disclose, copy or use any portion of           *
 * these materials for any purpose without the express written consent of Apria *
 * Healthcare.  You must reproduce this copyright notice and any other          *
 * copyright notices included in machine-readable copies on all authorized      *
 * copies.                                                                      *
 *******************************************************************************/

package com.apria.web.services.mediation;

import java.io.ByteArrayOutputStream;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;

import javax.naming.InitialContext;
import javax.rmi.PortableRemoteObject;
import javax.sql.DataSource;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.soap.MessageFactory;
import javax.xml.soap.SOAPMessage;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.dom.DOMResult;
import javax.xml.transform.dom.DOMSource;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

import com.apria.framework.common.util.logging.ApriaLogger;
import com.apria.web.services.mediation.util.PropertyManager;
import com.apria.web.services.mediation.util.XslUtil;

public class BaseDaoProvider {

	private static ApriaLogger logger = ApriaLogger.getLogger(BaseDaoProvider.class);
	
	private static HashMap<String, DataSource> dataSources = new HashMap<String, DataSource>(20);

	public SOAPMessage invoke(String service, SOAPMessage request) {

		SOAPMessage soapResponse = null;
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		try {
			logger.debug("Incoming request for service " + service);
			printSoapXml(request);
			con = getConnection(service);
			String sql = getSQL(request);
			logger.debug(sql);
			stmt = getStatement(con, sql);
			bindParams(stmt, request);
			if (stmt instanceof CallableStatement) {
				((CallableStatement) stmt).execute();
				soapResponse = transform(service + "_response", convertToXml(request, stmt));
			} else {
				rs = ((PreparedStatement) stmt).executeQuery();
				soapResponse = transform(service + "_response", convertToXml(request, rs));
			}
			printSoapXml(soapResponse);
		} catch (Exception e) {
			logger.error("Error Occurred", e);
			throw new RuntimeException(e);
		} finally {
			closeRs(rs);
			closeStmt(stmt);
			closeConnection(con);
		}

		return soapResponse;
	}

	protected Statement getStatement(Connection con, String sql) throws Exception {
		return con.prepareStatement(sql);
	}

	private SOAPMessage transform(String xslFile, Source source) throws Exception {

		SOAPMessage result = MessageFactory.newInstance().createMessage();
		Transformer transformer = XslUtil.getTransformer(xslFile);
		transformer.setParameter("versionParam", "1.0");
		DOMResult domResult = new DOMResult();
		transformer.transform(source, domResult);
		result.getSOAPPart().setContent(new DOMSource(domResult.getNode()));

		return result;
	}

	protected String getSQL(SOAPMessage request) throws Exception  {
		return null;
	}

	protected void bindParams(Statement pst, SOAPMessage request) throws Exception  {
	}

	protected Source convertToXml(SOAPMessage request, ResultSet rs) throws Exception {
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder = factory.newDocumentBuilder();
		Document doc = builder.newDocument();
		Element results = doc.createElement("output");
		doc.appendChild(results);
		ResultSetMetaData rsmd = rs.getMetaData();
		int colCount = rsmd.getColumnCount();
		while (rs.next()) {
			Element row = doc.createElement("branchesInfo");
			results.appendChild(row);
			for (int i = 1; i <= colCount; i++) {
				String columnName = rsmd.getColumnLabel(i);
				Object value = rs.getObject(i);
				Element node = doc.createElement(columnName);
				node.appendChild(doc.createTextNode(value.toString()));
				row.appendChild(node);
			}
		}
		return new DOMSource(doc);
	}

	protected Source convertToXml(SOAPMessage reqeust, Statement stmt) throws Exception {
		throw new UnsupportedOperationException();
	}

	protected void closeConnection(Connection con) {
		try {
			if (con != null) {
				con.close();
			}
		} catch (Exception ignore) {
			System.out.println("Ignored " + ignore);
		}
	}

	protected static void closeRs(ResultSet rs) {

		if (rs != null) {
			try {
				rs.close();
			} catch (Exception ignore) {
				System.out.println("Ignored " + ignore);
			}
		}
	}

	protected static void closeStmt(Statement stmt) {
		if (stmt != null) {
			try {
				stmt.close();
			} catch (Exception ignore) {
			}
		}
	}

	protected static Connection getConnection(String dbName) throws Exception {
		DataSource ds = dataSources.get(dbName);

		if (ds == null) {
			init(dbName);
			ds = dataSources.get(dbName);
		}

		Connection con = null;

		try {
			con = ds.getConnection();
		} catch (SQLException e) {
			throw e;
		}

		return con;
	}

	private static void init(String dbName) throws Exception {
		String jndiName = null;

		jndiName = PropertyManager.getProperty("db." + dbName.toLowerCase() + ".jndi.datasource.name");

		DataSource ds = null;

		Object home = new InitialContext().lookup(jndiName);
		ds = (DataSource) PortableRemoteObject.narrow(home, DataSource.class);
		if (ds != null)
			dataSources.put(dbName, ds);
	}
	
	private static void printSoapXml(SOAPMessage newRequest) throws Exception {
		ByteArrayOutputStream out = new ByteArrayOutputStream();
		newRequest.writeTo(out);
		String strMsg = new String(out.toByteArray());
		logger.debug(strMsg);
	}

}
