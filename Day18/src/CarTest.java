import java.util.Calendar;

public class CarTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Car.print();
		
		Car car1 = new Car("blue", 1, 1);
		car1.print();
		
		Car car2 = new Car("green", 1, 1);
		car2.print();
		
		int id = car1.id_pub;
		//int id = car.id_pub; (x)
		//int num = car1.numberOfCars_pub; (o)
		int num = Car.numberOfCars_pub;
		/* 객체를 생성하지 않더라고 static으로 선언된 애들은 사용이 가능 */
		/* 컴파일 시에 static으로 선언된 애들은 메모리에 로드가 되기 때문 */
		
		
		/* static 예제 */
		Math.random();
		// random() 이라는 메소드는 Math 클래스 내에 static으로 선언돼 있다
		
		new Car().print();
		// 이건 Car class의 객체를 하나 만든 후에 print()를 쓰는것이기 때문에
		// 맨 위에 Car.print()와는 조금 다른 것임
		
		
		/* static 예제 */
		Calendar c = Calendar.getInstance();
		// Calendar 
		c.get(Calendar.YEAR);
		// YEAR 변수는 static으로 선언되어 있다
		// 프로그램 내 하나만 존재한다
		// calendar는 'singleton pattern'을 이용하기 때문임
		
		CalendarT ct = CalendarT.getInstance();
		ct.print();
	}

}
