
public class StringTest2 {
	
	int size(String candidate) {
		return candidate.length();
	}
		
	char charat(String candidate, int index) {
		return candidate.charAt(index);
	}
	
	/*
	 * String 클래스 내에서는 실제로 문자열 이라는 타입이 존재하지 않기 때문에
	 * char 배열로 값을 가지고 있다.
	 * 그렇기 때문에 charAt(i) 함수는 배열의 인덱스를 참조하는 것처럼 작동한다 
	 */
	void reverse_print(String candidate) {
		for (int i = candidate.length(); i > 0; i--) {
			System.out.print(candidate.charAt(i-1));
		}
	}
	
	String reverse(String str) {
		int strLen = str.length();
		char[] result = new char[strLen];
		
		for (int i = strLen - 1; i >= 0; i--) {
			result[strLen - 1 - i] = str.charAt(i);
		}
		
		return new String(result);
	}
	
}
