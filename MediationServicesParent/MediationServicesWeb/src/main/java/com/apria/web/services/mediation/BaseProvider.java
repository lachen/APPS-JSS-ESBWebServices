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

import javax.xml.soap.MessageFactory;
import javax.xml.soap.SOAPConnection;
import javax.xml.soap.SOAPConnectionFactory;
import javax.xml.soap.SOAPException;
import javax.xml.soap.SOAPMessage;
import javax.xml.transform.Transformer;
import javax.xml.transform.dom.DOMResult;
import javax.xml.transform.dom.DOMSource;

import org.apache.soap.encoding.soapenc.Base64;

import com.apria.framework.common.util.logging.ApriaLogger;
import com.apria.web.services.mediation.util.PropertyManager;
import com.apria.web.services.mediation.util.XslUtil;

public class BaseProvider {

	private static ApriaLogger logger = ApriaLogger.getLogger(BaseProvider.class);
	
	private volatile static SOAPConnectionFactory factory;

	public SOAPMessage invoke(String service, SOAPMessage request) {

		SOAPMessage soapResponse = null;
		SOAPConnection con = null;
		try {
			logger.debug("Incoming request for service " + service);
			printSoapXml(request);
			// if service is null treat operation name as service.
			if (service == null) {
				if (request.getSOAPPart().getEnvelope().getBody().getChildNodes().item(1) == null) {
					service = request.getSOAPPart().getEnvelope().getBody().getChildNodes().item(0).getLocalName();
				} else {
					service = request.getSOAPPart().getEnvelope().getBody().getChildNodes().item(1).getLocalName();
				}
			}
			
			String staticUrl = PropertyManager.getProperty(service + ".acis.staticurl", "false");
			String url = PropertyManager.getProperty(service + ".acis.endpoint");
			String transform = PropertyManager.getProperty(service + ".transform");
			
			con = getSOAPConnectionFactory().createConnection();
			String branchHost = null;
			if ("false".equals(staticUrl)) {
				if ("true".equals(transform)) {
					if (request.getSOAPBody().getElementsByTagName("BranchHost").item(0) != null) {
						branchHost = request.getSOAPBody().getElementsByTagName("BranchHost").item(0).getTextContent();
					} else if (request.getSOAPBody().getElementsByTagName("branchHost").item(0) != null) {
						branchHost = request.getSOAPBody().getElementsByTagName("branchHost").item(0).getTextContent();
					} else if (request.getSOAPBody().getElementsByTagNameNS("*", "branchHost").item(0) != null) {
						branchHost = request.getSOAPBody().getElementsByTagNameNS("*", "branchHost").item(0).getTextContent();
					} else if (request.getSOAPBody().getElementsByTagNameNS("*", "_CPU").item(0) != null) {
						branchHost = request.getSOAPBody().getElementsByTagNameNS("*", "_CPU").item(0).getTextContent();
					}
				}

				// if no branchhost in the request assume it goes to corporate server.
				if (branchHost == null || branchHost.isEmpty()) {
					branchHost = PropertyManager.getProperty("acis.corporate.server");
				}
				url = url.replaceFirst("<branchhost>", branchHost);
			}
			
			SOAPMessage newRequest = request;
			if ("true".equals(transform)) {
				newRequest = transform(service + "_request", request);
			}
			printSoapXml(newRequest);
			logger.debug("calling service on " + url);

			String userId = PropertyManager.getProperty("acis.userid");
			String pwd = PropertyManager.getProperty("acis.password");
			String authorization = Base64.encode((userId+":"+pwd).getBytes());
			newRequest.getMimeHeaders().addHeader("Authorization", "Basic "+authorization);
			
			SOAPMessage response = con.call(newRequest, url);
			printSoapXml(response);
			soapResponse = response;
			if ("true".equals(transform)) {
				soapResponse = transform(service + "_response", response);
			}
			printSoapXml(soapResponse);
		} catch (Exception e) {
			logger.error("Error Occurred", e);
			throw new RuntimeException(e);
		} finally {
			if (con != null) {
				try {
					con.close();
				} catch (SOAPException e) {
					logger.error("Error Occurred", e);
				}
			}
		}

		return soapResponse;
	}

	private SOAPConnectionFactory getSOAPConnectionFactory() {

		if (factory == null) {
			synchronized (BaseProvider.class) {
				if (factory == null) {
					try {
						factory = SOAPConnectionFactory.newInstance();
					} catch (SOAPException e) {
						e.printStackTrace();
						throw new RuntimeException(e);
					}
				}
			}
		}
		return factory;
	}

	private SOAPMessage transform(String xslFile, SOAPMessage request) throws Exception {

		SOAPMessage result = MessageFactory.newInstance().createMessage();

		/* Setup XSLT */
		Transformer transformer = XslUtil.getTransformer(xslFile);

		/* Set the value of a <param> in the stylesheet */
		transformer.setParameter("versionParam", "1.0");

		DOMResult domResult = new DOMResult();
		
		setParameters(transformer, request);
		
		/* Start XSLT transformation and FOP processing */
		transformer.transform(request.getSOAPPart().getContent(), domResult);

		result.getSOAPPart().setContent(new DOMSource(domResult.getNode()));
		return result;
	}


	protected void setParameters(Transformer transformer, SOAPMessage request) throws Exception {
	}

	private static void printSoapXml(SOAPMessage newRequest) throws Exception {

		ByteArrayOutputStream out = new ByteArrayOutputStream();
		newRequest.writeTo(out);
		String strMsg = new String(out.toByteArray());
		logger.debug(strMsg);
	}
}
