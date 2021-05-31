<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
</head>
<body>
<jsp:include page="header.jsp"></jsp:include>
	<main class="container-fluid">
	<form action="AddFlightServlet" method="post">
		<h1>Login Page</h1>
		<label for="login">UserName</label> <input type="text" name="username"
			id="username" placeholder="username" required> <br> <br>
		<label for="password">Password</label> <input type="password"
			name="password" id="password" placeholder="password" required>
		<br> <br>
		<%
		String errorMessage = request.getParameter("errormessage");
		if (errorMessage != null) {
			out.println("<font color='red'>" + errorMessage + "</font>");
		}
		%>
		<br> <br>
		<button type="submit" class="btn btn-primary">Submit</button>
		
		<a href="AdminLogin.jsp">Admin</a>
	</form>
</main>
</body>
</html>