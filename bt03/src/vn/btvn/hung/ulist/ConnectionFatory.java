package vn.btvn.hung.ulist;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;



public class ConnectionFatory {
	public static final String URL = "jdbc:mysql://localhost:3306/SV";
	public static final String USER = "root";
	public static final String PASS = "206296302";

	public static Connection getConnectinon() {
		try {
			return DriverManager.getConnection(URL, USER, PASS);

		} catch (SQLException ex) {
			throw new RuntimeException("eror", ex);

		}
	
	}
	public static void main(String[] args) {
		ConnectionFatory.getConnectinon();
	}
}
