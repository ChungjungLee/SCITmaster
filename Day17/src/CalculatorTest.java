
public class CalculatorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator myCal = new Calculator();
		
		System.out.println(myCal.add(1, 2));
		System.out.println(myCal.add(1.4, 1.3));
		
		System.out.println(myCal.subtract(4, 1));
		System.out.println(myCal.subtract(3.8, 6.9));
		
		System.out.println(myCal.multiply(-1, 9));
		System.out.println(myCal.multiply(4.5, 1.5));
		
		System.out.println(myCal.divide(6, 3));
		System.out.println(myCal.divide(5.6, 0.8));
		
		System.out.println(myCal.absolute(4));
		System.out.println(myCal.absolute(-0.9));
		
		System.out.println(myCal.signChange(-56));
		System.out.println(myCal.signChange(5.6));
	}

}
