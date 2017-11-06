package UI;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import Manager.ManagerClass;
import VO.Bird;
import VO.Fish;
import VO.Mammal;
import VO.Pet;

public class UIClass {
	
	// Scanner 선언 
	private Scanner scanner;
	//Manager 선언
	private ManagerClass manager;
	
	private Pet pet = null;

	public UIClass() {
		// Manager, Scanner 생성
		scanner = new Scanner(System.in);
		manager = new ManagerClass();
		// 출력문 연결
		UI();
	}

	public void UI() {
		boolean flag = true;
		while (flag) {
			MainMenu();
			
			switch (scanner.nextInt()) {
				case 1:
					System.out.println("=========등 록=========");
					data(1);
					//(1) 등록과 수정 구분
					break;
				case 2:
					System.out.println("=========검 색=========");
					search();
					break;
				case 3:
					System.out.println("=========등록 데이터 전체보기=========");
					print();
					break;
				case 4:
					System.out.println("=========수 정=========");
					data(2);
					//(2) 등록과 수정 구분
					break;
				case 5:
					System.out.println("=========삭 제=========");
					delete();
					break;
				case 6:
					System.out.println("=========저 장=========");
					checkSave();
					break;
				case 7:
					System.out.println("=========불러 오기=========");
					checkLoad();
					break;
				case 8:
					System.out.println("프로그램을 종료 합니다.");
					flag = false;
					break;
				default:
					System.out.println("메뉴 다시 선택");
					break;
			}
		}
	}

	/**
	 * 
	 * @param k 1이면 등록, 2면 수정
	 */
	public void data(int k) {
		subMenu();
		int option = scanner.nextInt();
		
		Pet toInsert = null;
		switch(option) {
			// registration() 사용하여  생성 Return 받아 Manager 연결
			// 등록과 수정은 data 메소드 사용. (매개변수로 구분)
			case 1: // 포유류
				toInsert = (Pet) registration(1);
				break;
			case 2: // 어류
				toInsert = (Pet) registration(2);
				break;
			case 3: // 조류
				toInsert = (Pet) registration(3);
				break;
			case 4: // 상위 메뉴로
				System.out.println("상위 메뉴로 갑니다.");
				return;
			default:
				break;
		}
		
		if (k == 1) {
			// register
			boolean isInserted = manager.register(toInsert);
			
			if (isInserted) {
				System.out.println("등록 성공");
			} else {
				System.out.println("등록 실패");
			}
		} else {
			// modify
			boolean isModified = manager.modify(toInsert);
			
			if (isModified) {
				System.out.println("수정 성공");
			} else {
				System.out.println("수정 실패");
			}
		}
		
		System.out.println();
	}

	public String getName() {
		System.out.println("이름: ");
		String Name = scanner.next();
		return Name;
	}

	private Object registration(int select) {
		// 매개변수 (포유류, 어류, 조류구분)이용하여 생성하여 return
		// Object 형태로 return
		Object obj = null;
		
		System.out.print("이름: ");
		String name = scanner.next();
		System.out.print("나이: ");
		String age = scanner.next();
		System.out.print("종류: ");
		String kindOfPet = scanner.next();
		
		switch (select) {
			case 1:
				obj = new Mammal(name, age, kindOfPet);
				break;
			case 2:
				obj = new Fish(name, age, kindOfPet);
				break;
			case 3:
				obj = new Bird(name, age, kindOfPet);
				break;
		}
		
		return obj;
	}

	public void search() {
		//검색 Manager 연결
		String name = getName();
		
		Pet searched = manager.search(name);
		
		if (searched == null) {
			System.out.println("검색 결과 없습니다.");
		} else {
			System.out.println(searched);
		}
		
		System.out.println();
	}

	public void print() {
		// 출력 Manager 연결
		ArrayList<Pet> petList = manager.allPrint();
		
		if (petList.size() == 0) {
			System.out.println("등록 정보 없습니다.");
		} else {
			for (Pet pet : petList) {
				System.out.println(pet);
			}
		}
		
		System.out.println();
	}

	public void delete() {
		//삭제 Manager 연결
		String name = getName();
		
		if (manager.delete(name) == false) {
			System.out.println("삭제 실패");
		} else {
			System.out.println("삭제 성공");
		}
		
		System.out.println();
	}

	public void checkSave() {
		try {
			manager.saveFile();
			System.out.println("저장.");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println();
	}

	public void checkLoad() {
		try {
			manager.loadFile();
			System.out.println("불러오기 완료.");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println();
	}

	public void MainMenu() {
		System.out.println("1.등록");
		System.out.println("2.검색");
		System.out.println("3.전체보기");
		System.out.println("4.수정");
		System.out.println("5.삭제");
		System.out.println("6.저장");
		System.out.println("7.불러오기");
		System.out.println("8.종료");
	}

	public void subMenu() {
		System.out.println("1.포유류");
		System.out.println("2.어류");
		System.out.println("3.조류");
		System.out.println("4.상위 메뉴로");
	}

}
