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

import java.util.Collection;

import com.apria.web.services.customer.referral.dao.ReferralDao;
import com.apria.web.services.customer.referral.vo.Referral;
import com.apria.web.services.customer.referral.vo.request.ReferralLookupRequest;
import com.apria.web.services.customer.referral.vo.response.ReferralLookupResponse;

/**
 * service implementation class
 * 
 * @author Thakur_Vikas_Kumar_S
 *
 */
public class ReferralLookupServiceImpl implements ReferralLookupService {

	@Override
	public ReferralLookupResponse getReferrallList(ReferralLookupRequest request)
			throws Exception {

		Collection<Referral> referrals = new ReferralDao()
				.getReferralList(request);

		ReferralLookupResponse resp = new ReferralLookupResponse(referrals);

		return resp;
	}

}
