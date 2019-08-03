package com.apria.svcs.aesservice.dao;

import com.apria.framework.common.dao.ApriaDAOInterface;
import com.apria.svcs.dataobject.schema.DiagnosisXrefDO;
import com.apria.svcs.dataobject.schema.DiagnosisXrefResponseDocument.DiagnosisXrefResponse;;

public interface DiagnosisXrefServiceDAO extends ApriaDAOInterface {

	/**
	 * determine valid DAO from common DB
	 * @param diagDO
	 * @param response
	 * @throws com.apria.framework.common.exception.DAOException
	 */
	public void diagnosisXrefCodeLookup(DiagnosisXrefDO [] diagDO, DiagnosisXrefResponse response)
										throws com.apria.framework.common.exception.DAOException;
}
