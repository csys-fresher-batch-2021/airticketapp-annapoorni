package in.poorni.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import in.poorni.model.FlightBooking;
import in.poorni.services.FlightBookingService;

/**
 * Servlet implementation class ViewAllAppointmentServlet
 */
@WebServlet("/ViewAllFlightBookingServlet")
public class ViewAllFlightBookingServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		try {
			FlightBookingService flightBookingService = new FlightBookingService();
			List<FlightBooking> bookings = flightBookingService.getAllBookingList();
			request.setAttribute("bookings", bookings);
			request.getRequestDispatcher("ViewAllBooking.jsp").forward(request, response);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
