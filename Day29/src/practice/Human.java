package practice;

import java.io.Serializable;

// Serializable은 superclass에만 구현해도 된다.
public class Human implements Serializable {
	private String name;
	private int age;
	private String ssn;
	
	/*
	 * Constructor
	 */
	public Human() {
		
	}
	
	public Human(String name, int age, String ssn) {
		this.name = name;
		this.age = age;
		this.ssn = ssn;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}
		
		if (!(obj instanceof Human)) {
			return false;
		}
		
		Human candidate = (Human) obj;
		
		if (!(ssn.equals(candidate.ssn))) {
			return false;
		}
		
		return true;
	}
	
	@Override
	public String toString() {
		return "이름: " + name + ", 나이: " + age + ", 주민번호: " + ssn;
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
	
	public String getSsn() {
		return ssn;
	}
	
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	
	
}
