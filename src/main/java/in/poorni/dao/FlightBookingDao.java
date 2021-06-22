package in.poorni.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import in.poorni.exception.DBException;
import in.poorni.model.FlightBooking;
import in.poorni.util.ConnectionUtil;

public class FlightBookingDao {
	Connection connection = null;
	PreparedStatement pst = null;
	ResultSet rs = null;

	/**
	 * This method is used to get booking fixed
	 * 
	 * @return
	 */
	public List<FlightBooking> getFlightBookingList() {
		List<FlightBooking> FlightBookingList = new ArrayList<>();
		try {
			connection = ConnectionUtil.getConnection();
			String sql = "select * from flightBooking where status = 0";
			pst = connection.prepareStatement(sql);
			rs = pst.executeQuery();
			while (rs.next()) {
				toRow(FlightBookingList);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			ConnectionUtil.close(connection, pst, rs);
		}
		return FlightBookingList;
	}

	private void toRow(List<FlightBooking> FlightBookingList) throws SQLException {
		String flightId = rs.getString("flightId");
		String username = rs.getString("username");
		int numberOfPassengers = rs.getInt("numberOfPassengers");
		LocalDate bookingDate = rs.getDate("bookingDate").toLocalDate();
		String coach = rs.getString("coach");
		int price = rs.getInt("price");
		int status = rs.getInt("status");

		FlightBooking flightBooking = new FlightBooking(flightId, username, numberOfPassengers, bookingDate, coach,
				price, status);
		FlightBookingList.add(flightBooking);
	}

	/**
	 * This method is used to save bookings
	 * 
	 * @param bookings
	 */
	public void save(FlightBooking flightBooking) {
		String sql = "insert into flightBooking(flightId, username , numberOfPassengers, bookingDate, coach,price) values ( ?,?,?,?,?,? )";
		try {
			connection = ConnectionUtil.getConnection();
			pst = connection.prepareStatement(sql);
			pst.setString(1, flightBooking.getFlightId());
			pst.setString(2, flightBooking.getUsername());
			pst.setInt(3, flightBooking.getNumberOfPassengers());
			pst.setDate(4, Date.valueOf(flightBooking.getBookingDate()));
			pst.setString(5, flightBooking.getCoach());
			pst.setInt(6, flightBooking.getPrice());

			pst.executeUpdate();
		} catch (SQLException e) {
			throw new DBException("Flight booking can't be Fixed");
		} finally {
			ConnectionUtil.close(connection, pst, rs);
		}
	}

	public int getBookedSeats(LocalDate date, String flightId, String coach) {
		String sql = "select sum(numberOfpassengers) as bookedtickets from flightBooking where status!=1 and bookingdate=? and coach=? and flightid=?";
		int bookedTickets = 0;
		try {
			connection = ConnectionUtil.getConnection();
			pst = connection.prepareStatement(sql);
			Date bookingDate = Date.valueOf(date);
			pst.setDate(1, bookingDate);
			pst.setString(2, coach);
			pst.setString(3, flightId);
			rs = pst.executeQuery();
			while (rs.next()) {
				bookedTickets = rs.getInt("bookedtickets");
			}
		} catch (SQLException e) {
			throw new DBException("Flight booking can't be Fixed");
		} finally {
			ConnectionUtil.close(connection, pst, rs);
		}
		System.out.println(bookedTickets);
		return bookedTickets;

	}
	public List<FlightBooking> getFlightBooking(String username) {
		List<FlightBooking> bookingList = new ArrayList<>();
		try {
			connection = ConnectionUtil.getConnection();
			String sql = "select * from flightBooking where username= ?";
			pst = connection.prepareStatement(sql);
			pst.setString(1,  username);
			rs = pst.executeQuery();
			while (rs.next()) {
				int bookingId=rs.getInt("bookingid");
				String flightId = rs.getString("flightId");
				String user = rs.getString("username");
				int numberOfPassengers = rs.getInt("numberOfPassengers");
				LocalDate bookingDate = rs.getDate("bookingDate").toLocalDate();
				String coach = rs.getString("coach");
				int price = rs.getInt("price");
				int status = rs.getInt("status");

				FlightBooking flightBooking = new FlightBooking(bookingId,flightId, user, numberOfPassengers, bookingDate, coach,
						price, status);
				bookingList.add(flightBooking);
				}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			ConnectionUtil.close(connection, pst, rs);
		}
		return bookingList;
	}
	
	public List<FlightBooking> viewAllFlightBooking() {
		List<FlightBooking> bookingList = new ArrayList<>();
		try {
			connection = ConnectionUtil.getConnection();
			String sql = "select * from flightBooking";
			pst = connection.prepareStatement(sql);
			rs = pst.executeQuery();
			while (rs.next()) {
				int bookingId=rs.getInt("bookingid");
				String flightId = rs.getString("flightId");
				String user = rs.getString("username");
				int numberOfPassengers = rs.getInt("numberOfPassengers");
				LocalDate bookingDate = rs.getDate("bookingDate").toLocalDate();
				String coach = rs.getString("coach");
				int price = rs.getInt("price");
				int status = rs.getInt("status");

				FlightBooking flightBooking = new FlightBooking(bookingId,flightId, user, numberOfPassengers, bookingDate, coach,
						price, status);
				bookingList.add(flightBooking);
				}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			ConnectionUtil.close(connection, pst, rs);
		}
		return bookingList;
	}
	
	public void updatedBookingList( int bookingId,int status) {
		try {
			connection = ConnectionUtil.getConnection();
			String sql = "update flightBooking SET status=?  where bookingid=?";
			pst = connection.prepareStatement(sql);
			pst.setInt(1, status);
			pst.setInt(2, bookingId);
			pst.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			ConnectionUtil.close(connection, pst, rs);
		}
	}
	




}
