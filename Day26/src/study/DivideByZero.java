package study;
import java.util.Scanner;

public class DivideByZero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		int x, y;
		
		System.out.print("������: ");
		x = scanner.nextInt();
		System.out.print("����: ");
		y = scanner.nextInt();
		
		try {
			int result = x / y;
			
			System.out.println("������ ���: " + result);
		} catch (ArithmeticException e) {
			// try ��Ͽ��� ������ ������ ���⼭ ó���ϰڴ�
			System.out.println("0���� ���� �� �����ϴ�.");
		}
		
		// ������ �߻��ߴٰ� �ϴ��� catch ��Ͽ��� ó���� �ϹǷ�
		// ����ؼ� �ڵ�� ������ �ȴ�.
		System.out.println("���α׷��� ��� �˴ϴ�.");
	}

}
