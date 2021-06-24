package in.poorni.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.google.gson.Gson;

import in.poorni.services.FlightBookingService;

/**
 * Servlet implementation class GetBookedTickets
 */
@WebServlet("/GetBookedTickets")
public class GetBookedTickets extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		try {
			String flightId = request.getParameter("flightId");
			LocalDate bookingDate = LocalDate.parse(request.getParameter("bookingDate"));
			String coach=request.getParameter("coach");
			String name=request.getParameter("username");
			FlightBookingService flightBookingService=new FlightBookingService();
			int numberOfTickets=flightBookingService.getBookedTickets(bookingDate, flightId, coach);
			HttpSession session = request.getSession();
			session.setAttribute("name",name);
			Gson gson =new Gson();
			
			String json = gson.toJson(numberOfTickets);
			PrintWriter writer = response.getWriter();
			writer.print(json);
			writer.flush();

		}
		catch (Exception e) {
			e.printStackTrace();
			response.sendRedirect("AddPassenger.jsp?errorMessage=" + e.getMessage());
		}

	}
	
}
