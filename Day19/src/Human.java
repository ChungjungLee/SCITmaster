
public class Human {
	private String name;
	private int age;
	
	public Human(String name, int age) {
		System.out.println("Human constructor called");
		this.name = name;
		this.age = age;
	}
	
	public String toString() {
		return "이름: " + name + " 나이: " + age;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}
