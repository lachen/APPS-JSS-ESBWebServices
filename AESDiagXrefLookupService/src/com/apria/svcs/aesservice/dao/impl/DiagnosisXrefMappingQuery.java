package com.apria.svcs.aesservice.dao.impl;

import org.springframework.jdbc.object.MappingSqlQuery;
import javax.sql.DataSource;
import org.springframework.jdbc.core.SqlParameter;

import com.apria.svcs.dataobject.schema.DiagnosisXrefSearchDO;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;

public class DiagnosisXrefMappingQuery extends MappingSqlQuery {

	private static final String SQL_QUERY = "select DISTINCT * from (select DXA.SRC_DX_CD, DXA.SRC_DX_NM, DXB.DX_FRMT_CD, DXB.DX_NM from common.dx_xref DXA, common.dx DXB "
	        + "where DXA.DX_SK = DXB.DX_SK AND DXA.SRC_CD = ? AND DXA.SRC_DX_CD = ? "
	        + "UNION select DXA.SRC_DX_CD, DXA.SRC_DX_NM, DXB.DX_FRMT_CD, DXB.DX_NM from common.dx_xref DXA, common.dx DXB "
	        + "where DXA.DX_SK = DXB.DX_SK AND DXA.SRC_CD = ? AND DXB.DX_FRMT_CD = ?) with ur";

	public DiagnosisXrefMappingQuery(DataSource ds) {
		super(ds, SQL_QUERY);
		super.declareParameter(new SqlParameter("SRC_CD", Types.VARCHAR));
		super.declareParameter(new SqlParameter("SRC_DX_CD", Types.VARCHAR));
		super.declareParameter(new SqlParameter("SRC_CD", Types.VARCHAR));
		super.declareParameter(new SqlParameter("DX_FRMT_CD", Types.VARCHAR));
		compile();
	}

	public Object mapRow(ResultSet rs, int rowNumber) throws SQLException {
		DiagnosisXrefSearchDO diagDO = new DiagnosisXrefSearchDO();
		diagDO.setDiagnosisSrcCode((String) rs.getObject("SRC_DX_CD"));
		diagDO.setDiagnosisSrcDesc((String) rs.getObject("SRC_DX_NM"));
		diagDO.setDiagnosisXrefCode((String) rs.getObject("DX_FRMT_CD"));
		diagDO.setDiagnosisXrefDesc((String) rs.getObject("DX_NM"));
		return diagDO;
	}
}