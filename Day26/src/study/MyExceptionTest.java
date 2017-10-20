package study;

public class MyExceptionTest {

	// main에서도 처리 안하고 throws하게 되면 컴파일러한테
	// exception 먹고 죽으라는 이야기
	public static void main(String[] args) {
		try {
			throw new MyException();
		} catch (MyException e) {
			e.printStackTrace();
		}
	}

}
