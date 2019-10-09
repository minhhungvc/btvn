<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Book List</title>
</head>
<body>
<jsp:include page="header.jsp"></jsp:include>

	<h2 style="color: red; text-align: center;">Book List</h2>
	<table border="1" align="center" width="100%">
		<tr>
			<th>ID</th>
			<th>Name</th>
			<th>Author</th>
			<th>Publisher</th>
			<th>Price</th>
			<th>UpDate</th>
			<th>Delete</th>

		</tr>
		<c:forEach items="${bookList}" var="book">
			<tr>
				<td>${book.id}</td>
				<td>${book.name}</td>
				<td>${book.author}</td>
				<td>${book.publisher}</td>
				<td>${book.price}</td>
				<td><a href="updateBook?id=${book.id}">UpDate Book</a>
				<td><a href="deleteBook?id=${book.id}">Delete Book</a></td>
				
				

			</tr>

		</c:forEach>
	</table>


</body>
</html>