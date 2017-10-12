
public class Student extends Human {
	private String major;
	
	public Student(String name, int age, String major) {
		//super(name, age);
		setName(name);
		setAge(age);
		System.out.println("Student constructor called");
		this.major = major;
	}
	
	public String toString() {
		return super.toString() + " Àü°ø: " + major;
	}
	
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	
}
