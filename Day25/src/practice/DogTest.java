package practice;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 사용자로부터 강아지의 정보를 입력받아 ArrayList에 담는다
 * 등록, 검색, 삭제, 전체 출력이 가능하도록 메뉴를 구성하고
 * 프로그램을 계속 실행시킨다
 * 
 * @author user
 *
 */
public class DogTest {
	private static ArrayList<Dog> list = new ArrayList<>();
	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		boolean isContinued = true;
		while(isContinued) {
			System.out.println("<강아지 명부>");
			System.out.println("1. 등록");
			System.out.println("2. 검색");
			System.out.println("3. 삭제");
			System.out.println("4. 전체 출력");
			System.out.println("0. 종료");
			System.out.print("입력: ");
			int menu = sc.nextInt();	// buffer 내 \n 남아있다.
			//sc.nextLine();
			
			switch (menu) {
				case 1:
					// 등록
					case01();
					break;
					
				case 2:
					// 검색
					case02();
					break;
					
				case 3:
					// 삭제
					case03();
					break;
					
				case 4:
					// 전체 출력
					case04();
					break;
					
				case 0:
					// 종료
					System.out.println("프로그램을 종료합니다.");
					isContinued = false;
					break;
					
				default:
					System.out.println("잘못된 입력입니다.");
					break;
			}
			
		}	// end of while
		
	}	// end of main method
	
	/**
	 * 강아지를 등록한다.
	 */
	public static void case01() {
		System.out.print("이름: ");
		String name = sc.next();
		System.out.print("나이: ");
		int age = sc.nextInt();	// buffer 내 \n 미처리
		System.out.print("품종: ");
		String type = sc.next();
		
		Dog dog = new Dog(name, age, type);
		
		if(list.add(dog)) {
			System.out.println("등록되었습니다.");
		} else {
			System.out.println("등록에 실패했습니다.");
		}
	}
	
	/**
	 * 강아지를 검색한다.
	 */
	public static void case02() {
		System.out.print("이름: ");
		String name = sc.next();
		System.out.print("나이: ");
		int age = sc.nextInt();	// buffer 내 \n 미처리
		System.out.print("품종: ");
		String type = sc.next();
		
		Dog candidate = new Dog(name, age, type);
		
		// 포함하는지 아닌지 알 수 있는 함수
		list.contains(candidate);
		
		boolean isFound = false;
		for (Dog dog : list) {
			if (dog.equals(candidate)) {
				isFound = true;
				System.out.println("[검색 결과]");
				System.out.println(dog.toString());
			}
		}
		
		if (!isFound) {
			System.out.println("검색 결과가 없습니다.");
		}
	}
	
	/**
	 * 강아지를 삭제한다.
	 */
	public static void case03() {
		System.out.print("이름: ");
		String name = sc.next();
		System.out.print("나이: ");
		int age = sc.nextInt();	// buffer 내 \n 미처리
		System.out.print("품종: ");
		String type = sc.next();
		
		Dog candidate = new Dog(name, age, type);
		
		if (list.remove(candidate)) {
			System.out.println("삭제하였습니다.");
		} else {
			System.out.println("삭제에 실패했습니다.");
		}
	}
	
	/**
	 * 강아지를 전체 출력한다.
	 */
	public static void case04() {
		if (list.isEmpty()) {
			System.out.println("저장된 강아지가 없습니다.");
		} else {
			for (Dog dog : list) {
				// System.out.println(dog); 해도 자동으로 toString() 호출
				System.out.println(dog.toString());
			}
		}
	}
}
