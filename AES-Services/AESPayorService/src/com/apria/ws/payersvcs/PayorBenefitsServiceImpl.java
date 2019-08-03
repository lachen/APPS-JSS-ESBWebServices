package com.apria.ws.payersvcs;


public class PayorBenefitsServiceImpl implements PayorBenefitsService {

	public PayorBenefitsServiceImpl() {
		super();
	}

    /**
     * Main and the only public method of the class.
     * 
     * @param String payorId
     * @return PayorBenefits[]
     */
	public PayorBenefits getPayorBenefitsByID(String payorId) {
		PayorBenefits  iBenefits = null;
		
		if(payorId != null && payorId.length() > 0) {
			iBenefits = executeQuery ( payorId );
		}
		
		return iBenefits;
	}

	
	public MasterAgreement isMstrAgrmtValid( String mstrAgrmtId ) {
		MasterAgreement maid = null;

		if(mstrAgrmtId != null && mstrAgrmtId.length() > 0) {
			maid = executeMstrAgrmtQuery( mstrAgrmtId );
		}

		return maid;
	}
	
	public RthmeAgreement isRthmeAgrmtValid( String rthmeAgrmtId ) {
		RthmeAgreement raid = null;
		
		if( rthmeAgrmtId != null && rthmeAgrmtId.length() > 0) {
			raid = executeRthmeAgrmtQuery( rthmeAgrmtId );
		}
		
		return raid;
	}
	
	/**
     * utility method to populate the PayorBenefits bean with the output
     * obtained from COMMONDB call
     * 
     * @param String
     * @return PayorBenefits
     */
	/*
	private PayorBenefits[] oldExecuteQuery(String inPayorId) {
		PayorBenefiesDAO payorDAO = new PayorBenefiesDAO();
		List result = new ArrayList();

		PayorBenefits pb = payorDAO.getPayorBenefits(inPayorId);
		result.add(pb);

		return (PayorBenefits[]) result.toArray(new PayorBenefits[0]);
	}
	 */
	private PayorBenefits executeQuery(String inPayorId) {
		PayorBenefiesDAO payorDAO = new PayorBenefiesDAO();
		PayorBenefits pb = payorDAO.getPayorBenefits(inPayorId);
		return pb;
	}
	
	private MasterAgreement executeMstrAgrmtQuery(String inAgrmtId) {
		MasterAgreementDAO mstrAgrmtDAO = new MasterAgreementDAO();
		MasterAgreement ma = mstrAgrmtDAO.getMasterAgreementDetails(inAgrmtId);
		return ma;
	}
		
    private RthmeAgreement executeRthmeAgrmtQuery(String rthmeAgrmtId) {
    	RthmeAgreementDAO rthmeAgrmtDAO = new RthmeAgreementDAO();
    	RthmeAgreement ra = rthmeAgrmtDAO.getRthmeAgreementDetails(rthmeAgrmtId);
		return ra;
	}

	
}
