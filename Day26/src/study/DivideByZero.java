package study;
import java.util.Scanner;

public class DivideByZero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		int x, y;
		
		System.out.print("피젯수: ");
		x = scanner.nextInt();
		System.out.print("젯수: ");
		y = scanner.nextInt();
		
		try {
			int result = x / y;
			
			System.out.println("나눗셈 결과: " + result);
		} catch (ArithmeticException e) {
			// try 블록에서 오류가 터지면 여기서 처리하겠다
			System.out.println("0으로 나눌 수 없습니다.");
		}
		
		// 오류가 발생했다고 하더라도 catch 블록에서 처리를 하므로
		// 계속해서 코드는 진행이 된다.
		System.out.println("프로그램은 계속 됩니다.");
	}

}
