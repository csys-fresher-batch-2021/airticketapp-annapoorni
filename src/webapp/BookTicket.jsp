<%@page import="java.time.LocalTime"%>
<%@page import="in.poorni.Model.Flight"%>
<%@page import="in.poorni.services.FlightService"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="ISO-8859-1">
<title>List of Flight</title>
</head>
<body>
<%
String loggedInAsAdmin = (String) session.getAttribute("LOGGED_IN_ADMIN");
String loggedInAsUser = (String) session.getAttribute("LOGGED_IN_USER");
String role = (String) session.getAttribute("ROLE");
%>

	<jsp:include page="header.jsp"></jsp:include>
	<main class="main">
		<h1>List of Available Flights</h1>

		<p>Note : Flight availability details</p>
		<table class="table table-bordered">
			<caption>List of Available Flights</caption>
			<thead>
				<tr>
					<th scope="col">S.no</th>
					<th scope="col">Flight Id</th>
					<th scope="col">Flight name</th>
					<th scope="col">Departure Time</th>
					<th scope="col">Departing From</th>
					<th scope="col">Departing To</th>
				<%
			if (loggedInAsUser != null) {
			%>
					<th scope= "col">Book Ticket </th>
				<%}
				%>
				</tr>
			</thead>
			<tbody>
				<%
				LocalTime currentTime = LocalTime.now();
				FlightService flightService = new FlightService();
				List<Flight> flightInfo = flightService.getFlights();
				
				int i = 0;
				for (Flight flight : flightInfo) {
					i++;
					LocalTime flightTime = flight.getDepartureTime();
					if(flightTime.isAfter(currentTime)){
				%>
				<tr>
					<td><%=i%></td>
					<td><%=flight.getFlightId()%></td>
					<td><%=flight.getAirlines()%></td>
					<td><%=flight.getDepartureTime()%></td>
					<td><%=flight.getDepartingFrom()%></td>
					<td><%=flight.getDepartingTo()%></td>
				<%
			if (loggedInAsUser != null) {
			%>
					<td><a href="AddPassenger.jsp?flightId=<%=flight.getFlightId() %>" class="btn btn-primary">BOOK NOW</a></td>
				</tr>
				<% } %>
				<%
					}}
				%>
			</tbody>
		</table>
		<br />
	</main>
</body>
</html>