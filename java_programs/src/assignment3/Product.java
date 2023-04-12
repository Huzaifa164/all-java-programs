package assignment3;

public class Product {
	String productName;
	int uid;
	int stock;
	int price;
	int discount;
	String description;
	public Product(String productName, int stock) {
		this.productName = productName;
		this.stock = stock;
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
	
	public int orderProduct(String name, int qty) {
		int total = generateBill(qty, price);
		return total;
	}
	
	public int generateBill(int qty, int price) {
		return qty * price;
	}
	public static void main(String[] args) {
		Book b1 = new Book("Head first java", 50);
		b1.uid = 1;
		b1.price = 200;
		b1.description = "This is java book.";
		b1.getInfo();
		b1.changeDesc("This is core java book");
		b1.getInfo();
		int price = b1.orderProduct("Head first java", 2);
		System.out.println(price);
	}
}
