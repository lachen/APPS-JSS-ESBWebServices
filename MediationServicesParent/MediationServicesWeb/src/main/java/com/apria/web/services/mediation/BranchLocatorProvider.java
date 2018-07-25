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

import com.apria.web.services.mediation.util.PropertyManager;

@WebServiceProvider(portName = "AES_BranchLocator_Intf_branchesInfoHttpPort", 
		targetNamespace = "http://AES_BranchLocator_Svcs_v1/com/apria/services/aes/branchlocator/branchesInfo/Binding", 
		serviceName = "AES_BranchLocator_Intf", 
		wsdlLocation = "WEB-INF/wsdl/BranchLocator/AES_BranchLocator_Svcs_v1.wsdl")
@ServiceMode(value = Service.Mode.MESSAGE)
public class BranchLocatorProvider extends BaseDaoProvider implements Provider<SOAPMessage> {

	@Override
	public SOAPMessage invoke(SOAPMessage request) {
		return super.invoke("branchlocator", request);
	}
	
	@Override
	protected String getSQL(SOAPMessage request) {
		return PropertyManager.getProperty("branchlocator.sql");
	}

}
