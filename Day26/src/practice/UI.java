package practice;

import java.util.Scanner;

public class UI {
	// UI class가 sc를 빈번하게 사용하기 때문에 필드로 선언
	private Scanner sc;
	private Manager manager;
	
	/*
	 * Constructor
	 */
	public UI() {
		sc = new Scanner(System.in);
		manager = new Manager();
	}
	
	public void start() {
		// while 돌면서 메소드만 실행시킬 수 있도록 하게끔
		boolean exit = true;
		while (exit) {
			System.out.println("1. 등록");
			System.out.println("2. 검색");
			System.out.println("3. 삭제");
			System.out.println("4. 전체 출력");
			System.out.print("입력 >> ");
			
			int option = 0;
			try {
				option = sc.nextInt();
			} catch (Exception e) {
				System.out.println("문자를 입력하지 마세요");
				// 메뉴로 다시 돌아감
				continue;
			}
			
			switch (option) {
				case 1:	// 등록
					insert();
					break;
					
				case 2:	// 검색
					select();
					break;
					
				case 3:	// 삭제
					break;
					
				case 4:	// 전체 출력
					break;
			}
			
			
			
			
		}
	} // method start()
	
	/**
	 * 등록
	 */
	private void insert() {
		// 굳이 외부에서는 이 메소드를 접근할 이유가 없어서 private으로 선언
		
		System.out.print("이름: ");
		String name = sc.next();
		System.out.print("나이: ");
		int age = sc.nextInt();
		System.out.print("주민번호: ");
		String ssn = sc.next();
		
		// 입력을 다 받았다면 Human 객체를 만들어서 Manager에게 처리토록 넘겨준다
		Human h = new Human(name, age, ssn);
		
		// TODO: 매니저에게 넘겨주어야 함
		// 이런 식으로 매번 manager 객체를 생성하면 저장되는 list가 매번 사라짐
		// 때문에 필드에서 한 번 생성해 사용해야 한다.
		// Manager manager = new Manager();
		boolean canAdd = manager.insert(h);
		if (canAdd) {
			System.out.println("등록이 완료되었습니다.");
		} else {
			System.out.println("등록에 실패하였습니다.");
		}
		
	}
	
	/**
	 * 검색
	 */
	private void select() {
		System.out.print("주민번호: ");
		String ssn = sc.next();
		
		// 입력을 받았다면 이 주민번호를 가지고 Manager한테 찾아달라고 요청한다
		Human select = manager.select(ssn);
		
		if (select == null) {
			System.out.println("아무것도 못 찾았다.");
		} else {
			System.out.println(select);
		}
		
	}
	
}
