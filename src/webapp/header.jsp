<link rel="stylesheet" href="assets/css/bootstrap.min.css">
<link rel="stylesheet" href="assets/css/fontawesome.min.css">
<link rel="stylesheet" href="assets/css/style.css">
<header>
<% String loggedInUsername = (String)session.getAttribute("LOGGED_IN_USER");%>
<%out.println(loggedInUsername); %>
<% String role = (String) session.getAttribute("ROLE");%>
<% out.println(role);%>
<nav class="navbar navbar-expand-sm navbar-dark bg-dark">
  <a class="navbar-brand" href="Login.jsp">Air Line Reservation System</a>
  <button class="navbar-toggler d-lg-none" type="button" data-toggle="collapse" data-target="#collapsibleNavId" aria-controls="collapsibleNavId"
      aria-expanded="false" aria-label="Toggle navigation">
    <span class="navbar-toggler-icon"></span>
  </button>
  <div class="collapse navbar-collapse" id="collapsibleNavId">
    <ul class="navbar-nav mr-auto mt-2 mt-lg-0">
      <li class="nav-item active">
        <a class="nav-link" href="Login.jsp">Home <span class="sr-only">(current)</span></a>
      </li>
      <li class="nav-item active">
        <a class="nav-link" href="ListOfFlightDetails.jsp">Check Flights availability </a>
      </li>
    </ul>
     <ul class="navbar-nav ml-auto mt-2 mt-lg-0">
     <%if(role==null && loggedInUsername==null){ %>
      <li class="nav-item active">
        <a class="nav-link" href="Login.jsp">Login</a>
      </li>
      <%}else{ %>
      <li class="nav-item active">
        <a class="nav-link" href="LogoutServlet">Logout</a>
      </li>
      <%} %>
      </ul>
  </div>
</nav>
</header>


