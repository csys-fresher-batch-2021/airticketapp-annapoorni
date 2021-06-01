<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:include page="header.jsp"></jsp:include>
	<main class="container-fluid">
	
	<h3>Add Admin</h3>
	<a href="AddAdmin.jsp">ADD ADMIN</a>
	<br>
	<br>
		<h3>Add NEw FlightName</h3>
		
		<form action="AddFlightServlet" method="post">
		<label for="flightName">Flight Name</label>
		<input type="text" name="flightName" placeholder="Enter flight Name" required autofocus />
		<br>
		<br/>
		<button type="submit" class="btn btn-primary">ADD</button>
		</form>
		<!-- -- <br>
		<h3>Delete Flight</h3>
		<br>
		
		<a href="DeleteLoan.jsp">Delete Flight</a>
	--->
	
</main>
</body>
</html>