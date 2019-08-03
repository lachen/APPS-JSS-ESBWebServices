/*******************************************************************************
 * Copyright (c) 2008 Apria Healthcare                                          *
 * As an unpublished work. All Rights Reserved.                                 *
 * This media contains an authorized copy or copies of material copyrighted by  *
 * Apria Healthcare and is the unpublished, confidential property of            *
 * Apria Healthcare. You may not disclose, copy or use any portion of           *
 * these materials for any purpose without the express written consent of Apria *
 * Healthcare.  You must reproduce this copyright notice and any other          *
 * copyright notices included in machine-readable copies on all authorized      *
 * copies.                                                                      *
 *******************************************************************************/
package com.apria.svcs.acis;

/**
 * DataStructure which will be returned as result of the CustDtlsForCustId
 * WebService call
 *
 * @author Aravind Nandanan
 */
public class CustSummary
{

    private String custFirstName;

    private String custMidItl;

    private String custLastName;

    private String custDOB;

    public String getCustDOB() {
		return custDOB;
	}

	public void setCustDOB(String custDOB1) {
	
		if (null == custDOB1 ||custDOB1.trim().length() > 7 || custDOB1.trim().length() < 3) {
			this.custDOB = "1900-01-01";
			return;
		}
		custDOB1 = custDOB1.trim();
	
		if (custDOB1.length() < 6 ) {
			StringBuilder sb = new StringBuilder(custDOB1);
			while(sb.length() < 6){
				sb.insert(0, "0");
			}
			custDOB1 = sb.toString();
		}

		StringBuilder sbDOB = new StringBuilder("");

		if ((custDOB1.length() > 6) && custDOB1.startsWith("1") ) {
			sbDOB.append("20");
			sbDOB.append(custDOB1.substring(1,3));
			sbDOB.append("-");
			sbDOB.append(custDOB1.substring(3,5));
			sbDOB.append("-");
			sbDOB.append(custDOB1.substring(5,7));
		} else if (custDOB1.length() == 6) {
			sbDOB.append("19");
			sbDOB.append(custDOB1.substring(0,2));
			sbDOB.append("-");
			sbDOB.append(custDOB1.substring(2,4));
			sbDOB.append("-");
			sbDOB.append(custDOB1.substring(4,6));
		}

		this.custDOB = sbDOB.toString();
	}

	public String getCustFirstName() {
        return custFirstName;
    }

    public void setCustFirstName(String custFirstName) {
        this.custFirstName = custFirstName;
    }

    public String getCustLastName() {
        return custLastName;
    }

    public void setCustLastName(String custLastName) {
        this.custLastName = custLastName;
    }

    public String getCustMidItl() {
        return custMidItl;
    }

    public void setCustMidItl(String custMidItl) {
        this.custMidItl = custMidItl;
    }

    public static void main(String args[] ) {
    	CustSummary cs = new CustSummary();
    	cs.setCustDOB("101");
    	System.out.println("DOB-101:"+cs.custDOB);
    	cs.setCustDOB("1301");
    	System.out.println("DOB-1301:"+cs.custDOB);
    	cs.setCustDOB("10311");
    	System.out.println("DOB-10311:"+cs.custDOB);
    	cs.setCustDOB("10123121");
    	System.out.println("DOB-10123121:"+cs.custDOB);
    	cs.setCustDOB("0101");
    	System.out.println("DOB-0101:"+cs.custDOB);
    	cs.setCustDOB("10101");
    	System.out.println("DOB-10101:"+cs.custDOB);
    	cs.setCustDOB("90101");
    	System.out.println("DOB-90101:"+cs.custDOB);
    	cs.setCustDOB("450830");
    	System.out.println("DOB-101010:"+cs.custDOB);
    	cs.setCustDOB("1010100");
    	System.out.println("DOB-1010100:"+cs.custDOB);
    }

}
