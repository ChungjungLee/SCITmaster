package study;

class Test01 {
	// Exception을 상속하는 애들은 모두 throws에 사용할 수 있다
	// throws에 사용된 오류가 발생하면 이 메소드는 그것을 호출한 곳으로
	// 던지겠다는 의미. 즉, 이 메소드에서 오류를 처리하지 않고 부른 애한테
	// 처리를 떠 넘긴다.
	public int divide(int x, int y) throws Exception{
		
		if (y == 0) {
			// exception 객체를 만들어서 강제로 오류를 발생시키겠다
			throw new ArithmeticException();
		}
		
		// 실제로 오류가 터질 수 있는 코드는 여기다!
		return x / y;
	}
}


public class ExceptionTest02 {

	public static void main(String[] args) {
		/*
		 * throws: 메소드 옆에 쓰는 애
		 * throw: 오류를 발생시킬 때 쓰는 애
		 */
		Test01 t = new Test01();
		
		// throws하는 메소드는 반드시 try블록 안에 넣어주어야 함
		// t.divide(10, 0);
		// ctrl+1 하면 오류 수정을 추천해 준다
		try {
			
			int result = t.divide(10, 0);
			System.out.println(result);
			
		} catch (Exception e) {
			// Exception e 보다는 구체적인 Exception type을 적어주는게 좋다.
			// 다만 예외가 많이 발생하는 경우에는 Exception e로 받는 것이 좋다.
			
			
			// throws된 exception 객체 e가 어디로부터 오게 된
			// 것인지 출력해달라는 메소드
			e.printStackTrace();
			// 개발하는 중에는 위 메소드를 항상 사용할 것
			
		}
		
	}

}
