/* 221page question1*/
public class Dog {
	private String name;
	private String breed;
	private int age;
	
	// default �����ڰ� ������Ƿ� �ʿ��ϸ� �������� �Ѵ�
	
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
