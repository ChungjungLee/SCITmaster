
public class Person_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Person Ÿ���� ���� p�� ����
		// new��� Ű���带 ���ؼ� ��ü ����
		Person p = new Person();
		
		// ����p�� ���� ��ü ������ �����ϴ�
		p.name = "���";
		p.height = 180;
		p.weight = 75.0;
		
		p.introduce();
		
		Person p2 = new Person();
		
		p2.name = "���ڹ�";
		p2.height = 174;
		p2.weight = 70.0;
		
		p2.introduce();
		p2.sleep();
		
	}

}
