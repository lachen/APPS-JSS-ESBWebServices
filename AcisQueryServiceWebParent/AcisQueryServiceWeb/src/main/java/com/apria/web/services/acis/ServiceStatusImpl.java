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

import com.apria.web.services.common.AbstractServiceStatusImpl;
import com.apria.web.services.common.util.BusaCacheManager;
import com.apria.web.services.common.util.DataSourceConnection;

/**
 * Implementation class for Service Status Interface.
 * 
 * @author BRANGANA
 */
public class ServiceStatusImpl extends AbstractServiceStatusImpl {

	private static class TestThread extends Thread {

		private String cpu;
		private StringBuffer errorMsg;
		private StringBuffer successMsg;

		TestThread(String cpu, StringBuffer errorMsg, StringBuffer successMsg) {

			this.cpu = cpu;
			this.errorMsg = errorMsg;
			this.successMsg = successMsg;
		}

		public void run() {

			try {
				DataSourceConnection.getConnection(cpu);
				successMsg.append("\n ACIS service on CPU " + cpu + " is GOOD");
			} catch (Exception e) {
				errorMsg.append("\n Exception in getting ACIS Connection: "
					+ cpu);
			}
		}
	}

	@Override
	public String getStatusMessage() {

		StringBuffer errorMsg = new StringBuffer();
		StringBuffer sucessMsg = new StringBuffer();

		try {
			BusaCacheManager.doBusaLookup("0905");
		} catch (Exception e) {
			errorMsg.append("Exception while calling BUSA Service.");
		}

		String[] cpuList = { "BR0202", "BR0210", "BR0213", "BR0235", "BR0547",
			"BR0563", "BR0571", "BR0582", "BR0583", "BR0595", "BR0616",
			"BR0702", "BR0905", "NEPTUNE", "SATURN", "BR0042", "BR0104",
			"BR0142", "BR0165", "BR0169", "BR0182", "BR0183", "BR0151" };

		TestThread[] threadList = new TestThread[cpuList.length];

		int i = 0;
		for (String cpu : cpuList) {
			threadList[i] = new TestThread(cpu, errorMsg, sucessMsg);
			threadList[i++].start();
		}

		for (TestThread thread : threadList) {
			try {
				thread.join();
			} catch (InterruptedException e) {
			}
		}

		if (errorMsg.length() == 0) {
			sucessMsg.append("\n The Service Components are GOOD.");
		}

		sucessMsg.append("\n Load balancer status is : " + isServiceActive());
		errorMsg.append(sucessMsg);

		return errorMsg.toString();
	}
}
