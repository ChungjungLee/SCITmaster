
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
		System.out.println("Ķ���� ���");
	}
}

/*
public class Test {
	public static void main(String[] args) {
		CalendarT c = CalendarT.getInstance();
		c.print();
		
		//CalendarT d = CalendarT.getInstance();
		//�̹� ������ �ż� ������� Ŭ������ ��� �Ұ����ϴ�
	}
}
*/
