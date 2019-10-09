<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:include page="header.jsp"></jsp:include>
<h2 style="color: red; text-align: center;font-size: 100px">You have successfully booked a room <br>
	<a href="${pageContext.request.contextPath}/home">Home</a> </h2>

</body>
</html>