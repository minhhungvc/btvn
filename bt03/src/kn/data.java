package kn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class data {

	private Connection con = null;

	public data() {
		String url = "com.mysql.cj.jdbc.Driver";
		String dbUrl = "jdbc:mysql://localhost:3306/SV";
		String user = "root";
		String password = "206296302";
		try {
			Class.forName(url);
			con = DriverManager.getConnection(dbUrl, user, password);
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public ResultSet getResultSet(String tableName) throws SQLException {
		ResultSet rs = null;
		Statement stmt = con.createStatement();
		String sql = "select * from " + tableName;
		rs = stmt.executeQuery(sql);
		return rs;
	}

	public void Close() throws SQLException {
		con.close();
	}

	public static void main(String[] args) throws SQLException {
		data kn = new data();
		try {
			ResultSet rs = kn.getResultSet("students");// Table Name
			while (rs.next()) {
				System.out.println("ID: " + rs.getString("id"));
				System.out.println("FULL NAME: " + rs.getString("fist_name").trim() + " " + rs.getString("last_name").trim());
				System.out.println("GENDER: " + rs.getString("gender"));
				System.out.println("AGE: " + rs.getString("age"));
				System.out.println("TELEPHONE: " + rs.getString("telephone"));
				System.out.println("SCORE: " + rs.getString("score"));
				System.out.println();
				// Field Name
			}
			kn.Close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
