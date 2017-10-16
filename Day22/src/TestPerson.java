import java.util.Scanner;

public class TestPerson {

	public static void main(String[] args) {
		
		Person[] list = new Person[3];
		
		list[0] = new Student("ȫ�浿", 20, "�︪��", "��ǻ��");
		list[1] = new Teacher("������", 50, "����", "����");
		list[2] = new Student("�Ӳ���", 40, "���", "������");
		
		// automatic import: ctrl + shift + o
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�̸� �Է�: ");
		String name = sc.next();
		
		System.out.print("���� �Է�: ");
		int age = sc.nextInt();
		
		Person p = new Person();
		p.setName(name);
		p.setAge(age);
		
		// ����Ʈ �ȿ� �ִ� ��ü�� ���Ͽ� ��ġ�Ǹ� ���
		for (int i = 0; i < list.length; i++) {
			Person temp = list[i];
			
			// ������ �� ������ ��� �Ҹ������� �������� ������
			// ���� ���� �� �ִ� ����� �ִ�. => equals()�� override
			if (temp.getAge() == p.getAge() && 
				temp.getName().equals(p.getName())) {
				System.out.println("ã�Ҵ�");
			}
			
			if (p.equals(temp)) {
				System.out.println("ã�ҽ��ϴ�");
			}
		}
	}

}
