<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Book management</title>
</head>
<body>
	
	<h2 style="text-align:center; color:blue;">WELCOME TO HOME PAGE </h2>
	<a href="${pageContext.request.contextPath}/book/getall">Book List </a>
	
	<a href="${pageContext.request.contextPath}/book/create"> Create Book </a>
	<a href="${pageContext.request.contextPath}/logout"> Logout </a>
	<form action="${pageContext.request.contextPath}/book/search"method="GET">
	<table>
	<tr>
	<td> <input type="text" name="name" ></td>
	<td><input type="submit" values="search"></td>
	
	 
	</tr>
	</table>
	
	</form>
</body>
</html>