
public class StringTest2 {
	
	int size(String candidate) {
		return candidate.length();
	}
		
	char charat(String candidate, int index) {
		return candidate.charAt(index);
	}
	
	/*
	 * String Ŭ���� �������� ������ ���ڿ� �̶�� Ÿ���� �������� �ʱ� ������
	 * char �迭�� ���� ������ �ִ�.
	 * �׷��� ������ charAt(i) �Լ��� �迭�� �ε����� �����ϴ� ��ó�� �۵��Ѵ� 
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
