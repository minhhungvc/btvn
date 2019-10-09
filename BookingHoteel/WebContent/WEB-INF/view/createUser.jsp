<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Create User</title>
</head>
<body>
<jsp:include page="header.jsp"></jsp:include>

<h2 style="text-align: center; color: pink;">Create User</h2>
	<form method="POST" action="${pageContext.request.contextPath}/createUser">
		<table border="0" align = "center">
			<tr>
				<td>IdUser</td>
				<td><input type="text" name="idUser"required="required"></td>
			</tr>
			<tr>
				<td>UserName</td>
				<td><input type="text" name="userName"required="required"></td>
			</tr>
			<tr>
				<td>Password</td>
				<td><input type="password" name="password"required="required"></td>
			</tr>
			<tr>
				<td>Roles</td>
				<td><input type="text" name="roles"required="required"></td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value="Submit" /> <a
					href="${pageContext.request.contextPath}/home">Cancel</a></td>
			</tr>
		</table>
</body>
</html>