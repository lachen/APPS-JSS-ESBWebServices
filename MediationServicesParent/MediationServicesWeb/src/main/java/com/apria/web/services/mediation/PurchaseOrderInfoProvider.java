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

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.soap.SOAPMessage;
import javax.xml.transform.Source;
import javax.xml.transform.dom.DOMSource;
import javax.xml.ws.Provider;
import javax.xml.ws.Service;
import javax.xml.ws.ServiceMode;
import javax.xml.ws.WebServiceProvider;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

import com.apria.web.services.mediation.util.PropertyManager;

@WebServiceProvider(portName = "purchaseorderlookupSOAP", targetNamespace = "http://com.apria.ap/purchaseorderlookup/", serviceName = "purchaseorderlookup", wsdlLocation = "WEB-INF/wsdl/PurchaseOrderLookup/purchaseorderlookup.wsdl")
@ServiceMode(value = Service.Mode.MESSAGE)
public class PurchaseOrderInfoProvider extends BaseDaoProvider implements Provider<SOAPMessage> {

	@Override
	public SOAPMessage invoke(SOAPMessage request) {
		return super.invoke("purchaseorderinfo", request);
	}

	@Override
	protected String getSQL(SOAPMessage request) {
		return PropertyManager.getProperty("purchaseorderinfo.sql");
	}

	@Override
	protected void bindParams(Statement pst, SOAPMessage request) throws Exception {
		NodeList nodes = request.getSOAPBody().getElementsByTagName("purchaseOrderNo");

		((PreparedStatement) pst).setString(1, nodes.item(0).getTextContent());
	}

	@Override
	protected Source convertToXml(SOAPMessage reqeust, ResultSet rs) throws Exception {
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder = factory.newDocumentBuilder();
		Document doc = builder.newDocument();
		Element results = doc.createElement("out");
		doc.appendChild(results);
		Element list = doc.createElement("purchaserOrderInfoList");
		results.appendChild(list);
		while (rs.next()) {
			Element row = doc.createElement("purchaseOrderInfo");
			Element node = doc.createElement("purchaseOrderNo");
			node.appendChild(doc.createTextNode(rs.getString("purchaseOrderNo")));
			row.appendChild(node);
			node = doc.createElement("poType");
			node.appendChild(doc.createTextNode(rs.getString("poType")));
			row.appendChild(node);
			node = doc.createElement("costCenter");
			node.appendChild(doc.createTextNode(rs.getString("costCenter")));
			row.appendChild(node);
			node = doc.createElement("vendorNumber");
			node.appendChild(doc.createTextNode(rs.getString("vendorNumber")));
			row.appendChild(node);
			node = doc.createElement("vendorName");
			node.appendChild(doc.createTextNode(rs.getString("vendorName")));
			row.appendChild(node);
			list.appendChild(row);
		}
		return new DOMSource(doc);
	}
}
