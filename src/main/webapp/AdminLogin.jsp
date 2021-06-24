<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="ISO-8859-1">
<title>Airline | Login</title>
<link rel="stylesheet" href="css/style.css">
<style>
body {
	background-image: url("image/bg3.jpg");
	background-repeat: repeat;
	background-size: cover;
}
form {

	padding: 10px ;
	margin-left: 10% !important;
	margin-top: 5% !important;
	width: 350px;
	background-color: #FFFFFF !important;
	opacity: 0.9;
}
#Login{
	color: black;
	background-color: blue;
}
button {
	padding: 10px 12px;
	text-align: center;
	text-decoration: none;
	display: inline-block;
	font-size: 12px;
	margin: 2px 2px;
	transition-duration: 0.4s;
	cursor: pointer;
	background-color: white;
	color: black;
	border: 2px solid #008CBA;
	width:30%;
}
a{
	cursor : pointer;
}
</style>
</head>
<body>
	
	<jsp:include page="LoginHeader.jsp"></jsp:include>
	<main class="main">
		<form action="AdminLoginServlet" method="post">
			<div id="Login">
			<h1>Admin Login</h1>
			</div>
			<br> <label for="username"> Username: </label> <input
				type="text" id="username" name="username"
				placeholder="Enter the user name" required autofocus> <br> <br />
			 <label for="password"> Password: </label> <input
				type="password" id="password" name="password" placeholder="Enter the Password" required autofocus>
			 <br> <br />
			 
			 <div style="text-align: center">
				<button type="Submit">Submit</button>
			</div>
		</form>
	</main>
</body>
</html>
