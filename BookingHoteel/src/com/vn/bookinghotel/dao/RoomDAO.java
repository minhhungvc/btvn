package com.vn.bookinghotel.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.vn.bookinghotel.bo.Room;
import com.vn.bookinghotel.dbconnect.ConnectionFactory.ConnecttionFatory;



public class RoomDAO {
	public ArrayList<Room> getAllRoom() {
		Connection connection = null;
		Statement statement = null;
		ResultSet resultSet = null;
		ArrayList<Room> roomList = new ArrayList<Room>();
		try {
			connection = ConnecttionFatory.getConnectinon();
			statement = connection.createStatement();
			resultSet = statement.executeQuery("SELECT * FROM room");
			while (resultSet.next()) {
				roomList.add(convertToRoom(resultSet));
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
		return roomList;
	}
	
	public Room getRoom( int id_room) {
		Connection connection = null;
		Statement statement = null;
		ResultSet resultSet = null;
         
		try {
			connection = ConnecttionFatory.getConnectinon();
			statement = connection.createStatement();
			resultSet = statement.executeQuery("SELECT * FROM room where id_room = '" + id_room + "'");
			while (resultSet.next()) {
				Room room = convertToRoom(resultSet);
				return room;
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

	private static Room convertToRoom(ResultSet rs) throws SQLException {
		Room room= new Room();
		room.setIdRoom(rs.getInt(1));
		byte[] imgData = rs.getBytes("img");
		room.setImg(imgData);
		room.setrName(rs.getString(3));
		room.setDetail(rs.getString(4));
		room.setPrice(rs.getInt(5));
		

		return room;

	}

	public static ArrayList<Room> findRoomByName(String r_name) {
		Connection connection = null;
		Statement statement = null;
		ResultSet resultSet = null;
		ArrayList<Room> roomList = new ArrayList<Room>();
		try {
			connection = ConnecttionFatory.getConnectinon();
			statement = connection.createStatement();
			resultSet = statement.executeQuery("SELECT * FROM room where r_name='" + r_name + "'");
			while (resultSet.next()) {
				roomList.add(convertToRoom(resultSet));

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
		return roomList;
	}

	public void updateRoom(Room room) {
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		try {
			
			String updateSql = "UPDATE room SET img = ?, r_name = ?, detail = ?, price = ? WHERE id_room = ?";
			connection = ConnecttionFatory.getConnectinon();
			preparedStatement = connection.prepareStatement(updateSql);
			preparedStatement.setBytes(1, room.getImg());
			preparedStatement.setString(2, room.getrName());
			preparedStatement.setString(3, room.getDetail());
			preparedStatement.setInt(4, room.getPrice());
			preparedStatement.setInt(5, room.getIdRoom());
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

	public void addRoom(Room room) {
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		String insertSQL = "INSERT INTO room (id_room,img,r_name,detail,price) VALUES(?,?,?,?,?)";
		try {
			connection = ConnecttionFatory.getConnectinon();
			preparedStatement = connection.prepareStatement(insertSQL);
			preparedStatement.setInt(1, room.getIdRoom());
			preparedStatement.setBytes(2, room.getImg());
			preparedStatement.setString(3, room.getrName());
			preparedStatement.setString(4, room.getDetail());
			preparedStatement.setInt(5, room.getPrice());
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
	
	public void deleteRoom(int id_room) {
		Connection connection = null;
		Statement statement = null;
		String deleteSQL = ("delete from room where id_room =  '" + id_room + "'");
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

