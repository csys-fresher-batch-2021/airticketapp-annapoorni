package in.poorni.Util;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class DbConnection {
	private DbConnection() {
	}

	public static Connection getConnection() throws ClassNotFoundException, SQLException {
		String driverClass = "org.postgresql.Driver";
		String url = "jdbc:postgresql://localhost/airticketapp";
		String flights = "postgres";
		String time = "Poornima_5";
		Class.forName(driverClass);
		Connection connection = DriverManager.getConnection(url, flights, time);
		System.out.println("Connection Created");
		return connection;
	}
	public static void close(Statement st, Connection con) {
		try {
			if (con != null && st != null) {
				con.close();
				st.close();
				System.out.println("Connection Released");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
