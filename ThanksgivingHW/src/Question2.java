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
		
		*/
		
		// Gregorian Calendar�δ� Jan 1, 0001�� �������̴�.
		// Jan 1, 0001 ���� Oct 1, 2017 ���� 736,602�� ��� (�� ��¥�� ������)
		//System.out.println(736602%7);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("��: ");
		int year = sc.nextInt();
		System.out.print("��: ");
		int month = sc.nextInt();
		
		/* 
		 * 1�� 1�� 1�Ϻ��� �ش� �� �������� ��¥ ���
		 * 
		 * 1) �ش� �⵵ ���������� ��¥�� ����
		 * 2) �ش� �� ���������� ��¥�� �߰��� ���� 
		 */
		int total_days = 0;
		// 1)
		for (int i = 1; i < year; i++) {
			total_days += 365;
			if ((i % 4 == 0 && i % 100 != 0) || (i % 400 == 0)) {
				total_days += 1;
			}
		}
		// 2)
		for (int i = 1; i < month; i++) {
			switch (i) {
				case 1: case 3: case 5: case 7:
				case 8: case 10: case 12:
					total_days = total_days + 31;
					break;
					
				case 2:
					if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
						total_days = total_days + 29;
					} else {
						total_days = total_days + 28;
					}
					break;
					
				case 4: case 6: case 9: case 11:
					total_days = total_days + 30;
					break;
			}
			
		} // end of for loop
		
		System.out.println("total_days: " + total_days);
		System.out.println("day " + total_days % 7);
		
		// 0: ��, 1: ȭ, 2: ��, 3: ��, 4: ��, 5: ��, 6: �� 
		// �ε� ����� ���������Ƿ� �Ϸ縦 ���ؼ� ����� ����
		int daysInWeek = total_days % 7;
		// 0: ��, 1: ��, 2: ȭ, 3: ��, 4: ��, 5: ��, 6: ��
		daysInWeek = (total_days + 1) % 7;
		
		/*
		 * �޷� ���
		 * */
		System.out.println("\t\t" + year + "��" + month + "��" + "\n");
		System.out.println("��\t��\tȭ\t��\t��\t��\t��");
		int day = 1;
		int daysInMonth;
		switch (month) {
			case 1: case 3: case 5: case 7:
			case 8: case 10: case 12:
				daysInMonth = 31;
				break;
				
			case 2:
				if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
					daysInMonth = 29;
				} else {
					daysInMonth = 28;
				}
				break;
				
			default:
				daysInMonth = 30;
				break;
		}
		int i = 0;
		for (i = 0; i < daysInWeek; i++) {
			System.out.print("\t");
		}
		for (day = 1; day <= daysInMonth; day++) {
			System.out.print(day + "\t");
			if (i % 7 == 6) {
				System.out.println();
			}
			i++;
		}
		
		System.out.println();
	}

}
