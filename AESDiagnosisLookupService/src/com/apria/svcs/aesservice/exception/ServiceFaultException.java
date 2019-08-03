/**
 * WSFaultType.java
 *
 * This file was auto-generated from WSDL
 * by the IBM Web services WSDL2Java emitter.
 * cf190834.07 v9308141138
 */

package com.apria.svcs.aesservice.exception;

import org.springframework.ws.soap.server.endpoint.annotation.FaultCode;
import org.springframework.ws.soap.server.endpoint.annotation.SoapFault;

import com.apria.svcs.dataobject.schema.ServiceFault;
import com.apria.svcs.dataobject.schema.ServiceFaultDocument;

@SoapFault(faultCode = FaultCode.SERVER,faultStringOrReason="AES-ESB-SERVICE-ERR",locale="en")
public class ServiceFaultException extends Exception
{

    private static final long serialVersionUID = 1L;
    
    private ServiceFaultDocument faultMsg;

    /**
     * 
     */
    public ServiceFaultException() {
		super("ServiceFaultException");
	}

    /**
     * Service Fault Exception message
     * @param s
     */
    public ServiceFaultException(String s) {
		super(s);
	}
 
    /**
     * Throwable exception
     * @param s
     * @param ex
     */
	public ServiceFaultException(String s, Throwable ex) {
		super(s, ex);
	}

	
   /**
    * Set the fault document
    * @param message
    * @param ex
    * @param faultMsg
    */
    public ServiceFaultException(	java.lang.String message, 
    								Throwable ex,
    								ServiceFaultDocument faultMsg) {
        super(message,ex);
        this.setFaultMsg(faultMsg);
    }
    
    public void setFaultMsg(ServiceFaultDocument faultMsg) {
    	this.faultMsg = faultMsg;
	}
 
	public ServiceFaultDocument getFaultMsg() {
		return faultMsg;
	}

}
