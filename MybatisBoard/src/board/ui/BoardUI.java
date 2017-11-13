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
			System.out.println("=== 게 시 판 ===");
			System.out.println("1. 글 쓰 기");
			System.out.println("2. 전 체 글 목 록");
			System.out.println("3. 글 하 나 읽 기");
			System.out.println("4. 글 삭 제");
			System.out.println("5. 글 검 색");
			System.out.print("입력>> ");
			
			int option = 0;
			
			try {
				option = sc.nextInt();	// 개행문자는 읽어 들이지 않는다.
			} catch (Exception e) {
				e.printStackTrace();
				sc.nextLine();	// 개행문자까지 읽어들인다.
			}
			
			switch (option) {
				case 1:	// 글 쓰기
					writeBoard();
					break;
					
				case 2:	// 전체 글 목록
					printAllBoards();
					break;
					
				case 3:	// 글 하나 읽기
					printOneBoard();
					break;
					
				case 4:	// 글 삭제
					deleteBoard();
					break;
					
				case 5:	// 글 검색
					searchBoard();
					break;
					
				default:
					System.out.println("[에러] 잘못 입력하셨습니다.");
					break;
			} // switch
			
			System.out.println();
			
		} // while
		
	} // constructor
	
	/**
	 * 글을 입력 받고 저장 결과를 출력
	 */
	private void writeBoard() {
		System.out.println("--- 글 쓰 기 ---");
		sc.nextLine();					// 혹시 모를 개행문자를 삭제
		
		System.out.print("작성자: ");
		String writer = sc.nextLine();	// 위에 남아있던 개행문자를 지워줘야 한다.
		
		System.out.print("글제목: ");
		String title = sc.nextLine();
		
		System.out.print("글내용: ");
		String text = sc.nextLine();
		
		// 새로운 객체 생성
		Board b = new Board();
		b.setWriter(writer);
		b.setTitle(title);
		b.setText(text);
		
		// 객체 저장
		int result = boardDao.insertBoard(b);
		
		if (result > 0) {
			System.out.println("입력 완료");
		} else {
			System.out.println("입력 실패");
		}
		
	}
	
	/**
	 * 게시글 전체를 읽어 온다.
	 */
	private void printAllBoards() {
		List<Board> boardList = boardDao.selectAllBoards();
		
		System.out.println("--- 전 체 글 목 록 ---");
		
		if (boardList == null || boardList.isEmpty()) {
			System.out.println("[알림] 등록된 게시글이 없습니다.");
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
	 * 특정 게시글을 입력받아 출력한다.
	 */
	private void printOneBoard() {
		System.out.println("--- 글 하 나 읽 기 ---");
		
		sc.nextLine();
		
		System.out.print("게시글 번호: ");
		int boardNum = sc.nextInt();
		
		Board result = boardDao.selectOneBoard(boardNum);
		
		if (result == null) {
			System.out.println("[알림] 해당 게시글은 존재하지 않습니다.");
		} else {
			printBoardFormat(result);
			result.increaseHitNum();
			
			// TODO: 조회수를 늘렸으면 다시 DB에 저장하는 것이 필요하다.
			//updateBoard(result);
		}
	}
	
	/**
	 * 게시글을 포맷에 맞추어 출력한다.
	 * @param board 출력할 게시글
	 */
	private void printBoardFormat(Board board) {
		System.out.printf("[%d] %s 작성자: %s 작성일자: %s 조회수: %d\n", 
				board.getBoardnum(), board.getTitle(), 
				board.getWriter(), board.getIndate(),
				board.getHitnum());
		System.out.println(board.getText());
	}
	
	/**
	 * 특정 게시글을 지운다.
	 */
	private void deleteBoard() {
		System.out.println("--- 글 삭 제 ---");
		
		sc.nextLine();
		
		System.out.print("게시글 번호: ");
		int boardNum = sc.nextInt();
		
		int result = boardDao.deleteBoard(boardNum);
		
		if (result == 0) {
			System.out.println("[알림] 해당 게시글은 존재하지 않습니다.");
		} else {
			System.out.println("[알림] 게시글 삭제 완료");
		}
	}
	
	/**
	 * 게시글을 특정 분류에 따라 검색하여 결과를 출력한다.
	 */
	private void searchBoard() {
		System.out.println("--- 글 검 색 ---");
		System.out.println("검색 분류를 선택하세요.");
		System.out.println("1. 제목");
		System.out.println("2. 작성자");
		System.out.println("3. 본문");
		System.out.print("분류: ");
		
		int option = 0;
		
		try {
			option = sc.nextInt();	// 개행문자는 읽어 들이지 않는다.
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			sc.nextLine();	// 개행문자까지 읽어들인다.
		}
		
		System.out.print("검색할 문자열: ");
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
				System.out.println("[알림] 잘못 입력 하셨습니다.");
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
