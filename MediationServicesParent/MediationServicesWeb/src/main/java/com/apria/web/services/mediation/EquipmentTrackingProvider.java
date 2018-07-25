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

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.Types;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.soap.SOAPBody;
import javax.xml.soap.SOAPMessage;
import javax.xml.transform.Source;
import javax.xml.transform.dom.DOMSource;
import javax.xml.ws.Provider;
import javax.xml.ws.Service;
import javax.xml.ws.ServiceMode;
import javax.xml.ws.WebServiceProvider;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

@WebServiceProvider(portName = "AES_EquipmentTracking_Intf_EquipmentTrackingIntfHttpPort", 
		targetNamespace = "http://AES_EquipmentTracking_Svcs_1_0/com/apria/services/aes/equipmenttracking/EquipmentTrackingIntf/Binding", 
		serviceName = "AES_EquipmentTracking_Intf", 
		wsdlLocation = "WEB-INF/wsdl/EquipmentTracking/AES_EquipmentTracking_Svcs_1_0.wsdl")
@ServiceMode(value = Service.Mode.MESSAGE)
public class EquipmentTrackingProvider extends BaseDaoProvider implements Provider<SOAPMessage> {

	@Override
	public SOAPMessage invoke(SOAPMessage request) {
		return super.invoke("equipmenttracking", request);
	}
	
	@Override
	protected Statement getStatement(Connection con, String sql) throws Exception {
		return con.prepareCall(sql);
	}
	
	@Override
	protected String getSQL(SOAPMessage request) {
		return "{call SIMS.UPDATE_EQPMT_STATUS(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)}";
	}

	@Override
	protected void bindParams(Statement stmt, SOAPMessage request) throws Exception {

		SOAPBody body = request.getSOAPBody();
		CallableStatement cstmt =  (CallableStatement) stmt;
		
		cstmt.setString(1, body.getElementsByTagName("requestType").item(0).getTextContent());
		cstmt.setString(2, body.getElementsByTagName("srcSystemId").item(0).getTextContent());
		cstmt.setString(3, body.getElementsByTagName("bu").item(0).getTextContent());
		cstmt.setString(4, body.getElementsByTagName("orderNo").item(0).getTextContent());
		cstmt.setInt(5, Integer.parseInt(body.getElementsByTagName("orderLineNo").item(0).getTextContent()));
		cstmt.setInt(6, Integer.parseInt(body.getElementsByTagName("orderLineCmpntSeqNo").item(0).getTextContent()));
		cstmt.setInt(7, Integer.parseInt(body.getElementsByTagName("equipmentTrackingSeqNo").item(0).getTextContent()));
		cstmt.setString(8, body.getElementsByTagName("customerId").item(0).getTextContent());
		cstmt.setString(9, body.getElementsByTagName("customerName").item(0).getTextContent());
		cstmt.setString(10, body.getElementsByTagName("originalDeliveryDate").item(0).getTextContent());
		cstmt.setString(11, body.getElementsByTagName("deliveryProductId").item(0).getTextContent());
		cstmt.setString(12, body.getElementsByTagName("modelNo").item(0).getTextContent());
		cstmt.setString(13, body.getElementsByTagName("serialNo").item(0).getTextContent());
		cstmt.setString(14, body.getElementsByTagName("comments").item(0).getTextContent());
		
		cstmt.setString(15, body.getElementsByTagName("trackingStatusCode").item(0).getTextContent());
		
		cstmt.setString(16, body.getElementsByTagName("pickupWorkOrderId").item(0).getTextContent());
		cstmt.setInt(17, Integer.parseInt(body.getElementsByTagName("pickupWorkOrderLineNo").item(0).getTextContent()));
		cstmt.setString(18, body.getElementsByTagName("deliveryWorkOrderId").item(0).getTextContent());
		cstmt.setInt(19, Integer.parseInt(body.getElementsByTagName("deliveryWorkOrderLineNo").item(0).getTextContent()));
		cstmt.setString(20, body.getElementsByTagName("transactionTypeCode").item(0).getTextContent());
		cstmt.setString(21, body.getElementsByTagName("equipmentActivityCode").item(0).getTextContent());
		cstmt.setString(22, body.getElementsByTagName("requestedEquipmentStatusCode").item(0).getTextContent());
		
		cstmt.registerOutParameter("NEXTTESTDATE", Types.VARCHAR);
		cstmt.registerOutParameter("STATUSCODE", Types.VARCHAR);
		cstmt.registerOutParameter("STATUSCODEDESCRIPTION", Types.VARCHAR);
		cstmt.registerOutParameter("DEBUGSTATEMENT", Types.VARCHAR);
		
		/*
		IN TRACKINGSTATUSCODE CHARACTER(1),
		 */
	}
	
	@Override
	protected Source convertToXml(SOAPMessage reqeust, Statement stmt) throws Exception {
		CallableStatement cstmt =  (CallableStatement) stmt;
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder = factory.newDocumentBuilder();
		Document doc = builder.newDocument();
		Element results = doc.createElement("output");
		doc.appendChild(results);
		Element row = doc.createElement("nextTestDate");
		row.appendChild(doc.createTextNode(cstmt.getString("NEXTTESTDATE")));
		results.appendChild(row);
		row = doc.createElement("statusCode");
		row.appendChild(doc.createTextNode(cstmt.getString("STATUSCODE")));
		results.appendChild(row);
		row = doc.createElement("statusCodeDescription");
		row.appendChild(doc.createTextNode(cstmt.getString("STATUSCODEDESCRIPTION")));
		results.appendChild(row);
		
		return new DOMSource(doc);
	}
}
