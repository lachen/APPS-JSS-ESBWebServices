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

package com.apria.web.services.upslt.delivery;

import java.sql.Connection;
import java.sql.Statement;

import com.apria.web.services.common.AbstractServiceStatusImpl;
import com.apria.web.services.common.util.DataSourceConnection;

/**
 * Implementation class for Service Status Interface.
 * 
 * @author BRANGANA
 */
public class ServiceStatusImpl extends AbstractServiceStatusImpl {

	@Override
	public String getStatusMessage() {

		StringBuffer errorMsg = new StringBuffer();
		StringBuffer sucessMsg = new StringBuffer();

		try {
			Connection conn = DataSourceConnection.getConnection("upslt");
			if (conn.isValid(0)) {
				sucessMsg.append("\n The UPSLT DB connection is GOOD.");
				try {
					Statement stmt = conn.createStatement();
					stmt.executeQuery("select 1 from dual");
					sucessMsg.append("\n The UPSLT dummy sql is GOOD.");
				} catch (Exception e) {
					errorMsg.append("\nException executing UPSLT dummy sql .");
				}

			} else {
				errorMsg.append("\nException while connecting to UPSLT DB.");
			}
		} catch (Exception e) {
			errorMsg.append("\nException while connecting to UPSLT DB.");
		}

		try {
			Connection conn = DataSourceConnection.getConnection("edw");
			sucessMsg.append("\n The EDW DB connection is GOOD.");
			try {
				Statement stmt = conn.createStatement();
				stmt.executeQuery("select 1 from  sysibm.sysdummy1");
				sucessMsg.append("\n The EDW dummy sql is GOOD.");
			} catch (Exception e) {
				errorMsg.append("\nException executing EDW dummy sql .");
			}
		} catch (Exception e) {
			errorMsg.append("\nException while connecting to EDW DB.");
		}

		if (errorMsg.length() == 0) {
			sucessMsg.append("\n The Service Components are GOOD.");
		}

		sucessMsg.append("\n Load balancer status is : " + isServiceActive());
		errorMsg.append(sucessMsg);

		return errorMsg.toString();
	}
}
