package pack2;
import pack1.Calculator;

public class CalculatorTest {
	public static void main(String[] args) {
		Calculator c= new Calculator();
		System.out.println("Sum ="+c.add(50,20));
		System.out.println("Product ="+c.multiply(30,20));
	}

}
