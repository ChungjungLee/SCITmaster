package test1;

public class TestBox {

	public static void main(String[] args) {
		// Box<int> (x)
		// primitive type은 객체화 시키지 못해서 Wrapper class를 사용해야 한다
		Box<Integer> b1 = new Box<Integer>();
		// Box class 내의 V가 Integer로 치환이 되어 instance 생성됨
		
		b1.setValue(10);
		System.out.println(b1.getValue());
		
		// 생성자를 호출할 때 <>안에 type을 명시하지 않아도 괜찮다
		Box<String> b2 = new Box<>();
		b2.setValue("Hello World");
		System.out.println(b2.getValue());
	}

}
