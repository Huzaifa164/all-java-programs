package assignment3;

public class Book extends Product {
	public Book(String productName, int stock) {
		super(productName, stock);
		
	}
	float discount = 0.9f;
	public int orderProduct(String name, int qty) {
		return generateBill(qty, price, discount);
	}
	public int generateBill(int qty, int price, float discount) {
		return (int)(qty * price * discount);
	}
}
