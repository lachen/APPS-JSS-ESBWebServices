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

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import com.apria.web.services.acis.dao.AgentDao;
import com.apria.web.services.acis.dao.AttributeDao;
import com.apria.web.services.acis.dao.ContactPreferenceDao;
import com.apria.web.services.acis.dao.DeliveryCommitmentDao;
import com.apria.web.services.acis.dao.ProductPreferenceDao;
import com.apria.web.services.acis.vo.Agent;
import com.apria.web.services.acis.vo.Attribute;
import com.apria.web.services.acis.vo.ContactPreference;
import com.apria.web.services.acis.vo.DeliveryCommitment;
import com.apria.web.services.acis.vo.ProductPreference;
import com.apria.web.services.acis.vo.request.AgentRequest;
import com.apria.web.services.acis.vo.response.AgentResponse;
import com.apria.web.services.acis.vo.response.AttributeResponse;
import com.apria.web.services.acis.vo.response.ContactPreferenceResponse;
import com.apria.web.services.acis.vo.response.DeliveryCommitmentResponse;
import com.apria.web.services.acis.vo.response.ProductPreferenceResponse;

/**
 * Implementation class for the AgentService interface.
 * 
 * @author BRANGANA
 */
public class AgentServiceImpl implements AgentService {

	@Override
	public AgentResponse getAgentDetailList(AgentRequest request)
		throws Exception {

		Map<String, Collection<Attribute>> attributeMap = new HashMap<String, Collection<Attribute>>();
		new AttributeDao().getAttributeList(request, attributeMap);

		Map<String, Collection<ProductPreference>> producteMap = new HashMap<String, Collection<ProductPreference>>();
		new ProductPreferenceDao().getProductPreferenceList(request,
			producteMap);

		Map<String, Collection<DeliveryCommitment>> deliveryMap = new HashMap<String, Collection<DeliveryCommitment>>();
		new DeliveryCommitmentDao().getDeliveryCommitmentList(request,
			deliveryMap);

		Map<String, Collection<ContactPreference>> contactMap = new HashMap<String, Collection<ContactPreference>>();
		new ContactPreferenceDao()
			.getContactPreferenceList(request, contactMap);

		AgentDao agentDao = new AgentDao();
		Collection<Agent> agentList = agentDao.getAgentList(request);

		for (Agent agent : agentList) {

			String agentId = agent.getAcisId();
			agent.setAttributeList(attributeMap.get(agentId));
			agent.setProductPreferenceList(producteMap.get(agentId));
			agent.setDeliveryCommitmentList(deliveryMap.get(agentId));
			agent.setContactPreferenceList(contactMap.get(agentId));

			if (attributeMap.get(agentId) != null) {
				agent.setAttributeFlag("Y");
			}

			if (producteMap.get(agentId) != null) {
				agent.setProductPreferenceFlag("Y");
			}

			if (deliveryMap.get(agentId) != null) {
				agent.setDeliveryCommitmentFlag("Y");
			}

			if (contactMap.get(agentId) != null) {
				agent.setContactPreferenceFlag("Y");
			}
		}

		return new AgentResponse(agentList);
	}

	@Override
	public AgentResponse getAgentList(AgentRequest request) throws Exception {

		Collection<Agent> agentList = new AgentDao().getAgentList(request);
		AttributeDao attributeDao = new AttributeDao();
		ContactPreferenceDao contactPreferenceDao = new ContactPreferenceDao();
		DeliveryCommitmentDao deliveryCommitmentDao = new DeliveryCommitmentDao();
		ProductPreferenceDao productPreferenceDao = new ProductPreferenceDao();

		for (Agent agent : agentList) {

			AgentRequest req = new AgentRequest();
			req.setAcisId(agent.getAcisId());

			if (attributeDao.hasAttribute(req)) {
				agent.setAttributeFlag("Y");
			}

			if (productPreferenceDao.hasProductPreference(req)) {
				agent.setProductPreferenceFlag("Y");
			}

			if (deliveryCommitmentDao.hasDeliveryCommitment(req)) {
				agent.setDeliveryCommitmentFlag("Y");
			}

			if (contactPreferenceDao.hasContactPreference(req)) {
				agent.setContactPreferenceFlag("Y");
			}
		}

		return new AgentResponse(agentList);
	}

	@Override
	public AttributeResponse getAttributeList(AgentRequest request)
		throws Exception {

		return new AttributeResponse(
			new AttributeDao().getAttributeList(request));
	}

	@Override
	public ContactPreferenceResponse getContactPreferenceList(
		AgentRequest request) throws Exception {

		return new ContactPreferenceResponse(
			new ContactPreferenceDao().getContactPreferenceList(request));
	}

	@Override
	public DeliveryCommitmentResponse getDeliveryCommitmentList(
		AgentRequest request) throws Exception {

		return new DeliveryCommitmentResponse(
			new DeliveryCommitmentDao().getDeliveryCommitmentList(request));
	}

	@Override
	public ProductPreferenceResponse getProductPreferenceList(
		AgentRequest request) throws Exception {

		return new ProductPreferenceResponse(
			new ProductPreferenceDao().getProductPreferenceList(request));
	}

}
