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

import com.apria.web.services.ecm.vo.DocRequest;
import com.apria.web.services.ecm.vo.DocResponse;

@javax.jws.WebService(targetNamespace = "http://ecm.services.web.apria.com/", serviceName = "DocumentManagerImplService", portName = "DocumentManagerImplPort")
public class DocumentManagerImplDelegate {

	DocumentManagerImpl _documentManagerImpl = null;

	public DocumentManagerImplDelegate() {
		_documentManagerImpl = new DocumentManagerImpl();
	}

	public DocResponse getEcmDocument(DocRequest request) throws Exception {
		return _documentManagerImpl.getEcmDocument(request);
	}

}