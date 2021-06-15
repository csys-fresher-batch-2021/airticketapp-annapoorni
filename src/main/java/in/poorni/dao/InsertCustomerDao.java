package in.poorni.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import in.poorni.Model.InsertCustomer;
import in.poorni.Util.ConnectionUtil;


public class InsertCustomerDao {
	public static void addCustomer(InsertCustomer addCustomer )
	{
		Connection connection = null;
		PreparedStatement pst = null;
		try
		{
			String customerTable = "INSERT INTO Customer"
									+ "(firstName, lastName, dob, country, city, state, email)"
									+ " VALUES (?,?,?,?,?,?,?,?)";
			connection = ConnectionUtil.getConnection();
			pst.setString(1, addCustomer.getCustomer());
			pst.setString(1,pst.getfirtName);
			pst.setString(2,pst.getLastName);
			pst.setString(3,pst.getDob);
			pst.setString(4,pst.getCountry);
			pst.setString(5,pst.getCity);
			pst.setString(6,pst.getState);
			pst.setString(7,pst.getemail);
			
			pst.executeUpdate();
		}catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		} finally {
			ConnectionUtil.close(pst, connection);
		}
	}
}
