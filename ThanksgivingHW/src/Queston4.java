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

public class Queston4 {

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
					if (currentPeople >= 10) {
						System.out.println("10���� ����Ͽ� �� �̻� ����� �� �����ϴ�.");
						break;
					}
					
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
					for (int i = 0; i < currentPeople; i++) {
						p[i].print();
					}
					
					break;
					
				case 3:
					/* ȸ�� ���� �˻�*/
					System.out.println("[ ȸ�� �˻� ]");
					System.out.print("�˻��� ȸ�� �̸�: ");
					String findingName = sc.nextLine();
					
					for (int i = 0; i < currentPeople; i++) {
						if (p[i].getName().equals(findingName)) {
							p[i].print();
							break;
						}
					}
					
					break;
					
				case 0:
					/* ���α׷� ���� */
					System.out.println("���α׷��� �����մϴ�.");
					isContinue = false;
					break;
					
				default:
					/* �߸��� �Է� */
					System.out.println("�޴��� ���� ��ȣ�� �Է��Ͽ����ϴ�.");
					break;
			}
			
		} // end of while
		

	}

}
