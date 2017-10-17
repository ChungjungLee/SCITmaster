interface RemoteControl {
	void turnOn();
	void turnOff();
}

public class AnonymousClassTest {

	public static void main(String[] args) {
		/*
		 * Anonymous Class 선언
		 * 
		 * superclass/interfaceName variableName
		 * 		= new superclass/interfaceName() {};
		 * 
		 * 실제로 의미는 다음과 같다
		 * new anonymous extends superclass/implements interface {}
		 * 로 anonymous 이름의 클래스를 만들고
		 * up-casting하여 variableName에 넣겠다는 것
		 * 
		 */
		int num = 1;
		RemoteControl rc = new RemoteControl() {
			
			@Override
			public void turnOn() {
				// TODO Auto-generated method stub
				System.out.println("TV turnOn()");
			}

			@Override
			public void turnOff() {
				// TODO Auto-generated method stub
				System.out.println("TV turnOff()");
			}
			
			public int getNum() {
				
				return num;
			}
			
		};
		
		/*
		 * rc.getNum()은 접근이 불가능하다
		 * 
		 * 이유1) interface RemoteControl에는 getNum()함수가 선언되어 있지 않아서
		 * 이유2) 그것을 접근하기 위해서 Casting을 하려고 해도 이름이 없는 클래스이므로
		 * 		접근도 불가
		 * 
		 */
		System.out.println();
		rc.turnOn();
		rc.turnOff();
	}

}
