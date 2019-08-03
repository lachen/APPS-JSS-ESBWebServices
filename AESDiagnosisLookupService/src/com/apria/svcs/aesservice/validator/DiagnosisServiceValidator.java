package com.apria.svcs.aesservice.validator;

import com.apria.svcs.dataobject.schema.*;
import com.apria.svcs.dataobject.schema.GetDiagnosisRequestDocument.GetDiagnosisRequest;
import com.apria.svcs.dataobject.schema.impl.GetDiagnosisRequestDocumentImpl;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

public class DiagnosisServiceValidator implements Validator {

	    /**
	    * This VALIDATOR validates Diagnosis instances, and any subclasses of Diagnosis too
	    */
	   public boolean supports(Class clazz) {
	      return GetDiagnosisRequestDocumentImpl.class.equals(clazz);
	   }

	   public void validate(Object target, Errors errors) {
		   
		  GetDiagnosisRequestDocument requestDoc = (GetDiagnosisRequestDocument) target;		  
		  /** get the request object */
		  GetDiagnosisRequest diagReq = requestDoc.getGetDiagnosisRequest();		  
		  /** get the diagnosis DO */
		  DiagnosisDO [] diagDOReq = diagReq.getDiagnosisDOArray();
		  
		  /** Request cannot be more than 30 */
		  if( diagDOReq == null ){
			  errors.reject(ValidatorConstant.ERR_CDE_REQ_REQUIRED,
		  				new Object[]{ValidatorConstant.REQ_ATTR_REQUIRED},
		  				ValidatorConstant.FIELD_DEFAULT_REQUIRED);
		  }
		  if( diagDOReq != null && diagDOReq.length > 30 ){
			 errors.reject(ValidatorConstant.ERR_CDE_MAX_REQUEST);
		  }
		  
		  for( DiagnosisDO diagDO : diagDOReq ){

				  if( diagDO == null  ){
					  errors.reject(ValidatorConstant.ERR_CDE_REQ_REQUIRED,
					  				new Object[]{ValidatorConstant.REQ_ATTR_REQUIRED},
					  				ValidatorConstant.FIELD_DEFAULT_REQUIRED);
				  }else{			  
					  if( diagDO.getDiagnosisCode() == null ||
							  diagDO.getDiagnosisCode().trim().length() == 0 ){
		
							errors.reject(ValidatorConstant.ERR_CDE_FIELD_REQUIRED,
								 		new Object[]{ValidatorConstant.FIELD_DIAG_CODE},
			    		  				ValidatorConstant.FIELD_DEFAULT_REQUIRED);     
					  }
				  }
		  }
	}
}
