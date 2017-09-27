
public class Calculator_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// °´Ã¼ »ý¼º
		Calculator calc = new Calculator();
		
		int a = 100;
		int b = 30;
		
		int result = calc.add(a, b);
		System.out.println("a + b = " + result);
		
		result = calc.subtract(a, b);
		System.out.println("a - b = " + result);
		
		result = calc.multiply(a, b);
		System.out.println("a * b = " + result);
		
		result = calc.divide(a, b);
		System.out.println("a / b = " + result);
	}

}
