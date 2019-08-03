package com.apria.ws.payersvcs;

import java.io.Serializable;

public class MasterAgreement implements Serializable {
	
	private String mstrAgrmtUnqSk;
	private String mstrAgrmtId;
	private String mstrAgrmtNm;
	private Boolean isMstrAgrmtValid;
	
	
	public Boolean getIsMstrAgrmtValid() {
		return isMstrAgrmtValid;
	}
	public void setIsMstrAgrmtValid(Boolean isMstrAgrmtValid) {
		this.isMstrAgrmtValid = isMstrAgrmtValid;
	}
	public String getMstrAgrmtId() {
		return mstrAgrmtId;
	}
	public void setMstrAgrmtId(String mstrAgrmtId) {
		this.mstrAgrmtId = mstrAgrmtId;
	}
	public String getMstrAgrmtNm() {
		return mstrAgrmtNm;
	}
	public void setMstrAgrmtNm(String mstrAgrmtNm) {
		this.mstrAgrmtNm = mstrAgrmtNm;
	}
	public String getMstrAgrmtUnqSk() {
		return mstrAgrmtUnqSk;
	}
	public void setMstrAgrmtUnqSk(String mstrAgrmtUnqSk) {
		this.mstrAgrmtUnqSk = mstrAgrmtUnqSk;
	}
	
	

	
	

}
