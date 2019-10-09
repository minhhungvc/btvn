<%@page import="com.vn.bookinghotel.bo.Room"%>
<%@page import="org.apache.tomcat.util.codec.binary.Base64"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<meta charset="utf-8">
<title>Room List</title>

</head>
<body>
<jsp:include page="header.jsp"></jsp:include>

	<h2 style="color: red; text-align: center;">Room List</h2>
	<table border="0" align="center" width="100%">
		<tr>
			<th>IdRoom</th>
			<th>Image</th>
			<th>RoomName</th>
			<th>Detail</th>
			<th>Price</th>
			<th>UpDate</th>
			<th>Delete</th>
			<th>BookNow</th>
		</tr>
		<c:forEach items="${roomList}" var="room">
			<tr style="text-align: center;">
				<td>${room.idRoom}</td>
				<td><img src="data:image/jpeg;base64,${room.img}" width="300px" height="250px"/></td>
				<td>${room.rName}</td>
				<td>${room.detail}</td>
				<td>${room.price}</td>
				<td><a href="updateRoom?idRoom=${room.idRoom}">UpDate Room</a>
				<td><a href="deleteRoom?idRoom=${room.idRoom}">Delete Room</a></td>
				<td><a href="createCustomer?idRoom=${room.idRoom}">BookNow</a></td>
				
			</tr>
		</c:forEach>
	</table>
</body>
</html>