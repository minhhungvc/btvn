package com.msita.jspsverletdemo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.msita.jspsverletdemo.bo.Book;
import com.msita.jspsverletdemo.dbconretion.ConnecttionFactory.ConnecttionFatory;


public class BookDAO {
		public ArrayList<Book> getAllBook() {
			Connection connection = null;
			Statement statement = null;
			ResultSet resultSet = null;
			ArrayList<Book> bookList = new ArrayList<Book>();
			try {
				connection = ConnecttionFatory.getConnectinon();
				statement = connection.createStatement();
				resultSet = statement.executeQuery("SELECT * FROM book");
				while (resultSet.next()) {
					bookList.add(convertToBook(resultSet));

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
			return bookList;
		}
		
		public Book getBook( int id) {
			Connection connection = null;
			Statement statement = null;
			ResultSet resultSet = null;
             
			try {
				connection = ConnecttionFatory.getConnectinon();
				statement = connection.createStatement();
				resultSet = statement.executeQuery("SELECT * FROM book where id = '" + id + "'");
				while (resultSet.next()) {
					Book book = convertToBook(resultSet);
					return book;
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

		private static Book convertToBook(ResultSet rs) throws SQLException {
			Book book = new Book();
			book.setId(rs.getInt(1));
			book.setName(rs.getString(2));
			book.setAuthor(rs.getString(3));
			book.setPublisher(rs.getString(4));
			book.setPrice(rs.getInt(5));

			return book;

		}

		public static ArrayList<Book> findBookByName(String name) {
			Connection connection = null;
			Statement statement = null;
			ResultSet resultSet = null;
			ArrayList<Book> bookList = new ArrayList<Book>();
			try {
				connection = ConnecttionFatory.getConnectinon();
				statement = connection.createStatement();
				resultSet = statement.executeQuery("SELECT * FROM book where name='" + name + "'");
				while (resultSet.next()) {
					bookList.add(convertToBook(resultSet));

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
			return bookList;
		}

		public void updateBook(Book book) {
			Connection connection = null;
			PreparedStatement preparedStatement = null;
			try {
				
				String updateSql = "UPDATE book SET name = ?, author = ?, publisher = ?, price = ? WHERE id = ?";
				connection = ConnecttionFatory.getConnectinon();
				preparedStatement = connection.prepareStatement(updateSql);
				preparedStatement.setString(1, book.getName());
				preparedStatement.setString(2, book.getAuthor());
				preparedStatement.setString(3, book.getPublisher());
				preparedStatement.setInt(4, book.getPrice());
				preparedStatement.setInt(5, book.getId());
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

		public void addBook(Book book) {
			Connection connection = null;
			Statement statement = null;
			String insertSQL = "INSERT INTO book (name,author,publisher,price) VALUES('" + book.getName() + "','" + book.getAuthor()
					+ "','" + book.getPublisher() + "','" + book.getPrice() +"')";
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
		
		public void deleteBook(int id) {
			Connection connection = null;
			Statement statement = null;
			String deleteSQL = ("delete from book where id =  '" + id + "'");
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


