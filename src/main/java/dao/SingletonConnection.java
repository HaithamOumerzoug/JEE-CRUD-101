package dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class SingletonConnection {
	private static Connection Conn;
	static {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/YourDB","username","password");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static Connection getConn() {
		return Conn;
	}
	public static void setConn(Connection conn) {
		Conn = conn;
	}
	
}
