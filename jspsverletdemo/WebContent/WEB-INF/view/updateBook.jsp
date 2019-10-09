<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Update Book</title>
</head>
<body>
<jsp:include page="header.jsp"></jsp:include>
	<h2 style="color: red; text-align: center;">Update Book</h2>
	<form method ="post" action="${pageContext.request.contextPath}/updateBook">
	<table border="0" align="center" >
	<tr>
			<td>ID</td>
			<td><input type="hidden" name="id" value="${book.id}" readonly="readonly"/></td>
		</tr>
		<tr>
			<td>Name</td>
			<td><input type="text" name="name" value="${book.name}"/></td>
		</tr>
		<tr>
			<td>Author</td>
			<td><input type="text" name="author" value="${book.author}"/></td>
		</tr>
		<tr>
			<td>Publisher</td>
			<td><input type="text" name="publisher" value="${book.publisher}"/></td>
		</tr>
		<tr>
			<td>Price</td>
			<td><input type="text" name="price"value ="${book.price}"/></td>
		</tr>
		<tr>
		<td colspan ="2">
		<input type="submit" value="OK"/>
		<a href="home">Cancel</a></td>
		
		</tr>
	</table>
	</form>

</body>
</html>