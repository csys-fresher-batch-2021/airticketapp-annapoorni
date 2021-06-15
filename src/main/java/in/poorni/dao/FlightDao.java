package in.poorni.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Time;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

import in.poorni.Exception.DBException;
import in.poorni.Model.Flight;
import in.poorni.Util.ConnectionUtil;

public class FlightDao {
	
	Connection connection = null;
	PreparedStatement pst = null;
	ResultSet rs = null;
	
	List<Flight> flightList = new ArrayList<>();
	
	public List<Flight> findAllFlight() {
		try {
			// Step 1: Get the connection
			connection = ConnectionUtil.getConnection();
			// Step 2: Query
			String sql = "select * from flightList";
			pst = connection.prepareStatement(sql);
			// Step 3: execute query
			rs = pst.executeQuery();
			while (rs.next()) {
				String flightId = rs.getString("flightId");
				String airlines = rs.getString("airlines");
				LocalTime departureTime = rs.getTime("departureTime").toLocalTime();
				String departingFrom = rs.getString("departingFrom");
				String departingTo = rs.getString("departingTo");
				int firstClass = rs.getInt("firstClass");
				int economyClass = rs.getInt("economyClass");
				int businessClass = rs.getInt("businessClass");

				// Store the data in model
				Flight flight = new Flight(flightId, airlines, departureTime, departingFrom,departingTo,firstClass,economyClass,businessClass);
				// Store all doctor in list
				flightList.add(flight);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			ConnectionUtil.close(connection, pst, rs);
		}
		return flightList;
	}
	
	public void save(Flight flight) {
		// TODO Auto-generated method stub
		String sql="insert into flightList (flightId,airlines,departureTime,departingFrom,departingTo,firstClass,economyClass,businessClass) values (?,?,?,?,?,?,?,?)";

		try {
			connection = ConnectionUtil.getConnection();
			pst = connection.prepareStatement(sql);
			

			pst.setString(1, flight.getFlightId());
			pst.setString(2, flight.getAirlines());
			pst.setTime(3, Time.valueOf(flight.getDepartureTime()));
			pst.setString(4, flight.getDepartingFrom());
			pst.setString(5, flight.getDepartingTo());
			pst.setInt(6,flight.getFirstClass());
			pst.setInt(7,flight.getEconomyClass());
			pst.setInt(8,flight.getBusinessClass());

			pst.executeUpdate();
			System.out.println(pst);
		} catch (SQLException e) {
			throw new DBException("Flight can't be added");
		} finally {
			ConnectionUtil.close(connection, pst);
		}
	}
	public Flight search(String searchFlight) {
		Flight flight = null;
		String sql= "select * from  flightList where UPPER(airlines) like '%"+searchFlight +"%'";

		try {
			// Step 1: Get the connection
			connection = ConnectionUtil.getConnection();
			// Step 2: Query
			pst = connection.prepareStatement(sql);
			// Step 3: execute query
			rs = pst.executeQuery();
			while (rs.next()) {
				String flightId = rs.getString("flightId");
				String airlines = rs.getString("airlines");
				LocalTime departureTime = rs.getTime("departureTime").toLocalTime();
				String departingFrom = rs.getString("departingFrom");
				String departingTo = rs.getString("departingTo");
				int firstClass = rs.getInt("firstClass");
				int economyClass = rs.getInt("economyClass");
				int businessClass = rs.getInt("businessClass");

				// Store the data in model
			    flight = new Flight(flightId, airlines, departureTime, departingFrom,departingTo,firstClass,economyClass,businessClass);
			}
		} catch (SQLException e) {
			throw new DBException("No Details Found");

		} finally {
			ConnectionUtil.close(connection, pst, rs);
		}
		return flight;
	}
	
	public void update(Flight flight) {
		String sql = "update flightList set airlines = ?,departureTime =?,departingFrom = ?,departingTo = ?,firstClass = ?,economyClass = ?,businessClass = ? where flightId = ?";
		try {
			connection = ConnectionUtil.getConnection();
			pst=connection.prepareStatement(sql);
			pst.setString(1, flight.getAirlines());
			pst.setTime(2, Time.valueOf(flight.getDepartureTime()));
			pst.setString(3, flight.getDepartingFrom());
			pst.setString(4, flight.getDepartingTo());
			pst.setInt(5,flight.getFirstClass());
			pst.setInt(6,flight.getEconomyClass());
			pst.setInt(7,flight.getBusinessClass());
			pst.setString(8, flight.getFlightId());
			pst.executeUpdate();
		} catch (SQLException e) {
			throw new DBException("Flight data can't be updated");
		} finally {
			ConnectionUtil.close(connection, pst, rs);
		}
	}
	public void delete(String flightId) {
		String sql = "DELETE FROM flightList where flightId = ?";
		try {
			connection = ConnectionUtil.getConnection();
			pst = connection.prepareStatement(sql);
			pst.setString(1, flightId);
			pst.execute();
		} catch (SQLException e) {
			throw new DBException("Flight can't be deleted");
		} finally {
			ConnectionUtil.close(connection, pst, rs);
		}
	}
	}


