/*******************************************************************************
 * Copyright (c) 2014 Apria Healthcare                                          *
 * As an unpublished work. All Rights Reserved.                                 *
 * This media contains an authorized copy or copies of material copyrighted by  *
 * Apria Healthcare and is the unpublished, confidential property of            *
 * Apria Healthcare. You may not disclose, copy or use any portion of           *
 * these materials for any purpose without the express written consent of Apria *
 * Healthcare.  You must reproduce this copyright notice and any other          *
 * copyright notices included in machine-readable copies on all authorized      *
 * copies.                                                                      *
 *******************************************************************************/

package com.apria.web.services.mediation.util;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import javax.xml.transform.Source;
import javax.xml.transform.Templates;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.stream.StreamSource;

/**
 * Utility Class used to Send the SOAP Request Using SAAJ.
 * 
 * @author BRANGAN3
 */
public class XslUtil {

	private volatile static Map<String, Templates> templateMap;

	public static Transformer getTransformer(String xslFile) throws Exception {

		Templates cachedTemp = getTemplateMap().get(xslFile);

		if (cachedTemp == null) {
			synchronized (XslUtil.class) {
				cachedTemp = getTemplateMap().get(xslFile);
				if (cachedTemp == null) {
					Source xsltSource = new StreamSource(
							XslUtil.class.getClassLoader().getResourceAsStream("xsl/" + xslFile + ".xsl"));
					System.out.println("xsl transform");
					cachedTemp = TransformerFactory.newInstance().newTemplates(xsltSource);
					getTemplateMap().put(xslFile, cachedTemp);
				}
			}
		}

		return cachedTemp.newTransformer();
	}

	private static Map<String, Templates> getTemplateMap() {

		if (templateMap != null) {
			return templateMap;
		}

		synchronized (XslUtil.class) {
			if (templateMap == null) {
				templateMap = new HashMap<String, Templates>();
				Collections.synchronizedMap(templateMap);
			}
		}
		return templateMap;
	}

}
