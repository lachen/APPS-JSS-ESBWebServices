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
import com.apria.web.services.acis.vo.ProductPreference;
import com.apria.web.services.acis.vo.request.AgentRequest;
import com.apria.web.services.common.util.DataSourceConnection;
import com.apria.web.services.common.util.FileUtil;

/**
 * Dao Class to get the Product preferences for an Agent.
 * 
 * @author BRANGANA
 */
public class ProductPreferenceDao {

	private static ApriaLogger logger = ApriaLogger
		.getLogger(ProductPreferenceDao.class);

	private static volatile String productPreferenceSql = null;

	private static String getProductPreferenceSql() throws Exception {

		if (productPreferenceSql != null) {
			return productPreferenceSql;
		}

		synchronized (ProductPreferenceDao.class) {
			if (productPreferenceSql == null) {
				productPreferenceSql = FileUtil
					.getFileContent("product_preference.sql");
			}
		}
		return productPreferenceSql;
	}

	private static String getProductPreferenceSql(AgentRequest request)
		throws Exception {

		String sql = getProductPreferenceSql();
		StringBuilder where = new StringBuilder();

		String acisId = request.getAcisId();
		if (isNotEmpty(acisId)) {
			if (acisId.contains(",")) {
				where.append(" AND A.BBJPDC IN (" + AgentDao.getPlaceHolder()
					+ ") ");
			} else {
				where.append(" AND A.BBJPDC = ? ");
			}
		}

		return sql.replace("[CONDITION]", where.toString());
	}

	/**
	 * Get the ProductPreference details for the given request.
	 * 
	 * @param request AgentRequest
	 * @return list of ProductPreference Objects.
	 * @throws Exception
	 */
	public Collection<ProductPreference> getProductPreferenceList(
		AgentRequest request) throws Exception {

		return getProductPreferenceList(request, null);
	}

	/**
	 * Get the ProductPreference details for the given request.
	 * 
	 * @param request AgentRequest
	 * @return list of ProductPreference Objects.
	 * @throws Exception
	 */
	public Collection<ProductPreference> getProductPreferenceList(
		AgentRequest request,
		Map<String, Collection<ProductPreference>> resultMap) throws Exception {

		logger.entry("getProductPreferenceList");
		Connection conn = null;
		PreparedStatement pst = null;
		ResultSet rs = null;
		List<ProductPreference> preferenceList = new ArrayList<ProductPreference>();

		try {
			conn = DataSourceConnection.getAcisConnection("0905");
			pst = conn.prepareStatement(getProductPreferenceSql(request));

			AgentDao.setParams(request, pst);

			rs = pst.executeQuery();

			while (rs.next()) {
				String agentId = rs.getString("Agent_Id");

				ProductPreference preference = new ProductPreference();
				preference.setAgentId(agentId);
				preference.setModel(rs.getString("Model"));
				preference.setEffectiveDate(rs.getString("Effective_Date"));
				preference.setEndDate(rs.getString("End_Date"));
				preference.setNotes(rs.getString("Notes"));
				preference.setOpsClass(rs.getString("Ops_Class"));
				preference.setProduct(rs.getString("Product"));
				preference.setVendor(rs.getString("Vendor"));
				preferenceList.add(preference);

				/* if a map is passed add the result to the Map. */
				if (resultMap != null) {
					Collection<ProductPreference> prefList = resultMap
						.get(agentId);
					if (prefList == null) {
						prefList = new ArrayList<ProductPreference>();
						resultMap.put(agentId, prefList);
					}
					prefList.add(preference);
				}
			}
		} finally {
			DataSourceConnection.closeStmtResultSetAndConnection(pst, rs, conn);
		}

		logger.exit("getProductPreferenceList");
		return preferenceList;
	}

	/**
	 * Get the ProductPreference exists for the given request.
	 * 
	 * @param request AgentRequest
	 * @return true if ProductPreferencee exists.
	 * @throws Exception
	 */
	public boolean hasProductPreference(AgentRequest request) throws Exception {

		logger.entry("hasProductPreference");
		Connection conn = null;
		PreparedStatement pst = null;
		ResultSet rs = null;

		try {

			conn = DataSourceConnection.getAcisConnection("0905");
			pst = conn.prepareStatement(getProductPreferenceSql(request));

			AgentDao.setParams(request, pst);

			rs = pst.executeQuery();

			if (rs.next()) {
				return true;
			}
		} finally {
			DataSourceConnection.closeStmtResultSetAndConnection(pst, rs, conn);
		}

		logger.exit("hasProductPreference");
		return false;
	}
}
