package in.poorni.services;


import java.time.LocalDate;
import java.util.List;

import in.poorni.Model.FlightBooking;
import in.poorni.dao.FlightBookingDao;

public class FlightBookingService {
	 FlightBookingDao flightBookingDao = new FlightBookingDao();
		/**
		 * This method is used to get the list of flights
		 * 
		 * @return
		 */
	 public List<FlightBooking> getFlightBooking() {
			return flightBookingDao.getFlightBookingList();
		}
	 
	 /**
	  * This method is used to add flight booking details
	  * @param flightBooking
	  */
	 
	 public void addFlightBooking(FlightBooking flightBooking) {
				flightBookingDao.save(flightBooking);
		}

	 public int getBookedTickets(LocalDate date, String flightId, String coach) {
		 int bookedTickets=flightBookingDao.getBookedSeats(date, flightId, coach);
		return bookedTickets;
	 }
	 public void updateBooking(int bookingId,int status) {
			flightBookingDao.updatedBookingList(bookingId,status);
		}
	 public List<FlightBooking> getAllBookingList(){
			return flightBookingDao.viewAllFlightBooking();
		}

}
