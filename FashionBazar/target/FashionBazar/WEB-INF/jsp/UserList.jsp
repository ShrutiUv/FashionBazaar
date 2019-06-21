<%@include file="navBar.jsp" %>
<%@ page language="java" contentType="text/html"%>
 <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
    

<html>
<head>

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
<%-- <jsp:include page=""></jsp:include>
 --%>
 <form action="<c:url value=""/>" method="post">

     <table align="center" id="t01">
            
             <tr>
                
                 <td align="center"><h3>User List</h3></td>
             </tr>
             
			 <tr>
			     
			     <td> <h5>User Name </h5></td>
			    
			     <td><h5> Customer Name</h5>  </td>
			    
			     <td><h5> Email Id </h5> </td>
			     
			     <td><h5>User Address  </h5> </td>
			    
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
			      </form>
	<jsp:include page="footer.jsp"></jsp:include>		      

</body>
</html>

