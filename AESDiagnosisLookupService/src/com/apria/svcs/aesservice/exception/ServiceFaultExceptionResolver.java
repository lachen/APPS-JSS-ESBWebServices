package com.apria.svcs.aesservice.exception;


import javax.xml.transform.Result;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.TransformerFactoryConfigurationError;
 
import org.springframework.ws.soap.SoapFault;
import org.springframework.ws.soap.SoapFaultDetail;
import org.springframework.ws.soap.server.endpoint.SoapFaultMappingExceptionResolver;
import org.springframework.xml.transform.StringSource;

import com.apria.svcs.dataobject.schema.ErrorSeverity;
import com.apria.svcs.dataobject.schema.ServiceFault;
import com.apria.svcs.dataobject.schema.ServiceFaultDocument;

public class ServiceFaultExceptionResolver extends	SoapFaultMappingExceptionResolver {
	
	protected void customizeFault(	Object endpoint, 
									Exception ex, 
									SoapFault fault) {
		ServiceFaultException faultException = null;
		if (ex instanceof ServiceFaultException) {
			faultException = (ServiceFaultException) ex;
		} else {
			faultException = prepareServiceFault(ex);
		}
		prepareServiceFaultDetail(faultException, fault);
	}
	 
	/**
	  * 
	  * @param msg
	  * @param fault
	  * @throws TransformerFactoryConfigurationError
	  */
	   private void prepareServiceFaultDetail(	ServiceFaultException faultException, 
			   									SoapFault fault)
			throws TransformerFactoryConfigurationError {
			Transformer trn;
			try {
				trn = TransformerFactory.newInstance().newTransformer();
				SoapFaultDetail faultDetail = fault.addFaultDetail();
				Result result = faultDetail.getResult();
				
				ServiceFaultDocument faultDoc = faultException.getFaultMsg();
				
				if (faultDoc != null) {
					trn.transform(new StringSource(faultDoc.toString()), result);
				}
			} catch (TransformerException e) {
				/** ignore the stack trace */
				e.printStackTrace();
			}  
		}
	 
		private ServiceFaultException prepareServiceFault(Exception ex) {			 
			
			ServiceFaultDocument faultDoc = ServiceFaultDocument.Factory.newInstance();
			ServiceFault serviceFault = faultDoc.addNewServiceFault();	
			if( ex instanceof ValidationException )
				serviceFault.setErrorCode(((ValidationException)ex).getFieldErrCode());
			else
				serviceFault.setErrorCode("AES-ESB-SERVICE-ERR");
			serviceFault.setErrorSev(ErrorSeverity.ERROR);
			if( ex instanceof ValidationException )
				serviceFault.setErrorDesc(((ValidationException)ex).getFieldErrDesc());
			else
				serviceFault.setErrorDesc(ex.getMessage());
			ServiceFaultException faultException = 
					new ServiceFaultException( 	ex.getMessage(),
												ex,
												faultDoc);
			return faultException;
		}
	}