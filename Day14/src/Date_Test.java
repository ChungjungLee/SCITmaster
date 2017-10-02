
public class Date_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date today = new Date();
		
		today.year = 2017;
		today.month = 9;
		today.day = 25;
		
		today.print1();
		today.print2();
		
		System.out.println();
		
		Date yesterday = new Date();
		
		yesterday.year = 2017;
		yesterday.month = 9;
		yesterday.day = 24;
		
		yesterday.print1();
		yesterday.print2();
	}

}
