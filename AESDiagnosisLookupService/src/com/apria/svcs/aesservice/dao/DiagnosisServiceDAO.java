package com.apria.svcs.aesservice.dao;

import com.apria.framework.common.dao.ApriaDAOInterface;
import com.apria.svcs.dataobject.schema.DiagnosisDO;
import com.apria.svcs.dataobject.schema.DiagnosisResponseDocument.DiagnosisResponse;

public interface DiagnosisServiceDAO extends ApriaDAOInterface {

	/**
	 * determine valid DAO from common DB
	 * @param diagDO
	 * @param response
	 * @throws com.apria.framework.common.exception.DAOException
	 */
	public void diagnosisCodeLookup(DiagnosisDO [] diagDO, DiagnosisResponse response)
										throws com.apria.framework.common.exception.DAOException;
}
