package study;

public class ExceptionTest01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			System.out.println("try ���� ����");
			
			int result = 10 / 5;	//����
			
			System.out.println("try ���� ����");
		} catch (Exception e) {
			// ������ ���� ��� ó���� ������ �ۼ�
			System.out.println("catch ���� ����");
		} finally {
			// ������ ���� ���� �ʵ� �� �����ؾ� �ϴ� �� �ۼ�
			System.out.println("finally ���� ����");
		}
		
		
	}

}
