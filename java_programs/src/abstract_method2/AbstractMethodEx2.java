package abstract_method2;

public class AbstractMethodEx2 implements SquareCube {
	public int squareNum (int num) {
		return num*num;
	}
	public int cubeNum(int num) {
		return num*num*num;
	}
	public static void main(String[] args) {
		SquareCube obj = new AbstractMethodEx2();
		System.out.println("Square of number is: " + obj.squareNum(2));
		System.out.println("Cube of number is: " + obj.cubeNum(3));
	}
}
