package study;

public class MyExceptionTest {

	// main������ ó�� ���ϰ� throws�ϰ� �Ǹ� �����Ϸ�����
	// exception �԰� ������� �̾߱�
	public static void main(String[] args) {
		try {
			throw new MyException();
		} catch (MyException e) {
			e.printStackTrace();
		}
	}

}
