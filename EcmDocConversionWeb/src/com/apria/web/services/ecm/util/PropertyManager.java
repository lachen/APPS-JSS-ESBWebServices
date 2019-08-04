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

package com.apria.web.services.ecm.util;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.Properties;

/**
 * Property Manger class to read contentManager.properties file
 * 
 * @author PSRINIVA
 */
public class PropertyManager {

	private static Properties _properties = null;
	private static final String PROPERTIES_FILE_NAME = "ecmconversion.properties";

	public static Properties getCachedProperties() {

		if (_properties == null) {
			loadPropertiesFromFile();
		}
		return _properties;
	}

	/**
	 * return the requested property value with leading and trailing whitespace
	 * removed
	 * 
	 * @param key
	 * @return null if key not found
	 */
	public static String getProperty(String key) {

		return getProperty(key, null, false);
	}

	/**
	 * return the requested property value with leading and trailing whitespace
	 * removed
	 * 
	 * @param key
	 * @return defaultValue if key not found
	 */
	public static String getProperty(String key, String defaultValue) {

		try {
			return getProperty(key, defaultValue, true);
		} catch (RuntimeException e) {
			return defaultValue.trim();
		}

	}

	/**
	 * return the requested property value with leading and trailing whitespace
	 * removed
	 * 
	 * @param key
	 * @param defaultValue
	 * @return defaultValue if requested key not found.
	 */
	public static String getProperty(String key, String defaultValue,
		boolean defaultSpecified) {

		String value = getCachedProperties().getProperty(key, defaultValue);
		if (value != null) {
			value = value.trim();
		} else {
			if (!defaultSpecified) {
				throw new RuntimeException("Property <" + key
					+ "> doesn't exists!");
			}
		}
		return value;
	}

	/**
	 * return the requested property value with leading and trailing whitespace
	 * removed
	 * 
	 * @param key
	 * @return null if key not found
	 */
	public static int getPropertyInt(String key) {

		return getPropertyInt(key, 0, false);
	}

	/**
	 * return the requested property integer value with leading and trailing
	 * whitespace removed
	 * 
	 * @param key
	 * @return defaultValue if key not found
	 */
	public static int getPropertyInt(String key, int defaultValue) {

		try {
			return getPropertyInt(key, defaultValue, true);
		} catch (RuntimeException e) {
			return defaultValue;
		}
	}

	/**
	 * return the requested property integer value with leading and trailing
	 * whitespace removed
	 * 
	 * @param key
	 * @param defaultValue
	 * @return defaultValue if requested key not found.
	 */
	public static int getPropertyInt(String key, int defaultValue,
		boolean defaultSpecified) {

		int value = defaultValue;
		String valueStr = (defaultSpecified ? getCachedProperties()
			.getProperty(key, "") : getCachedProperties().getProperty(key));
		if (valueStr != null) {
			valueStr = valueStr.trim();
			try {
				value = Integer.parseInt(valueStr.trim());
			} catch (NumberFormatException ex) {
				if (!defaultSpecified)
					throw new RuntimeException("Property <" + key
						+ "> must be integer! Its value is <" + valueStr + ">");
			}
		} else {
			if (!defaultSpecified) {
				throw new RuntimeException("Property <" + key
					+ "> doesn't exists!");
			}
		}
		return value;
	}

	/**
	 * reload all properties from the config file
	 */
	private static void loadPropertiesFromFile() {

		InputStream internalIS = null;
		try {
			ClassLoader classLoader = PropertyManager.class.getClassLoader();
			internalIS = classLoader.getResourceAsStream(PROPERTIES_FILE_NAME);
			URL resource = classLoader.getResource(PROPERTIES_FILE_NAME);

			if (resource == null || internalIS == null) {
				// if properties are null, just return System properties.
				// Otherwise leave them as is.
				if (_properties == null) {
					_properties = System.getProperties();
				}
				return;
			}

			_properties = System.getProperties();
			try {
				_properties.load(internalIS);
			} catch (IOException ioe) {
				ioe.printStackTrace();
			}
		} finally {
			try {
				internalIS.close();
			} catch (Exception e) {
			}
		}
	}

	private PropertyManager() {

		// Instantiation of non static instances is not allowed.
	}

}
