class A {
	public void print() {
		System.out.println("A");
	}
}

class B extends A {
	@Override
	public void print() {
		System.out.println("B");
	}
}

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
		 * override할 때 자식이 본인의 영역에 가지고 있는 기능이라고 착각하는데 
		 * 그게 아니고 부모의 영역에 있는 기능을 덮어쓴것에 불과
		 * 
		 * 그래서 부모 자식 관계를 모르는 제3자의 입장에서는 덮어쓴 기능을
		 * 참조할 수 밖에 없음
		 * 그래서 override된 애가 출력된다
		 */
		B b = new B();
		A a = b;
		
		a.print();	// B
		
		
		
	}

}
