import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요: ");
		int input = sc.nextInt();
		if (input % 3 == 0) {
			if (input % 5 == 0) {
				System.out.println("3과 5의 배수입니다.");
			} else {
				System.out.println("3의 배수입니다.");
			}
		} else if (input % 5 == 0) {
			System.out.println("5의 배수입니다.");
		} else {
			System.out.println("3의 배수도 5의 배수도 아닙니다.");
		}
		
		sc.close();
	}

}
