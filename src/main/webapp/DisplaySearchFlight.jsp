<%@page import="in.poorni.model.Flight"%>
<%@page import="in.poorni.services.FlightService"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="ISO-8859-1">
<title>List of Search Flight</title>
</head>
<body>

	<jsp:include page="header.jsp"></jsp:include>
	<main class="main">
		<h1>List of Search Flight</h1>
		
		
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

				</tr>
			</thead>
			<tbody>
				<%
				FlightService flightService = new FlightService();
				String sourceName = (String) request.getAttribute("sourceName");
				String destinationName = (String) request.getAttribute("destinationName");
				List<Flight> flightList = flightService.searchFlight(sourceName, destinationName);
				for(Flight flight : flightList){
				int i = 1;
				if(flight!=null){
				%>
				<tr>
					<td><%=i%></td>
					<td><%=flight.getFlightId()%></td>
					<td><%=flight.getAirlines()%></td>
					<td><%=flight.getDepartureTime()%></td>
					<td><%=flight.getDepartingFrom()%></td>
					<td><%=flight.getDepartingTo()%></td>
					<td><%=flight.getFirstClass()%></td>
					<td><%=flight.getEconomyClass()%></td>
					<td><%=flight.getBusinessClass()%></td>
				
				</tr>
				<%
				}
				else{
					
				%>
				<h2> No records found</h2>
				<%
				}}
				%>
			</tbody>
		</table>
		<br />
	</main>
</body>
</html>