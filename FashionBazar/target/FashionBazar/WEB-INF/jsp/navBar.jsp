
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!-- Bootstrap core CSS -->
<link href="resources/css/bsmin.css" rel="stylesheet">

<!-- Custom styles for this template -->
<link href="resources/css/myApp.css" rel="stylesheet">

<nav class="navbar navbar-expand-lg navbar-dark bg-dark fixed-top">
	<div class="container">
		<a class="navbar-brand" href="home">Online Shopping</a>
		<button class="navbar-toggler" type="button" data-toggle="collapse"
			data-target="#navbarResponsive" aria-controls="navbarResponsive"
			aria-expanded="false" aria-label="Toggle navigation">
			<span class="navbar-toggler-icon"></span>
		</button>
		<div class="collapse navbar-collapse" id="navbarResponsive">
			<ul class="navbar-nav ml-auto">
				<li class="nav-item active"><a class="nav-link" href="home">Home
						<span class="sr-only">(current)</span>
				</a></li>


				<c:if test="${ userName==null && adminName==null}">


					<li class="nav-item"><a class="nav-link" href="login">Login</a>
					</li>
					<li class="nav-item"><a class="nav-link" href="register">Register</a>
					</li>

				</c:if>


				<c:if test="${ userName==null && adminName!=null}">

					<li class="nav-item"><a class="nav-link" href="categoryPage">Category
							Management</a></li>


					<li class="nav-item"><a class="nav-link" href="product">
							Product Management</a></li>

					<li class="nav-item"><a class="nav-link" href="supplier">Suppliers</a>
					</li>


					<li class="nav-item"><a class="nav-link" href="orderList">OrderList</a>
					</li>

					<li class="nav-item"><a class="nav-link" href="user">UserList</a>  
					</li>




				</c:if>

				<c:if test="${ userName!=null && adminName==null}">

					<li>
					<li class="nav-item"><a class="nav-link" href="editProfile">EditProfile</a>
					</li>

					<li>
					<li class="nav-item"><a class="nav-link" href="cartList">CartList</a>
					</li>

				</c:if>


                <c:if test="${userName!=null || adminName!=null }">
					<li class="nav-item"><a class="nav-link" href="logOut" >${userName}=LogOut</a></li>

				</c:if>
				<li class="nav-item"><a class="nav-link" href="contactUs">Contact</a></li>
			</ul>
		</div>
	</div>
</nav>
