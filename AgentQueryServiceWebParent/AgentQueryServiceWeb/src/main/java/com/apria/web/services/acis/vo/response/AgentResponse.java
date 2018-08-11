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

package com.apria.web.services.acis.vo.response;

import java.util.Collection;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

import com.apria.web.services.acis.vo.Agent;

/**
 * Model class to represent the Agent Response.
 * 
 * @author BRANGANA
 */
@XmlRootElement
public class AgentResponse {

	private Collection<Agent> agentList;
	private int count;

	public AgentResponse() {

	}

	public AgentResponse(Collection<Agent> agentList) {

		this.agentList = agentList;

		if (agentList != null) {
			this.count = agentList.size();
		}
	}

	/**
	 * @return the agentList
	 */
	@XmlElementWrapper(name = "agentList")
	@XmlElement(name = "agent")
	public Collection<Agent> getAgentList() {

		return agentList;
	}

	/**
	 * @return the count
	 */
	public int getCount() {

		return count;
	}

	/**
	 * @param agentList the agentList to set
	 */
	public void setAgentList(Collection<Agent> agentList) {

		this.agentList = agentList;
	}

	/**
	 * @param count the count to set
	 */
	public void setCount(int count) {

		this.count = count;
	}
}
