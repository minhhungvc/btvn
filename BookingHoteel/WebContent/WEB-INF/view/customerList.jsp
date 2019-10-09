<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Customer List</title>

</head>
<body>
<jsp:include page="header.jsp"></jsp:include>

	<h2 style="color: red; text-align: center;">Customer List</h2>
	<table border="1" align="center" width="100%">
		<tr>
			<th>IdRoom</th>
			<th>IdCard</th>
			<th>FullName</th>
			<th>Age</th>
			<th>Telephone</th>
			<th>CheckInDate</th>
			<th>CheckOutDate</th>
			<th>Email</th>
			<th>UpDate</th>
			<th>Delete</th>
		</tr>
		<c:forEach items="${customerList}" var="customer">
			<tr>
				<td>${customer.idRoom}</td>
				<td>${customer.idCard}</td>
				<td>${customer.fullName}</td>
				<td>${customer.age}</td>
				<td>${customer.telephone}</td>
				<td>${customer.checkInDate}</td>
				<td>${customer.checkOutDate}</td>
				<td>${customer.email}</td>
				<td><a href="updateCustomer?idCard=${customer.idCard}">UpDate Customer</a>
				<td><a href="deleteCustomer?idCard=${customer.idCard}">Delete Customer</a></td>
				
				
			</tr>
		</c:forEach>
		<form class="form-inline my-2 my-lg-0"
				action="${pageContext.request.contextPath}/searchRoom" method="GET">
				<input class="form-control mr-sm-2" type="text" placeholder="Search"
					aria-label="Search" name="rName">
				<button class="btn btn-outline-success my-2 my-sm-0" type="submit">Search</button>
			</form>
	</table>
</body>
</html>