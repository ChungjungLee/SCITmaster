package study;

public class MyException extends Exception {
	
	// Exception Ŭ�������� message��� �ʵ尡 �ִ�
	
	// ���� �Ʒ��� �� �����ڸ� �ۼ����ش�
	public MyException() {
		super("���� ���� �ͼ���");
	}
	
	public MyException(String message) {
		super(message);
	}
	
}
