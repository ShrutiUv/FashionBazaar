<%-- <%@include file="Header.jsp" %> --%>
<%@ page language="java" contentType="text/html"%>

<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>


<html>
<head>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Category List</title>


<!-- Bootstrap core CSS -->
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

<jsp:include page="navBar.jsp"></jsp:include>
<br><br><br>

<form action="<c:url value="InsertCategory"/>" method="post">
		<table align="center" id="t01">
			<tr>
				<td align="center" colspan="2"> <h3>Category Management</h3></td>
			</tr>

			<tr>
				<td><h5>Category Name</h5></td>
				<td><input type="text" name="categoryName" /></td>
			</tr>

			<tr>
				<td><h5>Category Desc</h5></td>

				<td><textarea rows="4" cols="50" name="categoryDesc"> </textarea></td>
			</tr>

			<tr>
				<td align="center" colspan="2">
				<input type="submit"  style="font-size:15pt;color:white;background-color:blue;border:2px solid #336600;padding:3px" value="Insert Category"></td>
			</tr>
			
		</table>
		</form>	
		<br><br>
		
		<table border="1" cellpadding="6" align="center" id="t01">
		
		
			 <tr>
			   
			     <td> <h5>Category Name</h5> </td>
			     
			     <td> <h5>Category Desc </h5></td>
			     
			 </tr>
			    
			    <c:forEach items="${categoryList}" var="category">
			    <tr>
			    
			      
			      <td> ${category.categoryName} </td>
			     
			      <td> ${category.categoryDesc} </td>
			
			    
			    <td>
			        <a href="<c:url value="editCategory${category.categoryId}"/>">Edit</a>
	                <a href="<c:url value="deleteCategory${category.categoryId}"/>">Delete</a>
	            </td>
	            </tr>
	            </c:forEach>

		</table>
		<br><br><br><br><br>
		<jsp:include page="footer.jsp"></jsp:include>
</body>

</html>

