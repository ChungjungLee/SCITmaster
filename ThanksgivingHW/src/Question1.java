/*
 * �Ǻ���ġ �����̶� ó�� �� ���� 1�� 1�� �� ��, 
 * �� ���� �׺��ʹ� �ٷ� ���� �� ���� ���� ���� ����� ������ ���Ѵ�. 
 * �Ǻ���ġ ������ for���� ����Ͽ� ����Ѵ�
 * 
 * */
import java.util.Scanner;

public class Question1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�� ��° �ױ��� ������� �Է�:  ");
		int input = sc.nextInt();
		
		if (input < 1) {
			System.out.println("1���� ū ���� �Է��ϼ���.");
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
