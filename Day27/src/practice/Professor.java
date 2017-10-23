package practice;

public class Professor extends Human {
	private String major;
	
	/*
	 * Constructor
	 */
	public Professor() {
		
	}
	
	public Professor(String name, int age, String ssn, String major) {
		super(name, age, ssn);
		this.major = major;
	}
	
	@Override
	public String toString() {
		return super.toString() + ", Àü°ø: " + major;
	}
	/*
	 * Getters and setters
	 */
	public String getMajor() {
		return major;
	}
	
	public void setMajor(String major) {
		this.major = major;
	}
	
}
