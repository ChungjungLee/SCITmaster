
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
		 * ��� ������ parameter�� ���� �� �ִ�
		 * ���� �� ������� downcasting�ؾ� �ʵ峪 �޼ҵ带 ��밡��
		 * �� �� downcasting�� Ȯ���ϰ� �ȴٴ� ������ ���� ������
		 * �׻� instanceof�� ���ִ°� ���� 
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
