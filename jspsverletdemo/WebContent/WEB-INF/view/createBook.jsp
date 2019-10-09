<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Create Book</title>
</head>
<body>
<jsp:include page="header.jsp"></jsp:include>

	<h2 style="text-align: center; color: pink;">Create Book</h2>
	<form method="POST" action="${pageContext.request.contextPath}/createBook">
		<table border="0" align = "center">
			<tr>
				<td>Name</td>
				<td><input type="text" name="name"></td>
			</tr>
			<tr>
				<td>Author</td>
				<td><input type="text" name="author"></td>
			</tr>
			<tr>
				<td>Publisher</td>
				<td><input type="text" name="publisher"></td>
			</tr>
			<tr>
				<td>Price</td>
				<td><input type="text" name="price"></td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value="Submit" /> <a
					href="${pageContext.request.contextPath}/home">Cancel</a></td>
			</tr>
		</table>
	</form>

</body>
</html>