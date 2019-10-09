package dct.ute.guitaracoustic.servlet;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import dct.ute.guitaracoustic.bo.Product;
import dct.ute.guitaracoustic.dao.ProductDAO;

/**
 * Servlet implementation class UpdateProductServlet
 */
@WebServlet(name = "updateProduct", urlPatterns = { "/updateProduct" })
@MultipartConfig(fileSizeThreshold = 1024 * 1024 * 2,
maxFileSize=1024*1024*10,
maxRequestSize = 1024 * 1024 * 50)
public class UpdateProductServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateProductServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		RequestDispatcher dispatcher = this.getServletContext()
				.getRequestDispatcher("/WEB-INF/view/updateProduct.jsp");
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String name = (String) request.getParameter("name");
		InputStream inputStream = null;

		Part filePart = request.getPart("image");
		if (filePart != null) {
			// prints out some information for debugging
			System.out.println(filePart.getName());
			System.out.println(filePart.getSize());
			System.out.println(filePart.getContentType());

			// obtains input stream of the upload file
			// the InputStream will point to a stream that contains
			// the contents of the file
			inputStream = filePart.getInputStream();
		}
		String type = (String) request.getParameter("type");
		String detail = (String) request.getParameter("detail");
		String amountStr = (String) request.getParameter("amount");
		int amount = Integer.parseInt(amountStr);
		String priceStr = (String) request.getParameter("price");
		int price = Integer.parseInt(priceStr);

		Product product = new Product();
		product.setProductName(name);
		product.setImg(readFile(inputStream));
		product.setProductType(type);
		product.setDetail(detail);
		product.setAmount(amount);
		product.setPrice(price);

		ProductDAO productDAO = new ProductDAO();
		productDAO.insertProduct(product);
		response.sendRedirect(request.getContextPath() + "/productList");

	}

	private static byte[] readFile(InputStream inputStream) {
		ByteArrayOutputStream bos = null;
		try {
			byte[] buffer = new byte[1024];
			bos = new ByteArrayOutputStream();
			for (int len; (len = inputStream.read(buffer)) != -1;) {
				bos.write(buffer, 0, len);
			}

		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
		return bos.toByteArray();
	}
}