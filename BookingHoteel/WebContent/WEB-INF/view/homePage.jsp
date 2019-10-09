<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Booking.com.vn</title>
</head>
<body>
<jsp:include page="header.jsp"></jsp:include>
<div style="width:550px;height:30px;font-size:16px;font-family:Arial;float:right;padding-top:9px;padding-right:10x;">
<marquee onmouseover=this.stop() onmouseout=this.start() scrolldelay="50" scrollamount="10">
<strong>  
<a href="http://divui.com/blog/47-dia-diem-du-lich-da-nang-dep-den-man-quen-loi-ve/" style="color:#fb4ca7">Top địa điểm du lịch tại Đà Nẵng</a>  
</strong>
</marquee>
</div>

	<div id="carouselExampleIndicators" class="carousel slide"
		data-ride="carousel">
		<ol class="carousel-indicators">
			<li data-target="#carouselExampleIndicators" data-slide-to="0"
				class="active"></li>
			<li data-target="#carouselExampleIndicators" data-slide-to="1"></li>
			<li data-target="#carouselExampleIndicators" data-slide-to="2"></li>
		</ol>
		<div class="carousel-inner">
			<div class="carousel-item active">
				<img src="pictures/6.jpg" style="height: 1000px; width: 100%;"
					class="d-block w-100" alt="...">

			</div>
			<div class="carousel-item">
				<img src="pictures/2.jpg" style="height: 1000px; width: 100%;"
					class="d-block w-100" alt="...">
			</div>
			<div class="carousel-item">
				<img src="pictures/4.jpg" style="height: 1000px; width: 100%;"
					class="d-block w-100" alt="...">
			</div>
		</div>
		<a class="carousel-control-prev" href="#carouselExampleIndicators"
			role="button" data-slide="prev"> <span
			class="carousel-control-prev-icon" aria-hidden="true"></span> <span
			class="sr-only">Previous</span>
		</a> <a class="carousel-control-next" href="#carouselExampleIndicators"
			role="button" data-slide="next"> <span
			class="carousel-control-next-icon" aria-hidden="true"></span> <span
			class="sr-only">Next</span>
		</a>
	</div>


</body>
</html>