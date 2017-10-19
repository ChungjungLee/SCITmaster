package study;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Dictionary {

	public static void main(String[] args) {
		// �ܾ ������ Map
		Map<String, String> dict = new HashMap<>();
		
		Scanner sc = new Scanner(System.in);
		
		boolean isContinued = true;
		while (isContinued) {
			// �޴� ���
			System.out.println("1. ���");
			System.out.println("2. �˻�");
			System.out.println("9. ����");
			System.out.print("�Է�: ");
			
			int option = sc.nextInt();
			
			switch (option) {
				case 1:
					System.out.print("�ܾ�: ");
					String word = sc.next();
					
					System.out.println("��: ");
					String meaning = sc.next();
					
					dict.put(word, meaning);
					// put()�� �� �̹� �����ϴ� key���� �ѱ�� ��ȯ�ϴ� ����
					// ������ key���� �����ϴ� value���̴�. �׸��� ������
					// pair�� �ִ´�. key���� �����ٸ� null ��ȯ!
					
					break;
					
				case 2:
					System.out.print("�ܾ�: ");
					String wordFind = sc.next();
					
					String meaning1 = dict.get(wordFind);
					
					if (meaning1 == null) {
						System.out.println("�ܾ �������� �ʽ��ϴ�.");
					} else {
						System.out.println("�ܾ �����մϴ�.");
					}
					
					break;
					
				case 9:
					isContinued = false;
					break;
				
				default:
					System.out.println("�߸� �Է�");
					break;
			}
			
			
		}
		
	}

}
