import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("������ �Է��ϼ���: ");
		int input = sc.nextInt();
		if (input % 3 == 0) {
			if (input % 5 == 0) {
				System.out.println("3�� 5�� ����Դϴ�.");
			} else {
				System.out.println("3�� ����Դϴ�.");
			}
		} else if (input % 5 == 0) {
			System.out.println("5�� ����Դϴ�.");
		} else {
			System.out.println("3�� ����� 5�� ����� �ƴմϴ�.");
		}
		
		sc.close();
	}

}
