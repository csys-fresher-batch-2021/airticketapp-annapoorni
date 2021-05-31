package in.poorni.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import in.poorni.Util.ConnectionUtil;

public class LoginDao {
	public boolean loginDao(long mobileNumber,String password) throws Exception
	{
		boolean validLogin=false;
		Connection connection = null;
		PreparedStatement pst = null;
		try {
			connection=ConnectionUtil.getConnection();
			String sql="select * from user_detail where mobile_number=? AND user_password=?";
			pst=connection.prepareStatement(sql);
			pst.setLong(1, mobileNumber);
			pst.setString(2, password);
			ResultSet rs=pst.executeQuery();
			if(rs.next())
			{
				validLogin=true;
			}
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
			throw new Exception("unable to fetch record from database");
		}
		 finally {
				ConnectionUtil.close(pst, connection);
		}

		return validLogin;

	}


}
