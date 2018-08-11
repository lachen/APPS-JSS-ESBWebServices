/*******************************************************************************
 * Copyright (c) 2013 Apria Healthcare                                          *
 * As an unpublished work. All Rights Reserved.                                 *
 * This media contains an authorized copy or copies of material copyrighted by  *
 * Apria Healthcare and is the unpublished, confidential property of            *
 * Apria Healthcare. You may not disclose, copy or use any portion of           *
 * these materials for any purpose without the express written consent of Apria *
 * Healthcare.  You must reproduce this copyright notice and any other          *
 * copyright notices included in machine-readable copies on all authorized      *
 * copies.                                                                      *
 *******************************************************************************/

package com.apria.web.services.upslt.delivery;

import java.util.Collection;

import com.apria.framework.common.exception.ApplicationRuntimeException;
import com.apria.framework.common.exception.handler.ExceptionHandler;
import com.apria.framework.common.util.logging.ApriaLogger;
import com.apria.web.services.common.ServiceStatus;
import com.apria.web.services.common.util.CommonUtil;
import com.apria.web.services.common.util.ErrorCode;
import com.apria.web.services.upslt.delivery.dao.DeliveryStatusDao;
import com.apria.web.services.upslt.delivery.vo.Delivery;
import com.apria.web.services.upslt.delivery.vo.DeliveryRequest;
import com.apria.web.services.upslt.delivery.vo.DeliveryResponse;

/**
 * Implementation class for the DeliveryStatus service interface.
 * 
 * @author BRANGANA
 */
public class DeliveryStatusImpl implements DeliveryStatus {

	private static long errorEmailCount = 0;
	private static long lastErrorEmailTime = System.currentTimeMillis();

	private static ApriaLogger logger = ApriaLogger
		.getLogger(DeliveryStatusImpl.class);
	private ServiceStatus serviceStatus = new ServiceStatusImpl();

	@Override
	public DeliveryResponse getDeliveryStatus(DeliveryRequest request)
		throws Exception {

		DeliveryResponse result = new DeliveryResponse();

		try {
			DeliveryStatusDao dao = new DeliveryStatusDao();
			Collection<Delivery> deliveryList = dao.getDeliveryStatus(request);
			result.setDeliveryList(deliveryList);
			result.setDeliveryCount(deliveryList.size());
		} catch (Exception e) {

			/* Send a email notification about the error. */
			if (CommonUtil.needToSendErrorEmail(errorEmailCount,
				lastErrorEmailTime)) {
				ApplicationRuntimeException are = new ApplicationRuntimeException(
					ErrorCode.SERVICE_ERROR, new Object[] { getStatusMessage(),
						e.getMessage() }, e);
				ExceptionHandler.handleException(are, logger);
				errorEmailCount++;
				lastErrorEmailTime = System.currentTimeMillis();
			}
			throw e;
		}
		return result;
	}

	@Override
	public String getStatusMessage() {

		return serviceStatus.getStatusMessage();
	}

	@Override
	public String isServiceActive() {

		return serviceStatus.isServiceActive();
	}

	@Override
	public String setServiceStatus(boolean active) {

		return serviceStatus.setServiceStatus(active);
	}

}
