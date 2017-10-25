package practice;

public class Staff extends Human {
	private String department;
	
	/*
	 * Constructor
	 */
	public Staff() {
		
	}
	
	public Staff(String name, int age, String ssn, String department) {
		super(name, age, ssn);
		this.department = department;
	}
	
	@Override
	public String toString() {
		return super.toString() + ", ºÎ¼­: " + department;
	}
	
	/*
	 * Getters and setters
	 */
	public String getDepartment() {
		return department;
	}
	
	public void setDepartment(String department) {
		this.department = department;
	}
	
}
