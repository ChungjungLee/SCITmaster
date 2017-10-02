//이 클래스의 형태를 본 따 객체를 이렇게 만들것이다
public class Person {
	/* 필드 영역 */
	//Person이라는 클래스로부터 만들어진 객체가 다음의
	//상태를 가지는지 나타냄
	String name;
	int height;
	double weight;
	
	/* 메소드 영역 */
	//객체가 다음의 행동을 한다는 걸 나타냄
	//메소드는 어떤 행동을 하는지 알려주며, 
	//그 행동의 결과가 항상 존재한다
	//void는 그 결과가 아무것도 없다는 것
	//method의 이름이 introduce
	//이름 뒤의 ()안에는 input
	//{}안에는 이 함수를 불렀을 때 실행시킬 문장들
	void introduce() {
		System.out.println("이름은 " + name);
		System.out.println("키는 " + height);
		System.out.println("몸무게는 " + weight);
		
	}

	
	void sleep() {
		System.out.println(name + "는 잡니다");
	}
}
