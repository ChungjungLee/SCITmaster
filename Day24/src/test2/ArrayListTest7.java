package test2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * String�� �����ϴ� arraylist�� Test6�� �ٲٱ�
 * @author user
 *
 */
public class ArrayListTest7 {
	static ArrayList<String> list = new ArrayList<>();
	static Scanner sc= new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
					String deleted = sc.next();
					
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
	}
	
	public static void case01() {
		System.out.println("�� �Է�: ");
		String value = sc.next();
		list.add(value);
		
	}
	
	public static void case02() {
		System.out.println("�˻��� ��: ");
		String search = sc.next();
		
		// ArrayList�� method�� �̿�
		boolean isFound = list.contains(search);
		
		// ���� �˻�
		boolean canSearch = false;
		
		for (int i = 0; i < list.size(); i++) {
			if (search.equals(list.get(i))) {
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
