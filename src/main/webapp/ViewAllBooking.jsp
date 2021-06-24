<%@page import="java.time.LocalDate"%>
<%@page import="in.poorni.dao.FlightBookingDao"%>
<%@page import="java.time.LocalTime"%>
<%@page import="in.poorni.model.FlightBooking"%>
<%@page import="java.util.List"%>
<%@page import="in.poorni.model.Flight"%>
<%@page import="in.poorni.dao.FlightDao"%>
<%@page import="in.poorni.services.FlightBookingService"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
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
				<tr>
					<th scope="col">Booking ID</th>
					<th scope="col">Passenger name</th>
					<th scope="col">Flight ID</th>
					<th scope="col">Airlines</th>
					<th scope="col">Number of Passenger</th>
					<th scope="col">Departing Time</th>
					<th scope="col">Departing Date</th>
					<th scope="col">Coach</th>
					<th scope="col">Price</th>
				<%
			if (loggedInAsAdmin != null) {
			%>
					<th scope="col"> Status </th>

				<%}
				%>
				</tr>			
				
							
			</thead>
			<tbody>

				<%
				
				List<FlightBooking> bookingInfo = (List<FlightBooking>) request.getAttribute("bookings");
				for(FlightBooking flightBooking : bookingInfo){
					String flightId = flightBooking.getFlightId();
					FlightDao flightDao = new FlightDao();
					Flight flight = flightDao.getRecordById(flightId);
					String airlines = flight.getAirlines();
					LocalTime DepartingTime = flight.getDepartureTime();
				%>
				<tr>
				
				    <td><%=flightBooking.getBookingId()%></td>
					<td><%=flightBooking.getUsername()%></td>
					<td><%=flightBooking.getFlightId()%></td>
					<td><%=airlines%>
					<td><%=flightBooking.getNumberOfPassengers()%></td>
					<td><%=DepartingTime%></td>
					<td><%=flightBooking.getBookingDate()%></td>
					<td><%=flightBooking.getCoach()%></td>
					<td><%=flightBooking.getPrice()%></td>
					<% 
						if(flightBooking.getStatus() == 0){
			     	%>
			     	<td>
			     	<span class="badge badge-primary">Booked</span>
			     	  </td>
			     	  <% }else{ %>
			     	  <td>
			     	<span class="badge badge-danger">Cancelled</span>
			     	  </td>
					<%}
			     	  }
				%>
					</tr>

							
			</tbody>
			
		</table>
		<a href="Home.jsp" class= "btn btn-primary">HOME</a>
		<br />
	</main>
</body>
</html>