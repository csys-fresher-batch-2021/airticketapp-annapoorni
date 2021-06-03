package in.poorni.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import in.poorni.Model.RegisterModel;
import in.poorni.Util.ConnectionUtil;

public class RegisterDao {
	private RegisterDao() {

	}

	public static void register1(RegisterModel reg) {
		Connection connection=null;
		PreparedStatement pst=null;
		//step 1:
		try {
			 connection = ConnectionUtil.getConnection();

			//step 2:

			String sql="insert into register_table(username,userpassword,email,age,mobileNo,adhaarNo,address,pincode) values(?,?,?,?,?,?,?,?)";



		    pst=connection.prepareStatement(sql);
			pst.setString(1, reg.getName());
			pst.setString(2, reg.getPassword());
			pst.setString(3, reg.getEmail());
			pst.setString(4, reg.getAge());
			pst.setString(5, reg.getMoblieNo());
			pst.setString(6, reg.getAdhaarNo());
			pst.setString(7, reg.getAddress());
			pst.setString(8, reg.getPincode());
			pst.executeUpdate();


		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}finally {
			ConnectionUtil.close(pst,connection);

		}

	}

}
