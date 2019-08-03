package com.apria.svcs.aesservice;

import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;

import com.apria.svcs.aesservice.exception.ServiceFaultException;
import com.apria.svcs.aesservice.exception.ValidationException;
import com.apria.svcs.dataobject.schema.*;

@Endpoint
public class DiagnosisServiceEndpoint{
	
	private final DiagnosisService diagnosisService;

	/**
	 * Constructor to hold the business service object 
	 * @param diagnosisService
	 */
    public DiagnosisServiceEndpoint(DiagnosisService diagnosisService) {
        this.diagnosisService = diagnosisService;
    }

    
    /**
     * Look up Diagnosis is Valid
     */
    @PayloadRoot(localPart=DiagnosisService.GET_DIAGNOSIS_REQUEST, namespace=DiagnosisService.NAMESPACE)
    public DiagnosisResponseDocument isValidDiagnosisCode(GetDiagnosisRequestDocument diagRequest) throws ValidationException,ServiceFaultException{
        return diagnosisService.isValidDiagnosisCode(diagRequest);     
    }

}
                    
           