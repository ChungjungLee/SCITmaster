
public class StudentTest {

	public static void main(String[] args) {
		Student student = new Student("��ö��", 200910000, "��ǻ���а�", 1, 0);
		System.out.println(student);
		
		UnderGraduate undergrad = new UnderGraduate("�̿���", 200910001, "�����а�", 2, 20, "��굿�Ƹ�");
		System.out.println(undergrad);
		
		Graduate grad = new Graduate("����", 200920000, "ȭ�а�", 1, 120, Graduate.RESEARCH_ASSIST, 0.5);
		System.out.println(grad);
		
	}

}
