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
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

import com.apria.framework.common.util.logging.ApriaLogger;
import com.apria.web.services.acis.vo.Attribute;
import com.apria.web.services.acis.vo.request.AgentRequest;
import com.apria.web.services.common.util.DataSourceConnection;
import com.apria.web.services.common.util.FileUtil;

/**
 * Dao Class to get the Attributes for an Agent.
 * 
 * @author BRANGANA
 */
public class AttributeDao {

	private static volatile String attributeSql = null;

	private static ApriaLogger logger = ApriaLogger
		.getLogger(AttributeDao.class);

	private static String getAttributeSql() throws Exception {

		if (attributeSql != null) {
			return attributeSql;
		}

		synchronized (AttributeDao.class) {
			if (attributeSql == null) {
				attributeSql = FileUtil.getFileContent("attribute.sql");
			}
		}
		return attributeSql;
	}

	private static String getAttributeSql(AgentRequest request)
		throws Exception {

		String sql = getAttributeSql();
		StringBuilder where = new StringBuilder();

		String acisId = request.getAcisId();
		if (isNotEmpty(acisId)) {
			if (acisId.contains(",")) {
				where.append(" AND A.BTILCU IN (" + AgentDao.getPlaceHolder()
					+ ") ");
			} else {
				where.append(" AND A.BTILCU = ? ");
			}
		}

		return sql.replace("[CONDITION]", where.toString());
	}

	/**
	 * Get the Attribute details for the given request.
	 * 
	 * @param request AgentRequest
	 * @return list of Attribute Objects.
	 * @throws Exception
	 */
	public Collection<Attribute> getAttributeList(AgentRequest request)
		throws Exception {

		return getAttributeList(request, null);
	}

	/**
	 * Get the Attribute details for the given request.
	 * 
	 * @param request AgentRequest
	 * @return list of Attribute Objects.
	 * @throws Exception
	 */
	public Collection<Attribute> getAttributeList(AgentRequest request,
		Map<String, Collection<Attribute>> resultMap) throws Exception {

		logger.entry("getAttributeList");
		Connection conn = null;
		PreparedStatement pst = null;
		ResultSet rs = null;
		List<Attribute> attributeList = new ArrayList<Attribute>();

		try {

			conn = DataSourceConnection.getAcisConnection("0905");
			pst = conn.prepareStatement(getAttributeSql(request));

			AgentDao.setParams(request, pst);

			rs = pst.executeQuery();

			while (rs.next()) {

				String agentId = rs.getString("Agent_Id");
				Attribute attribute = new Attribute();
				attribute.setAgentId(agentId);
				attribute.setCode(rs.getString("Code"));
				attribute.setEffectiveDate(rs.getString("Effective_Date"));
				attribute.setEndDate(rs.getString("End_Date"));
				attribute.setDescription(rs.getString("Description"));
				attributeList.add(attribute);

				/* if a map is passed add the result to the Map. */
				if (resultMap != null) {
					Collection<Attribute> attrList = resultMap.get(agentId);
					if (attrList == null) {
						attrList = new ArrayList<Attribute>();
						resultMap.put(agentId, attrList);
					}
					attrList.add(attribute);
				}
			}
		} finally {
			DataSourceConnection.closeStmtResultSetAndConnection(pst, rs, conn);
		}

		logger.exit("getAttributeList");
		return attributeList;
	}

	/**
	 * Get the Attribute exists for the given request.
	 * 
	 * @param request AgentRequest
	 * @return true if Attribute exists.
	 * @throws Exception
	 */
	public boolean hasAttribute(AgentRequest request) throws Exception {

		logger.entry("hasAttribute");
		Connection conn = null;
		PreparedStatement pst = null;
		ResultSet rs = null;

		try {

			conn = DataSourceConnection.getAcisConnection("0905");
			pst = conn.prepareStatement(getAttributeSql(request));

			AgentDao.setParams(request, pst);

			rs = pst.executeQuery();

			if (rs.next()) {
				return true;
			}
		} finally {
			DataSourceConnection.closeStmtResultSetAndConnection(pst, rs, conn);
		}

		logger.exit("hasAttribute");
		return false;
	}
}
