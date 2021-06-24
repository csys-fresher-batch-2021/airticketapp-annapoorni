<%@page import="java.util.List"%>
<%@page import="in.poorni.model.Seat"%>
<%@page import="in.poorni.dao.SeatDao"%>
<%@page import="java.time.LocalDate"%>
<%@page import="in.poorni.model.Flight"%>
<%@page import="in.poorni.dao.FlightDao"%>
<%@page import="in.poorni.services.FlightService"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="ISO-8859-1">
<title>FlightApp - Add Passengers details</title>
</head>
<body>

	<jsp:include page="header.jsp"></jsp:include>
	<main class="main">
		<form action="BookTicketServlet" method="get">
			<h1>Booking Details</h1>
			<br /> <label for="flightId">Flight Id:</label> <input type="text"
				name="flightId" id="flightId" value="<%=request.getParameter("flightId")%>"
				readonly /> <br /> <br /> <label for="username">Passenger
				Name:</label> <input type="text" name="username" id="username" required autofocus /> <br />
			<br /> <label for="bookingDate">Booking Date:</label> <input
				type="date" name="bookingDate" id="bookingDate" placeholder="Enter booking date"
				min="<%=LocalDate.now()%>" required autofocus /> <br /> <br /> <label
				for="coach">Select your coach:</label> <select name="coach"
				id="coach">
				<%
				SeatDao seatDao = new SeatDao();
				List<Seat> seatList = seatDao.getSeatDetails();
				for (Seat seat : seatList) {
					
				%>
				<option value="<%=seat.getCoach()%>"><%=seat.getCoach()%></option>
				<%
				}
				%>
				
			</select>
			<button onclick ="GetBookedTickets()">Get Available Tickets</button>
			 <br>
			<br /> <label for="numberOfPassengers">Number of passengers:</label>
			<input type="number" id="numberOfPassengers"
				name="numberOfPassengers"  min="0" max="8"
				placeholder="Enter passengers count" oninput="calc()" required autofocus /> <br />
			<br />
			<%
			String flightId = request.getParameter("flightId");
			FlightDao flightDao = new FlightDao();
			Flight flight = flightDao.getRecordById(flightId);
			int businessClassRate = flight.getBusinessClass();
			int economyClassRate = flight.getEconomyClass();
			int firstClassRate = flight.getFirstClass();
			%>
			<label for="availableSeat" >Available seats : </label> 
			<input type="number" id="seat"  readonly>
			<input type="hidden" id="firstClassPrice"
				value="<%=firstClassRate%>" readonly /> <br /> <br /> <input
				type="hidden" id="economyClassPrice" value="<%=economyClassRate%>"
				readonly /> <br /> <br /> <input type="hidden"
				id="businessClassPrice" value="<%=businessClassRate%>" readonly />
			<br /> <br /> <label for="price">Price:</label> <input
				type="number" id="price" name="price" readonly /> <br /> <br />
			<div style="text-align: center">
			<button type="submit">Book</button>
			</div>
			 
			</form>  
			 </main>
	<script>
		function calc() {
			event.preventDefault();
			let coach = document.getElementById("coach").value;
			let numberOfPassengers = document.getElementById("numberOfPassengers").value;
			let economyClassPrice = document.getElementById("economyClassPrice").value;
			let businessClassPrice = document.getElementById("businessClassPrice").value;
			let firstClassPrice = document.getElementById("firstClassPrice").value;
			let price = 0;
			switch (coach) {
			case "First Class": {
				price = numberOfPassengers * firstClassPrice;
				document.getElementById("price").value = price;
				break;
			}
			case "Economy Class": {
				price = numberOfPassengers * economyClassPrice;
				document.getElementById("price").value = price;
				break;
			}
			case "Business Class": {
				price = numberOfPassengers * businessClassPrice;
				document.getElementById("price").value = price;
				break;
			}
			}
		}		
		function GetBookedTickets(){
			event.preventDefault();
			let coach = document.getElementById("coach").value;
			let flightId=document.getElementById("flightId").value;
			let bookingDate=document.getElementById("bookingDate").value;
			let name=document.getElementById("username").value;
			console.log(coach);
			const queryParams = "?coach=" + coach + "&flightId=" + flightId + "&bookingDate="+ bookingDate +"&name=" + name;
			let url = "GetBookedTickets" + queryParams ;	
			console.log(url);
			fetch(url).then(res => res.json()).then((out) => {
				console.log(out);
				
				let ticketsAvailable=0;
				if(coach=="First Class"){
					 ticketsAvailable = 200;
					}else if(coach=="Economy Class"){
						ticketsAvailable = 50;
					}else if(coach=="Business Class"){
						ticketsAvailable = 50;
					}
				if(out!=0){
					ticketsAvailable=ticketsAvailable-out;
				}
				console.log(ticketsAvailable);
				document.querySelector("#seat").value=ticketsAvailable;
			}).catch(err=> {console.log(err);});
			

		}
		
	</script>
</body>
</html>