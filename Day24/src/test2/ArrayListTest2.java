package test2;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		// String�� �޴� ����Ʈ
		ArrayList<String> list = new ArrayList<>();
		
		for (int i = 0; i < 5; i++) {
			System.out.print("�Է�: ");
			String word = sc.next();
			list.add(word);
		}
		
		// ���
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i));
		}
		
		
	}

}
