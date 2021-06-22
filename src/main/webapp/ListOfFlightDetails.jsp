<%@page import="in.poorni.model.Flight"%>
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
	<main class="container-fluid">
		<h1>List of Flight</h1>
		<%
			if (loggedInAsAdmin != null && role != null) {
			%>
		<a href="AddFlight.jsp" class="btn btn-primary">Add Flights</a><br/>
		<br />
		<% } %>
		<%
		if(loggedInAsUser != null){
		%>
		<a href="BookTicket.jsp" class="btn btn-primary">Book Now</a><br/>
		<br/>
		<%} %>

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
					<th scope="col">First Class</th>
					<th scope="col">Economy Class</th>
					<th scope="col">Business Class</th>
				<%
			if (loggedInAsAdmin != null && role != null) {
			%>
					<th scope= "col"> Edit </th>
					<th scope="col"> Delete</th>
				<%}
				%>
				</tr>
			</thead>
			<tbody>
				<%
				FlightService flightService = new FlightService();
				List<Flight> flightInfo = flightService.getFlights();
				int i = 0;
				for (Flight flight : flightInfo) {
					i++;
					
				%>
				<tr>
					<td><%=i%></td>
					<td><%=flight.getFlightId()%></td>
					<td><%=flight.getAirlines()%></td>
					<td><%=flight.getDepartureTime()%></td>
					<td><%=flight.getDepartingFrom()%></td>
					<td><%=flight.getDepartingTo()%></td>
					<td>&#8377; <%=flight.getFirstClass()%></td>
					<td>&#8377; <%=flight.getEconomyClass()%></td>
					<td>&#8377; <%=flight.getBusinessClass()%></td>
				<%
			if (loggedInAsAdmin != null && role != null) {
			%>
					<td><a href="EditFlightServlet?flightId=<%=flight.getFlightId() %>" class="btn btn-primary">Edit</a></td>
					<td><a href="DeleteFlightServlet?flightId=<%=flight.getFlightId() %>" class="btn btn-primary">Delete</a></td>
				</tr>
				<% } %>
				<%
				}
				%>
						
			</tbody>
		</table>
		<br />
	</main>
</body>
</html>