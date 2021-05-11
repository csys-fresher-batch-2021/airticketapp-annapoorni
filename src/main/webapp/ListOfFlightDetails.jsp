
<%@page import="in.poorni.airlineapp.flightDetails"%>
<%@page import="java.awt.DisplayMode"%>
<%@page import="in.poorni.airlineapp.Flight"%>
<%@page import="in.poorni.airlineapp.Source"%>

<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
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
					<th>S.no</th>
					<th>Flight Names</th>
				</tr>
			</thead>
			<tbody>
<%
ArrayList<Flight> typesOfFlight=flightDetails.getNumberOfFlight();


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