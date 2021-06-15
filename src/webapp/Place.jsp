<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="ListOfFlightDetails.jsp">
  <label for="From">Enter From Location:</label>
  <select name="From" id="From">
    <option value="Coimbatore">Coimbatore</option>
    <option value="Cochin">Cochin</option>
    <option value="Thiruvanandhapuram">Thiruvanandhapuram</option>
    <option value="Thirchirappali">Thirchirappali</option>
    <option value="Banglore">Banglore</option>
    <option value="Tirupati">Tirupati</option>
    <option value="Kashmir">Kashmir</option>
    <option value="Tuticorin">Tuticorin</option>
    <option value="Calicut">Calicut</option>
    <option value="Kannur">Chennai</option>
  </select>
  <br><br>
  <label for="To">Enter To Location:</label>
  <select name="To" id="To">
    <option value="Mumbai">Mumbai</option>
    <option value="Hyderabad">Hyderabad</option>
    <option value="Calcutta">Calcutta</option>
    <option value="Kashmir">Kashmir</option>
    <option value="Delhi">Delhi</option>
    <option value="Goa">Goa</option>
    <option value="Vijayawada">Vijayawada</option>
    <option value="Manglore">Manglore</option>
    <option value="Chandhigarh">Chandhigarh</option>
    <option value="Surat">Surat</option>
  </select>
  <input type="submit" value="Submit">
</form>

</body>
</html>