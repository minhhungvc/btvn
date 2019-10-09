<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Update Room</title>
</head>
<body>
<jsp:include page="header.jsp"></jsp:include>

	<h2 style="color: red; text-align: center;">Update Room</h2>
	<form method="post"
		action="${pageContext.request.contextPath}/updateRoom" enctype="multipart/form-data">
		<table border="0" align="center">
			<tr>
				<td>IdRoom</td>
				<td><input type="text" name="idRoom" value="${room.idRoom}"
					readonly="readonly" /></td>
			</tr>
			<tr>
				<td>Image</td>
				<td><input type="file" name="img" value="${room.img}" required="required"/></td>
			</tr>
			<tr>
				<td>RoomName</td>
				<td><input type="text" name="rName" value="${room.rName}"required="required" /></td>
			</tr>
			<tr>
				<td>Detail</td>
				<td><input type="text" name="detail" value="${room.detail}" required="required"/></td>
			</tr>
			<tr>
				<td>Price</td>
				<td><input type="number" name="price" value="${room.price}" required="required"/></td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value="OK" /> <a
					href="home">Cancel</a></td>

			</tr>
		</table>
</body>
</html>