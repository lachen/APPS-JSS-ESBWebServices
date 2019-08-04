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

package com.apria.web.services.ecm.vo;

public class DocRequest {

	private String convertType;
	private String documentId;
	private String itemType;

	/**
	 * @return the convertType
	 */
	public String getConvertType() {
		return convertType;
	}

	/**
	 * @return the documentId
	 */
	public String getDocumentId() {
		return documentId;
	}

	/**
	 * @return the itemType
	 */
	public String getItemType() {
		return itemType;
	}

	/**
	 * @param convertType the convertType to set
	 */
	public void setConvertType(String convertType) {
		this.convertType = convertType;
	}

	/**
	 * @param documentId the documentId to set
	 */
	public void setDocumentId(String documentId) {
		this.documentId = documentId;
	}

	/**
	 * @param itemType the itemType to set
	 */
	public void setItemType(String itemType) {
		this.itemType = itemType;
	}

}
