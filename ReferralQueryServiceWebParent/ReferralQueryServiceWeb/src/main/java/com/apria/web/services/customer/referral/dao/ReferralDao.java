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

package com.apria.web.services.customer.referral.dao;

import static com.apria.web.services.common.util.CommonUtil.isNotEmpty;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import com.apria.framework.common.util.logging.ApriaLogger;
import com.apria.web.services.common.util.DataSourceConnection;
import com.apria.web.services.common.util.FileUtil;
import com.apria.web.services.common.util.PropertyManager;
import com.apria.web.services.customer.referral.vo.Referral;
import com.apria.web.services.customer.referral.vo.request.ReferralLookupRequest;

/**
 * DAO class to get the details from ODS database.
 * 
 * @author Thakur_Vikas_Kumar_S
 *
 */
public class ReferralDao {

	public static int RESULT_SIZE = PropertyManager.getPropertyInt(
			"search.record.max", 100);
	private static volatile String allReferralLookupSql = null;
	private static ApriaLogger logger = ApriaLogger
			.getLogger(ReferralDao.class);

	public static void setParams(ReferralLookupRequest request,
			PreparedStatement pst, List<String> paramValues)
			throws SQLException {

		int x = 1;

		for (String paramValue : paramValues) {
			pst.setString(x++, paramValue);
		}

	}

	private static String getReferralAllLookupSql() throws Exception {

		if (allReferralLookupSql != null) {
			return allReferralLookupSql;
		}

		synchronized (ReferralDao.class) {
			if (allReferralLookupSql == null) {
				allReferralLookupSql = FileUtil
						.getFileContent("referral_all_search.sql");
			}
		}
		return allReferralLookupSql;
	}

	private static String getReferralSql(ReferralLookupRequest request,
			List<String> paramValues) throws Exception {

		String name = request.getName();
		String city = request.getCity();
		String state = request.getState();

		String sql = getReferralAllLookupSql();
		
		StringBuilder where = new StringBuilder();

		if (isNotEmpty(name)) {
			where.append(" AND UPPER(RFRL_NM) LIKE UPPER('%' || ? || '%')");
			paramValues.add(name);
		}
		if (isNotEmpty(city)) {
			where.append(" AND UPPER(CITY_NM) LIKE UPPER('%' || ? || '%')");
			paramValues.add(city);
		}
		if (isNotEmpty(state)) {
			where.append(" AND UPPER(ST_CD) = ?");
			paramValues.add(state.toUpperCase());
		}
		return sql.replace("[CONDITION]", where.toString());
	}

	/**
	 * Get the Agent details for the given request.
	 * 
	 * @param request
	 *            AgentRequest
	 * @return list of Agent Objects.
	 * @throws Exception
	 */
	public Collection<Referral> getReferralList(ReferralLookupRequest request)
			throws Exception {

		logger.entry("getReferralList");
		Connection conn = null;
		PreparedStatement pst = null;
		ResultSet rs = null;
		List<String> paramValues = new ArrayList<String>();
		List<Referral> referralList = new ArrayList<Referral>();
		Context ctx = null;
		DataSource ds = null;

		try {

			ctx = new InitialContext();
			ds = (DataSource) ctx.lookup(PropertyManager
					.getProperty("db.referral.jndi.datasource.name"));
			conn = ds.getConnection();

			pst = conn.prepareStatement(getReferralSql(request, paramValues));

			setParams(request, pst, paramValues);

			rs = pst.executeQuery();

			while (rs.next()) {

				Referral referral = new Referral();
				referral.setId(rs.getString("RFRL_ID"));
				referral.setName(rs.getString("RFRL_NM"));
				referral.setAccountValue(rs.getString("ACCT_VAL_CD"));
				referral.setCity(rs.getString("CITY_NM"));
				referral.setState(rs.getString("ST_CD"));
				referral.setActive("Y".equalsIgnoreCase(rs.getString("VALID_RFRL_SRC_IN")));
				referralList.add(referral);

			}
		} finally {
			DataSourceConnection.closeStmtResultSetAndConnection(pst, rs, conn);
		}

		logger.exit("getReferralList");
		return referralList;
	}
}
