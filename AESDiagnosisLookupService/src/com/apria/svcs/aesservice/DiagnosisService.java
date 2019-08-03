package com.apria.svcs.aesservice;

import com.apria.svcs.aesservice.exception.ServiceFaultException;
import com.apria.svcs.aesservice.exception.ValidationException;
import com.apria.svcs.dataobject.schema.*;

/**
 * Diagnosis Lookup Service
 * @author LVEENASU
 *
 */
public interface DiagnosisService {
    
	/** NAMESPACE in WSDL */
    public final static String NAMESPACE = "http://schema.dataobject.svcs.apria.com/";
    /** Local Part in WSDL */
    public final static String GET_DIAGNOSIS_REQUEST = "getDiagnosisRequest";
    /** context beans */
	public final static String _CONTEXT_XML_KEY = "/WEB-INF/daoContext.xml";

    /**
     * Diagnosis Lookup Service
     */
    public DiagnosisResponseDocument isValidDiagnosisCode(GetDiagnosisRequestDocument request) 
														  throws ValidationException,ServiceFaultException;

}
