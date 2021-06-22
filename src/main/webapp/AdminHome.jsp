<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Airline Reservation System</title>
<style>
#header {
    background-color:#A7C942;
    color:white;
    text-align:center;
    padding:6px;
}
#nav {
    line-height:30px;
    background-color:#eeeeee;
    height:450px;
    width:200px;
    float:left;
    padding:5px;	      
}
#section {
    width:800px;
    float:left;
    padding:50px;	 	 
}

</style>
</head>
<body>
<form>
	<div id="header">
	<h1>Airline Reservation System</h1>
	</div>
	<div id="nav">
	<a href="ListOfFlightDetails.jsp">Flight List</a><br>
	<a href="AddFlight.jsp">Add an Airplane</a><br>
	<a href="adminreports.jsp">Reports</a><br>
	<a href="Login.jsp">Logout</a><br>
	</div>
</form>
</body>
</html>
