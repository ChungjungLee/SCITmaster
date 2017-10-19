package practice;

// ��ó�� �����͸� �����ϴ� Ŭ������ Value Object��� �θ���.
// ���⿡�� ArrayList<Dog> �ʵ带 ������ �̻�������!

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
	// equals() �Լ��� parameter�� Object Ÿ���̴�
	public boolean equals(Object candidate) {
		// Object candidate�� ���ϴ� ��?
		// parameter�� �Ѿ���� dog ��ü�� �����ϱ� ���� �ʿ��� ��
		
		// candidate�� �ƹ��͵� �������� �ʴ� null ���� ���� �� �ִ�.
		if (candidate == null) {
			return false;
		}
		
		// parameter�� Object type�̹Ƿ� down-casting�� �� 
		// ������ �߻��� �� �ִ�.
		if (!(candidate instanceof Dog)) {
			return false;
		}
		
		Dog candidateCasting = (Dog) candidate;
		
		// �� ���� ���� �༮�� �Ͱ� ������ ��
		// this.name.equals(candidateCasting.name)
		if (!candidateCasting.name.equals(this.name)
			|| candidateCasting.age != this.age
			|| !candidateCasting.type.equals(this.type)) {
			// �̸�, ����, ǰ�� �� �� �ϳ��� ���� ����
			return false;
		}
		
		// �̷������� �ϳ��� ���ϴ°� �� ȿ�����̰ڴ�.
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
		return "�̸�: " + this.name + " ����: " + this.age + " ǰ��: " + this.type;
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
