package com.apria.svcs.aesservice.dao.impl;

import org.springframework.jdbc.object.MappingSqlQuery;
import javax.sql.DataSource;
import org.springframework.jdbc.core.SqlParameter;

import com.apria.svcs.dataobject.schema.DiagnosisSearchDO;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;

public class DiagnosisMappingQuery extends MappingSqlQuery {
	
	private static final String SQL_QUERY = "SELECT DX_FRMT_CD, DX_NM FROM COMMON.DX WHERE DX_FRMT_CD = ?";
	
    public DiagnosisMappingQuery(DataSource ds) {
        super(ds, SQL_QUERY);
        super.declareParameter(new SqlParameter("ATTR_NAME", Types.VARCHAR));
        compile();
    }

    public Object mapRow(ResultSet rs, int rowNumber) throws SQLException {
    	DiagnosisSearchDO diagDO = new DiagnosisSearchDO();
        diagDO.setDiagnosisCode(rs.getString(1));
        diagDO.setDiagnosisDesc(rs.getString(2));
        return diagDO;
    } 
}