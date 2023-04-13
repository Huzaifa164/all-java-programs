package assignment3;

public class Toy extends Product {
	int age;
	public Toy(String productName, int stock) {
		super(productName, stock);
	}
	public Toy(String productName, int stock, int price, int age) {
		super(productName, stock, price);
		this.age = age;
	}
	@Override
	public void getInfo() {
		super.getInfo();
		System.out.println("Age: " + age);
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}
