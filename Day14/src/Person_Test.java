
public class Person_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Person 타입의 변수 p를 선언
		// new라는 키워드를 통해서 객체 생성
		Person p = new Person();
		
		// 변수p를 통해 객체 접근이 가능하다
		p.name = "김삿갓";
		p.height = 180;
		p.weight = 75.0;
		
		p.introduce();
		
		Person p2 = new Person();
		
		p2.name = "김자바";
		p2.height = 174;
		p2.weight = 70.0;
		
		p2.introduce();
		p2.sleep();
		
	}

}
