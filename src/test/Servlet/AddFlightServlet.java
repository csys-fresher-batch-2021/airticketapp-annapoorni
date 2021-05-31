package in.poorni.airlineapp;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AddFlightServlet
 */
@WebServlet("/AddFlightServlet")
public class AddFlightServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		
		String addFlight = request.getParameter("flightName");
		boolean isValid = AddFlight.addFlight(addFlight);
		if (isValid) {
			String message="Flight name is updated";
			response.sendRedirect("ListOfFlightDetails.jsp?message="+message);
			
		} else {
			String errorMessage = "Already exists";
			response.sendRedirect("ListOfFlightDetails.jsp?errorMessage=" + errorMessage);
		}
	}
	
	



}
