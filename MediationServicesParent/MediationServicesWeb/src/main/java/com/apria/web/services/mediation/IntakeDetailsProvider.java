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

/**
 * WebService Provider Class which implements the Intake Details Mediation
 * Service
 * AES_IntakeDetailsSummary_IntfExport1_AES_IntakeDetailsSummary_IntfHttpService
 * 
 * @author BRANGAN3
 */
@WebServiceProvider(portName = "AES_IntakeDetails_Intf_1_0_AES_IntakeDetails_IntfHttpPort", 
		targetNamespace = "http://AES_GetIntakeDetails_Lib_1_0/com/apria/services/aes/intakedetails/AES_IntakeDetails_Intf/Binding", 
		serviceName = "AES_IntakeDetails_Intf_1_0", 
		wsdlLocation = "WEB-INF/wsdl/IntakeDetails/AES_IntakeDetails_Intf_1_0.wsdl")
@ServiceMode(value = Service.Mode.MESSAGE)
public class IntakeDetailsProvider extends BaseProvider implements Provider<SOAPMessage> {

	@Override
	public SOAPMessage invoke(SOAPMessage request) {
		return super.invoke("intakedetails", request);
	}
}
