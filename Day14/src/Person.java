//�� Ŭ������ ���¸� �� �� ��ü�� �̷��� ������̴�
public class Person {
	/* �ʵ� ���� */
	//Person�̶�� Ŭ�����κ��� ������� ��ü�� ������
	//���¸� �������� ��Ÿ��
	String name;
	int height;
	double weight;
	
	/* �޼ҵ� ���� */
	//��ü�� ������ �ൿ�� �Ѵٴ� �� ��Ÿ��
	//�޼ҵ�� � �ൿ�� �ϴ��� �˷��ָ�, 
	//�� �ൿ�� ����� �׻� �����Ѵ�
	//void�� �� ����� �ƹ��͵� ���ٴ� ��
	//method�� �̸��� introduce
	//�̸� ���� ()�ȿ��� input
	//{}�ȿ��� �� �Լ��� �ҷ��� �� �����ų �����
	void introduce() {
		System.out.println("�̸��� " + name);
		System.out.println("Ű�� " + height);
		System.out.println("�����Դ� " + weight);
		
	}

	
	void sleep() {
		System.out.println(name + "�� ��ϴ�");
	}
}
