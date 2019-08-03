/**
 * FormIdSearchDO.java
 *
 * This file was auto-generated from WSDL
 * by the IBM Web services WSDL2Java emitter.
 * cf190834.07 v9308141138
 */

package com.apria.svcs.dataobject.schema;

import java.io.Serializable;

public class DiagnosisSearchDO implements Serializable  {
    private java.lang.String diagnosisCode;
    private java.lang.String diagnosisDesc;
    private java.lang.String diagnosisCodeStatus;
    
    public DiagnosisSearchDO() {
    }

	public java.lang.String getDiagnosisCode() {
		return diagnosisCode;
	}

	public void setDiagnosisCode(java.lang.String diagnosisCode) {
		this.diagnosisCode = diagnosisCode;
	}

	public java.lang.String getDiagnosisDesc() {
		return diagnosisDesc;
	}

	public void setDiagnosisDesc(java.lang.String diagnosisDesc) {
		this.diagnosisDesc = diagnosisDesc;
	}

	public java.lang.String getDiagnosisCodeStatus() {
		return diagnosisCodeStatus;
	}

	public void setDiagnosisCodeStatus(java.lang.String diagnosisCodeStatus) {
		this.diagnosisCodeStatus = diagnosisCodeStatus;
	}

  

}
