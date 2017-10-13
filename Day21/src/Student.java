
// 값을 가지고 있는 object를 value object라고 부른다.
public class Student {
	private String name;
	private int id;
	private String major;
	private int year;
	private int credit;
	
	public Student(String name, int id, String major) {
		this.name = name;
		this.id = id;
		this.major = major;
		year = 1;
		credit = 0;
	}
	
	public Student(String name, int id, String major, int year, int credit) {
		this(name, id, major);
		this.year = year;
		this.credit = credit;
	}
	
	@Override
	public String toString() {
		return "이름: " + name + "\n"
				+ "학번: " + id + "\n"
				+ "소속학과: " + major + "\n"
				+ "학년: " + year + "\n"
				+ "이수학점: " + credit;
	}
	
	// 이름, 학번, 소속학과, 학년, 이수 학점 수
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	
	public int getCredit() {
		return credit;
	}
	public void setCredit(int credit) {
		this.credit = credit;
	}
}
