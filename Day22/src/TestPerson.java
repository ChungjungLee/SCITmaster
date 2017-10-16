import java.util.Scanner;

public class TestPerson {

	public static void main(String[] args) {
		
		Person[] list = new Person[3];
		
		list[0] = new Student("홍길동", 20, "울릉도", "컴퓨터");
		list[1] = new Teacher("이율곡", 50, "서울", "유교");
		list[2] = new Student("임꺽정", 40, "산속", "산적질");
		
		// automatic import: ctrl + shift + o
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름 입력: ");
		String name = sc.next();
		
		System.out.print("나이 입력: ");
		int age = sc.nextInt();
		
		Person p = new Person();
		p.setName(name);
		p.setAge(age);
		
		// 리스트 안에 있는 객체와 비교하여 일치되면 출력
		for (int i = 0; i < list.length; i++) {
			Person temp = list[i];
			
			// 지금은 비교 갯수가 적어서 할만하지만 많아지면 복잡함
			// 쉽게 비교할 수 있는 방법이 있다. => equals()를 override
			if (temp.getAge() == p.getAge() && 
				temp.getName().equals(p.getName())) {
				System.out.println("찾았다");
			}
			
			if (p.equals(temp)) {
				System.out.println("찾았습니다");
			}
		}
	}

}
