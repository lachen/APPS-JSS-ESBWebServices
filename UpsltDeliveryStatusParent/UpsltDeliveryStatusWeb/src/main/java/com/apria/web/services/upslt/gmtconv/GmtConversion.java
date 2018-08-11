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

import com.apria.web.services.upslt.gmtconv.vo.ConversionRequest;
import com.apria.web.services.upslt.gmtconv.vo.ConversionResponse;

/**
 * Interface that defines the service methods for GMT time conversion.
 * 
 * @author BRANGANA
 */
public interface GmtConversion {

	/**
	 * Get the GMT offset details for the given request.
	 * 
	 * @param request
	 * @return
	 * @throws Exception
	 */
	ConversionResponse getGmtOffset(ConversionRequest request) throws Exception;
}
