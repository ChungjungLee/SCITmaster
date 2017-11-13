package board.vo;

public class Reply {
	private int replynum;	// 댓글번호
	private int boardnum;	// 본문글번호
	private String writer;	// 작성자
	private String retext;	// 댓글내용
	
	/*
	 * Constructor
	 */
	public Reply() {
		
	}
	
	public Reply(int replynum, int boardnum, String writer, String retext) {
		super();
		this.replynum = replynum;
		this.boardnum = boardnum;
		this.writer = writer;
		this.retext = retext;
	}
	
	/*
	 * Getters and setters
	 */
	public int getReplynum() {
		return replynum;
	}
	public void setReplynum(int replynum) {
		this.replynum = replynum;
	}
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
	public String getRetext() {
		return retext;
	}
	public void setRetext(String retext) {
		this.retext = retext;
	}
	
	
}
