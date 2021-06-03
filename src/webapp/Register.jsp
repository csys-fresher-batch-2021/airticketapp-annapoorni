<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<jsp:include page="header.jsp"></jsp:include>
	<main class="container-fluid">
		<form action="RegisterServlet" method="get">
			<h2>Register page</h2>
			<label for="name">Enter username</label> <input type="text"
				name="username" required> <br> <br> <label
				for="password">Enter password</label> <input type="password"
				name="password" required> <br> <br> <label
				for="email">Enter your Email</label> <input type="text" name="email"
				required> <br> <br> <label for="mobileno">Enter
				moblileNo</label> <input type="number" name="mobileno" required> <br>
			<br> <label for="age">Enter age</label> <input type="number"
				name="age" required> <br> <br> <label
				for="adhaarNo">Enter AdhaarNo</label> <input type="number"
				name="adhaarNo" required> <br> <br> <label
				for="address">Enter Address</label> <input type="text"
				name="address" required> <br> <br> <label
				for="pincode">Enter Pincode</label> <input type="number"
				name="pincode" required><br> <br>
			<%
			String errorMessage = request.getParameter("errorMessage");
			if (errorMessage != null) {
				out.println("<font color='green'>" + errorMessage + "</font>");
			}
			%>
			<br> <br>
			<button type="submit" class="btn btn-primary">Submit</button>
			<br> <br> <a href="Login.jsp">Login</a>

		</form>
	</main>
</body>
</html>