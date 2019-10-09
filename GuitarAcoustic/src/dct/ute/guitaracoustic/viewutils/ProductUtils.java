package dct.ute.guitaracoustic.viewutils;

import java.util.ArrayList;
import org.apache.tomcat.util.codec.binary.Base64;

import dct.ute.guitaracoustic.bo.Product;
import dct.ute.guitaracoustic.viewbo.ProductView;

public class ProductUtils {

	public static ArrayList<ProductView> convertToProductViewList(ArrayList<Product> productList) {
		ArrayList<ProductView> productViewsList = new ArrayList<ProductView>();
		for (Product product : productList) {
			productViewsList.add(convertToProductView(product));
		}
		return productViewsList;

	}

	public static ProductView convertToProductView(Product product) {
		ProductView productView = new ProductView();
		productView.setProductID(product.getProductID());

		String photoEncode = Base64.encodeBase64String(product.getImg());
		productView.setImg(photoEncode);

		productView.setProductName(product.getProductName());
		productView.setProductType(product.getProductType());
		productView.setDetail(product.getDetail());
		productView.setAmount(product.getAmount());
		productView.setPrice(product.getPrice());

		return productView;
	}
}
