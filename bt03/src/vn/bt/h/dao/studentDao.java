package vn.bt.h.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import vn.bt.h.bo.Student;
import vn.bt.h.utils.connectionFatory;
import vn.bt.h.utils.connectionFatory.ConnectionFatory;



public class studentDao {
	public static ArrayList<Student> countStudent() {
		Connection connection = null;
		Statement statement = null;
		ResultSet resultSet = null;
		ArrayList<Student> usersList = new ArrayList<Student>();
		try {
			connection = ConnectionFatory.getConnectinon();
			statement = connection.createStatement();
			resultSet = statement.executeQuery("SELECT * FROM sinhvien");
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

	private static Student convertTousers(ResultSet rs) throws SQLException {
		Student student = new Student();
		student.setId(rs.getInt(1));
		student.setName(rs.getString(2));
		student.setPass(rs.getString(3));
		student.setAge(rs.getInt(4));

		return student;

	}

	public static ArrayList<Student> findUserByUsername(String name) {
		Connection connection = null;
		Statement statement = null;
		ResultSet resultSet = null;
		ArrayList<Student> usersList = new ArrayList<Student>();
		try {
			connection = ConnectionFatory.getConnectinon();
			statement = connection.createStatement();
			resultSet = statement.executeQuery("SELECT * FROM sinhvien where name='" + name + "'");
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

	public void capnhatPass(int id, String pass) {
		Connection connection = null;
		Statement statement = null;
		String updateSQL = ("update sinhvien  set pass = '" + pass + "' where id =  '" + id + "'");
		System.out.println(updateSQL);
		try {
			connection = ConnectionFatory.getConnectinon();
			statement = connection.createStatement();
			statement.executeUpdate(updateSQL);

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

	public void addStudent(Student users) {
		Connection connection = null;
		Statement statement = null;
		String insertSQL = "INSERT INTO sinhvien (name,pass,age) VALUES('" + users.getName() + "','" + users.getPass()
				+ "','" + users.getAge() + "')";
		System.out.println(insertSQL);
		try {
			connection = ConnectionFatory.getConnectinon();
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
	public void delete(int id) {
		Connection connection = null;
		Statement statement = null;
		String deleteSQL = ("delete from sinhvien  where id =  '" + id + "'");
		System.out.println(deleteSQL);
		try {
			connection = ConnectionFatory.getConnectinon();
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
