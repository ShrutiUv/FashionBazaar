<%-- <%@include file="Header.jsp" %> --%>

<%@ page language="java" contentType="text/html"%>
 
 <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
   <html>
<head>
<title>Suppliers</title>

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
<br><br><br><br>

<form action="<c:url value="AddSupplier"/>" method="post">
		<table align="center"  id="t01">
			<tr>
				<td align="center"  colspan="2"><h3>Suppliers</h3></td>
			</tr>

			<tr>
				<td><h5>Supplier Name</h5></td>
				<td><input type="text" name="supplierName" /></td>
			</tr>

			<tr>
				<td><h5>Supplier Address</h5></td>

				<td><textarea rows="4" cols="50" name="supplierAdd"> </textarea></td>
			</tr>

			<tr>
				<td align="center" colspan="2">
				<input type="submit" style="font-size:15pt;color:white;background-color:blue;border:2px solid #336600;padding:3px" value="Add Supplier"></td>
			</tr>
			
		</table>
		</form>	
		
		
		<table border="1" cellpadding="6" align="center" id="t01">
			 <tr>
			     
			     <td><h5>Supplier Name </h5></td>
			   
			     <td><h5>Supplier Address</h5> </td>
			     
			 </tr>
			    
			    <c:forEach items="${supplierList}" var="supplier">
			    <tr>
			    
			      
			      <td> ${supplier.supplierName} </td>
			      
			      
			      <td> ${supplier.supplierAdd} </td>
			
			    
			    <td>
			        <a href="<c:url value="editSupplier${supplier.supplierId}"/>">Edit</a>
	                <a href="<c:url value="deleteSupplier${supplier.supplierId}"/>">Delete</a>
	            </td>
	            </tr>
	            </c:forEach>

		</table>
		<br><br><br><br>
		<jsp:include page="footer.jsp"></jsp:include>
</body>

</html>



</body>
</html>