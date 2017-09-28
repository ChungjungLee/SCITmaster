
public class Car2 {
	private int speed;
	
	public void setSpeed(int s) {
		speed = s;
		System.out.println("정수 버전 호출");
	}
	
	/*
	 * Method Overloading (중복 메소드)
	 * 
	 * 메소드의 signature가 다르면 이름이 같은 메소드를 여러개 만들 수 있다
	 * signature란? 메소드 이름, 매개변수 개수, 매개변수 타입, 매개변수 순서
	 * 다만 메소드의 반환형이 다르다고 해서 중복 메소드를 만들 수는 없다
	 * 
	 * 중복 메소드를 사용하면 간단해지기 때문에 많이 사용된다
	 * */
	public void setSpeed(double s) {
		speed = (int)s;
		System.out.println("실수 버전 호출");
	}
}
