
public class TestHuman {

	public static void main(String[] args) {
		StudentHuman student = new StudentHuman();
		Professor professor = new Professor();
		Teacher teacher = new Teacher();
		
		student.introduce();
		professor.introduce();
		teacher.introduce();
	}

}
