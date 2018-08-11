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

package com.apria.web.services.upslt.gmtconv;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import com.apria.web.services.common.util.PropertyManager;
import com.apria.web.services.upslt.gmtconv.dao.ConversionDao;
import com.apria.web.services.upslt.gmtconv.vo.ConversionRequest;
import com.apria.web.services.upslt.gmtconv.vo.ConversionResponse;

/**
 * Class used to cache Conversion mappings.
 * 
 * @author BRANGANA
 */
public class ConversionCacheManager {

	private static volatile Map<String, ConversionResponse> conversionMap;
	private static long lastRefresh = 0;
	private static long refreshhInterval = Long.valueOf(PropertyManager
		.getProperty("gmt.conversion.cache.interval"));

	/**
	 * Add an businessUnit and Conversion object to the cache.
	 * 
	 * @param businessUnit
	 */
	public static void addConversionToCache(String businessUnit,
		ConversionResponse response) {

		getConversionMap().put(businessUnit, response);
	}

	/**
	 * Clear the entire cache.
	 * 
	 * @param user
	 */
	public static void clearConversionCache() {

		conversionMap = null;
	}

	/**
	 * get an Conversion object from the cache.
	 * 
	 * @param user
	 */
	public static ConversionResponse getConversion(String businessUnit)
		throws Exception {

		ConversionResponse response = getConversionFromCache(businessUnit);
		if (response == null) {
			response = doConversionLookup(businessUnit);
			addConversionToCache(businessUnit, response);
		}
		return response;
	}

	/**
	 * get an Conversion object from the cache.
	 * 
	 * @param businessUnit
	 */
	public static ConversionResponse getConversionFromCache(String businessUnit) {

		return getConversionMap().get(businessUnit);
	}

	private static ConversionResponse doConversionLookup(String businessUnit)
		throws Exception {

		ConversionRequest request = new ConversionRequest();
		request.setBusinessUnit(businessUnit);
		ConversionDao dao = new ConversionDao();

		return dao.getConversion(request);
	}

	private static Map<String, ConversionResponse> getConversionMap() {

		if (conversionMap != null && !needToRefresh()) {
			return conversionMap;
		}

		synchronized (ConversionCacheManager.class) {
			if (conversionMap == null) {
				conversionMap = new HashMap<String, ConversionResponse>();
				Collections.synchronizedMap(conversionMap);
			}
		}
		return conversionMap;
	}

	private static boolean needToRefresh() {

		if (System.currentTimeMillis() - lastRefresh > refreshhInterval) {
			return true;
		} else {
			return false;
		}
	}
}
