package in.poorni.servlet;

import java.io.IOException;
import java.time.LocalTime;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import in.poorni.model.Flight;
import in.poorni.services.FlightService;

/**
 * Servlet implementation class UpdateFlightServlet
 */
@WebServlet("/UpdateFlightServlet")
public class UpdateFlightServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		try {
			String flightId =request.getParameter("flightId");
			String airlines = request.getParameter("airlines");
			LocalTime departureTime = LocalTime.parse(request.getParameter("departureTime"));
			String departingFrom = request.getParameter("departingFrom");
			String departingTo = request.getParameter("departingTo");
			int firstClass = Integer.parseInt(request.getParameter("firstClass"));
			int economyClass = Integer.parseInt(request.getParameter("economyClass"));
			int businessClass = Integer.parseInt(request.getParameter("businessClass"));
			Flight flight = new Flight(flightId,airlines, departureTime,departingFrom,departingTo,firstClass,economyClass,businessClass);
			FlightService flightService = new FlightService();
			flightService.updateFlight(flight);
			response.sendRedirect("ListOfFlightDetails.jsp");
		} catch (Exception e) {
			e.printStackTrace();
			response.sendRedirect("UpdateFlight.jsp?errorMessage=" + e.getMessage());
		}
	}
}

