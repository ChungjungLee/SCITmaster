/*
 * ����, ���� �Է¹޾� �ش� ���� �޷��� ����Ѵ�.
 * 
 * - �Է¹��� ������ y, ���� m�� ���
 * - 1�� 1�� 1�� ���� �Է¹��� y�� m�� 1�ϱ����� ��¥���� ���Ѵ�.
 * - ���� ��¥ ���� 7�� ���� �������� �����̴�. (0�� �Ͽ���, 1�� ������)
 * - �޷��� ����� ���� ù���� ���� ���������� ���� \t �Ǵ� �����̽��� �̿��Ͽ� ĭ�� ����.
 * - �ݺ����� �̿��Ͽ� 1�Ϻ��� �ش� ���� ������ ������ ����Ѵ�.
 * - ������� ����� ������ ���� �ٲ۴�.
 * 
 */
import java.util.Calendar;
import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) {
		/*
		// Calendar ��ü �޾ƿ���
		Calendar c = Calendar.getInstance();
		
		// ��¥�� ���� ex)Sep 01
		c.set(Calendar.MONTH, Calendar.SEPTEMBER);
		c.set(Calendar.DATE, 1);
		
		// 1(��) ~ 7(��)
		System.out.println(c.get(Calendar.DAY_OF_WEEK));
		
		// Jan 1, 0001 ���� Oct 2, 2017 ���� 736,605�� ���
		*/
		
		/*
		Scanner sc = new Scanner(System.in);
		
		System.out.print("��: ");
		int year = sc.nextInt();
		System.out.print("��: ");
		int month = sc.nextInt();
		*/
		
		System.out.println(736605%7);
		
		/* 
		 * 1�� 1�� 1�Ϻ��� �ش� �� �������� ��¥ ���
		 * 
		 * 1) 1���� 365���̹Ƿ� �ش� �⵵-1 * 365���� �켱 ����
		 * 2) ������ ��찡 �� �ֱ� ������ �ش� �⵵ / 4
		 */
		
		
	}

}
