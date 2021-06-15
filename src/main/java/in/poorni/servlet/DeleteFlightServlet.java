package in.poorni.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import in.poorni.services.FlightService;
/**
 * Servlet implementation class DeleteDoctorServlet
 */
@WebServlet("/DeleteFlightServlet")
public class DeleteFlightServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		try {
			String flightId = request.getParameter("flightId");
			FlightService flightService = new FlightService();
			boolean isDeleted = flightService.deleteFlight(flightId);
			if (isDeleted) {
				response.sendRedirect("ListOfFlightDetails.jsp");
			} else {
				String errorMessage = "Unable to delete flight";
				response.sendRedirect("ListOfFlightDetails.jsp?errorMessage " + errorMessage);
			}
		} catch (Exception e) {
			e.printStackTrace();
			response.sendRedirect("ListOfFlightDetails.jsp?errorMessage=" + e.getMessage());
		}
	}
}


