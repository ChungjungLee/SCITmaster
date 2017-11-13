package board.ui;

import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

import board.dao.BoardDAO;
import board.vo.Board;

public class BoardUI {
	private Scanner sc = new Scanner(System.in);
	private BoardDAO boardDao = new BoardDAO();
	
	/*
	 * Constructor
	 */
	public BoardUI() {
		boolean flag = true;
		
		while(flag) {
			System.out.println("=== �� �� �� ===");
			System.out.println("1. �� �� ��");
			System.out.println("2. �� ü �� �� ��");
			System.out.println("3. �� �� �� �� ��");
			System.out.println("4. �� �� ��");
			System.out.println("5. �� �� ��");
			System.out.print("�Է�>> ");
			
			int option = 0;
			
			try {
				option = sc.nextInt();	// ���๮�ڴ� �о� ������ �ʴ´�.
			} catch (Exception e) {
				e.printStackTrace();
				sc.nextLine();	// ���๮�ڱ��� �о���δ�.
			}
			
			switch (option) {
				case 1:	// �� ����
					writeBoard();
					break;
					
				case 2:	// ��ü �� ���
					printAllBoards();
					break;
					
				case 3:	// �� �ϳ� �б�
					printOneBoard();
					break;
					
				case 4:	// �� ����
					deleteBoard();
					break;
					
				case 5:	// �� �˻�
					searchBoard();
					break;
					
				default:
					System.out.println("[����] �߸� �Է��ϼ̽��ϴ�.");
					break;
			} // switch
			
			System.out.println();
			
		} // while
		
	} // constructor
	
	/**
	 * ���� �Է� �ް� ���� ����� ���
	 */
	private void writeBoard() {
		System.out.println("--- �� �� �� ---");
		sc.nextLine();					// Ȥ�� �� ���๮�ڸ� ����
		
		System.out.print("�ۼ���: ");
		String writer = sc.nextLine();	// ���� �����ִ� ���๮�ڸ� ������� �Ѵ�.
		
		System.out.print("������: ");
		String title = sc.nextLine();
		
		System.out.print("�۳���: ");
		String text = sc.nextLine();
		
		// ���ο� ��ü ����
		Board b = new Board();
		b.setWriter(writer);
		b.setTitle(title);
		b.setText(text);
		
		// ��ü ����
		int result = boardDao.insertBoard(b);
		
		if (result > 0) {
			System.out.println("�Է� �Ϸ�");
		} else {
			System.out.println("�Է� ����");
		}
		
	}
	
	/**
	 * �Խñ� ��ü�� �о� �´�.
	 */
	private void printAllBoards() {
		List<Board> boardList = boardDao.selectAllBoards();
		
		System.out.println("--- �� ü �� �� �� ---");
		
		if (boardList == null || boardList.isEmpty()) {
			System.out.println("[�˸�] ��ϵ� �Խñ��� �����ϴ�.");
			return;
		}
		
		for (Board board : boardList) {
			System.out.printf("[%d] %s [BY] %s [AT] %s [HITS] %d\n", 
					board.getBoardnum(), board.getTitle(), 
					board.getWriter(), board.getIndate(), 
					board.getHitnum());
		}
	}
	
	/**
	 * Ư�� �Խñ��� �Է¹޾� ����Ѵ�.
	 */
	private void printOneBoard() {
		System.out.println("--- �� �� �� �� �� ---");
		
		sc.nextLine();
		
		System.out.print("�Խñ� ��ȣ: ");
		int boardNum = sc.nextInt();
		
		Board result = boardDao.selectOneBoard(boardNum);
		
		if (result == null) {
			System.out.println("[�˸�] �ش� �Խñ��� �������� �ʽ��ϴ�.");
		} else {
			printBoardFormat(result);
			result.increaseHitNum();
			
			// TODO: ��ȸ���� �÷����� �ٽ� DB�� �����ϴ� ���� �ʿ��ϴ�.
			//updateBoard(result);
		}
	}
	
	/**
	 * �Խñ��� ���˿� ���߾� ����Ѵ�.
	 * @param board ����� �Խñ�
	 */
	private void printBoardFormat(Board board) {
		System.out.printf("[%d] %s �ۼ���: %s �ۼ�����: %s ��ȸ��: %d\n", 
				board.getBoardnum(), board.getTitle(), 
				board.getWriter(), board.getIndate(),
				board.getHitnum());
		System.out.println(board.getText());
	}
	
	/**
	 * Ư�� �Խñ��� �����.
	 */
	private void deleteBoard() {
		System.out.println("--- �� �� �� ---");
		
		sc.nextLine();
		
		System.out.print("�Խñ� ��ȣ: ");
		int boardNum = sc.nextInt();
		
		int result = boardDao.deleteBoard(boardNum);
		
		if (result == 0) {
			System.out.println("[�˸�] �ش� �Խñ��� �������� �ʽ��ϴ�.");
		} else {
			System.out.println("[�˸�] �Խñ� ���� �Ϸ�");
		}
	}
	
	/**
	 * �Խñ��� Ư�� �з��� ���� �˻��Ͽ� ����� ����Ѵ�.
	 */
	private void searchBoard() {
		System.out.println("--- �� �� �� ---");
		System.out.println("�˻� �з��� �����ϼ���.");
		System.out.println("1. ����");
		System.out.println("2. �ۼ���");
		System.out.println("3. ����");
		System.out.print("�з�: ");
		
		int option = 0;
		
		try {
			option = sc.nextInt();	// ���๮�ڴ� �о� ������ �ʴ´�.
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			sc.nextLine();	// ���๮�ڱ��� �о���δ�.
		}
		
		System.out.print("�˻��� ���ڿ�: ");
		String string = sc.nextLine();
		
		String searchCategory = "searchCategory";
		String searchString = "searchString";
		HashMap<String, String> toFind = new HashMap<>();
		switch (option) {
			case 1:
				toFind.put(searchCategory, "title");
				break;
				
			case 2:
				toFind.put(searchCategory, "writer");
				break;
				
			case 3:
				toFind.put(searchCategory, "text");
				break;
				
			default:
				System.out.println("[�˸�] �߸� �Է� �ϼ̽��ϴ�.");
		}
		
		toFind.put(searchString, string);
		
		List<Board> result = boardDao.searchBoards(toFind);
		for (Board board : result) {
			System.out.printf("[%d] %s [BY] %s [AT] %s [HITS] %d\n", 
					board.getBoardnum(), board.getTitle(), 
					board.getWriter(), board.getIndate(), 
					board.getHitnum());
		}
		
	}
}
