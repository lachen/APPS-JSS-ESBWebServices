package com.apria.svcs.aesservice.dao.impl;

import java.util.List;

import com.apria.framework.common.dao.ApriaJdbcDAO;
import com.apria.framework.common.exception.DAOException;
import com.apria.svcs.aesservice.dao.DiagnosisXrefServiceDAO;
import com.apria.svcs.dataobject.schema.DiagnosisXrefDO;
import com.apria.svcs.dataobject.schema.DiagnosisXrefSearchDO;
import com.apria.svcs.dataobject.schema.DiagnosisXrefResponseDocument.DiagnosisXrefResponse;

public class DiagnosisXrefServiceDAOImpl extends ApriaJdbcDAO implements DiagnosisXrefServiceDAO {

	public void diagnosisXrefCodeLookup(DiagnosisXrefDO[] diagDOReq, DiagnosisXrefResponse response) throws DAOException {

		/** PARAMS */
		Object[] params = new Object[4];

		/** invoke the query */
		try {
			for (DiagnosisXrefDO diagDO : diagDOReq) {
				DiagnosisXrefMappingQuery diagQry = new DiagnosisXrefMappingQuery(this.getDataSource());

				// If no sourcing system is passed in default the source to be ACIS system.
				String source = diagDO.getSourceCode();
				if (source == null || source.trim().length() == 0) {
					source = "ACIS";
				}

				params[0] = new String(source);
				params[1] = new String(diagDO.getDiagCode());
				params[2] = new String(source);
				params[3] = new String(diagDO.getDiagCode());
				List<DiagnosisXrefSearchDO> diagResult = null;
				/** execute the call */
				diagResult = diagQry.execute(params);
				/** result */
				DiagnosisXrefDO diagDOResp = response.addNewDiagnosisXrefDO();
				if (diagResult.size() > 0) {
					/** add the diagnosis DO */
					diagDOResp.setDiagCode(diagDO.getDiagCode());
					diagDOResp.setDiagDesc(diagResult.get(0).getDiagnosisSrcDesc());
					diagDOResp.setDiagXrefcode(diagResult.get(0).getDiagnosisXrefCode());
					diagDOResp.setDiagXrefdesc(diagResult.get(0).getDiagnosisXrefDesc());
				} else {
					diagDOResp.setDiagCode(diagDO.getDiagCode());
					diagDOResp.setDiagDesc(diagDO.getDiagDesc());
					diagDOResp.setDiagXrefcode("");
					diagDOResp.setDiagXrefdesc("");
				}
			}
		} catch (org.springframework.dao.DataAccessException dataAccessException) {
			dataAccessException.printStackTrace();
			throw new com.apria.framework.common.exception.DAOException(dataAccessException.getMessage());
		} catch (Exception sqlEx) {
			sqlEx.printStackTrace();
			throw new com.apria.framework.common.exception.DAOException(sqlEx.getMessage());
		}

	}
}
