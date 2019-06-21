<%@ page language="java" contentType="text/html"%> 
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    

<html>
<head>

<title>Insert title here</title>
</head>
<body>
<jsp:include page="navBar.jsp"></jsp:include>
<br><br><br>

<form action="<c:url value="UpdateSupplier"/>" method="post">
		<table align="center">
			<tr>
				<td colspan="2"><h3>Suppliers</h3></td>
			</tr>
			
			<tr>
			<td><h5>Supplier Id</h5></td>
           <td><input type="text" name="supplierId" value="${supplier.supplierId}" readonly/></td>
           </tr>

			<tr>
				<td><h5>Supplier Name</h5></td>
				<td><input type="text" name="supplierName" value="${supplier.supplierName}" /></td>
			</tr>

			<tr>
				<td><h5>Supplier Address</h5></td>

				<td><textarea rows="4" cols="50" name="supplierAdd">${supplier.supplierAdd}</textarea></td>
			</tr>

			<tr>
				<td align="center" colspan="2">
				<input type="submit" style="font-size:15pt;color:white;background-color:blue;border:2px solid #336600;padding:3px" value="Update Supplier"></td>
			</tr>
			
		</table>
		</form>	
		<br><br><br><br><br>
		<jsp:include page="footer.jsp"></jsp:include>
		
		</body>
</html>

