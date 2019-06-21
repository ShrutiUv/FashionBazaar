<%-- <%@include file="Header.jsp"%> --%>

<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>


<html>
<head>

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
  width: 70%;    
  background-color: #00FFFF;
}
</style>


</head>


<body>

<jsp:include page="navBar.jsp"></jsp:include>

  <form action="<c:url value="InsertProduct"/>" method="post">
		<table align="center" id="t01">
			<tr>
				<td align="center" colspan="2"><h3> Product Management</h3></td>
			</tr>

			<tr>
				<td><h5>Product Name</h5></td>
				<td><input type="text" name="productName" /></td>
			</tr>

			<tr>
				<td><h5>Product Desc</h5></td>

				<td><textarea rows="4" cols="50" name="productDesc"> </textarea></td>
			</tr>
			
			
			<tr>
				<td><h5>Stock</h5> </td>
				<td><input type="text" value="0" name="stock" /></td>
			</tr>

			<tr>
				<td><h5>Price</h5> </td>

				<td><input type="text" value="0" name="price" /></td>
			</tr>
			
	
			<tr>
				<td><h5>Category</h5></td>

				<td><select name="categoryId">
				
                        <option>--Select List--</option>
						<c:forEach var="c" items="${categoryList }">
							<option value="${c.categoryId}">${c.categoryName }</option>
						</c:forEach>
					
				</select></td>

			</tr>
			

			<tr>
				<td><h5>Supplier</h5></td>
				<td><input type="text" value="0" name="supplierId"/></td>
			</tr>

			<tr>
				<td align="center" colspan="2"><input type="submit" style="font-size:15pt;color:white;background-color:blue;border:2px solid #336600;padding:3px" value="Insert Product" />
				</td>
			</tr>

		</table>
		</form>
	

	<br />
	<br />

	<table border="1" cellpadding="6" align="center" id="t01">
		<tr>
			<td><h5>Product Name</h5></td>
			
			<td><h5>Product Desc</h5></td>
			
			<td><h5>Stock</h5></td>
			
			<td><h5>Price</h5></td>
			
			
			<td><h5>Category</h5></td>
		
			<td><h5>Supplier</h5></td>
			
		</tr>


		<c:forEach items="${productList}" var="product">
			<tr>
				<td>${product.productName}</td>
				
				<td>${product.productDesc}</td>
				
				<td>${product.stock}</td>
				
				<td>${product.price}</td>
				
				
				<td>${product.category.categoryName}</td>
			    
				<td>${product.supplierId}</td>    
				
				<td>
					<a href="<c:url value="editProduct${product.productId}"/>">Edit</a>

					<a href="<c:url value="deleteProduct${product.productId}"/>">Delete</a>
				</td>
			</tr>
		</c:forEach>
</table>

<jsp:include page="footer.jsp"></jsp:include>

</body>
</html>


