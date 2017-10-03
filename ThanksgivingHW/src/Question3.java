
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
			sc.close();
			return;
		}
		
		int[] calculateResult = { 0 };	// ������ ������� �����ϴ� ����
										// reference�� �Ѱ��ֱ� ���� �迭�� �����Ͽ���
		if (calculateFormula(formula, calculateResult)) {
			System.out.println("����� " + calculateResult[0]);
		} else {
			System.out.println("������ �߸��Ǿ����ϴ�.");
		}
		
		sc.close();
		
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
	
	/**
	 * �Է� ���� ������ ����ϴ� �Լ�
	 * @param formula 			�Է� ���� ����
	 * @param calculateResult 	��� ����� �����ϴ� ���� 1���� �迭
	 * @return true; 			���Ŀ� ������ ���� ����� ������� ��
	 * 		   false; 			���Ŀ� ������ ���� ��
	 */
	public static boolean calculateFormula(String formula, int[] calculateResult) {
		/* ���� ���(�켱 ���� ������� ���� ���) */
		/*
		 * ���� ����� �տ������� ���ʷ� ���ڸ� ���ϸ� ����
		 * case 1) ���ڰ� ������ ��;
		 * 		���ڸ� term�� �о���̰�,
		 * 		���ڸ� �о��ٴ� ���� isTermRead�� ǥ���� �д�.
		 * 
		 * case 2) ��ȣ�� ������ ��;
		 * 
		 * case 2-1) ��ȣ�� ���԰�, ������ �о���� ���ڰ� ���� ��;
		 * 		�������� ����Ǿ� �ִ� calculateResult & prevSign & term�� ����Ͽ�
		 * 		�� ����� calculateResult�� ����صд�.
		 * 		�������� �缳���Ѵ�.
		 * 		prevSign�� ��� �о��� ��ȣ��, isTermRead�� false��.
		 * 
		 * case 2-2) ��ȣ�� �������� ������ �о���� ���ڰ� ���� ��;
		 * 		��� false�� ��ȯ�Ѵ�.
		 * 
		 * case 3) ���� �ʴ� ���ڰ� ������ ��;
		 * 		��� false�� ��ȯ�Ѵ�.
		 * 
		 * */
		int formulaLen = formula.length();
		int term = 0;
		char prevSign = '+';
		boolean isTermRead = false;
		
		for (int i = 0; i < formulaLen; i++) {
			char aChar = formula.charAt(i);
			
			if ('0' <= aChar && aChar <= '9') {
				// case 1)
				term = aChar - '0';
				isTermRead = true;
				
			} else if (aChar == '+' || aChar == '-' || aChar == '*' || 
						aChar == '/' || aChar == '=') {
				// case 2)
				if (isTermRead) {
					// case 2-1)
					switch (prevSign) {
					case '+':
						calculateResult[0] = calculateResult[0] + term;
						break;
						
					case '-':
						calculateResult[0] = calculateResult[0] - term;
						break;
						
					case '*':
						calculateResult[0] = calculateResult[0] * term;
						break;
						
					default:
						calculateResult[0] = calculateResult[0] / term;
						break;
					}
					
					prevSign = aChar;
					isTermRead = false;
					
				} else {
					// case 2-2)
					return false;
					
				}
				
			} else {
				// case 3)
				return false;
				
			}
			
		} // end of for loop
		
		return true;
	}

}
