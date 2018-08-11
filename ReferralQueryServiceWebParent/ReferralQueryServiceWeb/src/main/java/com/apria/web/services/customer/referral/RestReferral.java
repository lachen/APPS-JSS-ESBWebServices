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

package com.apria.web.services.customer.referral;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import com.apria.web.services.customer.referral.vo.request.ReferralLookupRequest;
import com.apria.web.services.customer.referral.vo.response.ReferralLookupResponse;

/**
 * Class provide restful access to referral Query services.
 * 
 * @author Thakur_Vikas_Kumar_S
 *
 */
@Path(value = "/referrallist")
public class RestReferral {

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public ReferralLookupResponse getReferralList(
			@QueryParam("name") String name, @QueryParam("city") String city,
			@QueryParam("state") String state) throws Exception {

		ReferralLookupService service = new ReferralLookupServiceImpl();

		ReferralLookupRequest request = new ReferralLookupRequest(name, city,
				state);

		return service.getReferrallList(request);
	}

	@GET
	@Path(value = "/xml")
	@Produces(MediaType.APPLICATION_XML)
	public ReferralLookupResponse getReferralListXml(
			@QueryParam("name") String name, @QueryParam("city") String city,
			@QueryParam("state") String state) throws Exception {

		return getReferralList(name, city, state);
	}

}
