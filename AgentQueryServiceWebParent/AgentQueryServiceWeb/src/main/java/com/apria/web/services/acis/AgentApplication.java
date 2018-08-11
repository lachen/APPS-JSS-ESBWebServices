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

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.core.Application;

import org.codehaus.jackson.jaxrs.JacksonJsonProvider;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.map.SerializationConfig.Feature;

import com.apria.web.services.common.FormattingOptionsContextResolver;

/**
 * Application Class that extends JAX-RS application.
 * 
 * @author BRANGANA
 */
public class AgentApplication extends Application {

	@Override
	public Set<Class<?>> getClasses() {

		Set<Class<?>> classes = new HashSet<Class<?>>();

		/* Add the classes which defines the @path */
		classes.add(RestAgent.class);
		classes.add(RestAttribute.class);
		classes.add(RestContactPreference.class);
		classes.add(RestDeliveryCommitment.class);
		classes.add(RestProductPreference.class);

		return classes;
	}

	@Override
	public Set<Object> getSingletons() {

		Set<Object> singletons = new HashSet<Object>();

		/* Set the JacksonJson Provider to get JSON Response using @Produces. */
		ObjectMapper jacksonMapper = new ObjectMapper();
		jacksonMapper.configure(Feature.INDENT_OUTPUT, true);
		singletons.add(new JacksonJsonProvider(jacksonMapper));

		/* Set the XML formating options for XML Response in @Produces. */
		singletons.add(new FormattingOptionsContextResolver());
		return singletons;
	}
}
