
public class HumanTest {

	public static void main(String[] args) {
		Human human1 = new Human("����", 18);
		Human human2 = new Human("����", 21);
		Human human3 = new Human("���", 50);

		System.out.println(human1.toString());
		System.out.println(human2.toString());
		System.out.println(human3.toString());
		
		System.out.println("================");
		
		Student student1 = new Student("����", 21, "��ǻ��");
		Student student2 = new Student("����", 22, "�濵");
		Student student3 = new Student("����", 24, "����");
		
		System.out.println(student1.toString());
		System.out.println(student2.toString());
		System.out.println(student3.toString());
	}

}
