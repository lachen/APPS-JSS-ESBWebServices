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

package com.apria.web.services.acis;

import com.apria.framework.common.exception.ApplicationRuntimeException;
import com.apria.framework.common.exception.handler.ExceptionHandler;
import com.apria.framework.common.util.logging.ApriaLogger;
import com.apria.web.services.acis.dao.EmailDao;
import com.apria.web.services.acis.vo.request.EmailRequest;
import com.apria.web.services.acis.vo.response.EmailResponse;
import com.apria.web.services.common.ServiceStatus;
import com.apria.web.services.common.util.CommonUtil;
import com.apria.web.services.common.util.ErrorCode;

/**
 * Implementation class for the EmailService interface.
 * 
 * @author BRANGANA
 */
public class EmailServiceImpl implements EmailService {

	private static long errorCount = 0;
	private static long lastErrorEmailTime = System.currentTimeMillis();
	private static ApriaLogger logger = ApriaLogger
		.getLogger(EmailServiceImpl.class);
	private ServiceStatus serviceStatus = new ServiceStatusImpl();

	@Override
	public EmailResponse getEmailList(EmailRequest request) throws Exception {

		EmailResponse response = null;

		try {
			response = new EmailResponse(new EmailDao().getEmailList(request));
		} catch (RuntimeException re) {
			throw re;
		} catch (Exception e) {

			/* Send a email notification about the error. */
			if (CommonUtil.needToSendErrorEmail(errorCount, lastErrorEmailTime)) {
				ApplicationRuntimeException are = new ApplicationRuntimeException(
					ErrorCode.SERVICE_ERROR, new Object[] { getStatusMessage(),
						e.getMessage() }, e);
				ExceptionHandler.handleException(are, logger);
				errorCount++;
				lastErrorEmailTime = System.currentTimeMillis();
			}

			throw e;
		}

		return response;
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
