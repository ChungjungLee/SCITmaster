package test2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 숫자 5개 입력받아 역순으로 출력하기
 * @author user
 *
 */
public class ArrayListTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list = new ArrayList<>();
		
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < 5; i++) {
			System.out.print("입력: ");
			String num = sc.next();
			list.add(num);
		}
		
		for (int i = list.size() - 1; i >= 0; i--) {
			System.out.println(list.get(i));
		}
	}

}
