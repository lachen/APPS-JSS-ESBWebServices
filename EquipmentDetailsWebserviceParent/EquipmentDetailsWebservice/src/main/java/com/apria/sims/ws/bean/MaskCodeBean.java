/*******************************************************************************
 * Copyright (c) 2011 Apria Healthcare                                          *
 * As an unpublished work. All Rights Reserved.                                 *
 * This media contains an authorized copy or copies of material copyrighted by  *
 * Apria Healthcare and is the unpublished, confidential property of            *
 * Apria Healthcare. You may not disclose, copy or use any portion of           *
 * these materials for any purpose without the express written consent of Apria *
 * Healthcare.  You must reproduce this copyright notice and any other          *
 * copyright notices included in machine-readable copies on all authorized      *
 * copies.                                                                      *
 *******************************************************************************/
package com.apria.sims.ws.bean;

import java.io.Serializable;

/**
 * @author jainadit
 * Mask Code Bean for Equipment Details Web Service
 */
public class MaskCodeBean implements Serializable {
	private static final long serialVersionUID = 3247087657395933062L;
	private int modelmasksk;//model mask primary key
	private String modelmaskcode;//model mask name
	/**
	 * @return the modelmasksk
	 */
	public int getModelmasksk() {
		return modelmasksk;
	}
	/**
	 * @return the modelmaskcode
	 */
	public String getModelmaskcode() {
		return modelmaskcode;
	}
	/**
	 * @param modelmasksk the modelmasksk to set
	 */
	public void setModelmasksk(int modelmasksk) {
		this.modelmasksk = modelmasksk;
	}
	/**
	 * @param modelmaskcode the modelmaskcode to set
	 */
	public void setModelmaskcode(String modelmaskcode) {
		this.modelmaskcode = modelmaskcode;
	}
}
