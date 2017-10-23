package practice;

import java.util.ArrayList;
import java.util.Scanner;

/*
 * Ŭ���̾�Ʈ�� ���
 */
public class UI {
	// UI class�� sc�� ����ϰ� ����ϱ� ������ �ʵ�� ����
	private Scanner sc;
	private Manager manager;
	
	/*
	 * Constructor
	 */
	public UI() {
		sc = new Scanner(System.in);
		manager = new Manager();
	}
	
	public void start() {
		// while ���鼭 �޼ҵ常 �����ų �� �ֵ��� �ϰԲ�
		boolean exit = true;
		while (exit) {
			System.out.println("1. ���");
			System.out.println("2. �˻�");
			System.out.println("3. ����");
			System.out.println("4. ��ü ���");
			System.out.println("0. ����");
			System.out.print("�Է� >> ");
			
			int option = 0;
			try {
				option = sc.nextInt();
			} catch (Exception e) {
				System.out.println("���ڸ� �Է����� ������");
				sc.nextLine();	// ���ۿ� ó������ ���� �Է��� �����ֱ� ���� 
				continue;
			}
			
			switch (option) {
				case 1:	// ���
					insert();
					break;
					
				case 2:	// �˻�
					select();
					break;
					
				case 3:	// ����
					delete();
					break;
					
				case 4:	// ��ü ���
					printAll();
					break;
				
				case 0:	// ����
					exit = false;
					break;
			}
			
			
			
			
		}
	} // method start()
	
	/**
	 * ���
	 */
	private void insert() {
		// ���� �ܺο����� �� �޼ҵ带 ������ ������ ��� private���� ����
		
		System.out.print("�̸�: ");
		String name = sc.next();
		System.out.print("����: ");
		int age = sc.nextInt();
		System.out.print("�ֹι�ȣ: ");
		String ssn = sc.next();
		
		// �Է��� �� �޾Ҵٸ� Human ��ü�� ���� Manager���� ó����� �Ѱ��ش�
		Human h = new Human(name, age, ssn);
		
		// TODO: �Ŵ������� �Ѱ��־�� ��
		// �̷� ������ �Ź� manager ��ü�� �����ϸ� ����Ǵ� list�� �Ź� �����
		// ������ �ʵ忡�� �� �� ������ ����ؾ� �Ѵ�.
		// Manager manager = new Manager();
		boolean canAdd = manager.insert(h);
		if (canAdd) {
			System.out.println("����� �Ϸ�Ǿ����ϴ�.");
		} else {
			System.out.println("��Ͽ� �����Ͽ����ϴ�.");
		}
		
	}
	
	/**
	 * �˻�
	 */
	private void select() {
		System.out.print("�ֹι�ȣ: ");
		String ssn = sc.next();
		
		// �Է��� �޾Ҵٸ� �� �ֹι�ȣ�� ������ Manager���� ã�ƴ޶�� ��û�Ѵ�
		Human select = manager.select(ssn);
		
		if (select == null) {
			System.out.println("�ƹ��͵� �� ã�Ҵ�.");
		} else {
			System.out.println(select);
		}
		
	}
	
	/**
	 * ����
	 */
	private void delete() {
		System.out.print("������ �ֹι�ȣ: ");
		String ssn = sc.next();
		
		boolean canDelete = manager.delete(ssn);
		
		if (canDelete) {
			System.out.println("�����Ǿ����ϴ�.");
		} else {
			System.out.println("������ �����߽��ϴ�.");
		}
	}
	
	/**
	 * ��ü ���
	 */
	private void printAll() {
		// ����ϴ� �޼ҵ��ε� ���⼭ ����� ����� �ϴ���?
		
		/* Manager class������ �� �ٵ� ������� �ʴ� ��� */
		// manager������ �����͸� �Ѱ��ֱ⸸ �ϵ��� �ϸ� �ȴ�.
		// ��, getter�� ����ϸ� �ȴٴ� ��.
		/*
		int listSize = manager.getListSize();
		
		if (listSize == 0) {
			System.out.println("��ϵ� ����� �����ϴ�.");
		} else {
			for (int index = 0; index < manager.getListSize(); index++) {
				System.out.println((index + 1) + ") " + manager.getHuman(index));
			}
		}
		*/
		ArrayList<Human> list = manager.getList();
		
		if (list.isEmpty()) {
			System.out.println("��ϵ� ����� �����ϴ�.");
			return;
		}
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		/* Manager class���� ó������ ������ ����ϴ� ��� */
		manager.printAll();
	}
	
}
