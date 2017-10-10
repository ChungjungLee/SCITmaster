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
 * (����)
 * Gregorian Calendar�δ� Jan 1, 0001�� �������̴�.
 * Jan 1, 0001 ���� Oct 1, 2017 ���� 736,602�� ��� (�� ��¥�� ������)
 * by https://www.epochconverter.com/seconds-days-since-y0
 * 
 */
import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) {
		// ������ �� ���� �Ǵ����� ������ �ִ� �迭, 1~12��
		final int[] daysInMonth = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

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
		 * 
		 * */
		int total_days = 0;
		// 1)
		for (int i = 1; i < year; i++) {
			total_days += 365;
			if (isLeapYear(i)) {
				total_days += 1;
			}
		}
		// 2)
		for (int i = 1; i < month; i++) {
			total_days = total_days + daysInMonth[i - 1];
			
			if (i == 2 && isLeapYear(year)) {
				total_days++;
			}
			
		} // end of for loop
		
		/*
		 * total_days % 7�� ���� ���� ���� �������� ������ �ȴ�.
		 * 0 ~ 6 ���ʴ�� ������ ~ �Ͽ����� �Ǵµ� �Ͽ��Ϻ��� ����ϰ��� �ϱ� ������
		 * total_days�� 1��  ���Ͽ� ����� �� ���̴�.
		 * �� 0 ~ 6 ���ʴ�� �Ͽ��� ~ ������� �ȴ�.
		 * 
		 * */ 
		int startDay = (total_days + 1) % 7;
		
		/*
		 * �޷� ���
		 * 
		 * */
		// ���� �޷��� ��� ��� �������� ��Ÿ���� �ε���
		int printIndex = 0;
		int daysInThisMonth = daysInMonth[month - 1];
		
		if (isLeapYear(year) && month == 2) {
			daysInThisMonth++;
		} 
		
		System.out.println("\t\t" + year + "�� " + month + "��" + "\n");
		System.out.println("��\t��\tȭ\t��\t��\t��\t��");
		
		for (printIndex = 0; printIndex < startDay; printIndex++) {
			System.out.print("\t");
		}
		
		for (int day = 1; day <= daysInThisMonth; day++) {
			System.out.print(day + "\t");
			
			if (printIndex % 7 == 6) {
				System.out.println();
			}
			
			printIndex++;
		}
		
		System.out.println();
		
		int t1 = total_days % 7;
		int date = -1 * (t1);
		
		for (int row = 0; row < 6; row++) {
			for (int col = 0; col < 7; col++) {
				if(1 <= date && date <= 31) {
					System.out.print(date);
				}
				System.out.print("\t");
				date++;
			}
			System.out.println();
		}
		sc.close();
	}

	/**
	 * �Է� ���� ������ �������� �ƴ��� �Ǻ��ϴ� �Լ�
	 * @param year		�Ǻ��ϰ��� �ϴ� ����
	 * @return true;	������ ��
	 * 			false;	������ �ƴ� ��
	 */
	public static boolean isLeapYear(int year) {
		if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
			return true;
		} else {
			return false;
		}
	}
	
	/*
	// Calendar ��ü �޾ƿ���
	Calendar c = Calendar.getInstance();
	
	// ��¥�� ���� ex)Sep 01
	c.set(Calendar.MONTH, Calendar.SEPTEMBER);
	c.set(Calendar.DATE, 1);
	
	// 1(��) ~ 7(��)
	System.out.println(c.get(Calendar.DAY_OF_WEEK));
	
	*/
}
