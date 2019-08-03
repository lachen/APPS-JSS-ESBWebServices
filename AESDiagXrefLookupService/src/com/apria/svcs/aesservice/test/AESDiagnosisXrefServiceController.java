package com.apria.svcs.aesservice.test;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.validation.BindException;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.SimpleFormController;

import com.apria.svcs.aesservice.DiagnosisXrefServiceEndpoint;
import com.apria.svcs.dataobject.schema.DiagnosisXrefDO;
import com.apria.svcs.dataobject.schema.DiagnosisXrefResponseDocument;
import com.apria.svcs.dataobject.schema.GetDiagnosisXrefRequestDocument;
import com.apria.svcs.dataobject.schema.GetDiagnosisXrefRequestDocument.GetDiagnosisXrefRequest;

public class AESDiagnosisXrefServiceController extends SimpleFormController {

	private Map<String,String> _operations = null;
	
	private Map<String,String> _fieldAttrs = null;
	
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
		com.apria.svcs.dataobject.schema.DiagnosisXrefSearchDO requestForm = (com.apria.svcs.dataobject.schema.DiagnosisXrefSearchDO)command;					
		
		/** create the bean */
		ClassPathResource resource = new ClassPathResource("/WEB-INF/AesService-servlet.xml");
		BeanFactory factory = new XmlBeanFactory(resource);
    	
		/** call the service */			
		DiagnosisXrefServiceEndpoint serviceEndPoint = (DiagnosisXrefServiceEndpoint)factory.getBean("diagnosisXrefServiceEndPoint");
		
	
		Map <String,Object> returnResponse = new HashMap<String,Object>();
		 
		try{
			GetDiagnosisXrefRequestDocument requestDoc = (GetDiagnosisXrefRequestDocument)
				GetDiagnosisXrefRequestDocument.Factory.newInstance();

			GetDiagnosisXrefRequest diagnosisRequest = requestDoc.addNewGetDiagnosisXrefRequest();
			DiagnosisXrefDO diagDO = diagnosisRequest.addNewDiagnosisXrefDO();
			
			String source = requestForm.getSystemCode();
			if (source == null || source.trim().length() == 0) {
				source = "ACIS";
			}
			
			diagDO.setSourceCode(source);
			diagDO.setDiagCode(requestForm.getDiagnosisSrcCode());
			
			DiagnosisXrefResponseDocument serviceResponse = (DiagnosisXrefResponseDocument)serviceEndPoint.getDiagnosisXrefCode(requestDoc);
			
			returnResponse.put("serviceResponse",serviceResponse.toString());
							
		}catch(Exception e){		
			e.printStackTrace();
			returnResponse.put("serviceResponse",e.getMessage());				
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

}
