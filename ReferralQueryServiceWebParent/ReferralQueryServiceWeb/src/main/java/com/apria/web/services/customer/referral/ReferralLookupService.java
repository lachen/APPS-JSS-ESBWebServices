package com.apria.web.services.customer.referral;

import com.apria.web.services.customer.referral.vo.request.ReferralLookupRequest;
import com.apria.web.services.customer.referral.vo.response.ReferralLookupResponse;


/**
 * Service that defines the Referral Lookup details.
 */
public interface ReferralLookupService {
	/**
	 * Get the list of Referrals with for the given search criteria.
	 * 
	 * @param request
	 * @return ReferralLookupResponse
	 */
	ReferralLookupResponse getReferrallList(ReferralLookupRequest request) throws Exception;
}
