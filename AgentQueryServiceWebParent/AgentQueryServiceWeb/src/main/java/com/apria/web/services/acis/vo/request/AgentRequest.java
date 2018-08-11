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

package com.apria.web.services.acis.vo.request;

/**
 * Model class to represent the request to get Agent details.
 * 
 * @author BRANGANA
 */
public class AgentRequest {

	private String acisId;

	/**
	 * @return the acisId
	 */
	public String getAcisId() {

		return acisId;
	}

	/**
	 * @param acisId the acisId to set
	 */
	public void setAcisId(String acisId) {

		this.acisId = acisId;
	}
}
