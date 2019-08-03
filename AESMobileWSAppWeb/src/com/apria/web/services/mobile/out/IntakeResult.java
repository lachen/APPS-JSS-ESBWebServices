/**
 * 
 */
package com.apria.web.services.mobile.out;

import java.util.ArrayList;

/**
 * @author srinivas4
 *
 */
public class IntakeResult {

//    private ArrayList<Intake> intake;
	
    private String intakeCount;
    private String intakeOverFlow;
    private String recCount;
    private String recStatus;
    private String WOCount;
    
    private Intake[] intakeList;

	/**
	 * 
	 */
	public IntakeResult() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the intakeCount
	 */
	public String getIntakeCount() {
		return intakeCount;
	}

	/**
	 * @param intakeCount the intakeCount to set
	 */
	public void setIntakeCount(String intakeCount) {
		this.intakeCount = intakeCount;
	}

	/**
	 * @return the intakeOverFlow
	 */
	public String getIntakeOverFlow() {
		return intakeOverFlow;
	}

	/**
	 * @param intakeOverFlow the intakeOverFlow to set
	 */
	public void setIntakeOverFlow(String intakeOverFlow) {
		this.intakeOverFlow = intakeOverFlow;
	}

	/**
	 * @return the recCount
	 */
	public String getRecCount() {
		return recCount;
	}

	/**
	 * @param recCount the recCount to set
	 */
	public void setRecCount(String recCount) {
		this.recCount = recCount;
	}

	/**
	 * @return the recStatus
	 */
	public String getRecStatus() {
		return recStatus;
	}

	/**
	 * @param recStatus the recStatus to set
	 */
	public void setRecStatus(String recStatus) {
		this.recStatus = recStatus;
	}

	/**
	 * @return the wOCount
	 */
	public String getWOCount() {
		return WOCount;
	}

	/**
	 * @param count the wOCount to set
	 */
	public void setWOCount(String count) {
		WOCount = count;
	}

	/**
	 * @return the intakeList
	 */
	public Intake[] getIntakeList() {
		return intakeList;
	}

	/**
	 * @param intakeList the intakeList to set
	 */
	public void setIntakeList(Intake[] intakeList) {
		this.intakeList = intakeList;
	}





}
