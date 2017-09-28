/* 221page question1*/
public class Dog {
	private String name;
	private String breed;
	private int age;
	
	// default 생성자가 사라지므로 필요하면 만들어줘야 한다
	
	public Dog(String name, int age) {
		this.name = name;
		this.age = age;
		this.breed = null;
	}
	
	public Dog(String name, String breed, int age) {
		this.name = name;
		this.breed = breed;
		this.age = age;
	}
}
