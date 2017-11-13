package board.vo;

public class Board {
	private int boardnum;	// 글번호
	private String writer;	// 작성자
	private String title;	// 글제목
	private String text;	// 글내용
	private int hitnum;		// 조회수
	private String indate;	// 작성일
	// Date 타입을 사용해도 괜찮으나 여기서는 출력만 할것이고
	// DB상에서 Date는 ' ' 안에 문자열로 인식이 되므로 
	// String 타입을 사용한다.
	
	/*
	 * Constructor
	 */
	public Board() {
		
	}
	
	public Board(int boardnum, String writer, 
			String title, String text, 
			int hitnum, String indate) {
		this.boardnum = boardnum;
		this.writer = writer;
		this.title = title;
		this.text = text;
		this.hitnum = hitnum;
		this.indate = indate;
	}

	/**
	 * 조회수를 늘린다.
	 */
	public void increaseHitNum() {
		hitnum++;
	}
	
	/*
	 * Getters and setters
	 */
	public int getBoardnum() {
		return boardnum;
	}

	public void setBoardnum(int boardnum) {
		this.boardnum = boardnum;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public int getHitnum() {
		return hitnum;
	}

	public void setHitnum(int hitnum) {
		this.hitnum = hitnum;
	}

	public String getIndate() {
		return indate;
	}

	public void setIndate(String indate) {
		this.indate = indate;
	}
	
	@Override
	public String toString() {
		return String.format("[%d] %s [BY] %s [AT] %s", boardnum, title, writer, indate);
	}
}
