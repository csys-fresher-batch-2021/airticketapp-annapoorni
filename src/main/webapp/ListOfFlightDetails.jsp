
<%@page import="in.poorni.airlineapp.FlightDetails"%>
<%@page import="java.awt.DisplayMode"%>
<%@page import="in.poorni.airlineapp.Flight"%>

<%@page import="java.util.ArrayList"%>
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
	<h3>Flight Details</h3>
		<table class="table table-bordered">
			<thead>
				<tr>
					<th id="sno">S.no</th>
					<th id="flight">Flight Names</th>
				</tr>
			</thead>
			<tbody>
<%
ArrayList<Flight> typesOfFlight=FlightDetails.getNumberOfFlight();



int i=0;
for(Flight flightname:typesOfFlight){
	i++;

%>

				<tr>
					<td><%=i%>
					<td>
						<%=flightname.flightnames%>
					</td>
				</tr>

				<% }%>
						
</tbody>


</table>

</main>

</body>
</html>