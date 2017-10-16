
public class Student extends Person{
	private String major;
	
	public Student(String name, int age, String address, String major) {
		super(name, age, address);
		this.major = major;
	}
	
	@Override
	public void introduce() {
		super.introduce();
		System.out.println("major: " + major);
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	@Override
	public boolean equals(Object obj) {
		if (super.equals(obj) == false) {
			return false;
		}
		
		if ((obj instanceof Student) == false) {
			return false;
		}
		
		Student cmp = (Student) obj;
		
		if (this.major.equals(cmp.major) == false) {
			return false;
		}
		
		return true;
	}
}
