package com.msita.jspsverletdemo.dbconretion;

import java.sql.Connection;
import java.sql.DriverManager;



public class ConnecttionFactory {
	public static class ConnecttionFatory {
		public static final String URL = "jdbc:mysql://localhost:3306/BookShop";
		public static final String USER = "root";
		public static final String PASS = "206296302";

		public static Connection getConnectinon() {
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				return DriverManager.getConnection(URL, USER, PASS);

			} catch (Exception  ex) {
				throw new RuntimeException("eror", ex);

			}
		
		}
		public static void main(String[] args) {
			ConnecttionFatory.getConnectinon();
		}
	}


}
