package assignment4;

public class App {
	public static void main(String[] args) {
		PhoneBook p1 = new PhoneBook();
		p1.add(new Contact("Huzaifa", "123456789", "huzaifa@gmail.com"));
		p1.add(new Contact("Fahad", "234567890", "fahad@gmail.com"));
		p1.add(new Contact("Zaid", "345678901", "zaid@gmail.com"));
		p1.add(new Contact("Rohit", "456789012", "rohit@gmail.com"));
		p1.add(new Contact("Shubham", "567890123", "shubham@gmail.com"));
		
//		p1.display();
		
//		Contact result = p1.searchByNumber("123456789");
		
//		System.out.println(result.getName() + "," + result.getNumber() + "," + result.getEmail());
		
//		Contact result = p1.searchByName("Fahad");
		
//		System.out.println(result.getName() + "," + result.getNumber() + "," + result.getEmail());
		
		p1.remove("Shubham");
		p1.display();
	}
}
