 <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>



<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Cart List</title>

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

 <script type="text/javascript">
 
	
     function calculate(row) {    		 
    	var quantity = row.cells[2].children[0].value;
    	var price = row.cells[1].innerText;
 		var total = quantity * price;
 		row.cells[3].children[0].innerText = total;	
       }
    
     </script>
    
   
</head>


<body>

	<jsp:include page="navBar.jsp"></jsp:include>
<br><br><br><br><br>

 <form action="byOrder" method="post">

		<table border="1" cellpadding="6" align="center" id="t01">
	
			<tr>
				<td colspan="5" align="center"><h3> Cart List</h3></td>
			</tr>

			<tr>
			<th><h5>ProductName</h5></th> 
			<th><h5>Price</h5></th> 
			<th><h5>Quantity</h5></th> 
			<th><h5>Total Price</h5></th>
			<th><h5>Delete</h5></th>
			 </tr>			
				
				<c:forEach  var="cart" items="${ clist}">
				<tr>				
				<td>${cart.product.productName}</td>			
				<td>${cart.product.price}</td>
				<td><input type="number" name="qty" id="qty" value="1" min="1" max="100" onclick="calculate(this.parentNode.parentNode)"></td>
				<input type="hidden" name="price" value="${cart.product.price}" id="price">
				
				<td>
				<span id="result">${cart.product.price}</span>
				</td>
							
				  <td>
	                <a href="<c:url value="deleteCart${cart.cartId}"/>">Delete</a>
	            </td>
	                     
	             </tr>
			        </c:forEach>
				
				<tr>
				<td colspan="5" align="center"><input type="submit"  style="font-size:15pt;color:white;background-color:blue;border:2px solid #336600;padding:3px"  value="Placed Order"></td>
				</tr>
				<tr>
				<td>
	            <a href="<c:url value="home"/>"><h5>Continue Shopping</h5></a>
	            </td>
				</tr>
				
				 </table>

	</form>
 
<br><br><br><br><br><br><br>
	<jsp:include page="footer.jsp"></jsp:include>
	

</body>
</html>
  
 
 
 
