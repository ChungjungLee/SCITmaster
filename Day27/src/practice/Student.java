package practice;

public class Student extends Human {
	private String studentNum;
	
	/*
	 * Constructor
	 */
	public Student() {
		
	}
	
	public Student(String name, int age, String ssn, String studentNum) {
		super(name, age, ssn);
		this.studentNum = studentNum;
	}

	@Override
	public String toString() {
		return super.toString() + ", ÇĞ¹ø: " + studentNum;
	}
	
	/*
	 * Getters and setters
	 */
	public String getStudentNum() {
		return studentNum;
	}
	
	public void setStudentNum(String studentNum) {
		this.studentNum = studentNum;
	}
	
}
