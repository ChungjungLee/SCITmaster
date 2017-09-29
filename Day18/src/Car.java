
public class Car {
	private String color;
	private int speed;
	private int gear;
	// 자동차 시리얼 번호
	private int id;
	private static int numberOfCars = 0;
	/* 모든 Car 클래스의 객체는 위의 변수 하나를 공유한다 */
	/* 변수만이 아니라 메소드도 static으로 선언할 수 있다 */
	
	public int id_pub;
	public static int numberOfCars_pub = 0;
	
	public Car() {
		
	}
	
	public Car(String c, int s, int g) {
		color = c;
		speed = s;
		gear = g;
		// 자동차 개수를 증가하고 id번호를 할당한다.
		id = ++numberOfCars;
	}
	
	public void print() {
		System.out.println("자동차 수: " + numberOfCars);
		//temp1();
		
	}
	
	public static void temp1() {
		//print();
		/*
		 * static으로 선언된 메소드는 컴파일시 메모리에 로드가 된다.
		 * 그에 반해 static으로 선언되지 않은 메소드는 객체를 생성할 때에만
		 * 메모리에 로드가 된다.
		 * 그렇기 때문에 메모리에 아직 로드되지 않은 메소드를 사용하는 것은 불가
		 */
		
	}
	
	public void temp2() {
		temp1();
		/*
		 * 객체를 생성하고 난 뒤에 메모리에 로드된 메소드이므로
		 * 이미 메모리에 존재하는 static print() 메소드를 사용가능한 것이다
		 */
	}
	
}
