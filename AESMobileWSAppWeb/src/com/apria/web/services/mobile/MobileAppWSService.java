/**
 * 
 */
package com.apria.web.services.mobile;

import java.rmi.Remote;
import java.util.ArrayList;

import com.apria.web.services.mobile.in.SearchRequest;
import com.apria.web.services.mobile.out.Intake;
import com.apria.web.services.mobile.out.IntakeResult;

/**
 * @author srinivas4
 *
 */
public interface MobileAppWSService extends Remote {
	
	public IntakeResult  getIntakeWOList(SearchRequest request); 

}
