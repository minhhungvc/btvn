package dct.ute.guitaracoustic.dbconnect;

import java.sql.Connection;
import java.sql.DriverManager;


public class ConnectionFactory {
	public static class ConnectionFatory {
		public static final String URL = "jdbc:mysql://localhost:3306/MyDatabase";
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
			ConnectionFatory.getConnectinon();
		}
	}


}