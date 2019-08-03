/**
 * 
 */
package com.apria.web.services.mobile.in;

import java.io.Serializable;

/**
 * @author srinivas4
 *
 */
public class SearchRequest implements Serializable {
	
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private java.lang.String branch;
    private java.lang.String fromDate;
    private java.lang.String toDate;
    private java.lang.String zipCode;
    private java.lang.String branchHost;
    private java.lang.String intakeStartSeq;

	/**
	 * 
	 */
	public SearchRequest() {
		// TODO Auto-generated constructor stub
	}

	public java.lang.String getBranch() {
		return branch;
	}

	public void setBranch(java.lang.String branch) {
		this.branch = branch;
	}

	public java.lang.String getFromDate() {
		return fromDate;
	}

	public void setFromDate(java.lang.String fromDate) {
		this.fromDate = fromDate;
	}

	public java.lang.String getToDate() {
		return toDate;
	}

	public void setToDate(java.lang.String toDate) {
		this.toDate = toDate;
	}

	public java.lang.String getZipCode() {
		return zipCode;
	}

	public void setZipCode(java.lang.String zipCode) {
		this.zipCode = zipCode;
	}

	public java.lang.String getBranchHost() {
		return branchHost;
	}

	public void setBranchHost(java.lang.String branchHost) {
		this.branchHost = branchHost;
	}

	public java.lang.String getIntakeStartSeq() {
		return intakeStartSeq;
	}

	public void setIntakeStartSeq(java.lang.String intakeStartSeq) {
		this.intakeStartSeq = intakeStartSeq;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((branch == null) ? 0 : branch.hashCode());
		result = prime * result
				+ ((branchHost == null) ? 0 : branchHost.hashCode());
		result = prime * result
				+ ((fromDate == null) ? 0 : fromDate.hashCode());
		result = prime * result
				+ ((intakeStartSeq == null) ? 0 : intakeStartSeq.hashCode());
		result = prime * result + ((toDate == null) ? 0 : toDate.hashCode());
		result = prime * result + ((zipCode == null) ? 0 : zipCode.hashCode());
		return result;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SearchRequest other = (SearchRequest) obj;
		if (branch == null) {
			if (other.branch != null)
				return false;
		} else if (!branch.equals(other.branch))
			return false;
		if (branchHost == null) {
			if (other.branchHost != null)
				return false;
		} else if (!branchHost.equals(other.branchHost))
			return false;
		if (fromDate == null) {
			if (other.fromDate != null)
				return false;
		} else if (!fromDate.equals(other.fromDate))
			return false;
		if (intakeStartSeq == null) {
			if (other.intakeStartSeq != null)
				return false;
		} else if (!intakeStartSeq.equals(other.intakeStartSeq))
			return false;
		if (toDate == null) {
			if (other.toDate != null)
				return false;
		} else if (!toDate.equals(other.toDate))
			return false;
		if (zipCode == null) {
			if (other.zipCode != null)
				return false;
		} else if (!zipCode.equals(other.zipCode))
			return false;
		return true;
	}
	

}
