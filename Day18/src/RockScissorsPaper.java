import java.util.Scanner;

public class RockScissorsPaper {
	private final static int ROCK = 1;
	private final static int SCISSORS = 2;
	private final static int PAPER = 3;
	
	private Scanner sc;
	
	public RockScissorsPaper() {
		sc = new Scanner(System.in);
	}
	
	public void start() {
		// ������ ��� ���ư��� ��
		while(true) {
			// ��ĳ�ʷ� �Է��� �޴´�
			System.out.println("1.���� 2.���� 3.�� 9.����");
			System.out.println("�Է�>> ");
			int input = sc.nextInt();
			
			int computer = (int)(Math.random() * 3); //0~2���� ���´�
			/*
			 * �������� ���� �߻���Ű�� ��
			 * Math.random() => 0.0(inclusive) ~ 1.0(exclusive)
			 * (int)(Math.random() * [����]) + [���ʰ�]
			 */
			
			if (input == ROCK) {
				if (computer == ROCK) {
					System.out.println("���º�");
				} else if (computer == SCISSORS) {
					System.out.println("�¸�");
				} else {
					System.out.println("�й�");
				}
			} else if (input == SCISSORS) {
				if (computer == ROCK) {
					System.out.println("�й�");
				} else if (computer == SCISSORS) {
					System.out.println("���º�");
				} else {
					System.out.println("�¸�");
				}
			} else if (input == PAPER) {
				if (computer == ROCK) {
					System.out.println("�¸�");
				} else if (computer == SCISSORS) {
					System.out.println("�й�");
				} else {
					System.out.println("���º�");
				}
			} else {
				System.out.println("���� ����");
				break;
			}
		}
	}
}
