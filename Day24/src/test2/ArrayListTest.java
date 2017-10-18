package test2;

import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {
		// List<String> list = new ArrayList<>();
		// 보통 이렇게 사용한다. 다만 arraylist 고유의 기능은 사용못한다
		// linkedlist의 기능도 사용할 수 있다
		
		ArrayList<String> list = new ArrayList<>();
		
		list.add("우유");
		list.add("빵");
		list.add("버터");
		
		list.add(1, "토스트");	// 삽입
		
		list.set(2, "꿀");		// 교체
		
		list.remove(1);			// 삭제
		
		list.contains("버터");	// 포함하고 있는지 확인
								// 다만 equals()를 제대로 override시켜줘야 한다
		
		list.clear();			// 내부 내용 전부 삭제
		
		boolean isEmpty = list.isEmpty();	// 비었는지 아닌지 확인
		
		for (int i = 0; i < list.size(); i++) {	
			System.out.println(list.get(i));
		}
	}

}
