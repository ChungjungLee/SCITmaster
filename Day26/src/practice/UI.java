package practice;

import java.util.Scanner;

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
			System.out.print("�Է� >> ");
			
			int option = 0;
			try {
				option = sc.nextInt();
			} catch (Exception e) {
				System.out.println("���ڸ� �Է����� ������");
				// �޴��� �ٽ� ���ư�
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
					break;
					
				case 4:	// ��ü ���
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
	
}
