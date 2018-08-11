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

import com.apria.web.services.upslt.delivery.vo.DeliveryRequest;
import com.apria.web.services.upslt.delivery.vo.DeliveryResponse;

/**
 * JAX-WS Generated class to convert DeliveryStatusImpl as web service.
 * 
 * @author BRANGANA
 */
@javax.jws.WebService(targetNamespace = "http://delivery.upslt.services.web.apria.com/", serviceName = "DeliveryStatusImplService", portName = "DeliveryStatusImplPort", wsdlLocation = "WEB-INF/wsdl/DeliveryStatusImplService.wsdl")
public class DeliveryStatusImplDelegate {

	DeliveryStatusImpl _deliveryStatusImpl = null;

	public DeliveryStatusImplDelegate() {

		_deliveryStatusImpl = new DeliveryStatusImpl();
	}

	public DeliveryResponse getDeliveryStatus(DeliveryRequest request)
		throws Exception {

		return _deliveryStatusImpl.getDeliveryStatus(request);
	}

	public String getStatusMessage() {

		return _deliveryStatusImpl.getStatusMessage();
	}

	public String isServiceActive() {

		return _deliveryStatusImpl.isServiceActive();
	}

	public String setServiceStatus(boolean active) {

		return _deliveryStatusImpl.setServiceStatus(active);
	}
}