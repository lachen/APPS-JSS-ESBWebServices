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

package com.apria.web.services.ecm.wsclient;

/**
 * This class specifies the XML messages used in the sample to do CRUD
 * operations. The MessageFormat class is used to replace the macros in these
 * messages with specific values for each operation
 */
public class MessageTemplate {
	// Authentication
	protected static final String AUTHENTICATION_DATA_TEMPLATE = "<AuthenticationData  connectString=\"SCHEMA=ICMADMIN\" configString=\"\">"
		+ "<ServerDef>"
		+ "<ServerType>{0}</ServerType>"
		+ "<ServerName>{1}</ServerName>"
		+ "</ServerDef>"
		+ "<LoginData>"
		+ "<UserID>{2}</UserID>"
		+ "<Password>{3}</Password>"
		+ "</LoginData>"
		+ "</AuthenticationData>";
	// Query item(s)
	protected static final String QUERY_TEMPLATE = "<RunQueryRequest xmlns=\"http://www.ibm.com/xmlns/db2/cm/beans/1.0/schema\" "
		+ "maxResults=\"{0}\" version=\"latest-version(.)\" contentOption=\"{1}\" retrieveOption=\"{2}\">"
		+ "{3}"
		+ "<QueryCriteria>"
		+ "<QueryString>{4}</QueryString>"
		+ "</QueryCriteria>" + "</RunQueryRequest>";
}
