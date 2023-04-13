package assignment3;

public class App {
	public static void main(String[] args) {
		ProductInventory inv = new ProductInventory();
		inv.add(new Book("Head first java", 50, 200));
		inv.add(new Book("Let us C", 40, 300));
		inv.add(new Toy("RC Drone", 30, 1000, 6));
		inv.add(new Toy("Lego blocks", 20, 700,3));
		
		int billAmount = inv.billAmount("Lego blocks", 2);
		System.out.println("Bill Amount " + billAmount);
	}
}
