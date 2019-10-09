<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Create Room</title>
</head>
<body>
<jsp:include page="header.jsp"></jsp:include>

<h2 style="text-align: center; color: pink;">Create Room</h2>
	<form method="POST" action="${pageContext.request.contextPath}/createRoom" enctype="multipart/form-data">
		<table border="0" align = "center">
			<tr>
				<td>IdRoom</td>
				<td><input type="text" name="idRoom"required="required"></td>
			</tr>
			<tr>
				<td>Image</td>
				<td><input type="file" name="img" size="50" placeholder="Upload Your Image" required="required"/></td>
			</tr>
			<tr>
				<td>RoomName</td>
				<td><input type="text" name="rName"required="required"></td>
			</tr>
			<tr>
				<td>Detail</td>
				<td><input type="text" name="detail"required="required"></td>
			</tr>
			<tr>
				<td>Price</td>
				<td><input type="number" name="price"> $ </td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value="Submit" /> <a
					href="${pageContext.request.contextPath}/home">Cancel</a></td>
			</tr>
		</table>
</body>
</html>