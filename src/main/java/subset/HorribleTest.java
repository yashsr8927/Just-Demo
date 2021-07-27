package subset;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class HorribleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection con = null;
		String driverName = "com.mysql.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3309/test";
		String userid = "root";
		String password = "root";
		try {
			Class.forName(driverName);
			 con = DriverManager.getConnection(url, userid, password);
			// con.setAutoCommit(false);
			 System.out.println("hello");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("class not found");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("sql exception e");
		}

	}

}
