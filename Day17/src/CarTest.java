class Car {
	private String color;
	private int speed;
	private int gear;
	
	// 첫번째 생성자
	// 객체가 생성되는 순간 하고 싶은 일을 생성자 안에 정의해준다
	// 대부분 객체 생성될 때 초기화를 해주는 역할을 한다
	public Car(String c, int s, int g) {
		color = c;
		speed = s;
		gear = g;
	}
	
	// 두번째 생성자
	public Car() {
		color = "red";
		speed = 0;
		gear = 1;
	}
	
	// default 생성자 선언
	// 아무 문장도 없는 것
	// 어떤것이라고 생성자가 이미 있다면 default 생성자는 사라진다
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
