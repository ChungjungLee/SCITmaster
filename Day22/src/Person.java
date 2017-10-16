
public class Person {
	private String name;
	private int age;
	private String address;
	
	public Person() {
		
	}
	
	public Person(String name, int age, String address) {
		this.name = name;
		this.age = age;
		this.address = address;
	}
	
	public void introduce() {
		System.out.println("name: " + name);
		System.out.println("age: " + age);
		System.out.println("address: " + address);
	}

	@Override
	public boolean equals(Object obj) {
		/*
		 * 어느 누구라도 parameter로 들어올 수 있다
		 * 원래 본 모습으로 downcasting해야 필드나 메소드를 사용가능
		 * 이 때 downcasting이 확실하게 된다는 보장이 없기 때문에
		 * 항상 instanceof를 해주는게 좋다 
		 */
		if (obj == null) {
			return false;
		}
		
		if ((obj instanceof Person) == false) {
			return false;
		}
		
		Person cmp = (Person) obj;
		
		if (this.name.equals(cmp.name) == false) {
			return false;
		}
		if (this.age != cmp.age) {
			return false;
		}
		
		return true;
	}
	
	/*
	 * Getter and setter
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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	
}
