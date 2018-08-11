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

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;

import com.apria.framework.common.util.logging.ApriaLogger;
import com.apria.web.services.acis.vo.Address;
import com.apria.web.services.acis.vo.Patient;
import com.apria.web.services.acis.vo.request.PatientRequest;
import com.apria.web.services.acis.vo.request.PatientSearchRequest;
import com.apria.web.services.acis.vo.response.PatientResponse;
import com.apria.web.services.common.util.BusaCacheManager;
import com.apria.web.services.common.util.DataSourceConnection;
import com.apria.web.services.common.util.FileUtil;

/**
 * DAO class to get the Patient Details from the ACIS Database.
 * 
 * @author anil_kumar_mittur_ve
 */
public class PatientDao {

	private static ApriaLogger logger = ApriaLogger.getLogger(PatientDao.class);

	private static String getPatientSql(PatientRequest request) throws Exception {

		String sql = FileUtil.getFileFromCache("patient.sql");

		return sql;
	}

	/**
	 * Get the Patient details for the given request.
	 * 
	 * @param request
	 *            PatientRequest
	 * @return list of Email Objects.
	 * @throws Exception
	 */
	public PatientResponse getPatientDetails(PatientRequest request) throws Exception {

		logger.entry("getPatientDetails");
		Connection conn = null;
		PreparedStatement pst = null;
		ResultSet rs = null;
		PatientResponse patient = new PatientResponse();

		try {
			conn = DataSourceConnection.getAcisConnection(request.getBusinessUnit());
			pst = conn.prepareStatement(getPatientSql(request));

			pst.setString(1, request.getAcisId());

			rs = pst.executeQuery();

			while (rs.next()) {
				patient.setPatientId(rs.getString("Patient_ID"));
				patient.setPatientFirstName(rs.getString("Patient_FirstName"));
				patient.setPatientMiddleName(rs.getString("Patient_MiddleName"));
				patient.setPatientLastName(rs.getString("Patient_LastName"));
				patient.setPatientDOB(rs.getString("Date_Of_Birth"));
				patient.setZipCd(rs.getString("Zip_Code"));
			}
			patient.setCpuId(BusaCacheManager.getCpu(request.getBusinessUnit()));

		} finally {
			DataSourceConnection.closeStmtResultSetAndConnection(pst, rs, conn);
		}

		logger.exit("getPatientDetails");
		return patient;
	}

	private static String getPatientSearchSql(PatientSearchRequest request) throws Exception {

		String sql = FileUtil.getFileFromCache("patient_search.sql");
		StringBuilder where = new StringBuilder();

		if (StringUtils.isNotEmpty(request.getPatientId())) {
			where.append(" AND P.C6JPDC = ? ");
		} else if (StringUtils.isNotEmpty(request.getFirstName())) {
			where.append(" AND P.C6HNXT = ? ");
		}

		if (StringUtils.isNotEmpty(request.getLastName())) {
			where.append(" AND P.C6HPXT = ? ");
		}

		if (StringUtils.isNotEmpty(request.getDob())) {
			where.append(" AND (P.C6C2TD = ? OR P.C6C2TD = ? ) ");
		}

		if (StringUtils.isNotEmpty(request.getDeliveryZipCode())) {
			where.append(" AND A.BPP2TS = 'Y' AND A.BPDMBN = ? ");
		}

		return sql.replace("[CONDITION]", where.toString());
	}

	/**
	 * Get the Patient details for the given request.
	 * 
	 * @param request
	 *            PatientRequest
	 * @return list of Patient Objects.
	 * @throws Exception
	 */
	public Collection<Patient> searchPatients(PatientSearchRequest request) throws Exception {

		logger.entry("searchPatient");
		Connection conn = null;
		PreparedStatement pst = null;
		ResultSet rs = null;
		Map<String, Patient> patientMap = new HashMap<String, Patient>();
		int x = 1;

		try {

			if (StringUtils.isNotEmpty(request.getDeliveryZipCode())) {
				conn = DataSourceConnection.getAcisConnectionByZip(request.getDeliveryZipCode());
			}

			pst = conn.prepareStatement(getPatientSearchSql(request));

			if (StringUtils.isNotEmpty(request.getPatientId())) {
				pst.setString(x++, request.getPatientId().toUpperCase());
			} else  if (StringUtils.isNotEmpty(request.getFirstName())) {
				pst.setString(x++, request.getFirstName().toUpperCase());
			}

			if (StringUtils.isNotEmpty(request.getMiddleName())) {
				pst.setString(x++, request.getMiddleName().toUpperCase());
			}

			if (StringUtils.isNotEmpty(request.getLastName())) {
				pst.setString(x++, request.getLastName().toUpperCase());
			}

			if (StringUtils.isNotEmpty(request.getDob())) {
				pst.setString(x++, request.getDob());
				if (request.getDob().startsWith("0")) {
					pst.setString(x++, request.getDob().substring(1));
				} else {
					pst.setString(x++, request.getDob());
				}
			}

			if (StringUtils.isNotEmpty(request.getDeliveryZipCode())) {
				pst.setString(x++, request.getDeliveryZipCode());
			}
			
			rs = pst.executeQuery();

			while (rs.next()) {
				String patientId = rs.getString("PATIENT_ID");
				Patient patient = patientMap.get(patientId);

				if (patient == null) {
					patient = new Patient();
					patient.setPatientId(patientId);
					patient.setFirstName(rs.getString("FIRST_NM"));
					patient.setLastName(rs.getString("LAST_NM"));
					patient.setMiddleName(rs.getString("MIDDLE_NM"));
					patient.setDob(rs.getString("DOB"));
					patient.setBusinessUnit(rs.getString("BU"));
					patient.setCpu(BusaCacheManager.getCpuByZip(request.getDeliveryZipCode()));

					patientMap.put(patientId, patient);
				}

				Address address = new Address();
				address.setAddress1(rs.getString("ADDR_1"));
				address.setAddress2(rs.getString("ADDR_2"));
				address.setCity(rs.getString("City"));
				address.setState(rs.getString("State"));
				address.setZip(rs.getString("Zip_Code"));
				address.setPhone(rs.getString("PHONE"));

				String flag = rs.getString("PRIMARY_ADDR_FLG");

				if ("Y".equals(flag) && patient.getPrimaryAddress() == null) {
					patient.setPrimaryAddress(address);
				}

				flag = rs.getString("BILLING_ADDR_FLG");

				if ("Y".equals(flag) && patient.getBillingAddress() == null) {
					patient.setBillingAddress(address);
				}

				flag = rs.getString("DELIVERY_ADDR_FLG");

				if ("Y".equals(flag) && patient.getDeliveryAddress() == null) {
					patient.setDeliveryAddress(address);
				}

				flag = rs.getString("PERMANENT_FLG");

				if ("Y".equals(flag) && patient.getPermanentAddress() == null) {
					patient.setPermanentAddress(address);
				}
			}
		} finally {
			DataSourceConnection.closeStmtResultSetAndConnection(pst, rs, conn);
		}

		logger.exit("searchPatient");
		return patientMap.values();
	}
}
