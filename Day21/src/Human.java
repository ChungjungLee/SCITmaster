
public abstract class Human extends Animal {
	/*
	 * 추상클래스가 추상클래스를 상속받을 수 있다.
	 * 그런데 이 추상클래스를 상속받는 말단 클래스에서는
	 * 반드시 구현해 주어야 한다.
	 * 
	 * 추상클래스가 일반클래스를 상속받을 수도 있다.
	 * ex) public abstract class Human extends Dog
	 * 이 경우 의미는 일반 클래스를 상속받아 이제부터 추상 클래스로
	 * 만들어 사용하겠다는 것이다.
	 */
	
	public abstract void introduce();
}
