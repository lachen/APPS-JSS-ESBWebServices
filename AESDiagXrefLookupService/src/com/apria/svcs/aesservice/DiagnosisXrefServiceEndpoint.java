package com.apria.svcs.aesservice;

import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;

import com.apria.svcs.aesservice.exception.ServiceFaultException;
import com.apria.svcs.aesservice.exception.ValidationException;
import com.apria.svcs.dataobject.schema.*;

@Endpoint
public class DiagnosisXrefServiceEndpoint{
	
	private final DiagnosisXrefService diagnosisXrefService;

	/**
	 * Constructor to hold the business service object 
	 * @param diagnosisService
	 */
    public DiagnosisXrefServiceEndpoint(DiagnosisXrefService diagnosisService) {
        this.diagnosisXrefService = diagnosisService;
    }

    
    /**
     * Look up Diagnosis Xref code
     */
    @PayloadRoot(localPart=DiagnosisXrefService.GET_DIAGNOSIS_REQUEST, namespace=DiagnosisXrefService.NAMESPACE)
    public DiagnosisXrefResponseDocument getDiagnosisXrefCode( GetDiagnosisXrefRequestDocument diagRequest ) throws ValidationException,ServiceFaultException{ 
        return diagnosisXrefService.getXrefDiagnosisCode(diagRequest);     
    }
    
}
                    
           