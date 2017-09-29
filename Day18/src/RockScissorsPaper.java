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
		// 게임을 계속 돌아가게 함
		while(true) {
			// 스캐너로 입력을 받는다
			System.out.println("1.바위 2.가위 3.보 9.종료");
			System.out.println("입력>> ");
			int input = sc.nextInt();
			
			int computer = (int)(Math.random() * 3); //0~2까지 나온다
			/*
			 * 랜덤으로 숫자 발생시키는 것
			 * Math.random() => 0.0(inclusive) ~ 1.0(exclusive)
			 * (int)(Math.random() * [갯수]) + [최초값]
			 */
			
			if (input == ROCK) {
				if (computer == ROCK) {
					System.out.println("무승부");
				} else if (computer == SCISSORS) {
					System.out.println("승리");
				} else {
					System.out.println("패배");
				}
			} else if (input == SCISSORS) {
				if (computer == ROCK) {
					System.out.println("패배");
				} else if (computer == SCISSORS) {
					System.out.println("무승부");
				} else {
					System.out.println("승리");
				}
			} else if (input == PAPER) {
				if (computer == ROCK) {
					System.out.println("승리");
				} else if (computer == SCISSORS) {
					System.out.println("패배");
				} else {
					System.out.println("무승부");
				}
			} else {
				System.out.println("게임 종료");
				break;
			}
		}
	}
}
