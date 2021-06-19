package in.poorni.servlet;

import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalTime;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import in.poorni.Model.FlightBooking;
import in.poorni.services.FlightBookingService;
import in.poorni.services.FlightService;

/**
 * Servlet implementation class BookTicketServlet
 */
@WebServlet("/BookTicketServlet")
public class BookTicketServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			String flightId = request.getParameter("flightId");
			String username = request.getParameter("username");
			int numberOfPassengers=Integer.parseInt(request.getParameter("numberOfPassengers"));
			LocalDate bookingDate = LocalDate.parse(request.getParameter("bookingDate"));
			String coach=request.getParameter("coach");
			int price=Integer.parseInt(request.getParameter("price"));
			
			FlightBooking flightBooking=new FlightBooking(flightId,username,numberOfPassengers,bookingDate,coach,price);
			FlightBookingService flightBookingService = new FlightBookingService();
			flightBookingService.addFlightBooking(flightBooking);
			request.setAttribute("BOOKING_DETAILS", flightBooking);
			RequestDispatcher requestDispatcher = request.getRequestDispatcher("ViewFlightBooking.jsp");
			requestDispatcher.forward(request, response);
			
		} catch (Exception e) {
			e.printStackTrace();
			response.sendRedirect("AddPassenger.jsp?errorMessage=" + e.getMessage());
		}

		}
}

