package vn.msita.q.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import vn.msita.q.bo.User;
import vn.msita.q.utils.connectsionFatory;

public class usersDao {
	public ArrayList<User> getAllusers() {
		Connection connection = null;
		Statement statement = null;
		ResultSet resultSet = null;
		ArrayList<User> usersList = new ArrayList<User>();
		try {
			connection = connectsionFatory.getConnectinon();
			statement = connection.createStatement();
			resultSet = statement.executeQuery("SELECT * FROM users");
			while (resultSet.next()) {
				usersList.add(convertTousers(resultSet));

			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (resultSet != null) {
				try {
					resultSet.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (statement != null) {
				try {
					statement.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}

			if (connection != null) {
				try {
					connection.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}

		}
		return usersList;
	}

	private static User convertTousers(ResultSet rs) throws SQLException {
		User users = new User();
		users.setId(rs.getInt(1));
		users.setName(rs.getString(2));
		users.setPass(rs.getString(3));
		users.setAge(rs.getInt(4));
		return users;
	}

	public void addUsers(User users) {
		Connection connection = null;
		Statement statement = null;
		String insertSQL = "INSERT INTO users (name,pass,age) VALUES('" + users.getName() + "','" + users.getPass()
				+ "','" + users.getAge() + "')";
		System.out.println(insertSQL);
		try {
			connection = connectsionFatory.getConnectinon();
			statement = connection.createStatement();
			statement.executeUpdate(insertSQL);

		} catch (Exception e) {
			e.printStackTrace();
		} finally {

			if (statement != null) {
				try {
					statement.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}

			if (connection != null) {
				try {
					connection.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}

public void addUsersViaPreparedStatement(User users) {
	Connection connection = null;
	PreparedStatement preparedStatement = null;
	String insertSQL = "INSERT INTO users (name,pass,age) VALUES(?,?,?)";
	System.out.println(insertSQL);
	try {
		connection = connectsionFatory.getConnectinon();
		preparedStatement = connection.prepareStatement(insertSQL);
		preparedStatement.setString(1,users.getName());
		preparedStatement.setString(2,users.getPass());
		preparedStatement.setInt(3,users.getAge());
		preparedStatement.execute();

	} catch (Exception e) {
		e.printStackTrace();
	} finally {

		if (preparedStatement != null) {
			try {
				preparedStatement.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		if (connection != null) {
			try {
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
}

