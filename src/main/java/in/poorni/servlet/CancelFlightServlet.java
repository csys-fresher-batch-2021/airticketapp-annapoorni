package in.poorni.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import in.poorni.services.FlightBookingService;
/**
 * Servlet implementation class AdminAppointmentFixing
 */
@WebServlet("/CancelFlightServlet")
public class CancelFlightServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			int bookingId = Integer.parseInt(request.getParameter("bookingId"));
			int status = Integer.parseInt(request.getParameter("status"));
			
			FlightBookingService flightBookingService = new FlightBookingService();
			flightBookingService.updateBooking(bookingId,status);
			response.sendRedirect("Home.jsp");
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} 
	}
}



