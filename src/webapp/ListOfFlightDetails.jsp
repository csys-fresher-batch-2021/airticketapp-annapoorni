<%@page import="in.poorni.Model.AddFlightTime"%>
<%@page import="in.poorni.services.FlightDetails"%>
<%@page import="in.poorni.Model.AddFlightModel"%>
<%@page import="in.poorni.services.FlightTime"%>


<%@page import="java.util.List"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="ISO-8859-1">
<title>Flight Availabilty Details</title>
<style>
.center {
	text-align: center;
	padding: 70px 0;
}
</style>
</head>
<body>
	<jsp:include page="header.jsp"></jsp:include>
	<main class="container-fluid">
		<div class="center">
			<h1>Available Flights</h1>
			<br>
			<table class="table table-bordered">
				<caption>----Flight list---</caption>
				<thead>
					<tr>
						<th scope="col">S.no</th>
						<th scope="col">flight Name</th>
						<th scope ="col">Flight Timing</th>
					</tr>
				</thead>
				<tbody>
					<%
					List<AddFlightModel> flightList = FlightDetails.getNumberOfFlight();

					int i = 0;
					for (AddFlightModel item :flightList ) {
						i++;
					%>
					<tr>
						<td><%=i%>
						<td><%=item.getFlight()%></td>
						<td><%=item.getAdddFlightTime() %>
					</tr>
					<%
					}
					%>
					</tbody>
					<tbody>
					
				</tbody>
			</table>
			
			<br> <br> <a href="index.jsp">back --</a> <a
				href="flight.jsp">next</a>
		</div>
	</main>
</body>
</html>
