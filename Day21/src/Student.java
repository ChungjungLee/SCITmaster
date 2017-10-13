
// ���� ������ �ִ� object�� value object��� �θ���.
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
		return "�̸�: " + name + "\n"
				+ "�й�: " + id + "\n"
				+ "�Ҽ��а�: " + major + "\n"
				+ "�г�: " + year + "\n"
				+ "�̼�����: " + credit;
	}
	
	// �̸�, �й�, �Ҽ��а�, �г�, �̼� ���� ��
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
