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

import com.apria.web.services.common.ServiceStatus;
import com.apria.web.services.upslt.delivery.vo.DeliveryRequest;
import com.apria.web.services.upslt.delivery.vo.DeliveryResponse;

/**
 * Interface that define the service methods to get the delivery status.
 * 
 * @author BRANGANA
 */
public interface DeliveryStatus extends ServiceStatus {

	/**
	 * Get the delivery status for the given delivery request.
	 * 
	 * @param request
	 * @return
	 * @throws Exception
	 */
	DeliveryResponse getDeliveryStatus(DeliveryRequest request)
		throws Exception;
}
