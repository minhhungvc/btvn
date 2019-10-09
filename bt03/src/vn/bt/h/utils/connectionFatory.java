package vn.bt.h.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import vn.btvn.hung.ulist.ConnectionFatory;

public class connectionFatory {
	public static class ConnectionFatory {
		public static final String URL = "jdbc:mysql://localhost:3306/Student";
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


}
