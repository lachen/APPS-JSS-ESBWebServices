package com.apria.web.services.upslt.delivery.vo;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author Anil_Kumar_Mittur_Ve
 *
 */
@XmlRootElement
public class PatientWorkOrdersETAResponse {

	private List<WorkOrderETA> workOrderETAList;

	/**
	 * @param workOrderETAList the workOrderETAList to set
	 */
	public void setWorkOrderETAList(List<WorkOrderETA> workOrderETAList) {
		this.workOrderETAList = workOrderETAList;
	}

	/**
	 * @return the workOrderETAList
	 */
	@XmlElementWrapper(name = "workOrderETAList")
	@XmlElement(name = "workOrderETA")
	public List<WorkOrderETA> getWorkOrderETAList() {
		return workOrderETAList;
	}
}
