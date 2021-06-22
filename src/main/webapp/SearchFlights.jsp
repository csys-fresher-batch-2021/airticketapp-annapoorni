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
<style>


input {
	width: 20% !important;
}
</style>
</head>
<body>

	<jsp:include page="header.jsp"></jsp:include>
	<main class="main">
		<h1>List of Flight</h1>
		<form action="SearchFlightServlet" method="get">
			<div class="row">
				<div class="col-md-12">

					<label for="search"><h5>
							Source name:
							</h3></label> <input type="text" name="SourceName"
						placeholder="Search source name" /> <label for="search"><h5>
							Destination name:
							</h3></label> <input type="text" name="DestinationName"
						placeholder="Search Destination name" />
						<button>Search</button>
				</div>
			</div>
		</form>



		<p>Note : search flight details</p>
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
					<td><%=flight.getFirstClass()%></td>
					<td><%=flight.getEconomyClass()%></td>
					<td><%=flight.getBusinessClass()%></td>

				</tr>
				<%
				}
				%>
			</tbody>
		</table>
		<br />
	</main>
</body>
</html>