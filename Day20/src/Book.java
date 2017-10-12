
public class Book {
	private String title;
	private int page;
	private String author;
		
	public Book(String title, int page, String author) {
		super();
		this.title = title;
		this.page = page;
		this.author = author;
	}
	
	public void print() {
		System.out.println("제목: " + title);
		System.out.println("페이지: " + page);
		System.out.println("작가: " + author);
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getPage() {
		return page;
	}
	public void setPage(int page) {
		this.page = page;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	
	
}
