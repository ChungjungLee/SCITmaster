package study;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Dictionary {

	public static void main(String[] args) {
		// 단어를 저장할 Map
		Map<String, String> dict = new HashMap<>();
		
		Scanner sc = new Scanner(System.in);
		
		boolean isContinued = true;
		while (isContinued) {
			// 메뉴 출력
			System.out.println("1. 등록");
			System.out.println("2. 검색");
			System.out.println("9. 종료");
			System.out.print("입력: ");
			
			int option = sc.nextInt();
			
			switch (option) {
				case 1:
					System.out.print("단어: ");
					String word = sc.next();
					
					System.out.println("뜻: ");
					String meaning = sc.next();
					
					dict.put(word, meaning);
					// put()할 때 이미 존재하는 key값을 넘기면 반환하는 것은
					// 기존의 key값에 대응하는 value값이다. 그리고 새로이
					// pair를 넣는다. key값이 없었다면 null 반환!
					
					break;
					
				case 2:
					System.out.print("단어: ");
					String wordFind = sc.next();
					
					String meaning1 = dict.get(wordFind);
					
					if (meaning1 == null) {
						System.out.println("단어가 존재하지 않습니다.");
					} else {
						System.out.println("단어가 존재합니다.");
					}
					
					break;
					
				case 9:
					isContinued = false;
					break;
				
				default:
					System.out.println("잘못 입력");
					break;
			}
			
			
		}
		
	}

}
