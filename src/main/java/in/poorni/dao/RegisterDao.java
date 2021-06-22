package in.poorni.dao;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import in.poorni.exception.DBException;
import in.poorni.model.User;
import in.poorni.util.ConnectionUtil;
public class RegisterDao {
	Connection connection = null;
	PreparedStatement pst = null;
	ResultSet rs = null;
	/**
	 * This method is used to store user details in db
	 * 
	 * @param flight
	 */
	public void save(User user) {
		String sql = "insert into usertable(username,age,phoneNumber,email,pass,gender,address) values ( ?,?,?,?,?,?,? )";
		try {
			connection = ConnectionUtil.getConnection();
			pst = connection.prepareStatement(sql);
			pst.setString(1, user.getUsername());
			pst.setInt(2, user.getAge());
			pst.setLong(3, user.getPhoneNumber());
			pst.setString(4, user.getEmail());
			pst.setString(5, user.getPassword());
			pst.setString(6, user.getGender());
			pst.setString(7,user.getAddress());
			pst.executeUpdate();
		} catch (SQLException e) {
			throw new DBException("User can't be added");
		} finally {
			ConnectionUtil.close(connection, pst, rs);
		}
	}
	/**
	 * This method is used to get user details
	 * 
	 * @param username
	 * @param password
	 */
	public boolean findUser(String username, String password) {
		boolean valid = false;
		try {
			connection = ConnectionUtil.getConnection();
			String sql = "select username,pass from usertable where username = ? and pass = ?";
			pst = connection.prepareStatement(sql);
			pst.setString(1, username);
			pst.setString(2, password);
			rs = pst.executeQuery();
			while (rs.next()) {
				valid = true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			ConnectionUtil.close(connection, pst, rs);
		}
		return valid;
	}
}
