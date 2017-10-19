package study;

import java.util.HashMap;

public class MapTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, String> map = new HashMap<>();
		
		map.put(1, "일");
		map.put(2, "이");
		map.put(3, "삼");
		
		String v1 = map.get(1);
		System.out.println(v1);
		
		String v2 = map.get(2);
		System.out.println(v2);
		
		String v3 = map.get(3);
		System.out.println(v3);
		
		/*
		 * ArrayList의 경우, 순서대로 저장되어 있기 때문에 값을 찾을 때까지
		 * 모든 원소를 비교해야 한다.
		 * 
		 * HashMap의 경우, 값을 순서 없이, 연속성 없이 저장하지만 키를 가지고 한 번에
		 * 찾을 수 있다. 키 라는 것은 목차하고 비슷하기 때문임.
		 * 그래서 값은 중복이 되어도 상관없으나 키는 중복이 있어서는 안 된다.
		 */
		
		HashMap<String, String> map2 = new HashMap<>();
		/*
		 * 내가 직접 만든 클래스를 <>에 넘기는 것은 hashcode()를 재정의해야 하므로
		 * 지금 단계에서는 비추.
		 * Integer나 String을 사용하도록 할 것
		 * 
		 */
		
		map2.put("OOP", "객체 지향 프로그래밍");
		map2.put("LAN", "Local Area Network");
		map2.put("GOD", "아이돌그룹");
		
		String b1 = map2.get("OOP");
		System.out.println(b1);
		
		String b2 = map2.get("LAN");
		System.out.println(b2);
		
		String b3 = map2.get("GOD");
		System.out.println(b3);
		
		// map에 해당 key를 가지고 있는지 판단한 후에 get()을 하는 것이 훨씬 안전한 방법!
		if (map2.containsKey("GOD")) {
			System.out.println(map2.get("GOD"));
		}
		
		
		
	}

}
