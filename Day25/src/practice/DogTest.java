package practice;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * ����ڷκ��� �������� ������ �Է¹޾� ArrayList�� ��´�
 * ���, �˻�, ����, ��ü ����� �����ϵ��� �޴��� �����ϰ�
 * ���α׷��� ��� �����Ų��
 * 
 * @author user
 *
 */
public class DogTest {
	private static ArrayList<Dog> list = new ArrayList<>();
	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		boolean isContinued = true;
		while(isContinued) {
			System.out.println("<������ ���>");
			System.out.println("1. ���");
			System.out.println("2. �˻�");
			System.out.println("3. ����");
			System.out.println("4. ��ü ���");
			System.out.println("0. ����");
			System.out.print("�Է�: ");
			int menu = sc.nextInt();	// buffer �� \n �����ִ�.
			//sc.nextLine();
			
			switch (menu) {
				case 1:
					// ���
					case01();
					break;
					
				case 2:
					// �˻�
					case02();
					break;
					
				case 3:
					// ����
					case03();
					break;
					
				case 4:
					// ��ü ���
					case04();
					break;
					
				case 0:
					// ����
					System.out.println("���α׷��� �����մϴ�.");
					isContinued = false;
					break;
					
				default:
					System.out.println("�߸��� �Է��Դϴ�.");
					break;
			}
			
		}	// end of while
		
	}	// end of main method
	
	/**
	 * �������� ����Ѵ�.
	 */
	public static void case01() {
		System.out.print("�̸�: ");
		String name = sc.next();
		System.out.print("����: ");
		int age = sc.nextInt();	// buffer �� \n ��ó��
		System.out.print("ǰ��: ");
		String type = sc.next();
		
		Dog dog = new Dog(name, age, type);
		
		if(list.add(dog)) {
			System.out.println("��ϵǾ����ϴ�.");
		} else {
			System.out.println("��Ͽ� �����߽��ϴ�.");
		}
	}
	
	/**
	 * �������� �˻��Ѵ�.
	 */
	public static void case02() {
		System.out.print("�̸�: ");
		String name = sc.next();
		System.out.print("����: ");
		int age = sc.nextInt();	// buffer �� \n ��ó��
		System.out.print("ǰ��: ");
		String type = sc.next();
		
		Dog candidate = new Dog(name, age, type);
		
		// �����ϴ��� �ƴ��� �� �� �ִ� �Լ�
		list.contains(candidate);
		
		boolean isFound = false;
		for (Dog dog : list) {
			if (dog.equals(candidate)) {
				isFound = true;
				System.out.println("[�˻� ���]");
				System.out.println(dog.toString());
			}
		}
		
		if (!isFound) {
			System.out.println("�˻� ����� �����ϴ�.");
		}
	}
	
	/**
	 * �������� �����Ѵ�.
	 */
	public static void case03() {
		System.out.print("�̸�: ");
		String name = sc.next();
		System.out.print("����: ");
		int age = sc.nextInt();	// buffer �� \n ��ó��
		System.out.print("ǰ��: ");
		String type = sc.next();
		
		Dog candidate = new Dog(name, age, type);
		
		if (list.remove(candidate)) {
			System.out.println("�����Ͽ����ϴ�.");
		} else {
			System.out.println("������ �����߽��ϴ�.");
		}
	}
	
	/**
	 * �������� ��ü ����Ѵ�.
	 */
	public static void case04() {
		if (list.isEmpty()) {
			System.out.println("����� �������� �����ϴ�.");
		} else {
			for (Dog dog : list) {
				// System.out.println(dog); �ص� �ڵ����� toString() ȣ��
				System.out.println(dog.toString());
			}
		}
	}
}
