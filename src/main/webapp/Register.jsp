<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="ISO-8859-1">
<title>Register</title>

</head>
<body>
	<jsp:include page="header.jsp"></jsp:include>
	<main class="container-fluid">
		<form action="AddUserServlet" method="get">
			<h1>New user Registration</h1>
			<br />
					<label for="username">Username:</label> <input type="text"
						name="username" pattern="[A-Za-z\s]{3,20}"
						placeholder="Enter User name" required autofocus /> <br /> 
						<label for="age"> Age: </label> <input type="number" id="age"
						name="age" placeholder="Enter your age" required autofocus>
					<br> <label for="password">Password:</label> <input
						type="password" name="password" placeholder="Enter new password"
						required autofocus /> <br />
						<label for="phoneNumber">Phone number:</label> <input type="number"
						id="phoneNumber" name="phoneNumber" pattern="[789][0-9]{9}">
					<br /> <label for="email">Email:</label> <input type="email"
						id="email" name="email" placeholder="Enter email address" required
						autofocus /> <br /> <br /> <label for="gender">Gender:</label>
					<br /> <input type="radio" name="gender" value="male">
					Male <input type="radio" name="gender" value="female">
					Female <input type="radio" name="gender" value="other">
					Other<br />
					<label for="address">Address:</label> <input type="text"
						name="address"
						placeholder="Enter address" required autofocus /> <br />
				
			<div style="text-align: center">
				<button type="Submit">Sign Up</button>
			</div>
		</form>
	</main>
	
</body>
</html>