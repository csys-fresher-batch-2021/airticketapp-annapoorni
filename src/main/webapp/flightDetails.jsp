<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<title>MyApp</title>
</head>
<body>
	<jsp:include page="header.jsp"></jsp:include>
	<main class="container-fluid">
<h3>Here is your flight details</h3>
<style>
table, th, td {
  border: 1px solid black;
  border-collapse: collapse;
}
th, td {
  padding: 5px;
  text-align: left;
}
</style>
</head>
<body>

<table style="width:100%">
  <tr>
    <th><h4>Flights Name</h4></th>
    <th><h4>From where</h4></th>
    <th><h4>To where</h4></th>
    <th><h4>Deparure Date</h4></th>
    <th><h4>Departure time</h4></th>

  </tr>
  <tr>
    <td>Indigo</td>
    <td>coimbatote</td>
    <td>chennai</td>
    <td>05-07-2021</td>
    <td>02:00</td>
  </tr>
  <tr>
    <td>Spicejet</td>
    <td>chennai</td>
    <td>coimbatore</td>
    <td>08-07-2021</td>
    <td>15:00</td>
  </tr>
   <tr>
    <td>Air india</td>
    <td>cochin</td>
    <td>coimbatore</td>
    <td>11-07-2021</td>
    <td>01:00</td>
  </tr>
   <tr>
    <td>AirAsia India</td>
    <td>Mumbai</td>
    <td>chennai</td>
    <td>08-07-2021</td>
    <td>15:00</td>
  </tr>
   <tr>
    <td>GoAir</td>
    <td>banglore</td>
    <td>coimbatore</td>
    <td>08-07-2021</td>
    <td>15:00</td>
  </tr>
</table>

</main>
</body>
</html>