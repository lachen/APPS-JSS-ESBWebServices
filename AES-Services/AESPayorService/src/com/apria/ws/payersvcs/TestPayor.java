package com.apria.ws.payersvcs;

public class TestPayor {
	
	public static void main ( String args[] ) {
		
		PayorBenefitsServiceImpl pb = new PayorBenefitsServiceImpl();
		PayorBenefits pbResp = pb.getPayorBenefitsByID("*CT99");
		
		if( pbResp != null ) {
			PayorBenefitsLogger.log("NOT NULL");
		}
		
	}

}
