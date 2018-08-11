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
import com.apria.web.services.acis.vo.ContactPreference;
import com.apria.web.services.acis.vo.request.AgentRequest;
import com.apria.web.services.common.util.DataSourceConnection;
import com.apria.web.services.common.util.FileUtil;

/**
 * Dao Class to get the contact preferences for an Agent.
 * 
 * @author BRANGANA
 */
public class ContactPreferenceDao {

	private static volatile String contactPreferenceSql = null;

	private static ApriaLogger logger = ApriaLogger
		.getLogger(ContactPreferenceDao.class);

	private static String getContactPreferenceSql() throws Exception {

		if (contactPreferenceSql != null) {
			return contactPreferenceSql;
		}

		synchronized (ContactPreferenceDao.class) {
			if (contactPreferenceSql == null) {
				contactPreferenceSql = FileUtil
					.getFileContent("contact_preference.sql");
			}
		}
		return contactPreferenceSql;
	}

	private static String getContactPreferenceSql(AgentRequest request)
		throws Exception {

		String sql = getContactPreferenceSql();
		StringBuilder where = new StringBuilder();

		String acisId = request.getAcisId();
		if (isNotEmpty(acisId)) {
			if (acisId.contains(",")) {
				where.append(" AND A.A8JPDC IN (" + AgentDao.getPlaceHolder()
					+ ") ");
			} else {
				where.append(" AND A.A8JPDC = ? ");
			}
		}

		return sql.replace("[CONDITION]", where.toString());
	}

	/**
	 * Get the ContactPreference details for the given request.
	 * 
	 * @param request AgentRequest
	 * @return list of ContactPreference Objects.
	 * @throws Exception
	 */
	public Collection<ContactPreference> getContactPreferenceList(
		AgentRequest request) throws Exception {

		return getContactPreferenceList(request, null);
	}

	/**
	 * Get the ContactPreference details for the given request.
	 * 
	 * @param request AgentRequest
	 * @return list of ContactPreference Objects.
	 * @throws Exception
	 */
	public Collection<ContactPreference> getContactPreferenceList(
		AgentRequest request,
		Map<String, Collection<ContactPreference>> resultMap) throws Exception {

		logger.entry("getContactPreferenceList");
		Connection conn = null;
		PreparedStatement pst = null;
		ResultSet rs = null;
		List<ContactPreference> preferenceList = new ArrayList<ContactPreference>();

		try {

			conn = DataSourceConnection.getAcisConnection("0905");
			pst = conn.prepareStatement(getContactPreferenceSql(request));

			AgentDao.setParams(request, pst);

			rs = pst.executeQuery();

			while (rs.next()) {

				String agentId = rs.getString("Agent_Id");

				ContactPreference preference = new ContactPreference();
				preference.setAgentId(agentId);
				preference.setEffectiveDate(rs.getString("Effective_Date"));
				preference.setEndDate(rs.getString("End_Date"));
				preference.setContact(rs.getString("Contact_Name"));
				preference.setTitle(rs.getString("Title"));
				preference.setContactReason(rs.getString("Contact_Reason"));
				preference.setEmail(rs.getString("Email"));
				preference.setNotes(rs.getString("Notes"));
				preference.setDepartment(rs.getString("Department"));
				preference.setFax(rs.getString("Fax"));
				preference.setPhone(rs.getString("Phone"));
				preference.setPhoneExt(rs.getString("Phone_Ext"));
				preference.setPreferedContactMethod(rs
					.getString("Prefered_Contact_Method"));
				preferenceList.add(preference);

				/* if a map is passed add the result to the Map. */
				if (resultMap != null) {
					Collection<ContactPreference> prefList = resultMap
						.get(agentId);
					if (prefList == null) {
						prefList = new ArrayList<ContactPreference>();
						resultMap.put(agentId, prefList);
					}
					prefList.add(preference);
				}
			}
		} finally {
			DataSourceConnection.closeStmtResultSetAndConnection(pst, rs, conn);
		}

		logger.exit("getContactPreferenceList");
		return preferenceList;
	}

	/**
	 * Get the ContactPreference exists for the given request.
	 * 
	 * @param request AgentRequest
	 * @return true if contact preference exists.
	 * @throws Exception
	 */
	public boolean hasContactPreference(AgentRequest request) throws Exception {

		logger.entry("hasContactPreferece");
		Connection conn = null;
		PreparedStatement pst = null;
		ResultSet rs = null;

		try {

			conn = DataSourceConnection.getAcisConnection("0905");
			pst = conn.prepareStatement(getContactPreferenceSql(request));

			AgentDao.setParams(request, pst);

			rs = pst.executeQuery();

			if (rs.next()) {
				return true;
			}
		} finally {
			DataSourceConnection.closeStmtResultSetAndConnection(pst, rs, conn);
		}

		logger.exit("hasContactPreferece");
		return false;
	}
}
