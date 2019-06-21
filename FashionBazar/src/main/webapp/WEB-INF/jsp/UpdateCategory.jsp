<%-- <%@include file="Header.jsp" %> --%>

<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<html>
<head>

<title>Update Category</title>

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
	
	<jsp:include page="navBar.jsp" ></jsp:include>
	
	<br><br><br>
	
<form action="<c:url value="UpdateCategory"/>" method="post">

 <table align="center" id="t01">
      <tr>
          <td align="center" colspan="2"><h3> Category Management</h3></td>
       </tr>
       
       <tr>
           <td><h5>Category Id</h5></td>
           <td><input type="text" name="categoryId" value="${category.categoryId}" readonly/></td>
       </tr>
       
       <tr>
           <td><h5>Category Name</h5></td>
           <td><input type="text" name="categoryName" value="${category.categoryName}" /></td>
       </tr>
       
       <tr>
           <td><h5>Category Desc</h5></td>
           
           <td><textarea cols="20" row="7" name="categoryDesc">${category.categoryDesc}</textarea></td>
       </tr>
       
       <tr>
           <td colspan="2">
              <center>
                 <input type="submit" style="font-size:15pt;color:white;background-color:blue;border:2px solid #336600;padding:3px" value="Update Category">
              </center>
           </td>
       </tr>
</table>

<br><br><br><br><br><br>
<jsp:include page="footer.jsp"></jsp:include>
</form>      
             
</body>
</html>