
public class Car {
	
	
	String color;
	int speed;
	int gear;
	
	void introduce() {
		System.out.println("����: " + color);
		System.out.println("�ӵ�: " + speed);
		System.out.println("���: " + gear);
	}
	
	void speedUp(int add) {
		speed = speed + add;
	}
	
	void speedDown(int down) {
		speed = speed - down;
	}
	
}
