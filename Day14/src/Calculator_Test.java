
public class Calculator_Test {
	public static void main (String[] args) {
		Calculator c = new Calculator();
		
		c.kor = 80;
		c.eng = 90;
		c.mat = 70;
		
		// ȣ���Ѵ�(invocation)
		int sum = c.getSum();
		//c�� getSum()�� ����ߴ��� ���� Ƣ���
		System.out.println("����: " + sum);
		
		double avg = c.getAverage();
		System.out.println("���: " + avg);
		
		c.kor = 100;
		c.eng = 100;
		c.mat = 100;
		
		sum = c.getSum();
		System.out.println("����: " + sum);
		//System.out.println("����: " + c.getSum());
		
		avg = c.getAverage();
		System.out.println("���: " + avg);
		
		
	}
}
