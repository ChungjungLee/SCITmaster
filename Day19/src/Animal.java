
public class Animal {
	private int age;		// 나이
	private double weight;	// 몸무게
	private double height;	// 키
	
	public Animal() {
		
	}
	
	public Animal(int age, double weight, double height) {
		this.age = age;
		this.weight = weight;
		this.height = height;
	}
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	
	public void cry() {
		System.out.println("no cry");
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}

	@Override
	public String toString() {
		return "나이: " + age + "몸무게: " + weight;
	}
	
	
}
