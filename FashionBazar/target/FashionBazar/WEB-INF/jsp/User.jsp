<%-- <%@include file="Header.jsp" %> --%>
<%@ page language="java" contentType="text/html"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>   

<html>
<head>
<title>User List</title>

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

<form action="<c:url value="AddUser"/>" method="post">
		<table align="center" id="t01">
			<tr>
				<td align="center" colspan="2"><h3> Users</h3></td>
			</tr>

			<tr>
				<td><h5>User Name</h5> </td>
				<td><input type="text" name="userName" /></td>
			</tr>
			
			<tr>
				<td><h5> EmailId </h5></td>
				<td><input type="text" name="emailId" /></td>
			</tr>
			
			<tr>
				<td><h5>Customer Name</h5> </td>
				<td><input type="text" name="customerName" /></td>
			</tr>
			
			<tr>
				<td><h5>User Address</h5> </td>

				<td><textarea rows="4" cols="50" name="address"> </textarea></td>
			</tr>
			
			<tr>
				<td><h5>Password </h5> </td>
				<td><input type="text" name="password" /></td>
			</tr>
			
			<tr>
				<td><h5>Enabled </h5> </td>
				<td><input type="text" name="enabled" /></td>
			</tr>
			
			<tr>
				<td><h5>User-Role </h5> </td>
				<td><input type="text" name="role" /></td>
			</tr>
			
			

			<tr>
				<td align="center" colspan="2">
				<input type="submit"  style="font-size:15pt;color:white;background-color:blue;border:2px solid #336600;padding:3px" value="Add User "></td>
			</tr>
			
			
			
		</table>
		</form>	
		
		
		
           <table border="1" cellpadding="6" align="center" id="t01">
            
             
			<tr>
			     
			     <td><h5>User Name</h5> </td>
			     
			     <td><h5> Customer Name</h5>  </td>
			     
			     <td><h5> Email Id </h5> </td>
			 
			     <td><h5>User Address </h5></td>
			     
			     <td><h5>Password</h5></td>
			     
			     <td><h5>Enabled</h5></td>
			   
			     <td><h5>Role</h5></td>
			     
			     
			     
			     
			 </tr>
		
		<c:forEach items="${listUser}" var="u">
			    <tr>
			    
			      
			      <td> ${u.userName} </td>
			     
			      <td> ${u.customerName} </td>
			      
			      <td> ${u.emailId} </td>
			      
			      <td> ${u.address} </td>
			       
			      <td> ${u.password} </td>
			      
			      <td> ${u.enabled} </td>
			    
			      <td> ${u.role} </td>
			     
			      
			      <td>
			        <a href="<c:url value="deleteUser${u.userName}"/>">DeleteUser</a>
	            </td>
			      
			      </tr>
			      </c:forEach>
			      </table>
		
		<br><br><br>
		
	           
<jsp:include page="footer.jsp"></jsp:include>
	
</body>

</html>



