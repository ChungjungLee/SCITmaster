package study;

public class MyException extends Exception {
	
	// Exception 클래스에는 message라는 필드가 있다
	
	// 보통 아래의 두 생성자를 작성해준다
	public MyException() {
		super("내가 만든 익셉션");
	}
	
	public MyException(String message) {
		super(message);
	}
	
}
