
class CalendarT {
	private static CalendarT c = new CalendarT();
	
	private CalendarT() {}
	
	public static CalendarT getInstance() {
		return c;
	}
	
	/*
	public CalendarT getInstance() {
		return c;
	}
	*/
	
	public void print() {
		System.out.println("캘린더 출력");
	}
}

/**
 * 객체와 인스턴스
 * 객체: new Person(); 이것만 해도 객체는 메모리에 생성이 된 상태
 * 인스턴스: person p = new Person(); 생성된 객체를 참조 변수에 넣어서 계속 사용하겠다는 것 
 */

/**
 * 클래스의 has-a, is-a 관계
 * [Class] has-a [Field Name]
 * [Sub class] is-a [Super class]
 */

/**
 * 필드의 선언 방법: [접근제어자] [데이터타입] [변수명]
 */

/*
public class Test {
	public static void main(String[] args) {
		CalendarT c = CalendarT.getInstance();
		c.print();
		
		//CalendarT d = CalendarT.getInstance();
		//이미 선언이 돼서 사용중인 클래스라서 사용 불가능하다
	}
}
*/
