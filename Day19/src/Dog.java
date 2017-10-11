
public class Dog extends Animal {
	private String name;	// �̸�
	
	public Dog() {
		
	}
	
	public Dog(int age, double weight, double height, String name) {
		// field 'age'�� �θ� Ŭ���� ���� private���� ����Ǿ� �ֱ� ������
		// �ٷ� ������ �Ұ����ϴ�
		// this.age = age;
		// �ٸ� �̰Ŵ� ����, public���� ����Ǿ��� ����
		// this.setAge(age);
		
		// �θ��� �����ڸ� �ҷ��� �� �ִ�
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
	 * �����ε�: �Ķ���Ͱ� �ٸ� ���� �Լ��� ������ �� �ִ�
	 * �������̵�: �θ�κ��� ��ӹ��� �Լ��� �������� �� �ִ�
	 */
	// annotation�� ���� �� ���� ������
	@Override
	public void cry() {
		System.out.println("bowwow");
	}
	
	/**
	 * equals() �Լ��� Object Ŭ���� �ȿ� ����Ǿ� �ִ�.
	 * ���� ��� String Ŭ������ equals()�� ��ӹ��� object.equals()��
	 * �������̵� ��Ų ���̴�.
	 * toString() �Լ��� �� ��.
	 */
	
}
