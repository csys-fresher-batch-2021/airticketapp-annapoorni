<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="ISO-8859-1">
<title>Airline user | Login</title>
<link rel="stylesheet" href="css/style.css">
<style>
body {
	background-image: url("image/bg1.jpg");
	background-repeat: repeat;
	background-size: cover;
}
form {
	
	padding: 10px ;
	margin-left: 60% !important;
	margin-top: 5% !important;
	width: 300px;
	background-color: #FFFFFF !important;
	opacity: 0.9;
}
button {
	padding: 10px 12px;
	text-align: center;
	text-decoration: none;
	display: inline-block;
	font-size: 12px;
	margin: 4px 2px;
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

#Login{
	color: black;
	
	text-align: center;
	 
}
input{
	width: 100%;
}
</style>
</head>
<body>
	<%
	String loggedInUsername = (String) session.getAttribute("LOGGED_IN_USER");
	%>
	<jsp:include page="LoginHeader.jsp"></jsp:include>
	<main class="main">
		<form action="LoginServlet" method="post">
		<div id="Login">
			<h1>User Login</h1>
		</div>
			<br>  <input
				type="text" id="username" name="username"
				placeholder="Enter the user name" required autofocus> <br><br />
				 <input
				type="password" id="password" name="password" required autofocus>
			 <br><br />
			 
			 <div style="text-align: center">
				<button type="Submit">Submit</button>
				<p>Don't have an account? <a href="Register.jsp">Sign Up </a></p>
			</div>
		</form>
	</main>
</body>
</html>
