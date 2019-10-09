<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Update Customer</title>
</head>
<body>
<jsp:include page="header.jsp"></jsp:include>

<h2 style="color: red; text-align: center;">Update Customer</h2>
	<form method ="post" action="${pageContext.request.contextPath}/updateCustomer">
	<table border="0" align="center" >
	<tr>
			<td>IdRoom</td>
			<td><input type="text" name="idRoom" value="${customer.idRoom}"required="required"></td>
		</tr>
		<tr>
			<td>IdCard</td>
			<td><input type="text" name="idCard" value="${customer.idCard}"required="required"/></td>
		</tr>
		<tr>
			<td>FullName</td>
			<td><input type="text" name="fullName" value="${customer.fullName}"required="required"/></td>
		</tr>
		<tr>
			<td>Age</td>
			<td><input type="text" name="age" value="${customer.age}"required="required"/></td>
		</tr>
		<tr>
			<td>Telephone</td>
			<td><input type="hidden" name="telephone" value="${customer.telephone}"required="required"/></td>
		</tr>
		<tr>
			<td>CheckInDate</td>
			<td><input type="date" name="checkInDate" value="${customer.checkInDate}"required="required"/></td>
			
		</tr>
		<tr>
			<td>CheckOutDate</td>
			<td><input type="date" name="checkInDate" value="${customer.checkOutDate}"required="required"/></td>
		
		</tr>
		<tr>
			<td>Email</td>
			<td><input type="email" name="email" value="${customer.email}"required="required"/></td>
		</tr>
		<tr>
		<td colspan ="2">
		<input type="submit" value="OK"/>
		<a href="home">Cancel</a></td>
		
		</tr>
	</table>
</body>
</html>