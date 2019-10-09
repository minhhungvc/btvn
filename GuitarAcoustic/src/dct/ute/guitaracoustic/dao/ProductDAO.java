package dct.ute.guitaracoustic.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import javax.servlet.http.Part;

import dct.ute.guitaracoustic.bo.Product;
import dct.ute.guitaracoustic.dbconnect.ConnectionFactory.ConnectionFatory;

public class ProductDAO {

	// Select all
	public ArrayList<Product> getAllProduct() {
		Connection connection = null;
		Statement statement = null;
		ResultSet resultSet = null;

		ArrayList<Product> listProduct = new ArrayList<Product>();

		try {
			connection = ConnectionFatory.getConnectinon();
			statement = connection.createStatement();
			resultSet = statement.executeQuery("SELECT * FROM product");
			while (resultSet.next()) {
				listProduct.add(convertToProduct(resultSet));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (connection != null) {
				try {
					connection.close();
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
			if (resultSet != null) {
				try {
					resultSet.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}

		return listProduct;

	}

	// Find Product by name
	public ArrayList<Product> findProductByName(String name) {
		Connection connection = null;
		Statement statement = null;
		ResultSet resultSet = null;

		ArrayList<Product> listProduct = new ArrayList<Product>();
		try {
			connection = ConnectionFatory.getConnectinon();
			statement = connection.createStatement();
			resultSet = statement.executeQuery("SELECT * FROM product WHERE product_name = '" + name + "'");
			while (resultSet.next()) {
				listProduct.add(convertToProduct(resultSet));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (connection != null) {
				try {
					connection.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			if (statement != null) {
				try {
					statement.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			if (resultSet != null) {
				try {
					resultSet.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
		return listProduct;
	}

	// Insert
	public void insertProduct(Product product) {
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		String sql = "INSERT INTO product(img,product_name,product_type,detail,amount,price) VALUES (?,?,?,?,?,?)";
		try {
			connection = ConnectionFatory.getConnectinon();
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setBytes(1, product.getImg());
			preparedStatement.setString(2, product.getProductName());
			preparedStatement.setString(3, product.getProductType());
			preparedStatement.setString(4, product.getDetail());
			preparedStatement.setInt(5, product.getAmount());
			preparedStatement.setInt(6, product.getPrice());
			preparedStatement.execute();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (connection != null) {
				try {
					connection.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			if (preparedStatement != null) {
				try {
					preparedStatement.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
	}

	// Update product
	public void updateProduct(Product product) {
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		try {
			String sql = "UPDATE product SET img =?, product_name =?, product_type=?,detail=?, amount=?,price=? WHERE id_product=?";
			connection = ConnectionFatory.getConnectinon();
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setBytes(1, product.getImg());
			preparedStatement.setString(2, product.getProductName());
			preparedStatement.setString(3, product.getProductType());
			preparedStatement.setString(4, product.getDetail());
			preparedStatement.setInt(5, product.getAmount());
			preparedStatement.setInt(6, product.getPrice());
			preparedStatement.setInt(7, product.getProductID());
			preparedStatement.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (connection != null) {
				try {
					connection.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			if (preparedStatement != null) {
				try {
					preparedStatement.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
	}

	// Delete by Id
	public void deleteProduct(int id) {
		Connection connection = null;
		Statement statement = null;
		String sql = "DELETE FROM product WHERE id_product = '" + id + "'";
		try {
			connection = ConnectionFatory.getConnectinon();
			statement = connection.createStatement();
			statement.execute(sql);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (connection != null) {
				try {
					connection.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			if (statement != null) {
				try {
					statement.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
	}

	// Get Product
	public Product getProduct(int id) {
		Connection connection = null;
		Statement statement = null;
		ResultSet resultSet = null;
		try {
			connection = ConnectionFatory.getConnectinon();
			statement = connection.createStatement();
			resultSet = statement.executeQuery("SELECT * FROM product where id_product = '" + id + "'");
			while (resultSet.next()) {
				Product product = convertToProduct(resultSet);
				return product;
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (connection != null) {
				try {
					connection.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			if (statement != null) {
				try {
					statement.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
		if (resultSet != null) {
			try {
				resultSet.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return null;
	}

	// extractFile
	public static String extractFileName(Part part) {
		String contentDisp = part.getHeader("content-disposition");
		String[] items = contentDisp.split(";");
		for (String s : items) {
			if (s.trim().startsWith("filename")) {
				return s.substring(s.indexOf("=") + 2, s.length() - 1);
			}
		}
		return "";

	}

	// Convert to Product
	public static Product convertToProduct(ResultSet rs) throws SQLException {
		Product product = new Product();
		product.setProductID(rs.getInt(1));
		byte[] imgData = rs.getBytes("img");
		product.setImg(imgData);
		product.setProductName(rs.getString(3));
		product.setProductType(rs.getString(4));
		product.setDetail(rs.getString(5));
		product.setAmount(rs.getInt(6));
		product.setPrice(rs.getInt(7));
		return product;

	}

}
