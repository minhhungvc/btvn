<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Create Customer</title>
</head>
<body>
<jsp:include page="header.jsp"></jsp:include>

	<h2 style="text-align: center; color: pink;">Create Customer</h2>
	<form method="POST"
		action="${pageContext.request.contextPath}/createCustomer">
		<table border="0" align="center">
		<tr>
				<td>IdRoom</td>
				<td><input type="text" name=idRoom required="required" ></td>
			</tr>
			<tr>
				<td>IdCard</td>
				<td><input type="text" name=idCard required="required"></td>
			</tr>
			<tr>
				<td>FullName</td>
				<td><input  type="text" name="fullName" required="required"></td>
			</tr>
			<tr>
				<td>Age</td>
				<td><input type="text" name="age" required="required"></td>
			</tr>
			<tr>
				<td>Telephone</td>
				<td><input type="tel" name="telephone"required="required"></td>
			</tr>
			<tr>
				<td>CheckInDate</td>
				<td><input type="date" name="checkInDate"required="required"></td>
			</tr>
			<tr>
				<td>CheckOutDate</td>
				<td><input type="date" name="checkOutDate"required="required"></td>
			</tr>
			<tr>
				<td>Email</td>
				<td><input type="email" name="email"required="required"></td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value="Submit" /> <a
					href="${pageContext.request.contextPath}/home">Cancel</a></td>
			</tr>
		</table>
</body>
</html>