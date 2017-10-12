
public class Magazine extends Book {
	private String releaseDate;
	
	public Magazine(String title, int page, String author, String releaseDate) {
		super(title, page, author);
		this.releaseDate = releaseDate;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void print() {
		super.print();
		System.out.println("πﬂ∏≈¿œ: " + releaseDate);
	}
	
	public String getReleaseDate() {
		return releaseDate;
	}

	public void setReleaseDate(String releaseDate) {
		this.releaseDate = releaseDate;
	}

	
}
