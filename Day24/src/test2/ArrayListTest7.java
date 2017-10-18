package test2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * String을 저장하는 arraylist로 Test6번 바꾸기
 * @author user
 *
 */
public class ArrayListTest7 {
	static ArrayList<String> list = new ArrayList<>();
	static Scanner sc= new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		while(true) {
			System.out.println("1. 등록");
			System.out.println("2. 검색");
			System.out.println("3. 삭제");
			System.out.println("4. 출력");
			System.out.println("9. 종료");
			System.out.print("입력: ");
			
			int option = sc.nextInt();
			
			switch(option) {
				case 1:	// 등록
					case01();
					break;
					
				case 2:	// 검색
					case02();
					break;
					
				case 3:	// 삭제
					// remove() method는 index를 받는 것과 값(obj)을 받는 것 두 가지가 있다
					System.out.println("값 입력: ");
					String deleted = sc.next();
					
					// ArrayList의 method 이용
					boolean canRemove = list.remove(deleted);
					
					if (canRemove) {
						System.out.println("삭제 완료");
					} else {
						System.out.println("삭제 실패");
					}
					
					break;
				
				case 4:	// 출력
					for (int i = 0; i < list.size(); i++) {
						System.out.print(list.get(i) + " ");
					}
					
					break;
					
				case 9:	// 종료
					System.exit(0);	//switch 안에서는 break;가 먹히지 않아서
									// 프로그램 강제 종료. 다만 이것은 사용하지 않는 편이 좋다
					break;
					
				default:
					break;
			}
			
		} // end of while
	}
	
	public static void case01() {
		System.out.println("값 입력: ");
		String value = sc.next();
		list.add(value);
		
	}
	
	public static void case02() {
		System.out.println("검색할 값: ");
		String search = sc.next();
		
		// ArrayList의 method를 이용
		boolean isFound = list.contains(search);
		
		// 직접 검색
		boolean canSearch = false;
		
		for (int i = 0; i < list.size(); i++) {
			if (search.equals(list.get(i))) {
				System.out.println("있음");
				canSearch = true;
				break;
			}
		}
		
		if (canSearch == false) {
			System.out.println("없음");
		}
	}


}
