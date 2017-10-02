/*
 * 문자열로 수식을 입력받아 계산하여 결과를 출력한다.
 * 
 * - 한자리 양의 정수들과 사칙연산이 포함된 수식을 문자열로 입력받는다.
 * - 수식의 마지막은 반드시 '=' 문자로 끝나야 한다.
 * - 연산자 우선 순위 고려하지 않고 입력된 순서대로 계산한다.
 * - 0~9, +, -, *, / 이외의 문자가 표함되어 있으면 에러메시지 출력하고 프로그램을 종료한다.
 * 
 * */
import java.util.Scanner;

public class Question3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("수식 입력: ");
		String formula = sc.next();
		
		/* 수식의 마지막이 '=' 문자로 끝났는지 비교 */
		int formulaLen = formula.length();
		if (formula.charAt(formulaLen - 1) != '=') {
			System.out.println("수식이 잘못되었습니다.");
			return;
		}
		
		/* 수식 계산(우선 순위 고려하지 않을 경우) */
		/*
		 * 수식 계산은 앞에서부터 차례로 문자를 비교하며 진행
		 * case 1) 숫자가 나왔을 때;
		 * 		숫자를 term에 읽어들인다.
		 * 
		 * case 2) 기호가 나왔을 때;
		 * 		이전까지 저장되어 있던 result & prevSign & term를 계산하여
		 * 		그 결과를 result에 기록해두고, term의 값으로 재설정한다.
		 * 		그리고 prevSign에 기호를 저장해두고, 
		 * 		다음 숫자를 term에 읽어들인다.
		 * 
		 * case 3) 맞지 않는 문자가 나왔을 때;
		 * 		즉시 프로그램 종료한다.
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
				System.out.println("수식이 잘못되었습니다.");
				return;
				
			}
			
		} // end of for loop
		
		System.out.println("결과는 " + result);
		
		/* 수식 계산(우선 순위 고려할 경우) */
		/*
		 * 수식 계산은 앞에서부터 차례로 문자를 비교하며 진행
		 * case 1) 숫자가 나왔을 때;
		 * 		기호가 나올 때까지 계속 숫자를 term에 읽어들인다.
		 * 
		 * case 2) 기호가 나왔을 때;
		 * 		이전까지 저장되어 있던 result & sign & term를 계산하여
		 * 		그 결과를 result에 기록해두고, term의 값으로 재설정한다.
		 * 		그리고 sign에 기호를 저장해두고, 
		 * 		다음 문자가 나올 때까지 숫자를 term에 읽어들인다.
		 * 
		 * */		
	}

}
