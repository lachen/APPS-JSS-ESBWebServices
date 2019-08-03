<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>	
<head>

<style type="text/css">

TEXTAREA {	width:90%; height:75%; border-style: none; 
			scrollbar-face-color:#CCCCCC; 
			scrollbar-shadow-color:#FFFFFF; 
			scrollbar-highlight-color:#FFFFFF; 
			scrollbar-3dlight-color:#6B7A92; 
			scrollbar-darkshadow-color:#6B7A92; 
			scrollbar-track-color:#E2E2E2; 
			scrollbar-arrow-color:#6B7A92  }

</style>



</head>
<body>

	
	 <table id="viewResponse" width="99%" align="top" style="visibility: hidden;border-left: 1px #6699CC solid;border-top: 1px #6699CC solid; border-bottom: 1px #6699CC solid; border-right: 1px #6699CC solid; height:150px;margin-left:0px;margin-top:485px;margin-right:0px;margin-bottom:10px" cellspacing="0">								
		<caption class="caption">< Service Response ></caption>																				 
			<tr>                   
				<td >
					<TABLE BORDER="0" ALIGN="left"  style="height:250px;"  cellpadding="0" cellspacing="0">	
						<TR>
							<TD>
								<textarea  rows='6' cols='100'  READONLY>
											${serviceResponse}			
								</textarea>
							</TD>
						</TR>
					</TABLE>
				</TD>
			</TR>
	</TABLE>

	<%String showValue = request.getAttribute("showResponse") != null ? (String)request.getAttribute("showResponse") : "N"; %>

	<script>
		function displayResponse(showValue){
			if( showValue == 'Y' ){				
				document.getElementById("viewResponse").style.visibility = "visible";
				}
			else{				
				document.getElementById("viewResponse").style.visibility = "hidden";
				}
			
		}
			
		displayResponse('<%=showValue%>');
</script>
</body>
</html>
