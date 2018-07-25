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

import javax.xml.soap.SOAPMessage;
import javax.xml.ws.Provider;
import javax.xml.ws.Service;
import javax.xml.ws.ServiceMode;
import javax.xml.ws.WebServiceProvider;

@WebServiceProvider(portName = "AES_GetBusa_Intf_1_0_AES_GetBusa_IntfHttpPort", 
		targetNamespace = "http://AES_GetBusa_Lib_1_0/com/apria/services/aes/getbusa/AES_GetBusa_Intf/Binding", 
		serviceName = "AES_GetBusa_Intf_1_0", 
		wsdlLocation = "WEB-INF/wsdl/BusaService/AES_GetBusa_Intf_1_0.wsdl")
@ServiceMode(value = Service.Mode.MESSAGE)
public class BusaServiceProvider extends BaseProvider implements Provider<SOAPMessage> {

	@Override
	public SOAPMessage invoke(SOAPMessage request) {
		return super.invoke(null, request);
	}
	
}
