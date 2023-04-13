package assignment3;

public class ProductInventory {
	private Product products[] = new Product[4];
	private static int counter = 0;
	
	public void add(Product product) {
		products[counter++] = product;
	}
	
	public double calculateDiscount(Product product) {
		if(product instanceof Book) {
			return product.getPrice() * 0.1;
		}
		else if(product instanceof Toy) {
			Toy toy = (Toy) product;
			if(toy.getAge() >= 2 && toy.getAge() <= 4) {
				return product.getPrice() * 0.15;
			} else if(toy.getAge() >= 5 && toy.getAge() <= 6) {
				return product.getPrice() * 0.05;
			}
		}
		return 0;
	}
	
	public int billAmount(String name, int qty) {
		for(Product product: products) {
			if(product.getProductName().equals(name)) {
				if(product.getStock() >= qty) {
					int amount = (int)(product.getPrice() - calculateDiscount(product)) * qty;
					product.setStock(product.getStock() - qty);
					return amount;
				}
			}			
		}
		return 0;
	}
}
