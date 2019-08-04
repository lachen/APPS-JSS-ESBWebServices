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

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.rmi.RemoteException;
import java.text.MessageFormat;

import javax.activation.DataHandler;

import org.w3c.dom.Document;

import com.apria.framework.common.exception.ApplicationException;
import com.apria.framework.common.exception.ServiceException;
import com.apria.framework.common.util.logging.ApriaLogger;
import com.apria.web.services.ecm.util.Constants;
import com.apria.web.services.ecm.util.ExceptionCodes;
import com.apria.web.services.ecm.util.PropertyManager;
import com.apria.web.services.ecm.vo.DocResponse;
import com.ibm.mm.webservices.was60.CMBXMLResponse;

/**
 * Sample program illustrating how to retrieve multiple items using RetrieveItem
 * operation through IBM DB2 Content Manager Generic WebService.
 */
public class ECMWebServiceHelper extends GenericWebServiceHelperBase {

	private static final String DEFAULT_DSTYPE = "ICM";
	private static final String DEFAULT_PASSWORD = PropertyManager
		.getProperty(Constants.CM_PASSWORD_KEY);
	private static final String DEFAULT_SERVER = PropertyManager
		.getProperty(Constants.CM_DATABASE_KEY);

	private static final String DEFAULT_USERNAME = PropertyManager
		.getProperty(Constants.CM_USERNAME_KEY);
	private static ApriaLogger logger = ApriaLogger
		.getLogger(ECMWebServiceHelper.class);
	private static final String websvcURL = PropertyManager
		.getProperty(Constants.CMB_GENERIC_SERVICE_URL);

	private static final String WORKING_DIRECTORY = PropertyManager
		.getProperty(Constants.FAX_DIR_TEMP_CACHE);
	private String authenticationDataXML;
	private static final String DEFAULT_CREDENTIAL = createAuthenticationDataXML(
		DEFAULT_DSTYPE, DEFAULT_SERVER, DEFAULT_USERNAME, DEFAULT_PASSWORD);

	/**
	 * Constructors
	 */
	public ECMWebServiceHelper() throws ServiceException, ApplicationException {

		initialization();
		authenticationDataXML = DEFAULT_CREDENTIAL;
	}

	/**
	 * Get fax image using item id and item type
	 * 
	 * @param itemId
	 * @param itemType
	 * @return
	 * @throws ServiceException
	 */
	public DocResponse getFaxImageByItemID(String itemId, String itemType)
		throws ServiceException {
		logger.entry("getFaxImageByItemID");

		if (itemType != null) {
			itemType = "/" + itemType;
		} else {
			itemType = "/*";
		}

		String queryString = itemType + "[@ITEMID=\"" + itemId + "\"]";
		String requestXML = MessageFormat.format(
			MessageTemplate.QUERY_TEMPLATE, new Object[] { "1", "ATTACHMENTS",
				"CONTENT", authenticationDataXML, queryString });

		CMBXMLResponse response = null;
		try {
			response = cmbservice.processXMLRequest(requestXML, null, null,
				null);
		} catch (RemoteException re) {
			ServiceException se = new ServiceException(
				ExceptionCodes.CM_WEBSERVICE_FAILURE,
				new String[] { removeAuthDtls(requestXML) }, re);
			throw se;
		}

		return getImageFromResponse(response);
	}

	/**
	 * Get fax image from Web Service response
	 * 
	 * @param response
	 * @return
	 * @throws ServiceException
	 */
	private DocResponse getImageFromResponse(CMBXMLResponse response)
		throws ServiceException {
		if (response == null)
			return null;

		Document document = getDocument(response.getXmlResponseText());
		if (document == null || parseRequestStatus(document) == false) {
			ServiceException se = new ServiceException(
				ExceptionCodes.CM_WEBSERVICE_FAILURE,
				new String[] { response.getXmlResponseText() });
			throw se;
		}

		DataHandler[] dhs = response.getAttachments();
		if (dhs == null || dhs.length == 0) {
			ServiceException se = new ServiceException(
				ExceptionCodes.CM_WS_GET_DOCS_NO_ATTACHEMENTS);
			throw se;
		}

		byte[] image = null;
		DataHandler dh = dhs[0];
		String[] contentID = response.getContentID();

		try {
			InputStream is = dh.getInputStream();

			ByteArrayOutputStream out = new ByteArrayOutputStream();
			byte buf[] = new byte[1024];
			int len;
			while ((len = is.read(buf)) > 0)
				out.write(buf, 0, len);
			image = out.toByteArray();
			out.close();
			is.close();
		} catch (IOException ioe) {
			ServiceException se = new ServiceException(
				ExceptionCodes.CM_HANDLER_STREAM, new Object[] { contentID[0] });
			throw se;
		}
		DocResponse imageData = new DocResponse();
		imageData.setImageBytes(image);
		imageData.setMimeType(dh.getContentType());

		return imageData;
	}

	/**
	 * Instance initialization
	 */
	private void initialization() throws ServiceException, ApplicationException {

		// Initialization
		if (workingDir == null || workingDir.length() == 0) {
			setWorkingDir(WORKING_DIRECTORY);
		}

		// Only create static variable cmbservice once
		if (cmbservice == null) {
			createGenericWebService(websvcURL);
		}

		// make sure we can create the xml->dom document builder
		initializeDocumentBuilder();

	}
}
