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
import com.apria.web.services.acis.vo.DeliveryCommitment;
import com.apria.web.services.acis.vo.request.AgentRequest;
import com.apria.web.services.common.util.DataSourceConnection;
import com.apria.web.services.common.util.FileUtil;

/**
 * Dao Class to get the Delivery Commitment for an Agent.
 * 
 * @author BRANGANA
 */
public class DeliveryCommitmentDao {

	private static volatile String deliveryCommitmentSql = null;

	private static ApriaLogger logger = ApriaLogger
		.getLogger(DeliveryCommitmentDao.class);

	/**
	 * Return the time in HH:MM format from the 5 digit ACIS time.
	 * 
	 * @param acisTime
	 * @return the time in HH:MM format
	 */
	private static String getCommitment(String acisTime) {

		if (acisTime == null) {
			return null;
		}

		StringBuilder time = new StringBuilder(acisTime);

		if (acisTime.length() == 5) {
			time.insert(1, ":");
			time.delete(3, 5);
			time.insert(0, "0");
		}

		return time.toString();
	}

	private static String getDeliveryCommitmentSql() throws Exception {

		if (deliveryCommitmentSql != null) {
			return deliveryCommitmentSql;
		}

		synchronized (DeliveryCommitmentDao.class) {
			if (deliveryCommitmentSql == null) {
				deliveryCommitmentSql = FileUtil
					.getFileContent("delivery_commitment.sql");
			}
		}
		return deliveryCommitmentSql;
	}

	private static String getDeliveryCommitmentSql(AgentRequest request)
		throws Exception {

		String sql = getDeliveryCommitmentSql();
		StringBuilder where = new StringBuilder();

		String acisId = request.getAcisId();
		if (isNotEmpty(acisId)) {
			if (acisId.contains(",")) {
				where.append(" AND A.A9JPDC IN (" + AgentDao.getPlaceHolder()
					+ ") ");
			} else {
				where.append(" AND A.A9JPDC = ? ");
			}
		}

		return sql.replace("[CONDITION]", where.toString());
	}

	/**
	 * Get the DeliveryCommitment details for the given request.
	 * 
	 * @param request AgentRequest
	 * @return list of DeliveryCommitment Objects.
	 * @throws Exception
	 */
	public Collection<DeliveryCommitment> getDeliveryCommitmentList(
		AgentRequest request) throws Exception {

		return getDeliveryCommitmentList(request, null);
	}

	/**
	 * Get the DeliveryCommitment details for the given request.
	 * 
	 * @param request AgentRequest
	 * @return list of DeliveryCommitment Objects.
	 * @throws Exception
	 */
	public Collection<DeliveryCommitment> getDeliveryCommitmentList(
		AgentRequest request,
		Map<String, Collection<DeliveryCommitment>> resultMap) throws Exception {

		logger.entry("getDeliveryCommitmentList");
		Connection conn = null;
		PreparedStatement pst = null;
		ResultSet rs = null;
		List<DeliveryCommitment> commitmentList = new ArrayList<DeliveryCommitment>();

		try {

			conn = DataSourceConnection.getAcisConnection("0905");
			pst = conn.prepareStatement(getDeliveryCommitmentSql(request));

			AgentDao.setParams(request, pst);

			rs = pst.executeQuery();

			while (rs.next()) {
				String agentId = rs.getString("Agent_Id");

				DeliveryCommitment commitment = new DeliveryCommitment();
				commitment.setAgentId(rs.getString("Agent_Id"));
				commitment.setCommitment(getCommitment(rs
					.getString("Commitment")));
				commitment.setEffectiveDate(rs.getString("Effective_Date"));
				commitment.setEndDate(rs.getString("End_Date"));
				commitment.setNumberOfDays(rs.getString("Number_Days"));
				commitment.setOpsClass(rs.getString("Ops_Class"));
				commitment.setProductCategory(rs.getString("Product_Category"));
				commitment.setNotes(rs.getString("Notes"));
				commitmentList.add(commitment);

				/* if a map is passed add the result to the Map. */
				if (resultMap != null) {
					Collection<DeliveryCommitment> commitList = resultMap
						.get(agentId);
					if (commitList == null) {
						commitList = new ArrayList<DeliveryCommitment>();
						resultMap.put(agentId, commitList);
					}
					commitList.add(commitment);
				}
			}
		} finally {
			DataSourceConnection.closeStmtResultSetAndConnection(pst, rs, conn);
		}

		logger.exit("getDeliveryCommitmentList");
		return commitmentList;
	}

	/**
	 * Get the DeliveryCommitment exists for the given request.
	 * 
	 * @param request AgentRequest
	 * @return true if DeliveryCommitment exists.
	 * @throws Exception
	 */
	public boolean hasDeliveryCommitment(AgentRequest request) throws Exception {

		logger.entry("hasDeliveryCommitment");
		Connection conn = null;
		PreparedStatement pst = null;
		ResultSet rs = null;

		try {

			conn = DataSourceConnection.getAcisConnection("0905");
			pst = conn.prepareStatement(getDeliveryCommitmentSql(request));

			AgentDao.setParams(request, pst);

			rs = pst.executeQuery();

			if (rs.next()) {
				return true;
			}
		} finally {
			DataSourceConnection.closeStmtResultSetAndConnection(pst, rs, conn);
		}

		logger.exit("hasDeliveryCommitment");
		return false;
	}
}
