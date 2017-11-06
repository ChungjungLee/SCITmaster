package UI;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import Manager.ManagerClass;
import VO.Bird;
import VO.Fish;
import VO.Mammal;
import VO.Pet;

public class UIClass {
	
	// Scanner ���� 
	private Scanner scanner;
	//Manager ����
	private ManagerClass manager;
	
	private Pet pet = null;

	public UIClass() {
		// Manager, Scanner ����
		scanner = new Scanner(System.in);
		manager = new ManagerClass();
		// ��¹� ����
		UI();
	}

	public void UI() {
		boolean flag = true;
		while (flag) {
			MainMenu();
			
			switch (scanner.nextInt()) {
				case 1:
					System.out.println("=========�� ��=========");
					data(1);
					//(1) ��ϰ� ���� ����
					break;
				case 2:
					System.out.println("=========�� ��=========");
					search();
					break;
				case 3:
					System.out.println("=========��� ������ ��ü����=========");
					print();
					break;
				case 4:
					System.out.println("=========�� ��=========");
					data(2);
					//(2) ��ϰ� ���� ����
					break;
				case 5:
					System.out.println("=========�� ��=========");
					delete();
					break;
				case 6:
					System.out.println("=========�� ��=========");
					checkSave();
					break;
				case 7:
					System.out.println("=========�ҷ� ����=========");
					checkLoad();
					break;
				case 8:
					System.out.println("���α׷��� ���� �մϴ�.");
					flag = false;
					break;
				default:
					System.out.println("�޴� �ٽ� ����");
					break;
			}
		}
	}

	/**
	 * 
	 * @param k 1�̸� ���, 2�� ����
	 */
	public void data(int k) {
		subMenu();
		int option = scanner.nextInt();
		
		Pet toInsert = null;
		switch(option) {
			// registration() ����Ͽ�  ���� Return �޾� Manager ����
			// ��ϰ� ������ data �޼ҵ� ���. (�Ű������� ����)
			case 1: // ������
				toInsert = (Pet) registration(1);
				break;
			case 2: // ���
				toInsert = (Pet) registration(2);
				break;
			case 3: // ����
				toInsert = (Pet) registration(3);
				break;
			case 4: // ���� �޴���
				System.out.println("���� �޴��� ���ϴ�.");
				return;
			default:
				break;
		}
		
		if (k == 1) {
			// register
			boolean isInserted = manager.register(toInsert);
			
			if (isInserted) {
				System.out.println("��� ����");
			} else {
				System.out.println("��� ����");
			}
		} else {
			// modify
			boolean isModified = manager.modify(toInsert);
			
			if (isModified) {
				System.out.println("���� ����");
			} else {
				System.out.println("���� ����");
			}
		}
		
		System.out.println();
	}

	public String getName() {
		System.out.println("�̸�: ");
		String Name = scanner.next();
		return Name;
	}

	private Object registration(int select) {
		// �Ű����� (������, ���, ��������)�̿��Ͽ� �����Ͽ� return
		// Object ���·� return
		Object obj = null;
		
		System.out.print("�̸�: ");
		String name = scanner.next();
		System.out.print("����: ");
		String age = scanner.next();
		System.out.print("����: ");
		String kindOfPet = scanner.next();
		
		switch (select) {
			case 1:
				obj = new Mammal(name, age, kindOfPet);
				break;
			case 2:
				obj = new Fish(name, age, kindOfPet);
				break;
			case 3:
				obj = new Bird(name, age, kindOfPet);
				break;
		}
		
		return obj;
	}

	public void search() {
		//�˻� Manager ����
		String name = getName();
		
		Pet searched = manager.search(name);
		
		if (searched == null) {
			System.out.println("�˻� ��� �����ϴ�.");
		} else {
			System.out.println(searched);
		}
		
		System.out.println();
	}

	public void print() {
		// ��� Manager ����
		ArrayList<Pet> petList = manager.allPrint();
		
		if (petList.size() == 0) {
			System.out.println("��� ���� �����ϴ�.");
		} else {
			for (Pet pet : petList) {
				System.out.println(pet);
			}
		}
		
		System.out.println();
	}

	public void delete() {
		//���� Manager ����
		String name = getName();
		
		if (manager.delete(name) == false) {
			System.out.println("���� ����");
		} else {
			System.out.println("���� ����");
		}
		
		System.out.println();
	}

	public void checkSave() {
		try {
			manager.saveFile();
			System.out.println("����.");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println();
	}

	public void checkLoad() {
		try {
			manager.loadFile();
			System.out.println("�ҷ����� �Ϸ�.");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println();
	}

	public void MainMenu() {
		System.out.println("1.���");
		System.out.println("2.�˻�");
		System.out.println("3.��ü����");
		System.out.println("4.����");
		System.out.println("5.����");
		System.out.println("6.����");
		System.out.println("7.�ҷ�����");
		System.out.println("8.����");
	}

	public void subMenu() {
		System.out.println("1.������");
		System.out.println("2.���");
		System.out.println("3.����");
		System.out.println("4.���� �޴���");
	}

}
