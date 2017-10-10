package h17jb3.tu9.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnect {
	public static Connection getConnection() {
		Connection conn = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/h17jb3.tu9.jdbc?autoReconnect=true&useSSL=false", "root", "1234");
		} catch (Exception e) {
			e.printStackTrace();
		}
	    System.out.println("Opened database successfully");
		return conn;
	}

	// Kiểm tra kết nối với DB - com.mysql.jdbc.JDBC4Connection@14514713
	public static void main(String[] args) throws SQLException {
		System.out.println("DiemHocSinh " + DBConnect.getConnection());
	}
}
