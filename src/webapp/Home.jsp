<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Airlines | Home</title>
</head>
<body>
<%
String loggedInAsAdmin = (String) session.getAttribute("LOGGED_IN_ADMIN");
String loggedInAsUser = (String) session.getAttribute("LOGGED_IN_USER");
String role = (String) session.getAttribute("ROLE");
%>
	<jsp:include page="header.jsp"></jsp:include>
	<main class="main">
<br>
		<%
			if (loggedInAsAdmin != null && role != null) {
			%>
			<a href="ListOfFlightDetails.jsp" class="btn btn-primary"> List of Flights
			</a> <br/ > <br /> 
			<a href="#"
				class="btn btn-primary">  Fix Ticket booking </a> <br/ > <br />
			<a href="#" class="btn btn-primary">
				View booking details </a> <br/ > <br /> 			
			<%
			}else{
			%>
		
				<a href="ListOfFlightDetails.jsp" class="btn btn-primary"> List of Flights
						</a> <br/ > <br /> <a href="SearchFlights.jsp"
							class="btn btn-primary">Search Flight </a> <br/ > <br />
						<a href="#"
							class="btn btn-primary">Book Ticket </a> <br/ > <br />
						<a href="#" class="btn btn-primary">
							View booking details </a> <br/ > <br /> <a
							href="#" class="btn btn-primary"> Cancel booking </a> <br/ >
			<% 
			}		
			%>

</main>
</body>
</html>