/**
 * FormIdSearchDO.java
 *
 * This file was auto-generated from WSDL
 * by the IBM Web services WSDL2Java emitter.
 * cf190834.07 v9308141138
 */

package com.apria.svcs.dataobject.schema;

import java.io.Serializable;

public class DiagnosisXrefSearchDO implements Serializable  {
	
	private java.lang.String systemCode;
    private java.lang.String diagnosisSrcCode;
    private java.lang.String diagnosisSrcDesc;
    private java.lang.String diagnosisXrefCode;
    private java.lang.String diagnosisXrefDesc;
    
	public DiagnosisXrefSearchDO() {
    }

	public java.lang.String getDiagnosisSrcCode() {
		return diagnosisSrcCode;
	}

	public void setDiagnosisSrcCode(java.lang.String diagnosisSrcCode) {
		this.diagnosisSrcCode = diagnosisSrcCode;
	}

	public java.lang.String getDiagnosisXrefCode() {
		return diagnosisXrefCode;
	}

	public void setDiagnosisXrefCode(java.lang.String diagnosisXrefCode) {
		this.diagnosisXrefCode = diagnosisXrefCode;
	}

	public java.lang.String getDiagnosisSrcDesc() {
		return diagnosisSrcDesc;
	}

	public void setDiagnosisSrcDesc(java.lang.String diagnosisSrcDesc) {
		this.diagnosisSrcDesc = diagnosisSrcDesc;
	}

	public java.lang.String getDiagnosisXrefDesc() {
		return diagnosisXrefDesc;
	}

	public void setDiagnosisXrefDesc(java.lang.String diagnosisXrefDesc) {
		this.diagnosisXrefDesc = diagnosisXrefDesc;
	}

	public java.lang.String getSystemCode() {
		return systemCode;
	}

	public void setSystemCode(java.lang.String systemCode) {
		this.systemCode = systemCode;
	}



}
