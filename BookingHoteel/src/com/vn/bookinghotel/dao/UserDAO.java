package com.vn.bookinghotel.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.vn.bookinghotel.bo.User;
import com.vn.bookinghotel.dbconnect.ConnectionFactory.ConnecttionFatory;


public class UserDAO {
	

	public ArrayList<User> getAllUser() {
		Connection connection = null;
		Statement statement = null;
		ResultSet resultSet = null;
		ArrayList<User> userList = new ArrayList<User>();
		try {
			connection = ConnecttionFatory.getConnectinon();
			statement = connection.createStatement();
			resultSet = statement.executeQuery("select * from user");
			while (resultSet.next()) {
				userList.add(convertToUser(resultSet));

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
		return userList;
	}
	
	public User getUser( int id_user) {
		Connection connection = null;
		Statement statement = null;
		ResultSet resultSet = null;
         
		try {
			connection = ConnecttionFatory.getConnectinon();
			statement = connection.createStatement();
			resultSet = statement.executeQuery("SELECT * FROM user where id_user = '" + id_user + "'");
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
		user.setIdUser(rs.getInt(1));;
		user.setUserName(rs.getString(2));
		user.setPassword(rs.getString(3));
		user.setRoles(rs.getString(4));

		return user;

	}

	public User findUserByUsernameAndPassword(String user_name, String password) {
		Connection connection = null;
		Statement statement = null;
		ResultSet resultSet = null;

		try {
			connection = ConnecttionFatory.getConnectinon();
			statement = connection.createStatement();
			resultSet = statement
					.executeQuery("SELECT * FROM user where user_name='" + user_name + "' and password ='" + password + "'");
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

	public void updateUser(User user) {
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		try {
			
			String updateSql = "UPDATE user SET user_name = ?, password = ?, roles = ? WHERE id_user = ?";
			connection = ConnecttionFatory.getConnectinon();
			preparedStatement = connection.prepareStatement(updateSql);
			preparedStatement.setString(1, user.getUserName());
			preparedStatement.setString(2, user.getPassword());
			preparedStatement.setString(3, user.getRoles());
			preparedStatement.setInt(4, user.getIdUser());
			preparedStatement.executeUpdate();
		} catch (SQLException e) {
			//Handle errors for JDBC
			e.printStackTrace();
		} finally {
			//finally block used to close resources
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

	public void addUser(User user) {
		Connection connection = null;
		Statement statement = null;
		String insertSQL = "INSERT INTO user (user_name,password,roles) VALUES('" + user.getUserName() + "','" + user.getPassword()
				+ "','" + user.getRoles() + "')";
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
	
	public void deleteUser(int id_user) {
		Connection connection = null;
		Statement statement = null;
		String deleteSQL = ("delete from user where id_user =  '" + id_user + "'");
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



