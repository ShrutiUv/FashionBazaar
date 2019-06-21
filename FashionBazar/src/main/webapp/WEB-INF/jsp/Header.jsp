<%@ page language="java" contentType="text/html"%> 
 <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>  

<html>
<head>

<title>{}</title>
</head>
<body>

<a href="<c:url value="login"/>">Login</a>&nbsp;&nbsp;|&nbsp;&nbsp;
<a href="<c:url value="register"/>">Register</a>&nbsp;&nbsp;|&nbsp;&nbsp;
<a href="<c:url value="category"/>"> Category Management</a>&nbsp;&nbsp;|&nbsp;&nbsp;
<a href="<c:url value="product"/>"> Product Management</a>&nbsp;&nbsp;|&nbsp;&nbsp;
<a href="<c:url value="supplier"/>">Suppliers</a>&nbsp;&nbsp;|&nbsp;&nbsp;
<a href="<c:url value="user"/>">Users</a>&nbsp;&nbsp;|&nbsp;&nbsp;
<a href="<c:url value="addToCart"/>">addToCart</a>

</body>
</html>