
public class CalculatorFloat_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CalculatorFloat calc = new CalculatorFloat();
		
		double a = 12.0;
		double b = 6.0;
		
		System.out.println("a + b = " + calc.add(a, b));
		System.out.println("a - b = " + calc.subtract(a, b));
		System.out.println("a * b = " + calc.multiply(a, b));
		System.out.println("a / b = " + calc.divide(a, b));
		System.out.println("-a = " + calc.signChange(a));
		System.out.println("-b = " + calc.signChange(b));
	}

}
