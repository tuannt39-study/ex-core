package h17jb3.tu9.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySQLConn {
	public static Connection getMySQLConnection() throws ClassNotFoundException, SQLException {
		String hostName = "localhost";
		String dbName = "h17jb3.tu9.jdbc";
		String userConn = "root";
		String passConn = "1234";
		return getMySQLConnection(hostName, dbName, userConn, passConn);
	}
	
	public static Connection getMySQLConnection (String hostName, String dbName, String userConn, String passConn) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		String conUrl = "jdbc:mysql://" + hostName + ":3306/" + dbName + "?autoReconnect=true&useSSL=false";
		return DriverManager.getConnection(conUrl, userConn, passConn);
	}
	
	public static void main(String[] args) {
		try {
			MySQLConn.getMySQLConnection();
			System.out.println("Thanh Cong");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
