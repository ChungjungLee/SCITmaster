
public class Car_Test {
	public static void main(String[] args) {
		Car car = new Car();
		
		//
		car.color = "red";
		car.speed = 0;
		car.gear = 1;
		car.introduce();
		
		//스피드업
		car.speedUp(30);	//car 객체의 필드가 변경됨
		car.introduce();
		
		//스피드다운
		car.speedDown(20);
		car.introduce();
		
		
	}
}
