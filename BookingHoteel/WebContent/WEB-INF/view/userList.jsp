<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>User List</title>

</head>
<body>
<jsp:include page="header.jsp"></jsp:include>

	<h2 style="color: red; text-align: center;">User List</h2>
	<table border="1" align="center" width="100%">
		<tr>
			<th>IdUser</th>
			<th>UserName</th>
			<th>PassWord</th>
			<th>Roles</th>
			<th>UpDate</th>
			<th>Delete</th>
		</tr>
		<c:forEach items="${userList}" var="user">
			<tr>
				<td>${user.idUser}</td>
				<td>${user.userName}</td>
				<td><input type="hidden" name="password" value="${user.password}" readonly="readonly"/></td>
				<td>${user.roles}</td>
				<td><a href="updateUser?idUser=${user.idUser}">UpDate User</a>
				<td><a href="deleteUser?idUser=${user.idUser}">Delete User</a></td>

			</tr>
		</c:forEach>
	</table>
</body>
</html>