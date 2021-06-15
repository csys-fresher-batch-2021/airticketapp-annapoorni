package in.poorni.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import in.poorni.Model.Flight;
import in.poorni.services.FlightService;

/**
 * Servlet implementation class SearchPatientServlet
 */
@WebServlet("/SearchFlightServlet")
public class SearchFlightServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    @Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			String searchName = request.getParameter("search");
		    FlightService flightService = new FlightService();
			Flight flightName = flightService.searchFlight((searchName).toUpperCase());
			request.setAttribute("flightName", flightName);
			request.getRequestDispatcher("DisplaySearchFlight.jsp").forward(request, response);
		} catch (Exception e) {
			e.printStackTrace();
		} 
		}
}