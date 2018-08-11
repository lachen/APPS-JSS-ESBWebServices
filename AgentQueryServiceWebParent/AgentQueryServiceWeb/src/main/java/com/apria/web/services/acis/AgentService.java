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
 * Service that defines the Agent details.
 * 
 * @author BRANGANA
 */
public interface AgentService {

	/**
	 * Get the list of Agents with profile details for the given Agent request.
	 * 
	 * @param request
	 * @return AgentResponse
	 */
	AgentResponse getAgentDetailList(AgentRequest request) throws Exception;

	/**
	 * Get the list of Agents for the given Agent request.
	 * 
	 * @param request
	 * @return AgentResponse
	 */
	AgentResponse getAgentList(AgentRequest request) throws Exception;

	/**
	 * Get the list of Attribute for the given Agent request.
	 * 
	 * @param request
	 * @return AttributeResponse
	 */
	AttributeResponse getAttributeList(AgentRequest request) throws Exception;

	/**
	 * Get the list of Contact Preference for the given Agent request.
	 * 
	 * @param request
	 * @return ContactPreferenceResponse
	 */
	ContactPreferenceResponse getContactPreferenceList(AgentRequest request)
		throws Exception;

	/**
	 * Get the list of Delivery Commitment for the given Agent request.
	 * 
	 * @param request
	 * @return
	 */
	DeliveryCommitmentResponse getDeliveryCommitmentList(AgentRequest request)
		throws Exception;

	/**
	 * Get the list of Product Preference for the given Agent request.
	 * 
	 * @param request
	 * @return ProductPreferenceResponse
	 */
	ProductPreferenceResponse getProductPreferenceList(AgentRequest request)
		throws Exception;
}
