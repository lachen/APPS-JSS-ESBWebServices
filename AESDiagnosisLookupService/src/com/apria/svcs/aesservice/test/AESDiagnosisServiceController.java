/**
 * AESFormIdValidationServiceBindingSOAPImpl.java
 *
 * This file was auto-generated from WSDL
 * by the IBM Web services WSDL2Java emitter.
 * cf190834.07 v9308141138
 */

package com.apria.svcs.aesservice.test;

import org.springframework.web.servlet.mvc.SimpleFormController;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.validation.BindException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

import com.apria.svcs.aesservice.DiagnosisServiceEndpoint;
import com.apria.svcs.dataobject.schema.*;
import com.apria.svcs.dataobject.schema.GetDiagnosisRequestDocument.GetDiagnosisRequest;

public class AESDiagnosisServiceController extends SimpleFormController {

		private Map<String,String> _operations = null;
		
		private Map<String,String> _fieldAttrs = null;
		
		public AESDiagnosisServiceController(){
			setCommandName("aesservice");
			setCommandClass(com.apria.svcs.dataobject.schema.DiagnosisSearchDOCmd.class);
		}
		
		public void setOperations(Map<String,String> _operations){
			this._operations = _operations;
		}
		
		public Map<String,String> getOperations(){
			return _operations;
		}
		
		public void setFieldAttrs(Map<String,String> _fieldAttrs){
			this._fieldAttrs = _fieldAttrs;
		}
		
		public Map<String,String> getFieldAttrs(){
			return _fieldAttrs;
		}
		
		protected ModelAndView onSubmit(
		        HttpServletRequest request,
		        HttpServletResponse response,
		        Object command,
		        BindException errors) throws Exception {
			
			try{
			/** command object to request object */
			com.apria.svcs.dataobject.schema.DiagnosisSearchDOCmd diagCmd = (com.apria.svcs.dataobject.schema.DiagnosisSearchDOCmd)command;					
			
			/** create the bean */
			ClassPathResource resource = new ClassPathResource("/WEB-INF/AesService-servlet.xml");
			BeanFactory factory = new XmlBeanFactory(resource);
	    	
			/** call the service */			
			DiagnosisServiceEndpoint serviceEndPoint = (DiagnosisServiceEndpoint)factory.getBean("diagnosisServiceEndPoint");
			
		
			Map <String,Object> returnResponse = new HashMap<String,Object>();
			 
			try{
				GetDiagnosisRequestDocument requestDoc = (GetDiagnosisRequestDocument)
					GetDiagnosisRequestDocument.Factory.newInstance();

				GetDiagnosisRequest diagnosisRequest = requestDoc.addNewGetDiagnosisRequest();
				
				/** loop through it to create the request */
				List<DiagnosisSearchDO> diagList = diagCmd.getDiagnosisSearchDOs();
				for( DiagnosisSearchDO diagSearchDO : diagList){
					DiagnosisDO diagDO = diagnosisRequest.addNewDiagnosisDO();
					
					diagDO.setDiagnosisCode(diagSearchDO.getDiagnosisCode());	
				}
				
				DiagnosisResponseDocument serviceResponse = (DiagnosisResponseDocument)serviceEndPoint.isValidDiagnosisCode(requestDoc);
				
				returnResponse.put("serviceResponse",serviceResponse.toString());
								
			}catch(Exception e){		
				e.printStackTrace();
				returnResponse.put("serviceResponse",e.toString());				
			}
			
			/** set these attributes - must */
			request.setAttribute("viewPageAttr",request.getParameter("viewPage"));
			request.setAttribute("fieldAttrs",this.getFieldAttrs());
			request.setAttribute("operations",this.getOperations());
			request.setAttribute("showResponse","Y");
			
			/** response object */
			request.setAttribute("serviceResponse",returnResponse);	
			
			}catch(Exception e){ e.printStackTrace();}
			
			return showForm(request, response, errors);
	    }
		 
		protected Map<String,Map<String,String>> referenceData(HttpServletRequest request) throws Exception {

	     	Map<String,Map<String,String>> widgets = new HashMap<String,Map<String,String>>();
	     	widgets.put("fieldAttrs", this.getFieldAttrs());
	    	widgets.put("operations", this.getOperations());
	    	System.out.println(widgets);
	    	return widgets;
	    }
		
		protected Object formBackingObject(HttpServletRequest request) throws Exception {
			DiagnosisSearchDOCmd diagCodeCmd = new DiagnosisSearchDOCmd();
			List<DiagnosisSearchDO> searchDOs = new ArrayList<DiagnosisSearchDO>();
			for( int idx=0; idx < 30; idx++){
				DiagnosisSearchDO searchDO = new DiagnosisSearchDO();			
				searchDO.setDiagnosisCode("");			
			
				searchDOs.add(searchDO);
			}
					
			diagCodeCmd.setDiagnosisSearchDOs(searchDOs);
			return diagCodeCmd;
		}

}
