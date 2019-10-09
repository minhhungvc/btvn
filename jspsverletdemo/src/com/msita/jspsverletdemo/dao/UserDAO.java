package com.msita.jspsverletdemo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.msita.jspsverletdemo.bo.User;
import com.msita.jspsverletdemo.dbconretion.ConnecttionFactory.ConnecttionFatory;

public class UserDAO {
	public void updateUser(User user) {
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		try {

			String updateSql = "UPDATE users SET username = ?, password = ?, roles = ?,  WHERE id = ?";
			connection = ConnecttionFatory.getConnectinon();
			preparedStatement = connection.prepareStatement(updateSql);
			preparedStatement.setString(1, user.getName());
			preparedStatement.setString(2, user.getPassword());
			preparedStatement.setString(3, user.getRoles());
			preparedStatement.setInt(5, user.getId());
			preparedStatement.executeUpdate();
		} catch (SQLException e) {

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

	public void insertUser(User user) {
		Connection connection = null;
		Statement statement = null;
		String insertSQL = "INSERT INTO users (username,password,roles) VALUES('" + user.getName() + "','"
				+ user.getPassword() + "','" + user.getRoles() + "')";
		System.out.println(insertSQL);
		try {
			connection = ConnecttionFatory.getConnectinon();
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

	public User findUserByUsernameAndPassword(String name, String password) {
		Connection connection = null;
		Statement statement = null;
		ResultSet resultSet = null;

		try {
			connection = ConnecttionFatory.getConnectinon();
			statement = connection.createStatement();
			resultSet = statement
					.executeQuery("SELECT * FROM users where username='" + name + "' and password ='" + password + "'");
			while (resultSet.next()) {
				User user = convertToUser(resultSet);
				return user;

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
		return null;
	}

	private static User convertToUser(ResultSet rs) throws SQLException {
		User user = new User();
		user.setId(rs.getInt(1));
		user.setName(rs.getString(2));
		user.setPassword(rs.getString(3));
		user.setRoles(rs.getString(4));

		return user;

	}

	public void deleteUser(int id) {
		Connection connection = null;
		Statement statement = null;
		String deleteSQL = ("delete from users where id =  '" + id + "'");
		System.out.println(deleteSQL);
		try {
			connection = ConnecttionFatory.getConnectinon();
			statement = connection.createStatement();
			statement.executeUpdate(deleteSQL);

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
}
