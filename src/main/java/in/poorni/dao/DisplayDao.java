package in.poorni.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import in.poorni.Model.AddFlightModel;
import in.poorni.Util.ConnectionUtil;

public class DisplayDao {
	public static void addFlight(AddFlightModel addFlight) {
		Connection connection = null;
		PreparedStatement pst = null;
		try {
			connection = ConnectionUtil.getConnection();
			String sql = "insert into flight_newdetails(flights) values(?),(time) values(?)";
			pst = connection.prepareStatement(sql);
			pst.setString(1, addFlight.getFlight());
			pst.executeUpdate();
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		} finally {
			ConnectionUtil.close(pst, connection);
		}
	}
	public static void adddFlightTime(AddFlightModel adddFlightTime) {
		Connection connection = null;
		PreparedStatement pst = null;
		try {
			connection = ConnectionUtil.getConnection();
			String sql = "insert into flight_details1(time) values(?)";
			pst = connection.prepareStatement(sql);
			pst.setString(1, adddFlightTime.getAdddFlightTime());
			pst.executeUpdate();
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		} finally {
			ConnectionUtil.close(pst, connection);
		}
	}





}
