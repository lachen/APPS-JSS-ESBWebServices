package com.apria.web.services.customer.referral;

import java.util.ArrayList;
import java.util.Collection;
import com.apria.web.services.customer.referral.vo.Referral;
import com.apria.web.services.customer.referral.vo.request.ReferralLookupRequest;
import com.apria.web.services.customer.referral.vo.response.ReferralLookupResponse;


@javax.jws.WebService (targetNamespace="http://referral.customer.services.web.apria.com/", serviceName="ReferralLookupServiceImplService", portName="ReferralLookupServiceImplPort", wsdlLocation="WEB-INF/wsdl/ReferralLookupServiceImplService.wsdl")
public class ReferralLookupServiceImplDelegate{

    com.apria.web.services.customer.referral.ReferralLookupServiceImpl _referralLookupServiceImpl = null;

    public ReferralLookupResponse getReferrallList(ReferralLookupRequest request) throws Exception {
        return _referralLookupServiceImpl.getReferrallList(request);
    }

    public ReferralLookupServiceImplDelegate() {
        _referralLookupServiceImpl = new com.apria.web.services.customer.referral.ReferralLookupServiceImpl(); }

}