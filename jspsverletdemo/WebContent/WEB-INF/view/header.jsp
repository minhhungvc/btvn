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
		style="background-color: #e3f2fd;">
		<a class="navbar-brand" href="${pageContext.request.contextPath}/home">Home</a>
		<button class="navbar-toggler" type="button" data-toggle="collapse"
			data-target="#navbarSupportedContent"
			aria-controls="navbarSupportedContent" aria-expanded="false"
			aria-label="Toggle navigation">
			<span class="navbar-toggler-icon"></span>
		</button>
			<ul class="navbar-nav mr-auto">
				<li class="nav-item active"><a class="nav-link"
					href="${pageContext.request.contextPath}/bookList">Book List<span
						class="sr-only">(current)</span>
				</a></li>

			 </ul> 


				<ul class="navbar-nav mr-auto">
					<li class="nav-item active"><a class="nav-link"
						href="${pageContext.request.contextPath}/createBook">Create
							Book<span class="sr-only">(current)</span>
					</a></li>

				</ul>
					<ul class="navbar-nav mr-auto">
						<li class="nav-item active"><a class="nav-link"
							href="${pageContext.request.contextPath}/loginUser">Login
								User<span class="sr-only">(current)</span>
						</a></li>

					</ul>
					<div class="collapse navbar-collapse" id="navbarSupportedContent">
						<ul class="navbar-nav mr-auto">
							<li class="nav-item active"><a class="nav-link"
								href="${pageContext.request.contextPath}/logout">LogOut User<span
									class="sr-only">(current)</span>
							</a></li>

						</ul>
						<form class="form-inline my-2 my-lg-0"
							action="${pageContext.request.contextPath}/searchBook"
							method="GET">
							<input class="form-control mr-sm-2" type="text"
								placeholder="Search" aria-label="Search" name="name">
							<button class="btn btn-outline-success my-2 my-sm-0"
								type="submit">Search</button>
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