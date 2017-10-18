package test2;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListTest6 {
	// static�̶�?
	// ���ʿ� ���α׷��� ����� �� ��������� �ֵ�
	static ArrayList<Integer> list = new ArrayList<>();
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		
		while(true) {
			System.out.println("1. ���");
			System.out.println("2. �˻�");
			System.out.println("3. ����");
			System.out.println("4. ���");
			System.out.println("9. ����");
			System.out.print("�Է�: ");
			
			int option = sc.nextInt();
			
			switch(option) {
				case 1:	// ���
					case01();
					break;
					
				case 2:	// �˻�
					case02();
					break;
					
				case 3:	// ����
					// remove() method�� index�� �޴� �Ͱ� ��(obj)�� �޴� �� �� ������ �ִ�
					System.out.println("�� �Է�: ");
					Integer deleted = sc.nextInt();
					
					// ArrayList�� method �̿�
					boolean canRemove = list.remove(deleted);
					
					if (canRemove) {
						System.out.println("���� �Ϸ�");
					} else {
						System.out.println("���� ����");
					}
					
					break;
				
				case 4:	// ���
					for (int i = 0; i < list.size(); i++) {
						System.out.print(list.get(i) + " ");
					}
					
					break;
					
				case 9:	// ����
					System.exit(0);	//switch �ȿ����� break;�� ������ �ʾƼ�
									// ���α׷� ���� ����. �ٸ� �̰��� ������� �ʴ� ���� ����
					break;
					
				default:
					break;
			}
			
		} // end of while
	} // main
	
	public static void case01() {
		System.out.println("�� �Է�: ");
		int value = sc.nextInt();
		list.add(value);
		
	}
	
	public static void case02() {
		System.out.println("�˻��� ��: ");
		Integer search = sc.nextInt();
		
		// ArrayList�� method�� �̿�
		boolean isFound = list.contains(search);
		
		// ���� �˻�
		boolean canSearch = false;
		
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i) == search) {
				System.out.println("����");
				canSearch = true;
				break;
			}
		}
		
		if (canSearch == false) {
			System.out.println("����");
		}
	}

}
