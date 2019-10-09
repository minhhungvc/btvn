package com.vn.bookinghotel.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
////import java.util.Calendar;
//import java.util.Date;

import com.vn.bookinghotel.bo.Customer;
import com.vn.bookinghotel.dbconnect.ConnectionFactory.ConnecttionFatory;


public class CustomerDAO {

	
	public ArrayList<Customer> getAllCustomer() {
		Connection connection = null;
		Statement statement = null;
		ResultSet resultSet = null;
		ArrayList<Customer> customerList = new ArrayList<Customer>();
		try {
			connection = ConnecttionFatory.getConnectinon();
			statement = connection.createStatement();
			resultSet = statement.executeQuery("SELECT * FROM customer");
			while (resultSet.next()) {
				customerList.add(convertToCustomer(resultSet));

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
		return customerList;
	}
	
	public Customer getCustomer( int id_card) {
		Connection connection = null;
		Statement statement = null;
		ResultSet resultSet = null;
         
		try {
			connection = ConnecttionFatory.getConnectinon();
			statement = connection.createStatement();
			resultSet = statement.executeQuery("SELECT * FROM customer where id_card = '" + id_card + "'");
			while (resultSet.next()) {
				Customer customer = convertToCustomer(resultSet);
				return customer;
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

	private static Customer convertToCustomer(ResultSet rs) throws SQLException {
		Customer customer = new Customer();
		customer.setIdRoom(rs.getInt(1));
		customer.setIdCard(rs.getString(2));
		customer.setFullName(rs.getString(3));
		customer.setAge(rs.getInt(4));
		customer.setTelephone(rs.getString(5));
		customer.setCheckInDate(rs.getString(6));
		customer.setCheckOutDate(rs.getString(7));
		customer.setEmail(rs.getString(8));

		return customer;

	}

	public static ArrayList<Customer> findCustomerByName(String id_card) {
		Connection connection = null;
		Statement statement = null;
		ResultSet resultSet = null;
		ArrayList<Customer> customerList = new ArrayList<Customer>();
		try {
			connection = ConnecttionFatory.getConnectinon();
			statement = connection.createStatement();
			resultSet = statement.executeQuery("SELECT * FROM customer where id_card='" + id_card + "'");
			while (resultSet.next()) {
				customerList.add(convertToCustomer(resultSet));

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
		return customerList;
	}

	public void updateCustomer(Customer customer) {
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		try {
			
			String updateSql = "UPDATE customer SET id_room = ?, full_name = ?, age = ?, telephone = ?, checkin_date = ?, checkout_date = ?, email = ? WHERE id_card = ?";
			connection = ConnecttionFatory.getConnectinon();
			preparedStatement = connection.prepareStatement(updateSql);
			preparedStatement.setInt(1, customer.getIdRoom());
			preparedStatement.setString(2, customer.getFullName());
			preparedStatement.setInt(3, customer.getAge());
			preparedStatement.setString(4, customer.getTelephone());
			preparedStatement.setString(5, customer.getCheckInDate());
			preparedStatement.setString(6, customer.getCheckOutDate());
			preparedStatement.setString(7, customer.getEmail());
			preparedStatement.setString(8, customer.getIdCard());

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

	public void addCustomer(Customer customer) {
		Connection connection = null;
		Statement statement = null;
		String insertSQL = "INSERT INTO customer (id_room,id_card,full_name,age,telephone,checkin_date,checkout_date,email) VALUES('" + customer.getIdRoom() + "','" + customer.getIdCard()
				+ "','" + customer.getFullName() + "','" + customer.getAge() +"','" + customer.getTelephone() +"','" + customer.getCheckInDate() +"','" + customer.getCheckOutDate() +"','" + customer.getEmail() +"')";
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
	
	public void deleteCustomer(int id_card) {
		Connection connection = null;
		Statement statement = null;
		String deleteSQL = ("delete from customer where id_card =  '" + id_card + "'");
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
//    public final void setReservationDates(int daysBookNow, int nights) {
//        Calendar refDate = Calendar.getInstance();
//        refDate.set(refDate.get(Calendar.YEAR), refDate.get(Calendar.MONTH), refDate.get(Calendar.DAY_OF_MONTH)
//                + daysFromNow, 0, 0, 0);
//        this.checkInDate = refDate.getTime();
//        refDate.add(Calendar.DAY_OF_MONTH, nights);
//        this.checkOutDate = refDate.getTime();
//    }
	public static ArrayList<Customer> findCustomerBookNow(String id_room) {
		Connection connection = null;
		Statement statement = null;
		ResultSet resultSet = null;
		ArrayList<Customer> customerList = new ArrayList<Customer>();
		try {
			connection = ConnecttionFatory.getConnectinon();
			statement = connection.createStatement();
			resultSet = statement.executeQuery("Select checkin_date, checkout_date from customer where id_room ='" + id_room + "'");
			while (resultSet.next()) {
				customerList.add(convertToCustomer(resultSet));

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
		return customerList;
	}
	public static ArrayList<Customer> findBookNow(String id_room) {
		Connection connection = null;
		Statement statement = null;
		ResultSet resultSet = null;
		ArrayList<Customer> customerList = new ArrayList<Customer>();
		try {
			connection = ConnecttionFatory.getConnectinon();
			statement = connection.createStatement();
			resultSet = statement.executeQuery("select  * from  customer where id_room ='" + id_room + "'");
			while (resultSet.next()) {
				customerList.add(convertToCustomer(resultSet));

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
		return customerList;
	}
	
}




