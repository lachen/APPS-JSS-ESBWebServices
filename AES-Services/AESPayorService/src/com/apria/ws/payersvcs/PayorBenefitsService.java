package com.apria.ws.payersvcs;

import java.rmi.Remote;

public interface PayorBenefitsService extends Remote {
	
	public PayorBenefits getPayorBenefitsByID( String payorId ); 
	
	public MasterAgreement isMstrAgrmtValid( String mstrAgrmtId );
	
	public RthmeAgreement isRthmeAgrmtValid( String agrmtId );

}
