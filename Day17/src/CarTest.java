class Car {
	private String color;
	private int speed;
	private int gear;
	
	// ù��° ������
	// ��ü�� �����Ǵ� ���� �ϰ� ���� ���� ������ �ȿ� �������ش�
	// ��κ� ��ü ������ �� �ʱ�ȭ�� ���ִ� ������ �Ѵ�
	public Car(String c, int s, int g) {
		color = c;
		speed = s;
		gear = g;
	}
	
	// �ι�° ������
	public Car() {
		color = "red";
		speed = 0;
		gear = 1;
	}
	
	// default ������ ����
	// �ƹ� ���嵵 ���� ��
	// ����̶�� �����ڰ� �̹� �ִٸ� default �����ڴ� �������
	//public Car() {
	//}
}

public class CarTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car1 = new Car("blue", 100, 0);
		
		Car car2 = new Car();
	}

}
