
public class Calculator_Test {
	public static void main (String[] args) {
		Calculator c = new Calculator();
		
		c.kor = 80;
		c.eng = 90;
		c.mat = 70;
		
		// È£ÃâÇÑ´Ù(invocation)
		int sum = c.getSum();
		//cÀÇ getSum()À» »ç¿ëÇß´õ´Ï °ªÀÌ Æ¢¾î³ª¿È
		System.out.println("ÃÑÁ¡: " + sum);
		
		double avg = c.getAverage();
		System.out.println("Æò±Õ: " + avg);
		
		c.kor = 100;
		c.eng = 100;
		c.mat = 100;
		
		sum = c.getSum();
		System.out.println("ÃÑÁ¡: " + sum);
		//System.out.println("ÃÑÁ¡: " + c.getSum());
		
		avg = c.getAverage();
		System.out.println("Æò±Õ: " + avg);
		
		
	}
}
