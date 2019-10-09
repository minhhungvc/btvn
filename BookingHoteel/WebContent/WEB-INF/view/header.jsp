<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">

<!-- Bootstrap CSS -->
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous">

<title>HEADER</title>
</head>

<body>
	<nav class="navbar navbar-expand-lg navbar-light"
		style="background-color: #FFFF00;">
		<a class="navbar-brand" href="${pageContext.request.contextPath}/home">Home</a>
		<button class="navbar-toggler" type="button" data-toggle="collapse"
			data-target="#navbarSupportedContent"
			aria-controls="navbarSupportedContent" aria-expanded="false"
			aria-label="Toggle navigation">
			<span class="navbar-toggler-icon"></span>
		</button>
		<ul class="navbar-nav mr-auto">
			<li class="nav-item active"><a class="nav-link"
				href="${pageContext.request.contextPath}/roomList">Room List<span
					class="sr-only">(current)</span>
			</a></li>

		</ul>



		
		<div class="btn-group">
			<button type="button" class="btn btn-danger">Manage</button>
			<button type="button"
				class="btn btn-danger dropdown-toggle dropdown-toggle-split"
				data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
				<span class="sr-only">Toggle Dropdown</span>
			</button>
			<div class="dropdown-menu">
				<a class="dropdown-item"
					href="${pageContext.request.contextPath}/userList">User List</a> <a
					class="dropdown-item"
					href="${pageContext.request.contextPath}/createUser">Create
					User</a> <a class="dropdown-item"
					href="${pageContext.request.contextPath}/createRoom">Create
					Room</a> <a class="dropdown-item"
					href="${pageContext.request.contextPath}/customerList">Customer
					List</a>

			</div>
		</div>
		<div class="btn-group">
			<button type="button" class="btn btn-danger">Contact</button>
			<button type="button"
				class="btn btn-danger dropdown-toggle dropdown-toggle-split"
				data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
				<span class="sr-only">Toggle Dropdown</span>
			</button>
			<div class="dropdown-menu">
				<a class="dropdown-item" href="mailto:minhhung170899@gmail.com">Send
					Email BOOKING.COM </a> <a class="dropdown-item" href="sms:0764347535">SMS
					BOOKING.COM</a> <a class="dropdown-item" href="tel:+84764347535">HotLine</a>
			</div>
		</div>
		<div class="btn-group">
			<button type="button" class="btn btn-danger">System</button>
			<button type="button"
				class="btn btn-danger dropdown-toggle dropdown-toggle-split"
				data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
				<span class="sr-only">Toggle Dropdown</span>
			</button>
			<div class="dropdown-menu">
				<a class="dropdown-item"
					href="${pageContext.request.contextPath}/loginUser">Login</a>
				<div class="dropdown-divider"></div>
				<a class="dropdown-item"
					href="${pageContext.request.contextPath}/logout">LogOut</a>
			</div>
		</div>
		<div class="collapse navbar-collapse" id="navbarSupportedContent">
			<ul class="navbar-nav mr-auto">
				<li class="nav-item active"><a class="nav-link" href=""><span
						class="sr-only">(current)</span> </a></li>

			</ul>
			<form class="form-inline my-2 my-lg-0"
				action="${pageContext.request.contextPath}/searchRoom" method="GET">
				<input class="form-control mr-sm-2" type="text" placeholder="Search"
					aria-label="Search" name="rName">
				<button class="btn btn-outline-success my-2 my-sm-0" type="submit">Search</button>
			</form>
		</div>
	</nav>
	<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"></script>
	<script
		src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
	<script
		src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
</body>
</html>