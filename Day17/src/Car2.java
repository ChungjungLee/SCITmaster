
public class Car2 {
	private int speed;
	
	public void setSpeed(int s) {
		speed = s;
		System.out.println("���� ���� ȣ��");
	}
	
	/*
	 * Method Overloading (�ߺ� �޼ҵ�)
	 * 
	 * �޼ҵ��� signature�� �ٸ��� �̸��� ���� �޼ҵ带 ������ ���� �� �ִ�
	 * signature��? �޼ҵ� �̸�, �Ű����� ����, �Ű����� Ÿ��, �Ű����� ����
	 * �ٸ� �޼ҵ��� ��ȯ���� �ٸ��ٰ� �ؼ� �ߺ� �޼ҵ带 ���� ���� ����
	 * 
	 * �ߺ� �޼ҵ带 ����ϸ� ���������� ������ ���� ���ȴ�
	 * */
	public void setSpeed(double s) {
		speed = (int)s;
		System.out.println("�Ǽ� ���� ȣ��");
	}
}
