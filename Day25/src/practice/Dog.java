package practice;

// 이처럼 데이터를 저장하는 클래스를 Value Object라고 부른다.
// 여기에는 ArrayList<Dog> 필드를 가지면 이상해진다!

public class Dog {
	private String name;
	private int age;
	private String type;
	
	/*
	 * Constructor
	 */
	public Dog() {
		
	}
	
	public Dog(String name, int age, String type) {
		this.name = name;
		this.age = age;
		this.type = type;
	}

	@Override
	// equals() 함수는 parameter가 Object 타입이다
	public boolean equals(Object candidate) {
		// Object candidate는 뭐하는 애?
		// parameter로 넘어오는 dog 객체를 참조하기 위해 필요한 애
		
		// candidate는 아무것도 참조하지 않는 null 값을 가질 수 있다.
		if (candidate == null) {
			return false;
		}
		
		// parameter가 Object type이므로 down-casting할 때 
		// 오류가 발생할 수 있다.
		if (!(candidate instanceof Dog)) {
			return false;
		}
		
		Dog candidateCasting = (Dog) candidate;
		
		// 내 것이 들어온 녀석의 것과 같은지 비교
		// this.name.equals(candidateCasting.name)
		if (!candidateCasting.name.equals(this.name)
			|| candidateCasting.age != this.age
			|| !candidateCasting.type.equals(this.type)) {
			// 이름, 나이, 품종 셋 중 하나라도 맞지 않음
			return false;
		}
		
		// 이런식으로 하나씩 비교하는게 더 효율적이겠다.
		if (this.name.equals(candidateCasting.name) == false) {
			return false;
		}
		if (this.age != candidateCasting.age) {
			return false;
		}
		if (this.type.equals(candidateCasting.type) == false) {
			return false;
		}
		
		return true;
	}
	
	@Override
	public String toString() {
		return "이름: " + this.name + " 나이: " + this.age + " 품종: " + this.type;
	}
	
	/*
	 * Getters and setters
	 */
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
	
	public String getType() {
		return type;
	}
	
	public void setType(String type) {
		this.type = type;
	}
	
}
