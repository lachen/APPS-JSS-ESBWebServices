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

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import com.apria.web.services.acis.vo.request.EmailRequest;
import com.apria.web.services.acis.vo.response.EmailResponse;

/**
 * Class provide restful access to patient email Query services.
 * 
 * @author BRANGANA
 */
@Path(value = "/emaillist")
public class RestEmail {

	/**
	 * Get the email response for the given inputs. the response will be in JSON
	 * format.
	 * 
	 * @param businessUnit to find the ACIS CPU.
	 * @param acisId patient id in ACIS.
	 * @param typeCode Email address Type code in ACIS.
	 * @return EmailResponse
	 * @throws Exception
	 */
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public EmailResponse getEmailList(
		@QueryParam(value = "businessunit") String businessUnit,
		@QueryParam(value = "acisid") String acisId,
		@QueryParam(value = "typecode") String typeCode) throws Exception {

		EmailRequest request = new EmailRequest();
		request.setAcisId(acisId);
		request.setBusinessUnit(businessUnit);
		request.setTypeCode(typeCode);

		return new EmailServiceImpl().getEmailList(request);
	}

	/**
	 * Get the email response for the given inputs. the response will be in XML
	 * format.
	 * 
	 * @param businessUnit to find the ACIS CPU.
	 * @param acisId patient id in ACIS.
	 * @param typeCode Email address Type code in ACIS.
	 * @return EmailResponse
	 * @throws Exception
	 */
	@GET
	@Path(value = "/xml")
	@Produces(MediaType.APPLICATION_XML)
	public EmailResponse getEmailListXml(
		@QueryParam(value = "businessunit") String businessUnit,
		@QueryParam(value = "acisid") String acisId,
		@QueryParam(value = "typecode") String typeCode) throws Exception {

		return getEmailList(businessUnit, acisId, typeCode);
	}
}
