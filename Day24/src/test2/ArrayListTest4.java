package test2;

import java.util.ArrayList;

public class ArrayListTest4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list = new ArrayList<>();
		
		/*
		 * 만약 이중배열처럼 이중리스트를 만들고 싶다?
		 * 배열의 원소가 배열인것과 같이 리스트의 원소가 리스트다
		 * 
		 * ArrayList<ArrayList<Integer>>
		 */
		for (int i = 0; i < 10; i++) {
			list.add(i + 1);
		}
		
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i) % 2 == 0) {
				list.set(i, list.get(i) * 2);
			}
		}
		
		// ArrayList도 역시 for-each loop을 사용할 수 있다
		// for (Integer i : list) { sysout(i) };
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i));
		}
	}

}
