/*
 * 피보나치 수열이란 처음 두 항을 1과 1로 한 후, 
 * 그 다음 항부터는 바로 앞의 두 개의 항을 더해 만드는 수열을 말한다. 
 * 피보나치 수열을 for문을 사용하여 출력한다
 * 
 * */
import java.util.Scanner;

public class Question1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("몇 번째 항까지 출력할지 입력:  ");
		int input = sc.nextInt();
		
		if (input < 1) {
			System.out.println("1보다 큰 수를 입력하세요.");
			return;
		}
		
		int term1 = 0;
		int term2 = 1;
		for (int i = 0; i < input; i++) {
			System.out.print(term2 + " ");
			int nextTerm = term1 + term2;
			term1 = term2;
			term2 = nextTerm;
		}
		
		System.out.println();
	}

}
