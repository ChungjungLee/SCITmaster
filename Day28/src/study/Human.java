package study;

import java.io.Serializable;

public class Human implements Serializable {
	private String name;
	
	/*
	 * Constructor
	 */
	public Human() {
		
	}
	
	public Human(String name) {
		this.name = name;
	}
	
	public String toString() {
		return "Human [name="+name+"]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
