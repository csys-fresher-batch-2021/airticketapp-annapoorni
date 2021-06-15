<%@page import="java.sql.Connection"%>
<%@page import="javax.servlet.jsp.jstl.sql.Result"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="org.apache.tomcat.util.net.ApplicationBufferHandler"%>
<%@page import="java.sql.DriverPropertyInfo"%>
<%@page import="in.poorni.Util.ConnectionUtil"%><%!  %>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<%
	Result resultset = null;
%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>SearchResults</title>
<style>
#table {
	font-family: Arial;
	width: 100%;
	border-collapse: collapse;
}
#table td, #able th {
	font-size: 14px;
	border: 2px solid ForestGreen;
	padding: 3px 7px 2px 7px;
}
#table th {
	font-size: 16px;
	color: ForestGreen;
	text-align: center;
	border: 2px solid ForestGreen;
	padding-top: 5px;
	padding-bottom: 4px;
	background-color: DarkSeaGreen;
}
#table tr.alt td {
	color: black;
	background-color: #EAF2D3;
}
</style>
</head>
<body>

	<form method="post">
	


		<%
		Connection connection = null;
		PreparedStatement pst = null;
		
		
			try {
				connection = ConnectionUtil.getConnection();
				String sql = "insert into flight_newdetails(flights) values(?),(time) values(?)";
				pst = connection.prepareStatement(sql);
				
				int FromAirport = (Integer)session.getAttribute("SesFromAirport");
				int ToAirport = (Integer)session.getAttribute("SesToAirport");
				String DepDate = (String)session.getAttribute("SesDepDate");
				String ArrDate = (String)session.getAttribute("SesArrDate");
				int NumberOfPassengers = (Integer)session.getAttribute("SesNumberOfPassengers");
				int TripType = (Integer)session.getAttribute("SesTripType");
				int SeatType = (Integer)session.getAttribute("SesSeatType"); %>




		<%
				 pst = connection.prepareCall("{call pr_FlightSearch(?,?,?,?,?,?,?)}");
				
							
					%>
		<%
				pst.setInt(1,FromAirport); 
				pst.setInt(2,ToAirport);
				pst.setString(3,DepDate);
				pst.setString(4,ArrDate);
				pst.setInt(5,NumberOfPassengers);
				pst.setInt(6,TripType);
				pst.setInt(7,SeatType);
				pst.execute();
				
				%>


		<table id="table">
			<tr>
				<th></th>
				<th>Flight Number</th>
				<th>Departure Time</th>
				<th>From</th>
				<th>Arrival Time</th>
				<th>To</th>
				<th>Seat Type</th>
				<th>Price</th>
				<th>Depature Date</th>
				<th>Arrival Date</th>


			</tr>
			<%while (resultset.next()) { %>

			<tr>
				<td><button type="button" value=<%= resultset.getString(10) %>>Select</button>
				</td>
				<td><%= resultset.getString(3) %></td>
				<td><%= resultset.getString(7) %></td>
				<td><%=resultset.getString(4) %></td>
				<td><%= resultset.getString(6) %></td>
				<td><%= resultset.getString(5) %></td>
				<td><%= resultset.getString(2) %></td>
				<td><%= resultset.getString(1) %></td>
				<td><%= resultset.getString(9) %></td>
				<td><%= resultset.getString(8) %></td>


			</tr>
			<%}%>
		</TABLE>
		<%if(TripType == 2)
			{
				pst = connection.prepareCall("{call pr_FlightSearch(?,?,?,?,?,?,?)}");%>
				
							
					
		<%
				pst.setInt(1,ToAirport); 
				pst.setInt(2,FromAirport);
				pst.setString(3,ArrDate);
				pst.setString(4,DepDate);
				pst.setInt(5,NumberOfPassengers);
				pst.setInt(6,TripType);
				pst.setInt(7,SeatType);
				pst.execute();
				
				ArrDate=%>


		<table id="table">
			<tr>
				<th></th>
				<th>Flight Number</th>
				<th>Departure Time</th>
				<th>From</th>
				<th>Arrival Time</th>
				<th>To</th>
				<th>Seat Type</th>
				<th>Price</th>
				<th>Depature Date</th>
				<th>Arrival Date</th>


			</tr>
			<%while (resultset.next()) { %>

			<tr>
				<td><button type="button" value=<%= resultset.getString(10) %>>Select</button></td>
				<td><%= resultset.getString(3) %></td>
				<td><%= resultset.getString(7) %></td>
				<td><%=resultset.getString(4) %></td>
				<td><%= resultset.getString(6) %></td>
				<td><%= resultset.getString(5) %></td>
				<td><%= resultset.getString(2) %></td>
				<td><%= resultset.getString(1) %></td>
				<td><%= resultset.getString(9) %></td>
				<td><%= resultset.getString(8) %></td>


			</tr>
			<%}%>
		</TABLE>
			<%
			}
		 catch (Exception e)
		 { // TODO Auto-generated catch block
				e.printStackTrace();
		 }
		%>



	</form>

</body>
</html>
