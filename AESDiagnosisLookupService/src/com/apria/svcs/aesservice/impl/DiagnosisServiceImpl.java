package com.apria.svcs.aesservice.impl;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.validation.BindException;
import org.springframework.validation.Validator;

import com.apria.svcs.aesservice.DiagnosisService;
import com.apria.svcs.aesservice.dao.DiagnosisServiceDAO;
import com.apria.svcs.aesservice.exception.ServiceFaultException;
import com.apria.svcs.aesservice.exception.ValidationException;
import com.apria.svcs.dataobject.schema.*;
import com.apria.svcs.dataobject.schema.DiagnosisResponseDocument.DiagnosisResponse;
import com.apria.svcs.dataobject.schema.GetDiagnosisRequestDocument.GetDiagnosisRequest;

public class DiagnosisServiceImpl implements DiagnosisService{

	/** Content Management DAO */
	private final String _BEAN_KEY = "diagnosisDAO";
	
	/** VALIDATOR Object */
	private Validator validator = null;

	/** Bean Factory */
	private BeanFactory factory = null;
	
	
	public DiagnosisServiceImpl(){
		ClassPathResource resource = new ClassPathResource(_CONTEXT_XML_KEY);
    	factory = new XmlBeanFactory(resource);
	}
	
	public void setValidator(Validator validator){
		this.validator = validator;
	}
	
	public Validator getValidator(){
		return this.validator;
	}
	
	
	public DiagnosisResponseDocument isValidDiagnosisCode(GetDiagnosisRequestDocument diagRequest) 
														  throws ValidationException, ServiceFaultException{
        GetDiagnosisRequestDocument requestDoc = (GetDiagnosisRequestDocument) diagRequest;
        
    	/** Invoke the VALIDATOR if any */
    	this.invokeValidate(requestDoc);
    	
    	/**
    	 * Get the diagnosis request
    	 */
        GetDiagnosisRequest diagReq = requestDoc.getGetDiagnosisRequest();

        /** create the diagnosis response */        
        DiagnosisResponseDocument responseDoc = (DiagnosisResponseDocument)
        										DiagnosisResponseDocument.Factory.newInstance();
        /** add the diagnosis response */
        DiagnosisResponse  response = responseDoc.addNewDiagnosisResponse();
        
        /** perform database look up */
        try{
        	((DiagnosisServiceDAO)this.getDAO()).diagnosisCodeLookup(diagReq.getDiagnosisDOArray(), response);
        }catch( com.apria.framework.common.exception.DAOException daoEx){
        	daoEx.printStackTrace();
        	ServiceFaultDocument faultDoc = ServiceFaultDocument.Factory.newInstance();
			ServiceFault serviceFault = faultDoc.addNewServiceFault();			
			serviceFault.setErrorCode("AES-ESB-SERVICE-DAO-ERR");
			serviceFault.setErrorSev(ErrorSeverity.ERROR);
			serviceFault.setErrorDesc(daoEx.getMessage());
	
			throw new ServiceFaultException("DAO_EXCEPTION",
											daoEx,
											faultDoc);
        }
        
        return responseDoc;
    }
	
	private void invokeValidate(final Object requestDoc){
		/** create the error object */
		final BindException errors = new BindException(requestDoc, requestDoc.getClass().getName());
		/** validate the request document */
		validator.validate(requestDoc, errors);		
		if (errors.hasErrors()) {			
		     throw new ValidationException(errors);
		}	
	}
	
	public Object getDAO(){
		return (Object)factory.getBean(_BEAN_KEY);
	}
}
