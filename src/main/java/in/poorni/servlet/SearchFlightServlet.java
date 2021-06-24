package in.poorni.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import in.poorni.model.Flight;
import in.poorni.dao.FlightDao;


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
			String sourceName = request.getParameter("SourceName");
			String destinationName = request.getParameter("DestinationName");
			FlightDao flightDao = new FlightDao();
			flightDao.searchBySourceAndDestinationName(sourceName,destinationName);
			request.setAttribute("sourceName", sourceName);
			request.setAttribute("destinationName", destinationName);
			
			request.getRequestDispatcher("DisplaySearchFlight.jsp?").forward(request, response);
		    
		} catch (Exception e) {
			e.printStackTrace();
		} 
		}
}