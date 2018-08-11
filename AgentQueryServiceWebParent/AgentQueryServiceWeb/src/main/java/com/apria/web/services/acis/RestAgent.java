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

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import com.apria.web.services.acis.vo.request.AgentRequest;
import com.apria.web.services.acis.vo.response.AgentResponse;

/**
 * Class provide restful access to agent Query services.
 * 
 * @author BRANGANA
 */
@Path(value = "/agentlist")
public class RestAgent {

	@GET
	@Path(value = "/detail")
	@Produces(MediaType.APPLICATION_JSON)
	public AgentResponse getAgentDetailList(
		@QueryParam(value = "acisid") String acisId) throws Exception {

		AgentService service = new AgentServiceImpl();
		AgentRequest request = new AgentRequest();
		request.setAcisId(acisId);

		return service.getAgentDetailList(request);
	}

	@GET
	@Path(value = "/detail/xml")
	@Produces(MediaType.APPLICATION_XML)
	public AgentResponse getAgentDetailListXml(
		@QueryParam(value = "acisid") String acisId) throws Exception {

		return getAgentDetailList(acisId);
	}

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public AgentResponse getAgentList(
		@QueryParam(value = "acisid") String acisId) throws Exception {

		AgentService service = new AgentServiceImpl();
		AgentRequest request = new AgentRequest();
		request.setAcisId(acisId);

		return service.getAgentList(request);
	}

	@GET
	@Path(value = "/xml")
	@Produces(MediaType.APPLICATION_XML)
	public AgentResponse getAgentListXml(
		@QueryParam(value = "acisid") String acisId) throws Exception {

		return getAgentList(acisId);
	}
}
