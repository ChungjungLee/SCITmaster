
public class Car {
	
	
	String color;
	int speed;
	int gear;
	
	void introduce() {
		System.out.println("색상: " + color);
		System.out.println("속도: " + speed);
		System.out.println("기어: " + gear);
	}
	
	void speedUp(int add) {
		speed = speed + add;
	}
	
	void speedDown(int down) {
		speed = speed - down;
	}
	
}
