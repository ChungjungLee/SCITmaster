
public class UnderGraduate extends Student {
	// 家加 悼酒府疙
	private String clubName;
	
	public UnderGraduate(String name, int id, String major) {
		super(name, id, major);
		this.clubName = "None";
	}
	
	public UnderGraduate(String name, int id, 
						String major, int year, 
						int credit, String clubName) {
		super(name, id, major, year, credit);
		this.clubName = clubName;
	}
	
	@Override
	public String toString() {
		return super.toString() + "\n"
				+ "家加 悼酒府: " + clubName;
	}
	
	public String getClubName() {
		return clubName;
	}
	public void setClubName(String clubName) {
		this.clubName = clubName;
	}
	
}
