
public class Car {
	private String color;
	private int speed;
	private int gear;
	// �ڵ��� �ø��� ��ȣ
	private int id;
	private static int numberOfCars = 0;
	/* ��� Car Ŭ������ ��ü�� ���� ���� �ϳ��� �����Ѵ� */
	/* �������� �ƴ϶� �޼ҵ嵵 static���� ������ �� �ִ� */
	
	public int id_pub;
	public static int numberOfCars_pub = 0;
	
	public Car() {
		
	}
	
	public Car(String c, int s, int g) {
		color = c;
		speed = s;
		gear = g;
		// �ڵ��� ������ �����ϰ� id��ȣ�� �Ҵ��Ѵ�.
		id = ++numberOfCars;
	}
	
	public void print() {
		System.out.println("�ڵ��� ��: " + numberOfCars);
		//temp1();
		
	}
	
	public static void temp1() {
		//print();
		/*
		 * static���� ����� �޼ҵ�� �����Ͻ� �޸𸮿� �ε尡 �ȴ�.
		 * �׿� ���� static���� ������� ���� �޼ҵ�� ��ü�� ������ ������
		 * �޸𸮿� �ε尡 �ȴ�.
		 * �׷��� ������ �޸𸮿� ���� �ε���� ���� �޼ҵ带 ����ϴ� ���� �Ұ�
		 */
		
	}
	
	public void temp2() {
		temp1();
		/*
		 * ��ü�� �����ϰ� �� �ڿ� �޸𸮿� �ε�� �޼ҵ��̹Ƿ�
		 * �̹� �޸𸮿� �����ϴ� static print() �޼ҵ带 ��밡���� ���̴�
		 */
	}
	
}
