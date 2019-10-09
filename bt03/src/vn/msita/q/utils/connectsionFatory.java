package vn.msita.q.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class connectsionFatory {
	public static final String URL = "jdbc:mysql://localhost:3306/SVien";
	public static final String USER = "root";
	public static final String PASS = "206296302";

	public static Connection getConnectinon() {
		try {
			return DriverManager.getConnection(URL, USER, PASS);

		} catch (SQLException ex) {
			throw new RuntimeException("hhhh", ex);

		}
	
	}
	public static void main(String[] args) {
		connectsionFatory.getConnectinon();
	}
}
