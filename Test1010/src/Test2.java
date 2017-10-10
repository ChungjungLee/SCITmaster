import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수1 입력: ");
		int num1 = sc.nextInt();
		System.out.print("정수2 입력: ");
		int num2 = sc.nextInt();

		if (num1 > num2) {
			int temp = num1;
			num1 = num2;
			num2 = temp;
		}
		
		for (int i = num1; i <= num2; i++) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		sc.close();
	}

}
