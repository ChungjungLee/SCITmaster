class OuterClass {
	private String secret = "Time is money";
	
	public OuterClass() {
		InnerClass obj = new InnerClass();
		obj.print();
	}
	
	// Inner class�� GUI�� �ϸ� ����� ���� �������� 
	// �׷��� �ʴٸ� ���忡�� ���� ����.
	private class InnerClass {
		public InnerClass() {
			System.out.println("���� Ŭ���� ������");
		}
		
		public void print() {
			System.out.println(secret);
			// field�� ���� ������ �� �ִ�.
		}
	}
}

public class OuterClassTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new OuterClass();
	}

}
