
public class Teacher extends Person {
	private String subject;

	public Teacher(String name, int age, String address, String subject) {
		super(name, age, address);
		this.subject = subject;
	}
	
	@Override
	public void introduce() {
		super.introduce();
		System.out.println("subject: " + subject);
	}
	
	public String getSubject() {
		return subject;
	}
	
	public void setSubject(String subject) {
		this.subject = subject;
	}
	
	
}
