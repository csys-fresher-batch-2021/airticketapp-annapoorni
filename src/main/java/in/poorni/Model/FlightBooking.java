package in.poorni.Model;

import java.time.LocalDate;
import java.util.Date;

public class FlightBooking {
	public int bookingId;
	public FlightBooking(int bookingId, String flightId, String username, int numberOfPassengers, LocalDate bookingDate,
			String coach, int price, int status) {
		super();
		this.bookingId = bookingId;
		this.flightId = flightId;
		this.username = username;
		this.numberOfPassengers = numberOfPassengers;
		this.bookingDate = bookingDate;
		this.coach = coach;
		this.price = price;
		this.status = status;
	}
	public String flightId;
	public String username;
	public int numberOfPassengers;
	public LocalDate bookingDate;
	public String coach;
	public int price;
	public int status;
	public FlightBooking(String flightId, String username, int numberOfPassengers, LocalDate bookingDate, String coach,
			int price) {
		super();
		this.flightId = flightId;
		this.username = username;
		this.numberOfPassengers = numberOfPassengers;
		this.bookingDate = bookingDate;
		this.coach = coach;
		this.price = price;
	}
	public int getBookingId() {
		return bookingId;
	}
	public void setBookingId(int bookingId) {
		this.bookingId = bookingId;
	}
	public String getFlightId() {
		return flightId;
	}
	public void setFlightId(String flightId) {
		this.flightId = flightId;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public int getNumberOfPassengers() {
		return numberOfPassengers;
	}
	public void setNumberOfPassengers(int numberOfPassengers) {
		this.numberOfPassengers = numberOfPassengers;
	}
	public LocalDate getBookingDate() {
		return bookingDate;
	}
	public void setBookingDate(LocalDate bookingDate) {
		this.bookingDate = bookingDate;
	}
	public String getCoach() {
		return coach;
	}
	public void setCoach(String coach) {
		this.coach = coach;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "FlightBooking [bookingId=" + bookingId + ", flightId=" + flightId + ", username=" + username
				+ ", numberOfPassengers=" + numberOfPassengers + ", bookingDate=" + bookingDate + ", coach=" + coach
				+ ", price=" + price + ", status=" + status + "]";
	}
	public FlightBooking(String flightId, String username, int numberOfPassengers, LocalDate bookingDate,
			String coach, int price, int status) {
		super();
		this.flightId = flightId;
		this.username = username;
		this.numberOfPassengers = numberOfPassengers;
		this.bookingDate = bookingDate;
		this.coach = coach;
		this.price = price;
		this.status = status;
	}
	}