package board.vo;

public class Board {
	private int boardnum;	// �۹�ȣ
	private String writer;	// �ۼ���
	private String title;	// ������
	private String text;	// �۳���
	private int hitnum;		// ��ȸ��
	private String indate;	// �ۼ���
	// Date Ÿ���� ����ص� �������� ���⼭�� ��¸� �Ұ��̰�
	// DB�󿡼� Date�� ' ' �ȿ� ���ڿ��� �ν��� �ǹǷ� 
	// String Ÿ���� ����Ѵ�.
	
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
	 * ��ȸ���� �ø���.
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
