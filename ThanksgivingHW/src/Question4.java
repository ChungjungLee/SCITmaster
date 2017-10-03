/*
 * ȸ���� ��ȭ��ȣ�� �ּҸ� ���, �˻��� �� �ִ� ���α׷��� �ۼ��Ͻÿ�.
 * 
 * - ������ ���� Person Ŭ������ �����Ͽ� ȸ�� 1���� ������ ���� �� �ְ� �Ѵ�.
 * 	ȸ���ּҷ� ���α׷����� �Ѹ��� ȸ�������� ��Ÿ���� Ŭ����.
 * 	ȸ����ȣ, �̸�, ��ȭ��ȣ, �ּ� �̷��� 3������ �Ӽ��� ������.
 * 	��� �ʵ�� ���� �����ڰ� private�̸�,
 * 	�� �ʵ��� ���� �����ϴ� Setter�� �� �ʵ��� ���� �о �����ϴ� Getter�� ������.
 * 	�⺻�����ڿ� ��� �ʵ尪�� ���޹޾� �ʱ�ȭ�ϴ� �����ڸ� ������.
 * 	�� �ʵ��� ���� ������ ���� ����ϴ� print()�޼ҵ带 �����Ѵ�.
 * 
 * - �޴��� ����ϰ� �޴� ��ȣ�� �Է¹޾� �ش� ����� �����Ѵ�.
 * - 0�� �޴��� ������ ������ ���α׷��� �ݺ��ȴ�.
 * - ȸ�������� ���� 10��¥��  Person�迭�� �����Ͽ� �����Ѵ�.
 * - 10���� ��ϵǸ� 1�� �޴��� �������� ��, ���̻� ����� �� ���ٴ� �޽����� ����Ѵ�.
 * - �˻� ����� ȸ�� �̸��� �Է¹޾�, ��ϵ� ��� ȸ���� ���� �� ã���� ȸ�� ������ ����Ѵ�
 * 
 * */
import java.util.Scanner;

public class Question4 {

	public static void main(String[] args) {
		final int MAX_PERSON = 10;
		
		Scanner sc = new Scanner(System.in);
		Person p[] = new Person[MAX_PERSON];
		
		/* ���� �޴� */
		boolean isContinue = true;
		int currentPeople = 0;
		while (isContinue) {
			System.out.println();
			System.out.println("[ ȸ�� �ּҷ� ]");
			System.out.println("1. ȸ�� ���� ���");
			System.out.println("2. ��ü ȸ�� ����");
			System.out.println("3. ȸ�� ���� �˻�");
			System.out.println("0. ���α׷� ����");
			System.out.print("�޴� ��ȣ ����> ");
			int input = Integer.parseInt(sc.nextLine());
			
			switch (input) {
				case 1:
					/* ȸ�� ������ 10����� ��� */
					if (currentPeople >= MAX_PERSON) {
						System.out.println(MAX_PERSON + "���� ����Ͽ� �� �̻� ����� �� �����ϴ�.");
						break;
					}
					
					System.out.println();
					System.out.println("[ ȸ�� ��� ]");
					System.out.print("ȸ����ȣ: ");
					String memberNumber = sc.nextLine();
					System.out.print("�̸�: ");
					String name = sc.nextLine();
					System.out.print("��ȭ��ȣ: ");
					String phone = sc.nextLine();
					System.out.print("�ּ�: ");
					String address = sc.nextLine();
					
					p[currentPeople] = new Person(memberNumber, name, phone, address);
					currentPeople++;
					
					break;
					
				case 2:
					/* ȸ�� ���� ���� */
					System.out.println();
					System.out.println("[ ��ü ȸ�� ��� ]");
					
					if (currentPeople == 0) {
						System.out.println("��ϵ� ȸ���� �����ϴ�.");
					} else {
						for (int i = 0; i < currentPeople; i++) {
							p[i].print();
						}
					}
					
					break;
					
				case 3:
					/* ȸ�� ���� �˻�*/
					System.out.println();
					System.out.println("[ ȸ�� �˻� ]");
					System.out.print("�˻��� ȸ�� �̸�: ");
					String findingName = sc.nextLine();
					
					int indexFound;
					boolean isFound = false;
					for (indexFound = 0; indexFound < currentPeople; indexFound++) {
						if (p[indexFound].getName().equals(findingName)) {
							isFound = true;
							break;
						}
					}
					
					if (isFound) {
						p[indexFound].print();
					} else {
						System.out.println("ȸ�� �˻� ����� �����ϴ�.");
					}
					
					break;
					
				case 0:
					/* ���α׷� ���� */
					System.out.println();
					System.out.println("���α׷��� �����մϴ�.");
					isContinue = false;
					break;
					
				default:
					/* �߸��� �Է� */
					System.out.println("�޴��� ���� ��ȣ�� �Է��Ͽ����ϴ�.");
					break;
			}
			
		} // end of while
		
		sc.close();
	}

}
