interface RemoteControl {
	void turnOn();
	void turnOff();
}

public class AnonymousClassTest {

	public static void main(String[] args) {
		/*
		 * Anonymous Class ����
		 * 
		 * superclass/interfaceName variableName
		 * 		= new superclass/interfaceName() {};
		 * 
		 * ������ �ǹ̴� ������ ����
		 * new anonymous extends superclass/implements interface {}
		 * �� anonymous �̸��� Ŭ������ �����
		 * up-casting�Ͽ� variableName�� �ְڴٴ� ��
		 * 
		 */
		int num = 1;
		RemoteControl rc = new RemoteControl() {
			
			@Override
			public void turnOn() {
				// TODO Auto-generated method stub
				System.out.println("TV turnOn()");
			}

			@Override
			public void turnOff() {
				// TODO Auto-generated method stub
				System.out.println("TV turnOff()");
			}
			
			public int getNum() {
				
				return num;
			}
			
		};
		
		/*
		 * rc.getNum()�� ������ �Ұ����ϴ�
		 * 
		 * ����1) interface RemoteControl���� getNum()�Լ��� ����Ǿ� ���� �ʾƼ�
		 * ����2) �װ��� �����ϱ� ���ؼ� Casting�� �Ϸ��� �ص� �̸��� ���� Ŭ�����̹Ƿ�
		 * 		���ٵ� �Ұ�
		 * 
		 */
		System.out.println();
		rc.turnOn();
		rc.turnOff();
	}

}
