<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Login</title>
</head>
<body>
	<h2 style="color: red; text-align: center;">Login User</h2>
<form action="/loginAction" method="POST">
	<table border="0" align="center">
		<tr>
			<td>UserName:</td>
			<td><input type="text" name="username" placeholder="UserName" required/></td>
		</tr>
		<tr>
			<td>Password:</td>
			<td><input type="password" name="password" placeholder="Password" required/></td>
		</tr>
		<tr>
			<td colspan="2">
			<input type="submit" value="Login" /> 
				<a href="home">Cancel</a></td>

		</tr>
		</table>
		</form>
</body>
</html>