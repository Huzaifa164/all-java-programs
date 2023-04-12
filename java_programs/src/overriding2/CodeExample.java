package overriding2;

public class CodeExample {
	public static void main(String[] args) {
		Bank sbibank = new SBI();
		Bank icicibank = new ICICI();
		Bank axisbank = new AXIS();
		Bank bank = new Bank();
		System.out.println("SBI Rate of Interest: " + sbibank.getRateOfInterest());
		System.out.println("ICICI Rate of Interest: " + icicibank.getRateOfInterest());
		System.out.println("AXIS Rate of Interest: " + axisbank.getRateOfInterest());
		System.out.println("Normal Rate of Interest: " + bank.getRateOfInterest());
	}
}
