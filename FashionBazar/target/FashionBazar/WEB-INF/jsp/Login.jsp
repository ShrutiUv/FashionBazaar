<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	
	<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
	
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login</title>
<!-- Bootstrap core CSS -->
<link href="resources/css/bsmin.css" rel="stylesheet">

<!-- Custom styles for this template -->
<link href="resources/css/myApp.css" rel="stylesheet">

<style>
.padding-5
{
  padding-top: 200px;
  padding-bottom: 200px;
}

table
{
  border:1px solid black;
  outline:5px solid navy; 
}

body{background-color:skyblue;}

</style>

</head>
<body>

<jsp:include page="navBar.jsp"></jsp:include>
	
<div class="padding-5">
	<form action="loginData" method="post">
		
		<h4 align="center" style="color: red"> <c:out value="${checklogin }"></c:out> </h4>
		
		
		<table align="center" cellpadding="15" cellspacing="6" border="0">
		
		    <tr>
		       <td align="center"><h4>Login Here</h4></td>
		    </tr>
			<tr>
				<td>User Name:</td>
				<td><input type="text" name="userName" required></td>
			</tr>
			<tr>
				<td>Password:</td>
				<td><input type="password" name="Password" required></td>
			</tr>
			<tr>
				<td><input type="submit" value="LogIn" class="btn btn-primary"></td>
				
			</tr>

		</table>
	</form>
</div>
	<jsp:include page="footer.jsp"></jsp:include>
</body>
</html>