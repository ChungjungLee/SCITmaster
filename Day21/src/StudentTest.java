
public class StudentTest {

	public static void main(String[] args) {
		Student student = new Student("김철수", 200910000, "컴퓨터학과", 1, 0);
		System.out.println(student);
		
		UnderGraduate undergrad = new UnderGraduate("이영희", 200910001, "경제학과", 2, 20, "등산동아리");
		System.out.println(undergrad);
		
		Graduate grad = new Graduate("박훈", 200920000, "화학과", 1, 120, Graduate.RESEARCH_ASSIST, 0.5);
		System.out.println(grad);
		
	}

}
