package h17jb3.tu9.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import h17jb3.tu9.jdbc.demo.MySqlConn;

public class TestDatabase {
	public static void main(String[] arguments) {
		// String data = "jdbc:odbc:AddressBook";
		String data = "jdbc:odbc:Driver={Microsoft Access Driver (*.mdb)};DBQ=" + "D:/JAVA/LamBTJava/AddressBook.mdb";
		// DriverID=22";
		try {
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			Connection conn = DriverManager.getConnection(data, "Vo Tan Dung", "abc");
			Statement st = conn.createStatement();
			ResultSet rec = st.executeQuery("SELECT * FROM AddressBook");

			while (rec.next()) {
				System.out.println(rec.getString("NumberID") + "\t" + rec.getString("HomeNumber") + "\t\t"
						+ rec.getString("MobileNumber") + "\t" + rec.getString("WorkNumber"));
			}
			conn.close();
		} catch (SQLException s) {
			System.out.println("SQL Error: " + s.toString() + " " + s.getErrorCode() + " " + s.getSQLState());
		} catch (Exception e) {
			System.out.println("Error: " + e.toString() + e.getMessage());
		}
	}

	// TẠO BẢNG QUA JDBC
	public void createTable() throws ClassNotFoundException, SQLException {
		String sqlQuery = "CREATE TABLE PRICELIST(NAME VARCHAR(20), PRICE NUMBER);";
		Connection conn = MySqlConn.getMySQLConnection();
		if (conn != null) {
			try {
				Statement st = conn.createStatement();
				st.execute(sqlQuery);
				st.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	// NHẬP DỮ LIỆU QUA JDBC
	public void insertData(String name, double val) throws ClassNotFoundException, SQLException {
		String insertQuery = "INSERT INTO PRICELIST VALUES ('" + name + "'," + val + ");";
		Connection conn = MySqlConn.getMySQLConnection();
		if (conn != null) {
			try {
				Statement st = conn.createStatement();
				int d = st.executeUpdate(insertQuery);
				System.out.println("So dong duoc cap nhat: " + d);
				st.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	// ĐỌC DỮ LIỆU TỪ CSDL
	public void selectAll() throws ClassNotFoundException, SQLException {
		String selectQuery = "SELECT * FROM PRICELIST;";
		Connection conn = MySqlConn.getMySQLConnection();
		if (conn != null) {
			try {
				Statement st = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
				ResultSet rs = st.executeQuery(selectQuery);
				System.out.println("NAME\t\tPRICE");
				while (rs.next()) {
					String name = rs.getString("NAME");
					double val = rs.getDouble("PRICE");
					System.out.println(name + "\t\t" + val);
				}
				st.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	// VÍ DỤ CHỈNH SỬA DỮ LIỆU
	public void updateTable() throws ClassNotFoundException, SQLException {
		String selectQuery = "SELECT * FROM PRICELIST;";
		Connection conn = MySqlConn.getMySQLConnection();
		if (conn != null) {
			try {
				Statement st = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
				ResultSet rs = st.executeQuery(selectQuery);
				rs.next();
				rs.updateDouble("PRICE", 1.5);
				rs.updateRow();
				st.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	// SỬ DỤNG PreparedStatement
	public void prepareStatement() throws ClassNotFoundException, SQLException {
		String insertQuery = "INSERT INTO PRICELIST VALUES(?,?);";
		Connection conn = MySqlConn.getMySQLConnection();
		if (conn != null) {
			try {
				PreparedStatement prest = conn.prepareStatement(insertQuery);
				prest.setString(1, "Biscuit");
				prest.setDouble(2, 1.2);
				prest.executeUpdate();
				prest.setString(1, "Pen");
				prest.setDouble(2, 0.5);
				prest.executeUpdate();
				prest.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

}
