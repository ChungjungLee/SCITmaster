package test2;

import java.util.ArrayList;

public class ArrayListTest4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list = new ArrayList<>();
		
		/*
		 * ���� ���߹迭ó�� ���߸���Ʈ�� ����� �ʹ�?
		 * �迭�� ���Ұ� �迭�ΰͰ� ���� ����Ʈ�� ���Ұ� ����Ʈ��
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
		
		// ArrayList�� ���� for-each loop�� ����� �� �ִ�
		// for (Integer i : list) { sysout(i) };
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i));
		}
	}

}
