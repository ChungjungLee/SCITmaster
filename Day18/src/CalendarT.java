
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
