
public class Dog extends Animal {
	private String name;	// 이름
	
	public Dog() {
		
	}
	
	public Dog(int age, double weight, double height, String name) {
		// field 'age'는 부모 클래스 내에 private으로 선언되어 있기 때문에
		// 바로 접근이 불가능하다
		// this.age = age;
		// 다만 이거는 가능, public으로 선언되었기 때문
		// this.setAge(age);
		
		// 부모의 생성자를 불러올 수 있다
		// super();
		
		super(age, weight, height);
		//setAge(age);
		//setWeight(weight);
		//setHeight(height);
		this.name = name;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * 오버로딩: 파라미터가 다른 여러 함수를 선언할 수 있다
	 * 오버라이딩: 부모로부터 상속받은 함수를 재정의할 수 있다
	 */
	// annotation은 쓰나 안 쓰나 괜찮음
	@Override
	public void cry() {
		System.out.println("bowwow");
	}
	
	/**
	 * equals() 함수는 Object 클래스 안에 선언되어 있다.
	 * 예를 들어 String 클래스의 equals()는 상속받은 object.equals()를
	 * 오버라이딩 시킨 것이다.
	 * toString() 함수도 그 예.
	 */
	
}
