<%@page import="java.time.LocalTime"%>
<%@page import="in.poorni.Model.FlightBooking"%>
<%@page import="java.util.List"%>
<%@page import="in.poorni.Model.Flight"%>
<%@page import="in.poorni.dao.FlightDao"%>
<%@page import="in.poorni.services.FlightBookingService"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>View Bookings</title>
</head>
<body>
<%
String loggedInAsAdmin = (String) session.getAttribute("LOGGED_IN_ADMIN");
String loggedInAsUser = (String) session.getAttribute("LOGGED_IN_USER");
String role = (String) session.getAttribute("ROLE");
%>

	<jsp:include page="header.jsp"></jsp:include>
	<main class="main">
		<h1>View Bookings</h1>
		
		<table class="table table-bordered">
			<caption>List of Flights Booked</caption>
			<thead>
			<tr><td>Particulars</td><td>Details</td></tr>				
			</thead>
			<tbody>
			
				<%
				FlightBooking flightBooking=(FlightBooking)request.getAttribute("BOOKING_DETAILS");
				FlightDao flightDao = new FlightDao();
				
				
				%>
				
					<tr><td>Flight Id</td>
					<td><%=flightBooking.getFlightId()%></td></tr>
					<tr><td>Booked Person Name</td>		
					<td><%=flightBooking.getUsername() %></td></tr>
					<tr><td>Number Of Passengers</td>
					<td><%=flightBooking.getNumberOfPassengers()%></td></tr>
					<tr><td>Booking date</td>
					<td><%=flightBooking.getBookingDate()%></td></tr>
					<tr><td>Coach</td>
					<td><%=flightBooking.getCoach()%></td></tr>
					<tr><td>Total Price</td>
					<td> Rs. <%=flightBooking.getPrice()%></td></tr>
				
			</tbody>
			
		</table>
		<a href="Home.jsp" class= "btn btn-primary">HOME</a>
		<br />
	</main>
</body>
</html>