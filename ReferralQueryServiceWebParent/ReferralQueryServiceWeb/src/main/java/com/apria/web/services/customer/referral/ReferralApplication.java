package com.apria.web.services.customer.referral;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.core.Application;

import org.codehaus.jackson.jaxrs.JacksonJsonProvider;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.map.SerializationConfig.Feature;

import com.apria.web.services.common.FormattingOptionsContextResolver;

/**
 * Application Class that extends JAX-RS application.
 */
public class ReferralApplication extends Application {
	@Override
	public Set<Class<?>> getClasses() {

		Set<Class<?>> classes = new HashSet<Class<?>>();

		/* Add the classes which defines the @path */
		classes.add(RestReferral.class);

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
