package test2;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		// String만 받는 리스트
		ArrayList<String> list = new ArrayList<>();
		
		for (int i = 0; i < 5; i++) {
			System.out.print("입력: ");
			String word = sc.next();
			list.add(word);
		}
		
		// 출력
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i));
		}
		
		
	}

}
