package test2;

import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {
		// List<String> list = new ArrayList<>();
		// ���� �̷��� ����Ѵ�. �ٸ� arraylist ������ ����� �����Ѵ�
		// linkedlist�� ��ɵ� ����� �� �ִ�
		
		ArrayList<String> list = new ArrayList<>();
		
		list.add("����");
		list.add("��");
		list.add("����");
		
		list.add(1, "�佺Ʈ");	// ����
		
		list.set(2, "��");		// ��ü
		
		list.remove(1);			// ����
		
		list.contains("����");	// �����ϰ� �ִ��� Ȯ��
								// �ٸ� equals()�� ����� override������� �Ѵ�
		
		list.clear();			// ���� ���� ���� ����
		
		boolean isEmpty = list.isEmpty();	// ������� �ƴ��� Ȯ��
		
		for (int i = 0; i < list.size(); i++) {	
			System.out.println(list.get(i));
		}
	}

}
