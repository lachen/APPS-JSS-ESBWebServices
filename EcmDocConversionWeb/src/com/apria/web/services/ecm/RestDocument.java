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

package com.apria.web.services.ecm;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import com.apria.web.services.ecm.vo.DocRequest;
import com.apria.web.services.ecm.vo.DocResponse;

@Path(value = "/document")
public class RestDocument {

	public byte[] getDocument(String itemType, String docid, String type)
		throws Exception {
		DocRequest request = new DocRequest();
		request.setConvertType(type);
		request.setDocumentId(docid);
		request.setItemType(itemType);

		DocumentManger manager = new DocumentManagerImpl();
		DocResponse response = manager.getEcmDocument(request);
		return response.getImageBytes();
	}

	@GET
	@Path(value = "/pdf/{itemtype}/{docid}")
	@Produces("application/pdf")
	public byte[] getPdfDocument(
		@PathParam(value = "itemtype") String itemType,
		@PathParam(value = "docid") String docid) throws Exception {

		return getDocument(itemType, docid, "pdf");
	}

	@GET
	@Path(value = "/png/{itemtype}/{docid}")
	@Produces("image/png")
	public byte[] getPngDocument(
		@PathParam(value = "itemtype") String itemType,
		@PathParam(value = "docid") String docid) throws Exception {

		return getDocument(itemType, docid, "png");
	}
}
