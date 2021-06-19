package in.poorni.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import in.poorni.Exception.DBException;
import in.poorni.Model.Seat;
import in.poorni.Util.ConnectionUtil;

public class SeatDao {

	Connection connection = null;
	PreparedStatement pst = null;
	ResultSet rs = null;

	List<Seat> seatList = new ArrayList<>();

	/**
	 * This method is used to get seat details
	 */

	public List<Seat> getSeatDetails() {
		try {
			// Step 1: Get the connection
			connection = ConnectionUtil.getConnection();
			// Step 2: Query
			String sql = "select * from coachType";
			pst = connection.prepareStatement(sql);
			// Step 3: execute query
			rs = pst.executeQuery();
			while (rs.next()) {
				String coach = rs.getString("coachName");
				int seatCount = rs.getInt("seats");

				// Store the data in model
				Seat seat = new Seat(coach, seatCount);

				seatList.add(seat);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			ConnectionUtil.close(connection, pst, rs);
		}
		return seatList;
	}

	/**
	 * this method is used to return seat.
	 */
	public Seat getRecordByCoachName(String coachName) {
		Seat seat = null;
		String sql = " select * from coachType where  coachName = ?";
		try {
			connection = ConnectionUtil.getConnection();
			pst = connection.prepareStatement(sql);
			pst.setString(1, coachName);
			rs = pst.executeQuery();
			while (rs.next()) {
				String coach = rs.getString("coachName");
				int seatType = rs.getInt("seats");
				seat = new Seat(coach, seatType);

			}
		} catch (SQLException e) {
			throw new DBException("Flight data can't be find");
		} finally {
			ConnectionUtil.close(connection, pst, rs);
		}
		return seat;

	}

}
