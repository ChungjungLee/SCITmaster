/*
 * ���ڿ��� ������ �Է¹޾� ����Ͽ� ����� ����Ѵ�.
 * 
 * - ���ڸ� ���� ������� ��Ģ������ ���Ե� ������ ���ڿ��� �Է¹޴´�.
 * - ������ �������� �ݵ�� '=' ���ڷ� ������ �Ѵ�.
 * - ������ �켱 ���� ������� �ʰ� �Էµ� ������� ����Ѵ�.
 * - 0~9, +, -, *, / �̿��� ���ڰ� ǥ�ԵǾ� ������ �����޽��� ����ϰ� ���α׷��� �����Ѵ�.
 * 
 * */
import java.util.Scanner;

public class Question3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� �Է�: ");
		String formula = sc.next();
		
		/* ������ �������� '=' ���ڷ� �������� �� */
		int formulaLen = formula.length();
		if (formula.charAt(formulaLen - 1) != '=') {
			System.out.println("������ �߸��Ǿ����ϴ�.");
			return;
		}
		
		/* ���� ���(�켱 ���� ������� ���� ���) */
		/*
		 * ���� ����� �տ������� ���ʷ� ���ڸ� ���ϸ� ����
		 * case 1) ���ڰ� ������ ��;
		 * 		���ڸ� term�� �о���δ�.
		 * 
		 * case 2) ��ȣ�� ������ ��;
		 * 		�������� ����Ǿ� �ִ� result & prevSign & term�� ����Ͽ�
		 * 		�� ����� result�� ����صΰ�, term�� ������ �缳���Ѵ�.
		 * 		�׸��� prevSign�� ��ȣ�� �����صΰ�, 
		 * 		���� ���ڸ� term�� �о���δ�.
		 * 
		 * case 3) ���� �ʴ� ���ڰ� ������ ��;
		 * 		��� ���α׷� �����Ѵ�.
		 * 
		 * */
		double result = 0;
		int term = 0;
		char prevSign = '+';
		for (int i = 0; i < formulaLen; i++) {
			
			char aChar = formula.charAt(i);
			if ('0' <= aChar && aChar <= '9') {
				// case 1)
				term = aChar - '0';
				
			} else if (aChar == '+' || aChar == '-' || aChar == '*' || 
						aChar == '/' || aChar == '=') {
				// case 2)
				switch (prevSign) {
					case '+':
						result = result + term;
						break;
						
					case '-':
						result = result - term;
						break;
						
					case '*':
						result = result * term;
						break;
						
					default:
						result = result / term;
						break;
				}
				
				prevSign = aChar;
				
			} else {
				// case 3)
				System.out.println("������ �߸��Ǿ����ϴ�.");
				return;
				
			}
			
		} // end of for loop
		
		System.out.println("����� " + result);
		
		/* ���� ���(�켱 ���� ����� ���) */
		/*
		 * ���� ����� �տ������� ���ʷ� ���ڸ� ���ϸ� ����
		 * case 1) ���ڰ� ������ ��;
		 * 		��ȣ�� ���� ������ ��� ���ڸ� term�� �о���δ�.
		 * 
		 * case 2) ��ȣ�� ������ ��;
		 * 		�������� ����Ǿ� �ִ� result & sign & term�� ����Ͽ�
		 * 		�� ����� result�� ����صΰ�, term�� ������ �缳���Ѵ�.
		 * 		�׸��� sign�� ��ȣ�� �����صΰ�, 
		 * 		���� ���ڰ� ���� ������ ���ڸ� term�� �о���δ�.
		 * 
		 * */		
	}

}
