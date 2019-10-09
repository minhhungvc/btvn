package vn.btvn.hung.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import vn.btvn.hung.ulist.ConnectionFatory;
import vn.btvn.hung.bo.User;

public class UserDao {


	public static ArrayList<User> countUsers() {
		Connection connection = null;
		Statement statement = null;
		ResultSet resultSet = null;
		ArrayList<User> usersList = new ArrayList<User>();
		try {
			connection = ConnectionFatory.getConnectinon();
			statement = connection.createStatement();
			resultSet = statement.executeQuery("SELECT * FROM students");
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
		User user = new User();
		user.setId(rs.getInt(1));
		user.setFirst_name(rs.getString(2));
		user.setLast_name(rs.getString(3));
		user.setGender(rs.getString(4));
		user.setAge(rs.getInt(5));
		user.setTelephone(rs.getString(6));
		user.setScores(rs.getInt(7));
		
		return user;
	}
	public static ArrayList<User> countNotTelephone() {
		Connection connection = null;
		Statement statement = null;
		ResultSet resultSet = null;
		ArrayList<User> usersList = new ArrayList<User>();
		try {
			connection = ConnectionFatory.getConnectinon();
			statement = connection.createStatement();
			resultSet = statement.executeQuery("SELECT * FROM students where telephone is null ");
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

	public static ArrayList<User> countFemale() {
		Connection connection = null;
		Statement statement = null;
		ResultSet resultSet = null;
		ArrayList<User> usersList = new ArrayList<User>();
		try {
			connection = ConnectionFatory.getConnectinon();
			statement = connection.createStatement();
			resultSet = statement.executeQuery("SELECT * FROM students where gender = 'female'");
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
	public static ArrayList<User> countOverYears() {
		Connection connection = null;
		Statement statement = null;
		ResultSet resultSet = null;
		ArrayList<User> usersList = new ArrayList<User>();
		try {
			connection = ConnectionFatory.getConnectinon();
			statement = connection.createStatement();
			resultSet = statement.executeQuery("SELECT * FROM students where age > 18");
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

	public static ArrayList<User> countGood() {
		Connection connection = null;
		Statement statement = null;
		ResultSet resultSet = null;
		ArrayList<User> usersList = new ArrayList<User>();
		try {
			connection = ConnectionFatory.getConnectinon();
			statement = connection.createStatement();
			resultSet = statement.executeQuery("SELECT * FROM students where score > 80");
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
	public static ArrayList<User> countBad() {
		Connection connection = null;
		Statement statement = null;
		ResultSet resultSet = null;
		ArrayList<User> usersList = new ArrayList<User>();
		try {
			connection = ConnectionFatory.getConnectinon();
			statement = connection.createStatement();
			resultSet = statement.executeQuery("SELECT * FROM students where score < 45");
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
	public static ArrayList<User> countFistNameNike() {
		Connection connection = null;
		Statement statement = null;
		ResultSet resultSet = null;
		ArrayList<User> usersList = new ArrayList<User>();
		try {
			connection = ConnectionFatory.getConnectinon();
			statement = connection.createStatement();
			resultSet = statement.executeQuery("SELECT * FROM students where fist_name = 'Nike' OR  last_name = 'Nike'");
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
	public static ArrayList<User> countMedium() {
		Connection connection = null;
		Statement statement = null;
		ResultSet resultSet = null;
		ArrayList<User> usersList = new ArrayList<User>();
		try {
			connection = ConnectionFatory.getConnectinon();
			statement = connection.createStatement();
			resultSet = statement.executeQuery("SELECT * FROM students where score > 45 AND score < 80;");
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
	

}
