/*******************************************************************************
 * Copyright (c) 2013 Apria Healthcare                                          *
 * As an unpublished work. All Rights Reserved.                                 *
 * This media contains an authorized copy or copies of material copyrighted by  *
 * Apria Healthcare and is the unpublished, confidential property of            *
 * Apria Healthcare. You may not disclose, copy or use any portion of           *
 * these materials for any purpose without the express written consent of Apria *
 * Healthcare.  You must reproduce this copyright notice and any other          *
 * copyright notices included in machine-readable copies on all authorized      *
 * copies.                                                                      *
 *******************************************************************************/

package com.apria.web.services.acis;

import com.apria.web.services.acis.vo.request.AgentRequest;
import com.apria.web.services.acis.vo.response.AgentResponse;
import com.apria.web.services.acis.vo.response.AttributeResponse;
import com.apria.web.services.acis.vo.response.ContactPreferenceResponse;
import com.apria.web.services.acis.vo.response.DeliveryCommitmentResponse;
import com.apria.web.services.acis.vo.response.ProductPreferenceResponse;

/**
 * Generated class to make AgentServiceImpl as JAX-WS Webservice.
 * 
 * @author BRANGANA
 */
@javax.jws.WebService (targetNamespace="http://acis.services.web.apria.com/", serviceName="AgentServiceImplService", portName="AgentServiceImplPort", wsdlLocation="WEB-INF/wsdl/AgentServiceImplService.wsdl")
public class AgentServiceImplDelegate{

    com.apria.web.services.acis.AgentServiceImpl _agentServiceImpl = null;

    public AgentResponse getAgentDetailList(AgentRequest request) throws Exception {
        return _agentServiceImpl.getAgentDetailList(request);
    }

    public AgentResponse getAgentList(AgentRequest request) throws Exception {
        return _agentServiceImpl.getAgentList(request);
    }

    public AttributeResponse getAttributeList(AgentRequest request) throws Exception {
        return _agentServiceImpl.getAttributeList(request);
    }

    public ContactPreferenceResponse getContactPreferenceList(AgentRequest request) throws Exception {
        return _agentServiceImpl.getContactPreferenceList(request);
    }

    public DeliveryCommitmentResponse getDeliveryCommitmentList(AgentRequest request) throws Exception {
        return _agentServiceImpl.getDeliveryCommitmentList(request);
    }

    public ProductPreferenceResponse getProductPreferenceList(AgentRequest request) throws Exception {
        return _agentServiceImpl.getProductPreferenceList(request);
    }

    public AgentServiceImplDelegate() {
        _agentServiceImpl = new com.apria.web.services.acis.AgentServiceImpl(); }

}