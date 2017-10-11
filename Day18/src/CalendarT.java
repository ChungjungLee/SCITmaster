
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

/**
 * ��ü�� �ν��Ͻ�
 * ��ü: new Person(); �̰͸� �ص� ��ü�� �޸𸮿� ������ �� ����
 * �ν��Ͻ�: person p = new Person(); ������ ��ü�� ���� ������ �־ ��� ����ϰڴٴ� �� 
 */

/**
 * Ŭ������ has-a, is-a ����
 * [Class] has-a [Field Name]
 * [Sub class] is-a [Super class]
 */

/**
 * �ʵ��� ���� ���: [����������] [������Ÿ��] [������]
 */

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
