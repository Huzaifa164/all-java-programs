package overriding3;

public class CodeExample {
	public static void main(String[] args) {
		Vehicle vehicle = new Vehicle();
		vehicle.fueltype();
//		vehicle.engine();
		Vehicle benz = new Car();
//		benz.engine();
		benz.fueltype();
	}
}
