package in.poorni.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import in.poorni.dao.FlightBookingDao;
import in.poorni.services.FlightBookingService;
import in.poorni.Model.FlightBooking;
/**
 * Servlet implementation class ViewServlet
 * @param <FlightBooking>
 */

	@WebServlet("/ViewBookingServlet")
	public class ViewBookingServlet<FlightBooking> extends HttpServlet {
		private static final long serialVersionUID = 1L;
		/**
		 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
		 */
		@Override
		protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			HttpSession session = request.getSession();
			String username = (String) session.getAttribute("LOGGED_IN_USER");
			try {
				FlightBookingDao  flightBookingDao = new  FlightBookingDao();
				List<FlightBooking> bookingList = (List<FlightBooking>) flightBookingDao.getFlightBooking(username);
				request.setAttribute("bookingList", bookingList);
				RequestDispatcher requestDispatcher = request.getRequestDispatcher("ViewBooking.jsp");
				requestDispatcher.forward(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			} 
		}
}



