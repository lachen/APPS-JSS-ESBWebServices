package com.apria.web.services.upslt.delivery;

import com.apria.framework.common.util.logging.ApriaLogger;
import com.apria.web.services.upslt.delivery.dao.WorkOrderETADao;
import com.apria.web.services.upslt.delivery.vo.PatientWorkOrdersETAResponse;
import com.apria.web.services.upslt.delivery.vo.WorkOrderETARequest;
import com.apria.web.services.upslt.delivery.vo.WorkOrderETAResponse;

public class WorkOrderETAServiceImpl {
	private static ApriaLogger logger = ApriaLogger.getLogger(WorkOrderETAServiceImpl.class);

	public WorkOrderETAResponse getWorkOrderETA(WorkOrderETARequest request) throws Exception {

		WorkOrderETAResponse obj = null;

		try {
			WorkOrderETADao dao = new WorkOrderETADao();
			obj = dao.getWorkOrderETA(request);
			if (obj == null) {
				obj = new WorkOrderETAResponse();
				obj.setStatus("N");
			}
		} catch (Exception e) {
			e.printStackTrace();
			logger.error("Error in WorkOrderETA ", e);
			obj = new WorkOrderETAResponse();
			obj.setStatus("E");
		}
		return obj;
	}

	public PatientWorkOrdersETAResponse getPatientWorkOrdersETA(WorkOrderETARequest request) throws Exception {

		PatientWorkOrdersETAResponse obj = null;

		try {
			WorkOrderETADao dao = new WorkOrderETADao();
			obj = dao.getPatientWorkOrdersETA(request);
		} catch (Exception e) {
			e.printStackTrace();
			logger.error("Error in getPatientWorkOrdersETA ", e);
			throw e;
		}
		return obj;
	}
}
