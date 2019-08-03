<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html> 
<head>
	<link rel="stylesheet" href="<c:url value="/theme/styles.css"/>" type="text/css"/>
</head>
<body>

<table width="760" cellspacing="0" align="center" cellpadding="0" >
   <tbody>
      <tr>
         <td valign="top" width="100%">
	         <table class="header" cellspacing="0" cellpadding="0" border="0" width="100%">	            
	               <tr>
	                  <td width="100%" >
	                  	<img border="0" width="100%" height="55" alt="Company's LOGO" src="<c:url value="/theme/logo.gif"/>"></td>                  
	               </tr>	            
	         </table>
         </td>
      </tr>
      <tr>
         <td valign="top"><jsp:include page="nav_bar.jsp"/></td>
      </tr>
       <tr class="content-area" >
       <!--  request -->
         <td valign="top" >
         		<jsp:include page="serviceRequest.jsp"/>
         </td>
      </tr>
      <tr class="content-area" >
      <!-- response -->
         <td valign="top" >
         		<jsp:include page="serviceResponse.jsp"/>
         </td>
      </tr>
      <tr>
         <td valign="top"><jsp:include page="footer.jsp"/></td>
      </tr>
   </tbody>
</table>
</body>
</html><%-- /tpl:insert --%>