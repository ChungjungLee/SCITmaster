package study;

public class ExceptionTest01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			System.out.println("try 구문 시작");
			
			int result = 10 / 5;	//오류
			
			System.out.println("try 구문 종료");
		} catch (Exception e) {
			// 오류가 나면 어떻게 처리할 것인지 작성
			System.out.println("catch 구문 시작");
		} finally {
			// 오류가 나든 나지 않든 꼭 실행해야 하는 것 작성
			System.out.println("finally 구문 시작");
		}
		
		
	}

}
