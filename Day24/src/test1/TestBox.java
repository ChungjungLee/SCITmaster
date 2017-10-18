package test1;

public class TestBox {

	public static void main(String[] args) {
		// Box<int> (x)
		// primitive type�� ��üȭ ��Ű�� ���ؼ� Wrapper class�� ����ؾ� �Ѵ�
		Box<Integer> b1 = new Box<Integer>();
		// Box class ���� V�� Integer�� ġȯ�� �Ǿ� instance ������
		
		b1.setValue(10);
		System.out.println(b1.getValue());
		
		// �����ڸ� ȣ���� �� <>�ȿ� type�� ������� �ʾƵ� ������
		Box<String> b2 = new Box<>();
		b2.setValue("Hello World");
		System.out.println(b2.getValue());
	}

}
