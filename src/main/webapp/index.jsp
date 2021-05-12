<html>
<head>
<title>MyApp</title>
</head>
<body>
	<jsp:include page="header.jsp"></jsp:include>
	<main class="container-fluid">
		<h3>Welcome To Project</h3>
		<h3>Login to view flight details</h3>


	<form>
		<div class="container">
			<label>Username : </label> <input type="text" placeholder="Enter Username" name="username" required><br>
			<label>Password : </label> <input type="password" placeholder="Enter Password" name="password" required><br>
			<button type="submit">Login</button><br>
			<a href = "ListOfFlightDetails.jsp">click me
			</a>
			</div>
	</form>
		
		
		
	</main>
</body>
</html>
