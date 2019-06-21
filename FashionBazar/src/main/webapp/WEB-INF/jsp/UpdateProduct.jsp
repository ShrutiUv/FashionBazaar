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
  width: 50%;    
  background-color: #00FFFF;
}
</style>


</head>
<body>
<jsp:include page="navBar.jsp"></jsp:include>
<br><br><br>
		<form action="<c:url value="UpdateProduct"/>" method="post">
		
		<table align="center" id="t01">
			<tr>
				<td colspan="2"> <h3>Product Management</h3></td>
			</tr>
			
			<tr>
               <td><h5>Product Id</h5></td>
               <td><input type="text" name="productId" value="${product.productId}" readonly/></td>
           </tr>

			<tr>
				<td><h5>Product Name</h5></td>
				<td><input type="text" name="productName" value="${product.productName}"/></td>
			</tr>

			<tr>
				<td><h5>Product Desc</h5></td>

				<td><textarea rows="4" cols="50" name="productDesc" >${product.productDesc}> </textarea></td>
			</tr>
			
			
			<tr>
				<td><h5>Stock </h5></td>
				<td><input type="text" name="stock" value="${product.stock}"/></td>
			</tr>

			<tr>
				<td><h5>Price </h5></td>

				<td><input type="text" name="price" value="${product.price}"/></td>
			</tr>
			
	
			<tr>
				<td><h5>Category</h5></td>

				<td><select name="categoryId">
						<c:forEach var="c" items="${categoryList }">
							<option value="${c.categoryId }">${c.categoryName }</option>
						</c:forEach>
				</select></td>

			</tr>
			

			<tr>
				<td><h5>Supplier</h5></td>
				<td><input type="text" name="supplierId" value="${product.supplierId}"/></td>
			</tr>

			<tr>
				<td align="center"  colspan="2"><input type="submit" style="font-size:15pt;color:white;background-color:blue;border:2px solid #336600;padding:3px"  value="Update Product" />
				</td>
			</tr>
    </table>
    <br><br><br>
    <jsp:include page="footer.jsp"></jsp:include>
		</form>
	