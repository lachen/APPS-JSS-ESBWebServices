package com.apria.svcs.aesservice.dao.impl;


import java.util.List;

import com.apria.framework.common.dao.ApriaJdbcDAO;
import com.apria.svcs.aesservice.dao.DiagnosisServiceDAO;
import com.apria.svcs.dataobject.schema.DiagnosisDO;
import com.apria.svcs.dataobject.schema.DiagnosisSearchDO;
import com.apria.svcs.dataobject.schema.DiagnosisResponseDocument.DiagnosisResponse;


public class DiagnosisServiceDAOImpl extends ApriaJdbcDAO implements DiagnosisServiceDAO {

	
	public void diagnosisCodeLookup(DiagnosisDO [] diagDOReq, DiagnosisResponse response) 
										throws com.apria.framework.common.exception.DAOException{
	
		/** PARAMS */
		Object[] params = new Object[1];
		
		/** invoke the query */
		try{
			for( DiagnosisDO diagDO : diagDOReq ){
				DiagnosisMappingQuery diagQry = new DiagnosisMappingQuery(this.getDataSource());				
				params[0] = new String(diagDO.getDiagnosisCode());
				List<DiagnosisSearchDO> diagResult = null;
			    /** execute the call */
				diagResult = diagQry.execute(params);
				/** result */
			    DiagnosisDO diagDOResp = response.addNewDiagnosisDO();
			    if( diagResult.size() > 0 ){
			    	/** add the diagnosis DO */
			        diagDOResp.setDiagnosisCode(diagDO.getDiagnosisCode());
			        diagDOResp.setDiagnosisDesc(diagResult.get(0).getDiagnosisDesc());
			        diagDOResp.setDiagnosisStatus(true);
			    }else{
			    	diagDOResp.setDiagnosisCode(diagDO.getDiagnosisCode());
			    	diagDOResp.setDiagnosisDesc("");
			        diagDOResp.setDiagnosisStatus(false);
			    }
			}
		} 
	    catch(org.springframework.dao.DataAccessException dataAccessException){
	    	dataAccessException.printStackTrace();
			throw new com.apria.framework.common.exception.DAOException(dataAccessException.getMessage());
		}catch(Exception sqlEx){
			sqlEx.printStackTrace();
			throw new com.apria.framework.common.exception.DAOException(sqlEx.getMessage());
		}
	}
}
