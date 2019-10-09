<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Update User</title>
</head>
<body>
<jsp:include page="header.jsp"></jsp:include>

<h2 style="color: red; text-align: center;">Update User</h2>
	<form method ="post" action="${pageContext.request.contextPath}/updateUser">
	<table border="0" align="center" >
	<tr>
			<td>IdUser</td>
			<td><input type="hidden" name="idUser" value="${user.idUser}" readonly="readonly"/></td>
		</tr>
		<tr>
			<td>UserName</td>
			<td><input type="text" name="userName" value="${user.userName}"required="required"/></td>
		</tr>
		<tr>
			<td>Password</td>
			<td><input type="password" name="password" value="${user.password}"required="required"/></td>
		</tr>
		<tr>
			<td>Roles</td>
			<td><input type="text" name="roles" value="${user.roles}"required="required"/></td>
		</tr>
		<tr>
		<td colspan ="2">
		<input type="submit" value="OK"/>
		<a href="home">Cancel</a></td>
		
		</tr>
	</table>
</body>
</html>