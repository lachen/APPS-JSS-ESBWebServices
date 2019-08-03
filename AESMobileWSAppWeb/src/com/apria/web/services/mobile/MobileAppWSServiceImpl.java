/**
 * 
 */
package com.apria.web.services.mobile;

import iseries.wsbeans.referralintakewosts_1_0.ReferralIntakeWOSts_1_0Locator;
import iseries.wsbeans.referralintakewosts_1_0.ReferralIntakeWOSts_1_0PortType;
import iseries.wsbeans.referralintakewosts_1_0.xsd.ReferralIntakeWOSts_1_0Input;
import iseries.wsbeans.referralintakewosts_1_0.xsd.ReferralIntakeWOSts_1_0Result;

import java.math.BigDecimal;
import java.net.MalformedURLException;
import java.net.URL;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.Arrays;

import javax.xml.rpc.ServiceException;

import AES_GetBusa_Lib_1_0.AES_GetBusa_Exception;
import AES_GetBusa_Lib_1_0.AES_GetBusa_Intf;
import AES_GetBusa_Lib_1_0.AES_GetBusa_IntfExport1_AES_GetBusa_IntfHttpServiceLocator;
import AES_GetBusa_Lib_1_0.AES_GetBusa_Request;
import AES_GetBusa_Lib_1_0.AES_GetBusa_Response;
import AES_MB_IntakeWOList_Lib_1_0.AES_MB_IntakeWOList_Exception;
import AES_MB_IntakeWOList_Lib_1_0.AES_MB_IntakeWOList_Intf_1_0;
import AES_MB_IntakeWOList_Lib_1_0.AES_MB_IntakeWOList_Request;
import AES_MB_IntakeWOList_Lib_1_0.AES_MB_IntakeWOList_Result;
import AES_MB_IntakeWOList_Lib_1_0.WSExport1_AES_MB_IntakeWOList_Intf_1_0HttpServiceLocator;

import com.apria.web.services.mobile.in.SearchRequest;
import com.apria.web.services.mobile.out.Intake;
import com.apria.web.services.mobile.out.IntakeResult;
import com.apria.web.services.mobile.out.WorkOrder;
import com.apria.web.services.mobile.utility.PropertyManager;
import java.util.Properties;

/**
 * @author srinivas4
 *
 */
public class MobileAppWSServiceImpl implements MobileAppWSService {

	/**
	 * 
	 */
	public MobileAppWSServiceImpl() {
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see com.apria.web.services.mobile.MobileAppWSService#getIntakeWOList(com.apria.web.services.mobile.in.SearchRequest)
	 */
	@Override
	public IntakeResult getIntakeWOList(SearchRequest request) {
		// TODO Auto-generated method stub
		String branchUrl = null;
		IntakeResult intakeResult = new IntakeResult();
		BigDecimal intakeStartno = null;
	//	WSExport1_AES_MB_IntakeWOList_Intf_1_0HttpServiceLocator wsloc = new WSExport1_AES_MB_IntakeWOList_Intf_1_0HttpServiceLocator();
		try {
			/*
			
            URL url = new URL("http://esbdev.apria.com:12016/AES_MB_IntakeWOList_Svcs_1_0Web/sca/AES_MB_IntakeWOList_Intf_1_0");
            AES_MB_IntakeWOList_Intf_1_0 ws = wsloc.getWSExport1_AES_MB_IntakeWOList_Intf_1_0HttpPort(url);
			AES_MB_IntakeWOList_Request wsrequest = new AES_MB_IntakeWOList_Request();
			String branchHost = doBusaLookup(request.getBranchHost());
			wsrequest.setBranch(request.getBranch());
			wsrequest.setBranchHost(branchHost);
			wsrequest.setFromDate(request.getFromDate());
			wsrequest.setToDate(request.getToDate());
			wsrequest.setZipCode(request.getZipCode());
			wsrequest.setIntakeStartSeq(request.getIntakeStartSeq());
			try {
				AES_MB_IntakeWOList_Result result = ws.getIntakeWOList(wsrequest);
				Intake[] intakeList=this.getIntakeResults(result);
				intakeResult.setIntakeList(intakeList) ;
				intakeResult.setIntakeCount(result.getIntakeCount());
				intakeResult.setIntakeOverFlow(result.getIntakeOverFlow());
				intakeResult.setRecCount(result.getRecCount());
				intakeResult.setRecStatus(result.getRecStatus());
				
			*/
			String branchHost = doBusaLookup(request.getBranch());
			System.out.println( "Branch Host "+ branchHost);
    		if(branchHost!= null && branchHost.length() >= 0){
    			//String count = PropertyManager.getProperty("process.count");
    			//System.out.println( "Count is  ---> "+ count);
    			branchUrl =  PropertyManager.getProperty(branchHost);
			}
			System.out.println( "Branch Url ---> "+ branchUrl);
			URL url = new URL(branchUrl);
			
			//	URL url = new URL("http://BR0905.corp.apria.com:10000/web/services/ReferralIntakeWOSts_1_0");
			//URL url = new URL("http://yoda.corp.apria.com:10000/web/services/ReferralIntakeWOSts_1_0");
			ReferralIntakeWOSts_1_0Locator wsloc = new ReferralIntakeWOSts_1_0Locator();
			ReferralIntakeWOSts_1_0PortType ws = wsloc.getReferralIntakeWOSts_1_0SOAP11Port_http(url);
			ReferralIntakeWOSts_1_0Input wsrequest = new ReferralIntakeWOSts_1_0Input();
			
			wsrequest.set_BusinessUnit(request.getBranch());
			wsrequest.set_FromDate(request.getFromDate());
			if(request.getIntakeStartSeq()!= null & request.getIntakeStartSeq().trim().length()>0)
			 intakeStartno = new BigDecimal(request.getIntakeStartSeq());
			
			wsrequest.set_IntakeStartSeq(intakeStartno);
			wsrequest.set_ReferralZipCode(request.getZipCode());
			wsrequest.set_ToDate(request.getToDate());
			
			System.out.println( "Before webservice call --------------");
			ReferralIntakeWOSts_1_0Result result = ws.referralintakewosts_1_0(wsrequest);
			System.out.println( "After webservice call --------------");
			Intake[] intakeList =  this.getIntakeResultsFromACIS(result);
			intakeResult.setIntakeList(intakeList);
			intakeResult.setIntakeCount(result.get_IntakeCount().toString());
			intakeResult.setIntakeOverFlow(result.get_IntakeOverflow().toString());
			intakeResult.setRecCount(result.get_RecCount().toString()+" -Branch Host :"+ branchHost);
			intakeResult.setRecStatus("");
			System.out.println( "Intake results are ");			
			} catch (RemoteException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				System.out.println( "RemoteException");
			} catch (MalformedURLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				System.out.println( "MalformedURLException");
			} catch (ServiceException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				System.out.println( "ServiceException");
			}
			

		return intakeResult;
	}

private String doBusaLookup(String businessUnit) {
		// TODO Auto-generated method stub
	AES_GetBusa_IntfExport1_AES_GetBusa_IntfHttpServiceLocator wsloc = new AES_GetBusa_IntfExport1_AES_GetBusa_IntfHttpServiceLocator();
	URL url= null;
	String cpuName = null;
	try {
//		url = new URL("http://aesbdev.apria.com:80/AES_GetBusa_Svcs_1_0Web/sca/AES_GetBusa_Intf_1_0");
		url = new URL(PropertyManager.getProperty("busa.lookup.url"));
		AES_GetBusa_Intf busaIntf = wsloc.getAES_GetBusa_Intf_1_0_AES_GetBusa_IntfHttpPort(url);
		AES_GetBusa_Request request = new AES_GetBusa_Request();
		request.setBusinessUnit(businessUnit);
		request.setZipCode(1);
		request.setTradingPartner(PropertyManager.getProperty("busa.lookup.trading.partner"));
		request.setClientHost("");
		request.setServiceVersion(PropertyManager.getProperty("busa.lookup.service.version"));
		request.setUserName(PropertyManager.getProperty("busa.lookup.service.username"));
		request.setPassword(PropertyManager.getProperty("busa.lookup.service.password"));
		AES_GetBusa_Response response = busaIntf.getCPUByBU(request);
		cpuName = response.getCPUName();
		System.out.println("------->CPU name is "+ cpuName );
	} catch (MalformedURLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (ServiceException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (RemoteException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (AES_GetBusa_Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

	return cpuName;
	}

	//	private ArrayList<Intake> getIntakeResults(AES_MB_IntakeWOList_Result result) {
	private Intake[] getIntakeResults(AES_MB_IntakeWOList_Result result) {		
		
		AES_MB_IntakeWOList_Lib_1_0.Intake[] intakes = result.getIntake();
		AES_MB_IntakeWOList_Lib_1_0.WorkOrder[] wos = result.getWorkOrder();
		ArrayList<Intake> intakeList = new ArrayList<Intake>();
		
		for (AES_MB_IntakeWOList_Lib_1_0.Intake in : intakes){
			if(in.getAssociate().length()>0){
			Intake intake= new Intake();
			intake.setAssociate(in.getAssociate());
			intake.setIntakeNo(in.getIntake());
			intake.setFollowpCode(in.getFollowpCode());
			intake.setIntakeStatus(in.getIntakeStatus());
			if(in.getIIntakeCreateDate().equalsIgnoreCase("0001-01-01"))
				intake.setIIntakeCreateDate("");
			else
				intake.setIIntakeCreateDate(in.getIIntakeCreateDate());
			
			if(in.getIntakeCreateTime().equalsIgnoreCase("00:00"))
				intake.setIntakeCreateTime("");
			else
				intake.setIntakeCreateTime(in.getIntakeCreateTime());
			
			if(in.getIntakeStatusDate().equalsIgnoreCase("0001-01-01"))			
				intake.setIntakeStatusDate("");
			else
				intake.setIntakeStatusDate(in.getIntakeStatusDate());
			
			if(in.getIntakeStatusTime().equalsIgnoreCase("00:00"))
				intake.setIntakeStatusTime("");
			else
				intake.setIntakeStatusTime(in.getIntakeStatusTime());
			
			intake.setPatientFirstName(in.getPatientFirstName());
			intake.setPatientID(in.getPatientID());
			intake.setPatientLastName(in.getPatientLastName());
			
			intake.setPatientMI(in.getPatientMI());
			intake.setPhysicianID(in.getPhysicianID());
			intake.setPhysicianName(in.getPhysicianName());
			intake.setReferralID(in.getReferralID());
			intake.setReferralName(in.getReferralName());
			intake.setReferralZipCode(in.getReferralZipCode());
			intakeList.add(intake);
			}
		}
		// TODO Auto-generated method stub
		
		
		for (AES_MB_IntakeWOList_Lib_1_0.WorkOrder wo : wos){
			if(wo.getAssociate().length()>0){
				
			WorkOrder workOrder= new WorkOrder();
			workOrder.setAssociate(wo.getAssociate());
			workOrder.setIntakeNo(wo.getIntake());
			
			if(wo.getCompleteDate().equalsIgnoreCase("0001-01-01"))
				workOrder.setCompleteDate("");
			else	
				workOrder.setCompleteDate(wo.getCompleteDate());
			
			if(wo.getCompleteTime().equalsIgnoreCase("00:00"))
				workOrder.setCompleteTime("");
			else
			    workOrder.setCompleteTime(wo.getCompleteTime());
			
			workOrder.setDeliveryAdressLine1(wo.getDeliveryAdressLine1());
			workOrder.setDeliveryAdressLine2(wo.getDeliveryAdressLine2());
			workOrder.setDeliveryCity(wo.getDeliveryCity());
			
			if(wo.getDeliveryDate().equalsIgnoreCase("0001-01-01"))
				workOrder.setDeliveryDate("");
			else
				workOrder.setDeliveryDate(wo.getDeliveryDate());
			
			if(wo.getDeliveryTime().equalsIgnoreCase("00:00"))
				workOrder.setDeliveryTime("");
			else
				workOrder.setDeliveryTime(wo.getDeliveryTime());
			
			workOrder.setDeliveryState(wo.getDeliveryState());
			workOrder.setDeliveryZipCode(wo.getDeliveryZipCode());
			
			if(wo.getEQDate().equalsIgnoreCase("0001-01-01"))
				workOrder.setEQDate("");
			else
				workOrder.setEQDate(wo.getEQDate());
		
			
			if(wo.getEQTime().equalsIgnoreCase("00:00"))			
				workOrder.setEQTime("");
			else
				workOrder.setEQTime(wo.getEQTime());
			
			workOrder.setProduct1(wo.getProduct1());
			workOrder.setProduct2(wo.getProduct2());
			workOrder.setProduct3(wo.getProduct3());
			workOrder.setProduct4(wo.getProduct4());
			
			if(wo.getReadyDate().equalsIgnoreCase("0001-01-01"))			
				workOrder.setReadyDate("");
			else
				workOrder.setReadyDate(wo.getReadyDate());
			
			if(wo.getReadyTime().equalsIgnoreCase("00:00"))	
				workOrder.setReadyTime("");
			else
				workOrder.setReadyTime(wo.getReadyTime());
			
			if(wo.getWOCreateDate().equalsIgnoreCase("0001-01-01"))				
				workOrder.setWOCreateDate("");
			else
				workOrder.setWOCreateDate(wo.getWOCreateDate());
			
			if(wo.getWOCreateTime().equalsIgnoreCase("00:00"))
				workOrder.setWOCreateTime("");
			else
				workOrder.setWOCreateTime(wo.getWOCreateTime());
			
			workOrder.setWorkOrderNO(wo.getWorkOrderNO());
			workOrder.setWOStatus(wo.getWOStatus());
			workOrder.setWOStatusDesc(wo.getWOStatusDesc());
			
			
			for (Intake intake : intakeList) {

					if (intake.getAssociate().equalsIgnoreCase(
							workOrder.getAssociate())
							&& intake.getIntakeNo().equalsIgnoreCase(
									workOrder.getIntakeNo())) {

						// intake.setWorkOrder(workOrder);
						WorkOrder wors[] = intake.getWorkOrderList();
						if (wors == null) {
							wors = new WorkOrder[1];
							if(workOrder.getWorkOrderNO().equalsIgnoreCase("")){
								workOrder.setWOCreateDate(intake.getIIntakeCreateDate());
								workOrder.setWOCreateTime(intake.getIntakeCreateTime());
								workOrder.setWOStatus(intake.getIntakeStatus());
							}
							wors[0] = workOrder;
							intake.setWorkOrderList(wors);
						} else {
							ArrayList<WorkOrder> wlist = new ArrayList<WorkOrder>();
							for (WorkOrder word : wors) {
								wlist.add(word);
							}
							
							if(workOrder.getWorkOrderNO().equalsIgnoreCase("")){
								workOrder.setWOCreateDate(intake.getIIntakeCreateDate());
								workOrder.setWOCreateTime(intake.getIntakeCreateTime());
								workOrder.setWOStatus(intake.getIntakeStatus());
							}							
							wlist.add(workOrder);
							intake.setWorkOrderList(wlist
									.toArray(new WorkOrder[wlist.size()]));
						}
					}
				}

			}
		}

		return intakeList.toArray(new Intake[intakeList.size()]);
	}
	
	private Intake[] getIntakeResultsFromACIS(ReferralIntakeWOSts_1_0Result result) {		
		
		iseries.wsbeans.referralintakewosts_1_0.xsd.Intake[] intakes = result.get_Intake();
		iseries.wsbeans.referralintakewosts_1_0.xsd.WorkOrder[] wos = result.get_WorkOrder();
		ArrayList<Intake> intakeList = new ArrayList<Intake>();
		
		for (iseries.wsbeans.referralintakewosts_1_0.xsd.Intake in : intakes){
			if(in.get_Associate().length()>0){
			Intake intake= new Intake();
			intake.setAssociate(in.get_Associate());
			intake.setIntakeNo(in.get_Intake_().toString());
			intake.setFollowpCode(in.get_FollowpCode());
			intake.setIntakeStatus(in.get_IntakeStatus());
			if(in.get_IntakeCreateDate().equalsIgnoreCase("0001-01-01"))
				intake.setIIntakeCreateDate("");
			else
				intake.setIIntakeCreateDate(in.get_IntakeCreateDate());
			
			if(in.get_IntakeCreateTime().equalsIgnoreCase("00:00"))
				intake.setIntakeCreateTime("");
			else
				intake.setIntakeCreateTime(in.get_IntakeCreateTime());
			
			if(in.get_IntakeStatusDate().equalsIgnoreCase("0001-01-01"))			
				intake.setIntakeStatusDate("");
			else
				intake.setIntakeStatusDate(in.get_IntakeStatusDate());
			
			if(in.get_IntakeStatusTime().equalsIgnoreCase("00:00"))
				intake.setIntakeStatusTime("");
			else
				intake.setIntakeStatusTime(in.get_IntakeStatusTime());
			
			intake.setPatientFirstName(in.get_PatientFirstName());
			intake.setPatientID(in.get_PatientID());
			intake.setPatientLastName(in.get_PatientLastName());
			
			intake.setPatientMI(in.get_PatientMI());
			intake.setPhysicianID(in.get_PhysicianID());
			intake.setPhysicianName(in.get_PhysicianName());
			intake.setReferralID(in.get_ReferralID());
			intake.setReferralName(in.get_ReferralName());
			intake.setReferralZipCode(in.get_ReferralZipCode());
			intakeList.add(intake);
			}
		}
		// TODO Auto-generated method stub
		
		
		for (iseries.wsbeans.referralintakewosts_1_0.xsd.WorkOrder wo : wos){
			if(wo.get_Associate().length()>0){
				
			WorkOrder workOrder= new WorkOrder();
			workOrder.setAssociate(wo.get_Associate());
			workOrder.setIntakeNo(wo.get_Intake_().toString());
			
			if(wo.get_CompleteDate().equalsIgnoreCase("0001-01-01"))
				workOrder.setCompleteDate("");
			else	
				workOrder.setCompleteDate(wo.get_CompleteDate());
			
			if(wo.get_CompleteTime().equalsIgnoreCase("00:00"))
				workOrder.setCompleteTime("");
			else
			    workOrder.setCompleteTime(wo.get_CompleteTime());
			
			workOrder.setDeliveryAdressLine1(wo.get_WODeliveryAdrressLine1());
			workOrder.setDeliveryAdressLine2(wo.get_WODeliveryAdressLine2());
			workOrder.setDeliveryCity(wo.get_WODeliveryCity());
			
			if(wo.get_DeliveryDate().equalsIgnoreCase("0001-01-01"))
				workOrder.setDeliveryDate("");
			else
				workOrder.setDeliveryDate(wo.get_DeliveryDate());
			
			if(wo.get_DeliveryTime().equalsIgnoreCase("00:00"))
				workOrder.setDeliveryTime("");
			else
				workOrder.setDeliveryTime(wo.get_DeliveryTime());
			
			workOrder.setDeliveryState(wo.get_DeliveryTime());
			workOrder.setDeliveryZipCode(wo.get_WODeliveryZipCode());
			
			if(wo.get_EQDate().equalsIgnoreCase("0001-01-01"))
				workOrder.setEQDate("");
			else
				workOrder.setEQDate(wo.get_EQDate());
		
			
			if(wo.get_EQTime().equalsIgnoreCase("00:00"))			
				workOrder.setEQTime("");
			else
				workOrder.setEQTime(wo.get_EQTime());
			
			workOrder.setProduct1(wo.get_Product1());
			workOrder.setProduct2(wo.get_Product2());
			workOrder.setProduct3(wo.get_Product3());
			workOrder.setProduct4(wo.get_Product4());
			
			if(wo.get_ReadyDate().equalsIgnoreCase("0001-01-01"))			
				workOrder.setReadyDate("");
			else
				workOrder.setReadyDate(wo.get_ReadyDate());
			
			if(wo.get_ReadyTime().equalsIgnoreCase("00:00"))	
				workOrder.setReadyTime("");
			else
				workOrder.setReadyTime(wo.get_ReadyTime());
			
			if(wo.get_WOCreateDate().equalsIgnoreCase("0001-01-01"))				
				workOrder.setWOCreateDate("");
			else
				workOrder.setWOCreateDate(wo.get_WOCreateDate());
			
			if(wo.get_WOCreateTime().equalsIgnoreCase("00:00"))
				workOrder.setWOCreateTime("");
			else
				workOrder.setWOCreateTime(wo.get_WOCreateTime());
			
			workOrder.setWorkOrderNO(wo.get_WorkOrder());
			workOrder.setWOStatus(wo.get_WOStatus());
			workOrder.setWOStatusDesc(wo.get_WOStatus());
			
			
			for (Intake intake : intakeList) {

					if (intake.getAssociate().equalsIgnoreCase(
							workOrder.getAssociate())
							&& intake.getIntakeNo().equalsIgnoreCase(
									workOrder.getIntakeNo())) {

						// intake.setWorkOrder(workOrder);
						WorkOrder wors[] = intake.getWorkOrderList();
						if (wors == null) {
							wors = new WorkOrder[1];
							if(workOrder.getWorkOrderNO().equalsIgnoreCase("")){
								workOrder.setWOCreateDate(intake.getIIntakeCreateDate());
								workOrder.setWOCreateTime(intake.getIntakeCreateTime());
								workOrder.setWOStatus(intake.getIntakeStatus());
							}
							wors[0] = workOrder;
							intake.setWorkOrderList(wors);
						} else {
							ArrayList<WorkOrder> wlist = new ArrayList<WorkOrder>();
							for (WorkOrder word : wors) {
								wlist.add(word);
							}
							
							if(workOrder.getWorkOrderNO().equalsIgnoreCase("")){
								workOrder.setWOCreateDate(intake.getIIntakeCreateDate());
								workOrder.setWOCreateTime(intake.getIntakeCreateTime());
								workOrder.setWOStatus(intake.getIntakeStatus());
							}							
							wlist.add(workOrder);
							intake.setWorkOrderList(wlist
									.toArray(new WorkOrder[wlist.size()]));
						}
					}
				}

			}
		}

		return intakeList.toArray(new Intake[intakeList.size()]);
	}

}
