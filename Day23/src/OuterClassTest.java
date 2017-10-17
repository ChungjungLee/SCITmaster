class OuterClass {
	private String secret = "Time is money";
	
	public OuterClass() {
		InnerClass obj = new InnerClass();
		obj.print();
	}
	
	// Inner class는 GUI를 하면 사용할 일이 많겠지만 
	// 그렇지 않다면 당장에는 별로 없다.
	private class InnerClass {
		public InnerClass() {
			System.out.println("내부 클래스 생성자");
		}
		
		public void print() {
			System.out.println(secret);
			// field를 쉽게 접근할 수 있다.
		}
	}
}

public class OuterClassTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new OuterClass();
	}

}
