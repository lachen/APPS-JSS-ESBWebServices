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

import java.net.URL;
import java.util.ArrayList;

import javax.wsdl.Definition;
import javax.wsdl.factory.WSDLFactory;
import javax.wsdl.xml.WSDLReader;
import javax.xml.XMLConstants;
import javax.xml.soap.SOAPMessage;
import javax.xml.transform.dom.DOMSource;
import javax.xml.validation.SchemaFactory;
import javax.xml.validation.Validator;
import javax.xml.ws.Provider;
import javax.xml.ws.Service;
import javax.xml.ws.ServiceMode;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceProvider;

import org.w3c.dom.Element;

@WebServiceProvider(portName = "AES_AgentDetails_Intf_1_0_AES_AgentDetails_IntfHttpPort", targetNamespace = "http://AES_GetAgentDetails_Lib_1_0/com/apria/services/aes/agentdetails/AES_AgentDetails_Intf/Binding", serviceName = "AES_AgentDetails_Intf_1_0", wsdlLocation = "WEB-INF/wsdl/AgentDetails/AES_AgentDetails_Intf_1_0.wsdl")
@ServiceMode(value = Service.Mode.MESSAGE)
public class AgentDetailsProvider extends BaseProvider implements Provider<SOAPMessage> {

	private Validator validator;

	public AgentDetailsProvider() {
		try {
			WSDLFactory wsdlFactory = WSDLFactory.newInstance();
			WSDLReader reader = wsdlFactory.newWSDLReader();
			URL url = Thread.currentThread().getContextClassLoader()
					.getResource("/WEB-INF/wsdl/AgentDetails/AES_AgentDetails_Intf.wsdl");
			Definition wsdlDefinition = reader.readWSDL(url.getFile());

			ArrayList<Element> wsdlSchemas = new ArrayList<Element>();

			for (Object o : wsdlDefinition.getTypes().getExtensibilityElements()) {
				if (o instanceof javax.wsdl.extensions.schema.Schema) {
					wsdlSchemas.add(((javax.wsdl.extensions.schema.Schema) o).getElement());
				}
			}

			SchemaFactory factory = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
			ArrayList<DOMSource> asrcs = new ArrayList<DOMSource>();

			for (Element e : wsdlSchemas) {
				asrcs.add(new DOMSource(e));
			}
			DOMSource sources[] = asrcs.toArray(new DOMSource[0]);
			
			for (int i = 1; i <= 3 ; i++) {
				try {
					validator = factory.newSchema(sources).newValidator();
			        break;
			    } catch (Exception e) {
			        if (i == 3) {
			            // this was the last attempt
			            throw e;
			        }
			    }
			}
			
			//Validator schemaValidator = schema.newValidator();

			//long start = System.nanoTime();
			//SchemaFactory schemaFac = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);

			//Schema schema = schemaFac.newSchema(url);
			//System.out.println("created validator in " + ((System.nanoTime() - start) / 1000000.0) + "ms");
		} catch (Exception e) {
			e.printStackTrace();
			throw new WebServiceException(e.getMessage());
		}
	}

	@Override
	public SOAPMessage invoke(SOAPMessage request) {
		try {
			System.out.println(request.getSOAPPart().getEnvelope().getBody().getChildNodes().item(1).getLocalName());
			validator.validate(new DOMSource(request.getSOAPPart().getEnvelope().getBody().getChildNodes().item(1)));
		} catch (Exception ex) {
			throw new RuntimeException(ex);
		}
		return super.invoke("getagentdetails", request);
	}
}
