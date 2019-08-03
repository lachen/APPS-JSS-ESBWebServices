package com.apria.ws.payersvcs;

import java.io.Serializable;

public class RthmeAgreement implements Serializable {
	
	//AGRMT_ID, AGRMT_NM, MSTR_AGRMT_UNQ_SK
	private String agrmtId;
	private String agrmtNm;
	private String agrmtUnqSk;
	private Boolean isRthmeAgrmtValid;
	
	
	public String getAgrmtId() {
		return agrmtId;
	}
	public void setAgrmtId(String agrmtId) {
		this.agrmtId = agrmtId;
	}
	public String getAgrmtNm() {
		return agrmtNm;
	}
	public void setAgrmtNm(String agrmtNm) {
		this.agrmtNm = agrmtNm;
	}
	public String getAgrmtUnqSk() {
		return agrmtUnqSk;
	}
	public void setAgrmtUnqSk(String agrmtUnqSk) {
		this.agrmtUnqSk = agrmtUnqSk;
	}
	public Boolean getIsRthmeAgrmtValid() {
		return isRthmeAgrmtValid;
	}
	public void setIsRthmeAgrmtValid(Boolean isRthmeAgrmtValid) {
		this.isRthmeAgrmtValid = isRthmeAgrmtValid;
	}
	
}
