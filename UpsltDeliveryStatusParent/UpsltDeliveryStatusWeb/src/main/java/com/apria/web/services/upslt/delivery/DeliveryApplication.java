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

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.core.Application;

import com.apria.web.services.common.util.CommonUtil;

/**
 * The Application which contains the list of Rest classes. this class is added
 * in the init param for the REST Servlet.
 * 
 * @author BRANGANA
 */
public class DeliveryApplication extends Application {

	@Override
	public Set<Class<?>> getClasses() {

		Set<Class<?>> classes = new HashSet<Class<?>>();

		/* Add the classes which defines the @path */
		classes.add(RestDeliveryStatus.class);
		classes.add(RestWorkOrderETA.class);
		return classes;
	}

	@Override
	public Set<Object> getSingletons() {

		return CommonUtil.getSingletons();
	}
}