
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>


<!DOCTYPE html>
<html lang="en">

<head>

<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<meta name="description" content="">
<meta name="author" content="">

<title>Shop Homepage - Start Bootstrap Template</title>

<!-- Bootstrap core CSS -->
<link href="resources/css/bsmin.css" rel="stylesheet">

<!-- Custom styles for this template -->
<link href="resources/css/myApp.css" rel="stylesheet">

</head>

<body>

	<!-- Navigation -->
	<jsp:include page="navBar.jsp"></jsp:include>

	<!-- Page Content -->
	<div class="container">

		<div class="row">

			<!-- /.col-lg-3  side Bar-->
			<jsp:include page="sideBar.jsp"></jsp:include>

			<div class="col-lg-9">


				<!-- slider Page -->

				<jsp:include page="slider.jsp"></jsp:include>

				<div class="row">

					<c:forEach var="p" items="${productList }">

						<div class="col-lg-4 col-md-6 mb-4">
							<div class="card h-100">
								<a href="#"><img class="card-img-top"
									src=" resources/images/${p.productName }.jpeg"
									style="width: 300px; height: 200px" alt=""></a>
								<div class="card-body">
									<h4 class="card-title">
										<a href="#">${p.productName }</a>
									</h4>
									<h5>${p.price} Rs.</h5>
										
										
										<c:if test="${ userName!=null}">
		
									<h4>
										<a href="addToCart${p.productId}">addToCart</a>
									</h4>
									
									<h4>
										<a href="buyNow${p.productName}">Buy Now</a>
									</h4>
									
									</c:if>
									

									<p class="card-text">${p.productDesc }</p>

								</div>
								<div class="card-footer">
									<small class="text-muted">&#9733; &#9733; &#9733;
										&#9733; &#9734;</small>
								</div>
							</div>
						</div>

					</c:forEach>

				</div>
				<!-- /.row -->

			</div>
			<!-- /.col-lg-9 -->

		</div>
		<!-- /.row -->

	</div>
	<!-- /.container -->

	<!-- Footer -->
	<jsp:include page="footer.jsp"></jsp:include>

	<!-- Bootstrap core JavaScript -->
	<script src="resources/js/jquery.js"></script>
	<script src="resources/js/bsjq.js"></script>

</body>

</html>
