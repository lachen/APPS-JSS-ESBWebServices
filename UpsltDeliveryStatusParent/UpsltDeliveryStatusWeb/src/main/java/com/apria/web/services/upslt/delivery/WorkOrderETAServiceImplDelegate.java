package com.apria.web.services.upslt.delivery;

import com.apria.web.services.upslt.delivery.vo.PatientWorkOrdersETAResponse;
import com.apria.web.services.upslt.delivery.vo.WorkOrderETARequest;
import com.apria.web.services.upslt.delivery.vo.WorkOrderETAResponse;


@javax.jws.WebService (targetNamespace="http://delivery.upslt.services.web.apria.com/", serviceName="WorkOrderETAService", portName="WorkOrderETAServicePort", wsdlLocation="WEB-INF/wsdl/WorkOrderETAService.wsdl")
public class WorkOrderETAServiceImplDelegate{

    com.apria.web.services.upslt.delivery.WorkOrderETAServiceImpl _workOrderETAServiceImpl = null;

    public WorkOrderETAResponse getWorkOrderETA(WorkOrderETARequest request) throws Exception {
        return _workOrderETAServiceImpl.getWorkOrderETA(request);
    }

    public PatientWorkOrdersETAResponse getPatientWorkOrdersETA(WorkOrderETARequest request) throws Exception {
        return _workOrderETAServiceImpl.getPatientWorkOrdersETA(request);
    }

    public WorkOrderETAServiceImplDelegate() {
        _workOrderETAServiceImpl = new com.apria.web.services.upslt.delivery.WorkOrderETAServiceImpl(); }

}