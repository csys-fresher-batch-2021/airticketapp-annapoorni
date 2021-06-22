package in.poorni.util;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import in.poorni.exception.DBException;
public class ConnectionUtil {
	private ConnectionUtil() {
		// default Constructor
	}
	private static String driverClass = "org.postgresql.Driver";
	private static String url = "jdbc:postgresql://localhost/airticketapp";
	private static String username = "postgres";
	private static String password = "Poornima_5";
	
	
	public static Connection getConnection() {
		Connection connection = null;
		try {
			// Step 1: Load the database driver into memory ( ClassNotFoundException )
			Class.forName(driverClass);
			// Step 2: Get the Database Connection (SQLException)
			connection = DriverManager.getConnection(url, username, password);
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
			throw new DBException("Unable to get the database connection");
		}
		return connection;
	}
	public static void close(Connection connection, PreparedStatement pst, ResultSet rs) {
		try {
			if (rs != null) {
				rs.close();
			}
			if (pst != null) {
				pst.close();
			}
			if (connection != null) {
				connection.close();
			}
		} catch (SQLException e) {
			throw new DBException("There no connection to close");
		}
	}
		public static void close(Connection connection, PreparedStatement pst) {
			try {
				if (pst != null) {
					pst.close();
				}
				if (connection != null) {
					connection.close();
				}
			} catch (SQLException e) {
				throw new DBException("There no connection to close");
			}
	}
}


