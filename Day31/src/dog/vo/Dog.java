package dog.vo;

public class Dog {
	private int num;
	private String name;
	private int age;
	
	/*
	 * Constructor
	 * 기본 생성자를 만들어주지 않으면 오류가 난다.
	 * 프레임워크에서는 기본 생성자를 이용해 객체를 만들고 
	 * setter를 통해 필드의 값을 설정하기 때문이다.
	 */
	public Dog() {
		
	}
	
	public Dog(int num, String name, int age) {
		this.num = num;
		this.name = name;
		this.age = age;
	}

	/*
	 * Getters and setters
	 */
	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
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
	
	@Override
	public String toString() {
		return "[" + num + "] 이름: " + name + ", 나이: " + age;
	}
}
