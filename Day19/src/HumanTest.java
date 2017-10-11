
public class HumanTest {

	public static void main(String[] args) {
		Human human1 = new Human("춘향", 18);
		Human human2 = new Human("몽룡", 21);
		Human human3 = new Human("사또", 50);

		System.out.println(human1.toString());
		System.out.println(human2.toString());
		System.out.println(human3.toString());
		
		System.out.println("================");
		
		Student student1 = new Student("명진", 21, "컴퓨터");
		Student student2 = new Student("미현", 22, "경영");
		Student student3 = new Student("용준", 24, "경제");
		
		System.out.println(student1.toString());
		System.out.println(student2.toString());
		System.out.println(student3.toString());
	}

}
