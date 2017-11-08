package test1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * <pre>
 * ���� ���� ���α׷��� ����� ȭ��(User Interface) Ŭ����
 * ����ڷκ��� ó���� ���õ� �Է��� �ް�, Manager Ŭ������ ���� ó���� ����� �����ش�.
 * </pre>
 */
public class UI {
	//��û�� ���õ� ó���� �ϱ� ���� ������ Manager Ŭ������ ��ü
	private Manager manager;
	
	//Ű����κ��� ������ �Է¹ޱ� ���� ������ Scanner Ŭ������ ��ü
	private Scanner sc;
	
	/**
	 * ������.
	 * 
	 */
	public UI() {
		manager = new Manager();
		sc = new Scanner(System.in);
	}

	/**
	 * UI�� �����Ѵ�
	 */
	public void start() {
		// ���α׷� ���� ������ ��� �ݺ��Ѵ�
		boolean canContinue = true;
		
		while (canContinue) {
			System.out.println("����������������������������������������������������������������");
			System.out.println("��      ���� ���� �ý���     	       ��");
			System.out.println("����������������������������������������������������������������");
			System.out.println("����������������������������������������������������������������");
			System.out.println("�� 1.���                    	       ��");	
			System.out.println("�� 2.ã��                    	       ��");	
			System.out.println("�� 3.����                    	       ��");	
			System.out.println("�� 4.��ü���                	       ��");	
			System.out.println("�� 9.����                    	       ��");
			System.out.println("����������������������������������������������������������������");
			
			int option = getNextInt("�޴� ��ȣ�� �����ϼ���=> ");
			
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
					print();
					break;
					
				case 9:	// ����
					canContinue = false;
					System.out.println("���α׷��� �����մϴ�.");
					break;
	
				default:
					System.out.println("[����] �߸��� �Է��Դϴ�");
			}
			
			System.out.println();
		}
	}
	
	/**
	 * �� ������ å ������ �Է� �޾� �˸´� ��ü�� �����ϰ�
	 * �̸� �Ŵ����� ���� �����Ѵ�
	 */
	private void insert() {
		// ���� ������ ��� �ݺ��Ѵ�
		boolean canContinue = true;
		
		while (canContinue) {
			System.out.println("����������������������������������������������������������������");
			System.out.println("��        ���� ���� ���	       ��");
			System.out.println("����������������������������������������������������������������");
			System.out.println("����������������������������������������������������������������");
			System.out.println("�� 1.å                      	       ��");	
			System.out.println("�� 2.������                  	       ��");	
			System.out.println("�� 3.����                    	       ��");	
			System.out.println("�� 9.�����޴�                	       ��");
			System.out.println("����������������������������������������������������������������");
			
			int option = getNextInt("�޴� ��ȣ�� �����ϼ���=> ");
			
			// 9���̸� �����Ѵ�
			if (option == 9) {
				canContinue = false;
				continue;
			}
			
			// 1 ~ 3�� ���̰� �ƴϸ� �ٽ� �Է� �޴´�
			if (option < 1 || 3 < option) {
				System.out.println("[����] �߸� �Է��ϼ̽��ϴ�");
				continue;
			}
			
			// ����� �����Ѵ�
			Publication pub = null;
			
			//CODE HERE
			int productId = getNextInt("��ǰ��ȣ: ");
			System.out.print("����: ");
			String title = sc.next();
			System.out.print("���ǻ�: ");
			String company = sc.next();
			int price = getNextInt("����: ");
			
			switch (option) {
				case 1:	// å
					//CODE HERE
					System.out.print("����: ");
					String author = sc.next();
					
					pub = new Book(productId, title, company, price, author);
					
					break;
					
				case 2:	// ����å
					//CODE HERE
					System.out.print("����: ");
					String format = sc.next();
					int filesize = getNextInt("�뷮: ");
					
					pub = new Ebook(productId, title, company, price, format, filesize);
					break;
					
				case 3:	// ����
					//CODE HERE
					int year = getNextInt("����⵵: ");
					int month = getNextInt("�����: ");
					
					pub = new Magazine(productId, title, company, price, year, month);
					
					break;
			}
			
			//CODE HERE
			boolean isInserted = manager.insert(pub);
			
			if (isInserted) {
				System.out.println("[�˸�] ����� �Ϸ��Ͽ����ϴ�.");
			} else {
				System.out.println("[�˸�] ����� �����Ͽ����ϴ�.");
			}
			
			System.out.println();
		}
	}
	
	/**
	 * ��ǰ��ȣ�� �Է� �޾� �ش� ��ȣ�� ��ġ�ϴ� ��ǰ��ȣ�� ������ �ִ� ������ ����Ѵ�
	 */
	private void select() {
		System.out.println("����������������������������������������������������������������");
		System.out.println("��             �˻�        	       ��");
		System.out.println("����������������������������������������������������������������");
		
		// ��ǰ ��ȣ�� �Է� �޴´�
		int productId = getNextInt("��ǰ��ȣ �Է�>> ");
		
		// �˻��Ͽ� ������ ã�´�
		//CODE HERE
		Publication selected = manager.select(productId);
		
		if (selected == null) {
			System.out.println("[�˸�] �ش� ��ǰ�� ã�� ���߽��ϴ�.");
		} else {
			System.out.println(selected);
		}
	}

	/**
	 * ��ǰ��ȣ�� �Է� �޾� �ش� ��ȣ�� ��ġ�ϴ� ��ǰ��ȣ�� ������ �ִ� ������ �����Ѵ�
	 */
	private void delete() {
		System.out.println("����������������������������������������������������������������");
		System.out.println("��             ����        	       ��");
		System.out.println("����������������������������������������������������������������");
		
		// ��ǰ ��ȣ�� �Է� �޴´�
		int productId = getNextInt("��ǰ��ȣ �Է�>> ");
		
		// �����ϰ� ���� ���θ� Ȯ���Ѵ�
		//CODE HERE
		boolean isDeleted = manager.delete(productId);
		
		if (isDeleted) {
			System.out.println("[�˸�] ������ �Ϸ��Ͽ����ϴ�.");
		} else {
			System.out.println("[�˸�] ������ �����Ͽ����ϴ�.");
		}
	}

	/**
	 * �Ŵ����κ��� ����Ʈ ������ ������ �ͼ� ��� ������ ����Ѵ�
	 */
	private void print() {
		System.out.println("����������������������������������������������������������������");
		System.out.println("��          ��ü ���       	       ��");
		System.out.println("����������������������������������������������������������������");
		
		// ����Ʈ�� �����´�
		//CODE HERE
		ArrayList<Publication> pubList = manager.getPubList();
		
		// �� �ǵ� �������� ������ �������� �˸��� �޼ҵ� ����
		//CODE HERE
		if (pubList.isEmpty()) {
			System.out.println("[�˸�] ����� ������ �� �ǵ� �������� �ʽ��ϴ�.");
			return;
		}
		
		// ��ü ����Ѵ�
		//CODE HERE
		for (Publication pub : pubList) {
			System.out.println(pub);
		}
	}
	
	/**
	 * �� ó���� ���ڸ� �Է� �޴´�
	 * @return 0�� �ƴ� ����
	 */
	private int getNextInt(String message) {
		int option = 0;
		
		do {
			try {
				System.out.print(message);
				option = sc.nextInt();
			} catch (Exception e) {
				System.out.println("[����] �߸� �Է��Ͽ����ϴ�");
				sc.nextLine();
			}
		} while(option == 0);
		
		return option;
	}
}

