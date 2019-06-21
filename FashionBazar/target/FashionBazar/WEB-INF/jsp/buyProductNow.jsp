<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add Address</title>

<!-- Bootstrap core CSS -->
<link href="resources/css/bsmin.css" rel="stylesheet">

<!-- Custom styles for this template -->
<link href="resources/css/myApp.css" rel="stylesheet">

<style>
table {
	border: 1px solid black;
	outline: 5px solid navy;
	/* margin:30px; */
	margin-left: auto;
	margin-right: auto;
	padding: 50px 60px;
}

.padding-6 {
	padding-top: 0px;
	padding-bottom: 70px;
}

table#t01 {
  width: 40%;    
  background-color: #00FFFF;
}
</style>
</head>
<body>

	

<jsp:include page="navBar.jsp"></jsp:include>


	<br>
	<div class="padding-6">

		<table border="2" cellpadding="6" id="t01">
		
		
			<tr>
				
				<th>Product Name</th>

				<th>Product Price</th>


			</tr>
			
			
			<tr>
				<td>${product.productName}</td>
				<td>${product.price}</td>
					
			</tr>
			
		
			<tr>
				<td >Total Bill</td>
				<td >${totalBill}</td>
			</tr>
		</table>
		<br>
		<h3 align="center">Enter Address Details</h3>


		<form action="paymentBuyNow" method="post">
			<table cellpadding="6" cellspacing="6" id="t01">
				<tr>
					<td>Name:</td>
					<td><input type="text" name="addressName" value="${userName}" readonly ></td>
				</tr>
				<tr>
					<td>Mobile Number :</td>
					<td><input type="number" name="mobileNumber" required></td>
					<!-- chk value in table -->
				</tr>

				<tr>
				<td>Address </td>

				<td><textarea rows="4" cols="50" name="address" required>${user.address }</textarea></td>
			</tr>
			
				<tr>
					<td>City :</td>
					<td><input type="text" name="city" required></td>
				</tr>
				<tr>
					<td>Pincode :</td>
					<td><input type="number" name="pincode" required></td>
				</tr>
				<tr>
					<td>Landmark :</td>
					<td><input type="text" name="landmark"></td>
				</tr>
				<tr>
					<td>State :</td>
					<td><input type="text" name="state" required></td>
				</tr>
				<tr>
					<td>Country :</td>
					<td><input type="text" name="country" value="India" disabled></td>
				</tr>
				<tr>
					<td><input type="submit" value="ProceedForPayment"
						class="btn btn-primary"></td>
					<td><input type="reset" value="Reset" class="btn btn-primary" /></td>
				</tr>
			</table>
		</form>
	</div>

	<jsp:include page="footer.jsp"></jsp:include>

</body>
</html>