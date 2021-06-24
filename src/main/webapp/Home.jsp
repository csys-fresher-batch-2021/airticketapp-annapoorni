<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Airlines | Home</title>
<style>
body {
	background-image: url("image/bg7.jpg");
	background-repeat: repeat;
	background-size: cover;
	background-position:top;
}
form {
	border: 5px solid #000 !important;
	padding: 10px ;
	margin-left: 25% !important;
	margin-top: 6% !important;
	width: 400px;
	background-color: #FFFFFF !important;
	opacity: 0.9;
}

.btn-primary{
	cursor : pointer;
	width: 50%;
	margin-left: auto;
	margin-right:auto;
	padding: 50px;
	font-size: 28px;
	height: 50px;
}

#buttons{
	margin-left: 35%;
	margin-right: 50px;
}
</style>

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
<div id="buttons">
		<%
			if (loggedInAsAdmin != null && role != null) {
			%>
			<a href="ListOfFlightDetails.jsp" class="btn btn-primary"> List of Flights
			</a> <br/ > <br /> 
		
			<a href="ViewAllFlightBookingServlet" class="btn btn-primary">
				View booking details </a> <br/ > <br /> 			
			<%
			}else{
			%>
		
				<a href="ListOfFlightDetails.jsp" class="btn btn-primary"> List of Flights
						</a> <br/ > <br /> <a href="SearchFlights.jsp"
							class="btn btn-primary">Search Flight </a> <br/ > <br />
						<a href="BookTicket.jsp"
							class="btn btn-primary">Book Ticket </a> <br/ > <br />
						<a href="ViewBookingServlet" class="btn btn-primary">
							View booking details </a> <br/ > <br /> <
			<% 
			}		
			%>
	</div>
</main>
</body>
</html>