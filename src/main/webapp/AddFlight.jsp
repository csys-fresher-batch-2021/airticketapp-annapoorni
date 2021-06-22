<%@page import="java.time.LocalDate"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="ISO-8859-1">
<title>FlightApp - Add Flight</title>
</head>
<body>
	
	<jsp:include page="header.jsp"></jsp:include>
	<main class="main">
		<form action="AddFlightServlet" method = "get">
			<h1>Add Flight Details</h1>
			<br /> <label for="flightId">Flight Id:</label> <input type="text"
				name="flightId" 
				placeholder="@Example : air01" required autofocus /> <br /> <br /> <label
				for="airlines">Airlines :
				</label> <input type="text"
				name="airlines" pattern="[A-Za-z\s]{3,20}"
				placeholder="Enter Flight name" required autofocus /> <br /> <br />
				<label for="departureTime">Departure Time:</label>  <input type="time"
				name="departureTime"  required autofocus /> <br /> <br />
				<label for="departingFrom">Departing from:</label>  <input type="text"
				name="departingFrom" pattern="[A-Za-z\s]{3,20}"
				placeholder="Enter departing from" required autofocus /> <br /> <br />
				<label for="departingTo">Departing to:</label>  <input type="text"
				name="departingTo" pattern="[A-Za-z\s]{3,20}"
				placeholder="Enter departing to" required autofocus /> <br /> <br />
				<label for="firstClass">First Class Price:</label>  <input type="number"
				name="firstClass" 
				placeholder="Enter first class price" required autofocus /> <br /> <br />
				<label for="economyClass">Economy Class Price:</label>  <input type="number"
				name="economyClass" 
				placeholder="Enter economy class price" required autofocus /> <br /> <br />
				<label for="businessclass">Business Class Price:</label>  <input type="number"
				name="businessClass" 
				placeholder="Enter business class price" required autofocus /> <br /> <br />
			<br />
				<div style="text-align: center">
				<button>Submit</button>
			</div>
		</form>
	</main>
</body>
</html>


