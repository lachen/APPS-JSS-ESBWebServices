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

package com.apria.web.services.acis.dao;

import static com.apria.web.services.common.util.CommonUtil.isNotEmpty;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import com.apria.framework.common.util.logging.ApriaLogger;
import com.apria.web.services.acis.vo.Agent;
import com.apria.web.services.acis.vo.request.AgentRequest;
import com.apria.web.services.common.util.DataSourceConnection;
import com.apria.web.services.common.util.FileUtil;
import com.apria.web.services.common.util.PropertyManager;

/**
 * DAO class to get the agent details from ACIS database.
 * 
 * @author BRANGANA
 */
public class AgentDao {

	public static int BATCH_SIZE = PropertyManager.getPropertyInt(
		"search.batch.max", 5);
	private static volatile String agentSql = null;
	private static ApriaLogger logger = ApriaLogger.getLogger(AgentDao.class);
	private static volatile String placeHolder = null;

	public static String getPlaceHolder() {

		if (placeHolder != null) {
			return placeHolder;
		}
		synchronized (AgentDao.class) {
			if (placeHolder == null) {
				StringBuilder temp = new StringBuilder("?");
				for (int i = 1; i < BATCH_SIZE; i++) {
					temp.append(", ?");
				}
				placeHolder = temp.toString();
			}
		}
		return placeHolder;
	}

	public static void setParams(AgentRequest request, PreparedStatement pst)
		throws SQLException {

		int x = 1;
		String acisId = request.getAcisId();

		if (isNotEmpty(acisId)) {
			acisId = acisId.toUpperCase();
			if (acisId.contains(",")) {
				String[] idList = acisId.split(",");
				if (idList.length > AgentDao.BATCH_SIZE) {
					throw new RuntimeException("Enter only "
						+ AgentDao.BATCH_SIZE + " Agent Ids.");
				}
				for (int i = 0; i < idList.length; i++) {
					pst.setString(x++, idList[i]);
				}
				for (int j = idList.length; j < AgentDao.BATCH_SIZE; j++) {
					pst.setString(x++, null);
				}
			} else {
				pst.setString(x++, acisId);
			}
		}
	}

	private static String getAgentSql() throws Exception {

		if (agentSql != null) {
			return agentSql;
		}

		synchronized (AgentDao.class) {
			if (agentSql == null) {
				agentSql = FileUtil.getFileContent("agent_search.sql");
			}
		}
		return agentSql;
	}

	private static String getAgentSql(AgentRequest request) throws Exception {

		String sql = getAgentSql();
		StringBuilder where = new StringBuilder();

		String acisId = request.getAcisId();
		if (isNotEmpty(acisId)) {
			if (acisId.contains(",")) {
				where.append(" AND A.C7JPDC IN (" + AgentDao.getPlaceHolder()
					+ ") ");
			} else {
				where.append(" AND A.C7JPDC = ? ");
			}
		}

		return sql.replace("[CONDITION]", where.toString());
	}

	/**
	 * Get the Agent details for the given request.
	 * 
	 * @param request AgentRequest
	 * @return list of Agent Objects.
	 * @throws Exception
	 */
	public Collection<Agent> getAgentList(AgentRequest request)
		throws Exception {

		logger.entry("getAgentList");
		Connection conn = null;
		PreparedStatement pst = null;
		ResultSet rs = null;
		List<Agent> agentList = new ArrayList<Agent>();

		try {

			conn = DataSourceConnection.getAcisConnection("0905");
			pst = conn.prepareStatement(getAgentSql(request));

			setParams(request, pst);

			rs = pst.executeQuery();

			while (rs.next()) {

				Agent agent = new Agent();
				agent.setAcisId(rs.getString("Agent_Id"));
				agent.setFirstName(rs.getString("First_Name"));
				agent.setLastName(rs.getString("Last_Name"));
				agentList.add(agent);
			}
		} finally {
			DataSourceConnection.closeStmtResultSetAndConnection(pst, rs, conn);
		}

		logger.exit("getAgentList");
		return agentList;
	}
}
