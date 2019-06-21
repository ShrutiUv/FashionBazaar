<%-- <%@include file="Header.jsp" %> --%>

<%@ page language="java" contentType="text/html"%>; 
 <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>  

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link href="resources/css/bsmin.css" rel="stylesheet">

<!-- Custom styles for this template -->
<link href="resources/css/myApp.css" rel="stylesheet">

<style>
.padding-6 {
	padding-top: 20px;
	padding-bottom: 140px;
}

table {
	border: 1px solid black;
	outline: 5px solid navy;
}

table#t01 {
  width: 50%;    
  background-color: #00FFFF;
}
</style>


</head>
<body>
<jsp:include page="navBar.jsp"></jsp:include>
<br><br><br>

<form action="<c:url value="AddUser"/>">  
		
		<table align="center" id="t01">
			<tr>
				<td align="center" colspan="2"><h3>Users</h3></td>
			</tr>

			<tr>
				<td>User Name </td>
				<td><input type="text" name="userName" required></td>
			</tr>
			
			<tr>
				<td> EmailId </td>
				<td><input type="text" name="emailId" required></td>
			</tr>
			
			<tr>
				<td>Customer Name </td>
				<td><input type="text" name="customerName" required></td>
			</tr>
			
			<tr>
				<td>User Address </td>

				<td><textarea rows="4" cols="50" name="address"  required> </textarea></td>
			</tr>
			
			<tr>
				<td>Password  </td>
				<td><input type="text" name="password" required></td>
			</tr>
			
			<tr>
				<td>Enabled  </td>
				<td><input type="text" name="enabled" required></td>
			</tr>
			
			<tr>
				<td>User-Role  </td>
				<td><input type="text" name="role" required></td>
			</tr>
			
			

			<tr>
				<td align="center" colspan="2">
				<input type="submit" style="font-size:15pt;color:white;background-color:blue;border:2px solid #336600;padding:3px" value="Register "></td>
			</tr>
			
			
			
		</table>
		<br><br><br><br><br>
		<jsp:include page="footer.jsp"></jsp:include>
		</form>	
		
		
		

</body>
</html>