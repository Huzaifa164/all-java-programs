package assignment3;

public class Product {
	private String productName;
	private int sequence = 1001;
	private int uid;
	private int stock;
	private int price;
	private int discount;
	private String description;
	public Product(String productName, int stock) {
		this.productName = productName;
		this.stock = stock;
		this.uid = sequence++;
	}
	
	public Product(String productName, int stock, int price) {
		this(productName, stock);
		this.price = price;
	}
	
	public Product() {
		this.uid = sequence++;
	}
	
	public void getInfo() {
		System.out.println("Unique id: " + uid);
		System.out.println("Product name: " + productName);
		System.out.println("Stock: " + stock);
		System.out.println("Price: " + price);
		System.out.println("Description: " + description);
	}
	
	public void changeDesc(String desc) {
		this.description = desc;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public int getUid() {
		return uid;
	}

	public void setUid(int uid) {
		this.uid = uid;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getDiscount() {
		return discount;
	}

	public void setDiscount(int discount) {
		this.discount = discount;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
}
