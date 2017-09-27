
public class PersonWithModifier {
	//이름,키,나이 	
	private String name;
	private int age;
	private int height;
	
	int getAge() {
		return age;
	}
	
	void setAge(int a) {
		if(a < 0) {
			age = 0;
		} else {
			age = a;
		}
	}
	
	int getHeight() {
		return height;
	}
	
	void setHeight(int a) {
		if(a < 0) {
			height = 0;
		} else {
			height = a;
		}
		
	}
	
	String getName() {
		return name;
	}
	
	void setName(String a) {
		name = a;
	}
}
