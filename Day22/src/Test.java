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
		 * override�� �� �ڽ��� ������ ������ ������ �ִ� ����̶�� �����ϴµ� 
		 * �װ� �ƴϰ� �θ��� ������ �ִ� ����� ����Ϳ� �Ұ�
		 * 
		 * �׷��� �θ� �ڽ� ���踦 �𸣴� ��3���� ���忡���� ��� �����
		 * ������ �� �ۿ� ����
		 * �׷��� override�� �ְ� ��µȴ�
		 */
		B b = new B();
		A a = b;
		
		a.print();	// B
		
		
		
	}

}
