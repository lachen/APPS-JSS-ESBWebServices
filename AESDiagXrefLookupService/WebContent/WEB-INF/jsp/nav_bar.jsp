<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>	
<head>
<script language="JavaScript">

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
</script>
</head>
<body>
	<table class="nav_top" cellspacing="0" cellpadding="0" border="0" align="center" width="50%">
		<TR style="top: 77px; left: 230px;Position: Absolute;"  id="Row1" >   
	   		<c:forEach var="operation" items="${operations}" varStatus="loop" >			
					<TD  id="Tab${loop.count}" width="20%" align="center" class="headActiveTab" >
						  <A href="javascript:ShowTab(${loop.count})">
						  	<c:out value="${operation.value}"/>
						  </A>
					</TD>			
			 </c:forEach>
		 </TR>   
	</table>
</body>
</html>
