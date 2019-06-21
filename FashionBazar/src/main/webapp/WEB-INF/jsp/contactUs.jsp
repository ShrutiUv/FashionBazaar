<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Contact Us</title>

<!-- Bootstrap core CSS -->
<link href="resources/css/bsmin.css" rel="stylesheet">

<!-- Custom styles for this template -->
<link href="resources/css/myApp.css" rel="stylesheet">
<!-- jQuery library -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>

<!--     <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css"> -->

<style>
.padding-4 {
	padding: 0px 120px;
    background-color:skyblue;
    margin:0px;
    
}

.padding-2 {
	padding: 0px 20px;
}

.padding-7
{
   padding-bottom:30px;
/* padding:30px; */
}

.padding-10
{
   padding-top:30px;
   padding-bottom:180px;
 }
 
body
{
  background-color:skyblue;  
}
</style>

</head>
<body>
	<jsp:include page="navBar.jsp"></jsp:include>

	<div class="container-fluid padding-10">
		<form action="sendContact" method="post">
			<div class="padding-4">

				<p>
					<span class="glyphicon glyphicon-map-marker"></span> Mumbai, India
				</p>
				<p>
					<span class="glyphicon glyphicon-phone"></span> +91 4455667788
				</p>
				<p>
					<span class="glyphicon glyphicon-envelope"></span> onlineshopping@abc.com
				</p>
			</div>
		<div class="padding-4 padding-7" >
			<p class="padding-2">
				Hello ! How are you doing today? <br>Mail us and we'll get back
				to you within 48 hours. <br>Thanks.
			</p>

			<p>
				<input type="text" placeholder="Name"  name="Name">
			</p>
			<p>
				<input type="text" placeholder="Email" name="Email">
			</p>
			<p>
				<textarea col="20" rows="5" placeholder="Comment" >

				</textarea>
			</p>
			<button type="submit" class="btn btn-primary">Send</button>

		</div>
		
		<script type="text/javascript">
		$(document).ready(function(){
			$("input").attr('required','required');
		});
		</script>
		
		</form>
			 <jsp:include page="footer.jsp"></jsp:include>
		
	</div>
</body>
</html>