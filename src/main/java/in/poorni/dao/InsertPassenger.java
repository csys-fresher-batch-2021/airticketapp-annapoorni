package in.poorni.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import in.poorni.Model.AddFlightModel;
import in.poorni.Model.Passenger;
import in.poorni.Util.ConnectionUtil;

public class InsertPassenger {
	public static void addPassenger(Passenger addPassenger, String sql) {
		Connection connection = null;
		PreparedStatement pst = null;
		try{
			String passengerTable = "INSERT INTO Passenger"
									+ "(Customer_idCustomer, firstName, lastName, dob)"
									+ " VALUES (?,?,?,?)";
			connection = ConnectionUtil.getConnection();
			pst.setString(1, addPassenger.getPassenger());
			pst.setString(1,addPassenger.getCustID);
			pst.setString(2,addPassenger.getFirstName);
			pst.setString(3,addPassenger.getLastName);
			pst.setString(4,addPassenger.getDob);
			
			pst.executeUpdate();
		}
		catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		} finally {
			ConnectionUtil.close(pst, connection);
		}
	}
}