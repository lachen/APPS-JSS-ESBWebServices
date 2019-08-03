<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>	
<head>
<script language="JavaScript" >
function doSubmit(pageNum){	
	document.getElementById("viewPage").value = pageNum;	
}


function ShowTab(intNum){

	document.getElementById("id"+intNum).style.visibility = "visible";
	document.getElementById("Tab"+intNum).className = "headActiveTab";
	if( intNum != 2 ){
		if( document.getElementById("viewResponse") != null )
			document.getElementById("viewResponse").style.visibility = "hidden";
	}

	for(var i=1;i<=3;i++){
			if(i!=intNum){
				document.getElementById("id"+i).style.visibility  = "hidden";
				document.getElementById("Tab"+i).className = "headInActiveTab";
			}
	}

}

function decideTab(intNum){
 	if( intNum != '' )
 		ShowTab( intNum );
 	else
 		ShowTab( 1 );
}
</script>

</head>
<body>	

	<form:form action="test.service">
		<%
			String pageNum = request.getAttribute("viewPageAttr") != null ? (String)request.getAttribute("viewPageAttr") :""; 
		 %>
		<input type="hidden" name="viewPage" id="viewPage" value="<%=(String)request.getAttribute("viewPageAttr")%>" />
		
		<TABLE cellpadding="0" cellspacing="0" width="100%">						
			    <TR style="top:89px;Position: Absolute;" id="Row2">
					<TD>
						  <TABLE style="height: 400px; left: 0px; position: absolute; top: 12px; visibility: visible;width:100%" style="border-left: 1px #6699CC solid;border-top: 1px #6699CC solid; border-bottom: 1px #6699CC solid; border-right: 1px #6699CC solid;"   id="id1">
								<TR>
									  <TD align="center" class="contentContainer">
										<p>
											<u>Introduction:</u>
										</p>
										<p>
											This web service is designed to validate form id existence in Apria Content management system.  
										</p>												
										<p>
											<input type="button" value="Start >>" onclick="javascript:ShowTab(2)" class="btn" />
										</p>
									  </TD>
								</TR>
						  </TABLE>						  
						  <TABLE style="height: 250px; left: 0px; position: absolute; top: 12px;visibility: hidden; width:100%" style="border-left: 1px #6699CC solid;border-top: 1px #6699CC solid; border-bottom: 1px #6699CC solid; border-right: 1px #6699CC solid;"  id="id2">						  	
						  	<tr>
						  		<td colspan="2" valign="top" >
									<div id="display" >							
										<table width="95%" align="top" style="margin-left:10px;margin-top:20px;margin-right:10px;margin-bottom:10px" cellspacing="0">								
											<caption class="caption">< Service Request ></caption>																				 
												<c:forEach var="fieldLabel" items="${fieldAttrs}" varStatus="loop" >	
													<TR>
													  <TD class="${(loop.count%2) == 0 ? 'colAlt' : 'col'}" style="border-left: 1px #6699CC solid;" valign="top" width="25%" >
															${fieldLabel.key}																						
													  </TD>
													  <TD class="${(loop.count%2) == 0 ? 'colAlt' : 'col'}"  width="25%" align="left" >
														<form:input path="${fieldLabel.value}" cssClass="textBox" maxlength="20" size="20"/>
													  </TD>										  
													</TR>
												</c:forEach>		
										</table>
									</div>
								</td>
							</tr>		
							<TR>
								  <TD  align="right" class="colAlt"><font  color="red">&nbsp;&nbsp;&nbsp;*Required fields</font></TD>								  							
								  <TD  align="left" class="colAlt">
										<br/>
										<input type="submit" name="submitBtn"  value="Submit >>" onclick="javascript:doSubmit('2')" class="btn" width="100%" />
								  </TD>
							</TR>					
						 </TABLE>	
						 <TABLE style="HEIGHT: 400px; LEFT: 10px; POSITION: absolute; TOP: 12px; VISIBILITY: hidden; width:100%" class="contentContainer" id="id3">
								<TR>
									  <TD align="center">
										<<< Under construction >>>
									  </TD>
								</TR>
						  </TABLE>	
					</TD>
			  </TR>
		</TABLE>
		<script>		
		 decideTab( '<%=pageNum%>' );		  
		</script>
	</form:form>
	
	
</body>
</html>
