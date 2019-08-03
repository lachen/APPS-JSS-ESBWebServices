package com.apria.svcs.aesservice.exception;

import java.util.List;

import org.springframework.validation.Errors;
import org.springframework.validation.FieldError;
import org.springframework.validation.ObjectError;

public class ValidationException extends RuntimeException {

	private static final long serialVersionUID = 1L;
	
	private Errors errors;

  	public ValidationException(final Errors errors) {
  		this.errors = errors;
  	}

	public Errors getErrors() {
		return errors;
	}
	
	public void setErrors(Errors errors) {
		this.errors = errors;
	}	 
	
	public String getFieldErrCode( ){
		if( errors != null && errors.hasGlobalErrors() ){
			ObjectError err = errors.getGlobalError();
			
			return (String)err.getArguments()[0];
		}
		return "";
	}
	
	public String getFieldErrDesc( ){
		if( errors != null && errors.hasGlobalErrors() ){
			ObjectError err = errors.getGlobalError();
			
			return (String)err.getDefaultMessage();
		}
		return "";
	}
  
}
