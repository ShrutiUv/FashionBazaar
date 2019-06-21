<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Update User</title>

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

<form action="UpdateUser" method="post">
		<table align="center" id="t01">
			<tr>
				<td align="center" colspan="2"> <h3>User</h3></td>
			</tr>

			<tr>
				<td><h5>User Name</h5> </td>
				<td><input type="text" name="userName"  value="${user.userName }"></td>
			</tr>
			
			<tr>
				<td><h5> EmailId</h5> </td>
				<td><input type="text" name="emailId" value="${user.emailId }" /></td>
			</tr>
			
			<tr>
				<td><h5>Customer Name </h5></td>
				<td><input type="text" name="customerName"  value="${user.customerName }"/></td>
			</tr>
			
			<tr>
				<td><h5>User Address</h5> </td>

				<td><textarea rows="4" cols="50" name="address">${user.address }  </textarea></td>
			</tr>
			
			<tr>
				<td><h5>Password </h5> </td>
				<td><input type="text" name="password"  value="${user.password }"/></td>
			</tr>
			
			<tr>
				<td><h5>Enabled </h5> </td>
				<td><input type="text" name="enabled"  value="${user.enabled }"/></td>
			</tr>
			
			<tr>
				<td><h5>User-Role</h5>  </td>
				<td><input type="text" name="role"  value="${user.role }"/></td>
			</tr>
			
			

			<tr>
				<td align="center" colspan="2">
				<input type="submit" style="font-size:15pt;color:white;background-color:blue;border:2px solid #336600;padding:3px" value="update User "></td>
			</tr>
			
			
			</table>
		</form>	
		
		<br><br><br><br><br>
		<jsp:include page="footer.jsp"></jsp:include>

</body>
</html>