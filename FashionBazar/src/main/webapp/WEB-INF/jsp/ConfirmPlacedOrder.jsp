 <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Confirm Purchase</title>

<!-- Bootstrap core CSS -->
<link href="resources/css/bsmin.css" rel="stylesheet">

<!-- Custom styles for this template -->
<link href="resources/css/myApp.css" rel="stylesheet">

<style>
.padding-6
{
  padding-top: 30px;
  padding-bottom: 170px;
}

table {
	border: 1px solid black;
	outline: 5px solid navy;
	margin-left:400px; margin-right:auto;
	
}

#display_table
{
text-align:left; //?
	outline: 5px solid skyblue;;

}

table#t01 {
  width: 40%;    
  background-color: #00FFFF;
}
</style>

</head>
<body>
	<jsp:include page="navBar.jsp"></jsp:include>

	

	<div class="padding-6">
	<form action="paymentCart" id="cartForm" method="post">
		<table align="center" border="2" cellpadding="6" id="t01">
		
		<td><h3>Confirm Purchase</h3></td>
			<tr>
				<th>Product Name</th>
				<th>Product Price</th>
			
				<th>Total price</th>
 			</tr>
			<c:forEach var="cart" items="${cartList}">
				<tr>
					<td>${cart.product.productName }</td>
					<td value="${cart.product.price}">${cart.product.price}</td>
 					
					<td>${cart.product.price}</td>   					
				</tr>
			</c:forEach>

            <tr>
            <td colspan="1" align="right">Grand Total : </td>
            <td colspan="1" id="grandTotal">${totalBill} </td>  
            </tr>
		</table>
		<br><br>
		
		<table align="center"  cellpadding="6" cellspacing="6" id="t01">
			<tr>
				<td>Name :</td>
				<td>${address.addressName}</td>
			</tr>
			<tr>
				<td>Mobile Number :</td>
				<td>${address.mobileNumber}</td> 
			</tr>
			<tr>
				<td>Address :</td>
				<td>${address.address}</td>
			</tr>
			
			<tr>
				<td>City :</td>
				<td>${address.city}</td>
			</tr>
			<tr>
				<td>Pincode :</td>
				<td>${address.pincode}</td>
			</tr>
			<tr>
				<td>Landmark :</td>
				<td>${address.landmark}</td>
			</tr>
			<tr>
				<td>State :</td>
				<td>${address.state}</td>
			</tr>
			<tr>
				<td>Country :</td>
				<td>${address.country}</td>
			</tr>
		
<br><br>
		<tr>
			<td><input type="submit" value="Proceed For Payment" class="btn btn-info" ></td>
			
		</tr>
		</table>


	</form>


</body>
</html> 