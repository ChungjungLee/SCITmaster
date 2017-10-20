package study;

class Test01 {
	// Exception�� ����ϴ� �ֵ��� ��� throws�� ����� �� �ִ�
	// throws�� ���� ������ �߻��ϸ� �� �޼ҵ�� �װ��� ȣ���� ������
	// �����ڴٴ� �ǹ�. ��, �� �޼ҵ忡�� ������ ó������ �ʰ� �θ� ������
	// ó���� �� �ѱ��.
	public int divide(int x, int y) throws Exception{
		
		if (y == 0) {
			// exception ��ü�� ���� ������ ������ �߻���Ű�ڴ�
			throw new ArithmeticException();
		}
		
		// ������ ������ ���� �� �ִ� �ڵ�� �����!
		return x / y;
	}
}


public class ExceptionTest02 {

	public static void main(String[] args) {
		/*
		 * throws: �޼ҵ� ���� ���� ��
		 * throw: ������ �߻���ų �� ���� ��
		 */
		Test01 t = new Test01();
		
		// throws�ϴ� �޼ҵ�� �ݵ�� try��� �ȿ� �־��־�� ��
		// t.divide(10, 0);
		// ctrl+1 �ϸ� ���� ������ ��õ�� �ش�
		try {
			
			int result = t.divide(10, 0);
			System.out.println(result);
			
		} catch (Exception e) {
			// Exception e ���ٴ� ��ü���� Exception type�� �����ִ°� ����.
			// �ٸ� ���ܰ� ���� �߻��ϴ� ��쿡�� Exception e�� �޴� ���� ����.
			
			
			// throws�� exception ��ü e�� ���κ��� ���� ��
			// ������ ����ش޶�� �޼ҵ�
			e.printStackTrace();
			// �����ϴ� �߿��� �� �޼ҵ带 �׻� ����� ��
			
		}
		
	}

}
