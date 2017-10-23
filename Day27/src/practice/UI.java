package practice;

import java.util.ArrayList;
import java.util.Scanner;

/*
 * 클라이언트와 비슷
 */
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
			System.out.println("0. 종료");
			System.out.print("입력 >> ");
			
			int option = 0;
			try {
				option = sc.nextInt();
			} catch (Exception e) {
				System.out.println("문자를 입력하지 마세요");
				sc.nextLine();	// 버퍼에 처리하지 못한 입력이 남아있기 때문 
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
					delete();
					break;
					
				case 4:	// 전체 출력
					printAll();
					break;
				
				case 0:	// 종료
					exit = false;
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
	
	/**
	 * 삭제
	 */
	private void delete() {
		System.out.print("삭제할 주민번호: ");
		String ssn = sc.next();
		
		boolean canDelete = manager.delete(ssn);
		
		if (canDelete) {
			System.out.println("삭제되었습니다.");
		} else {
			System.out.println("삭제에 실패했습니다.");
		}
	}
	
	/**
	 * 전체 출력
	 */
	private void printAll() {
		// 출력하는 메소드인데 여기서 출력을 해줘야 하는지?
		
		/* Manager class에서는 한 줄도 출력하지 않는 방법 */
		// manager에서는 데이터를 넘겨주기만 하도록 하면 된다.
		// 즉, getter를 사용하면 된다는 것.
		/*
		int listSize = manager.getListSize();
		
		if (listSize == 0) {
			System.out.println("등록된 사람이 없습니다.");
		} else {
			for (int index = 0; index < manager.getListSize(); index++) {
				System.out.println((index + 1) + ") " + manager.getHuman(index));
			}
		}
		*/
		ArrayList<Human> list = manager.getList();
		
		if (list.isEmpty()) {
			System.out.println("등록된 사람이 없습니다.");
			return;
		}
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		/* Manager class에서 처음부터 끝까지 출력하는 방법 */
		manager.printAll();
	}
	
}
