package dct.ute.guitaracoustic.bo;

public class Product {
	private int productID;
	private byte[] img;
	private String productName;
	private String productType;
	private String detail;
	private int amount;
	private int price;
	public Product() {
		super();
		
	}
	public Product(int productID, byte[] img, String productName, String productType, String detail, int amount,
			int price) {
		super();
		this.productID = productID;
		this.img = img;
		this.productName = productName;
		this.productType = productType;
		this.detail = detail;
		this.amount = amount;
		this.price = price;
	}
	public int getProductID() {
		return productID;
	}
	public void setProductID(int productID) {
		this.productID = productID;
	}
	public byte[] getImg() {
		return img;
	}
	public void setImg(byte[] img) {
		this.img = img;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getProductType() {
		return productType;
	}
	public void setProductType(String productType) {
		this.productType = productType;
	}
	public String getDetail() {
		return detail;
	}
	public void setDetail(String detail) {
		this.detail = detail;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	
}
