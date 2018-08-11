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

package com.apria.web.services.upslt.gmtconv.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.apria.framework.common.util.logging.ApriaLogger;
import com.apria.web.services.common.util.DataSourceConnection;
import com.apria.web.services.common.util.FileUtil;
import com.apria.web.services.upslt.gmtconv.vo.ConversionRequest;
import com.apria.web.services.upslt.gmtconv.vo.ConversionResponse;

/**
 * DAO class to get the GMT conversion details from EDW data source.
 * 
 * @author BRANGANA
 */
public class ConversionDao {

	private static ApriaLogger logger = ApriaLogger
		.getLogger(ConversionDao.class);

	/**
	 * Get the GMT conversion response for the given request.
	 * 
	 * @param request
	 * @return
	 * @throws Exception
	 */
	public ConversionResponse getConversion(ConversionRequest request)
		throws Exception {

		logger.entry("getConversion");
		Connection conn = null;
		PreparedStatement pst = null;
		ResultSet rs = null;
		ConversionResponse response = new ConversionResponse();

		try {
			conn = DataSourceConnection.getConnection("edw");
			pst = conn.prepareStatement(FileUtil
				.getFileFromCache("gmt_conversion.sql"));
			pst.setString(1, request.getBusinessUnit());

			rs = pst.executeQuery();

			if (rs.next()) {
				response.setOffsetHours(rs.getDouble("OFFSET_HR"));
			}
		} finally {
			DataSourceConnection.closeStmtAndConnection(pst, conn);

		}

		logger.exit("getConversion");
		return response;
	}
}
