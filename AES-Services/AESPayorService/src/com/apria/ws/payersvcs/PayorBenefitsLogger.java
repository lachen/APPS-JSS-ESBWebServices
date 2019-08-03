package com.apria.ws.payersvcs;

public class PayorBenefitsLogger {
	
	
	private static boolean logflag = true;
	
	public static void log ( String mesg ) {
		
		if(logflag) 
				System.out.println("LOG: " + mesg );
		
	}

}
