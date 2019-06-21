<%@page import="com.ecomm.Model.PlaceOrder"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>



<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Order List</title>

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
	<br>
	<br>
	<br>
	<br>
	<br>

	
		<table border="1" cellpadding="6" align="center" id="t01">

			<tr>
				<td colspan="5" align="center"><h3>Order List</h3></td>

			</tr>

			<tr>
				<th><h5>orderId</h5></th>
				<th><h5>userName</h5></th>
				<th><h5>status</h5></th>
				<th><h5>orderDate</h5></th>
				<th><h5>totalBill</h5></th>
			</tr>
			
			<c:forEach items="${orderList}" var="order">
			<tr>
				<td>${order.orderId}</td>
				
				<td>${order.userName}</td>
				
				<td>${order.status}</td>
				
				<td>${order.orderDate}</td>

			    
				<td>${order.totalBill}</td>
				</tr>
				</c:forEach>

				</table>

	
	<br>
	<br>
	<br>
	<br>
	<br>
	<br>
	<br>
	<jsp:include page="footer.jsp"></jsp:include>


</body>
</html>




