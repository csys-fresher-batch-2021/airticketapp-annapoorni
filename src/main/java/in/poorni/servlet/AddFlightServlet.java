package in.poorni.servlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import in.poorni.Model.AddFlightModel;
import in.poorni.services.AddFlightService;

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
		boolean isValid=false;
		String addFlight = request.getParameter("flightName");
		String adddFlightTime = request.getParameter("flightTime");
	    AddFlightModel newFlight = new AddFlightModel(addFlight, addFlight);
	    AddFlightModel newTime=new AddFlightModel(adddFlightTime,adddFlightTime);

		try {
			isValid = (AddFlightService.addFlight(newFlight) && AddFlightService.adddFlightTime(newTime));
			isValid=true;
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if (isValid) {
			response.sendRedirect("ListOfFlightDetails.jsp");
		} else {
			String errorMessage = "Already exists";
			response.sendRedirect("AddFlight.jsp?errorMessage=" + errorMessage);
		}
	}
}