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

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;

import com.apria.framework.common.util.logging.ApriaLogger;
import com.apria.web.services.acis.vo.Email;
import com.apria.web.services.acis.vo.request.EmailRequest;
import com.apria.web.services.common.util.DataSourceConnection;
import com.apria.web.services.common.util.DateUtil;
import com.apria.web.services.common.util.FileUtil;

/**
 * DAO class to get the Patient Email Details from the ACIS Database.
 * 
 * @author BRANGANA
 */
public class EmailDao {

	private static ApriaLogger logger = ApriaLogger.getLogger(EmailDao.class);

	private static String getEmailSql(EmailRequest request) throws Exception {

		String sql = FileUtil.getFileFromCache("patient_email.sql");
		StringBuilder where = new StringBuilder();

		if (isNotEmpty(request.getAcisId())) {
			where.append(" AND E.B5JPDC = ? ");
		}

		if (isNotEmpty(request.getTypeCode())) {
			where.append(" AND E.B5PZCT = ? ");
		}

		return sql.replace("[CONDITION]", where.toString());
	}

	private SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");

	/**
	 * Get the PatientEmail details for the given request.
	 * 
	 * @param request EmailRequest
	 * @return list of Email Objects.
	 * @throws Exception
	 */
	public Collection<Email> getEmailList(EmailRequest request)
		throws Exception {

		logger.entry("getEmailList");
		Connection conn = null;
		PreparedStatement pst = null;
		ResultSet rs = null;
		List<Email> emailList = new ArrayList<Email>();
		int x = 1;

		try {
			conn = DataSourceConnection.getAcisConnection(request
				.getBusinessUnit());
			pst = conn.prepareStatement(getEmailSql(request));

			String currentDate = DateUtil
				.getAcisDate(format.format(new Date()));

			pst.setBigDecimal(x++, new BigDecimal(currentDate));
			pst.setBigDecimal(x++, new BigDecimal(currentDate));

			if (isNotEmpty(request.getAcisId())) {
				pst.setString(x++, request.getAcisId());
			}

			if (isNotEmpty(request.getTypeCode())) {
				pst.setString(x++, request.getTypeCode());
			}

			rs = pst.executeQuery();

			while (rs.next()) {
				Email email = new Email();
				email.setAcisId(rs.getString("Acis_Id"));
				email.setType(rs.getString("Email_Type"));
				email.setAddress(rs.getString("Address"));
				email.setTypeCode(rs.getString("Email_Type_Code"));
				email.setEffectiveDate(DateUtil.getDateFromAcis(rs
					.getString("Effective_Date")));
				email.setEndDate(DateUtil.getDateFromAcis(rs
					.getString("End_Date")));

				emailList.add(email);
			}
		} finally {
			DataSourceConnection.closeStmtResultSetAndConnection(pst, rs, conn);
		}

		logger.exit("getEmailList");
		return emailList;
	}
}
