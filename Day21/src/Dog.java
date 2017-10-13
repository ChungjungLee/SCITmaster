
public class Dog extends Animal {
	
	/*
	 * 추상클래스 Animal을 상속받았다면
	 * 무조건 추상메소드가 구현되어 있음을 추론가능
	 */
	@Override
	public void cry() {
		System.out.println("멍멍");
	}
}
