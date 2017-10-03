/*
 * 회원의 전화번호와 주소를 등록, 검색할 수 있는 프로그램을 작성하시오.
 * 
 * - 다음과 같은 Person 클래스를 정의하여 회원 1명의 정보를 담을 수 있게 한다.
 * 	회원주소록 프로그램에서 한명의 회원정보를 나타내는 클래스.
 * 	회원번호, 이름, 전화번호, 주소 이렇게 3가지의 속성을 가진다.
 * 	모든 필드는 접근 지정자가 private이며,
 * 	각 필드의 값을 변경하는 Setter와 각 필드의 값을 읽어서 리턴하는 Getter를 가진다.
 * 	기본생성자와 모든 필드값을 전달받아 초기화하는 생성자를 가진다.
 * 	각 필드의 값을 다음과 같이 출력하는 print()메소드를 정의한다.
 * 
 * - 메뉴를 출력하고 메뉴 번호를 입력받아 해당 기능을 수행한다.
 * - 0번 메뉴를 선택할 때까지 프로그램은 반복된다.
 * - 회원정보는 원소 10개짜리  Person배열을 생성하여 저장한다.
 * - 10명이 등록되면 1번 메뉴를 선택했을 때, 더이상 등록할 수 없다는 메시지를 출력한다.
 * - 검색 기능은 회원 이름을 입력받아, 등록된 모든 회원과 비교한 후 찾으면 회원 정보를 출력한다
 * 
 * */
import java.util.Scanner;

public class Question4 {

	public static void main(String[] args) {
		final int MAX_PERSON = 10;
		
		Scanner sc = new Scanner(System.in);
		Person p[] = new Person[MAX_PERSON];
		
		/* 메인 메뉴 */
		boolean isContinue = true;
		int currentPeople = 0;
		while (isContinue) {
			System.out.println();
			System.out.println("[ 회원 주소록 ]");
			System.out.println("1. 회원 정보 등록");
			System.out.println("2. 전체 회원 보기");
			System.out.println("3. 회원 정보 검색");
			System.out.println("0. 프로그램 종료");
			System.out.print("메뉴 번호 선택> ");
			int input = Integer.parseInt(sc.nextLine());
			
			switch (input) {
				case 1:
					/* 회원 정보를 10명까지 등록 */
					if (currentPeople >= MAX_PERSON) {
						System.out.println(MAX_PERSON + "명을 등록하여 더 이상 등록할 수 없습니다.");
						break;
					}
					
					System.out.println();
					System.out.println("[ 회원 등록 ]");
					System.out.print("회원번호: ");
					String memberNumber = sc.nextLine();
					System.out.print("이름: ");
					String name = sc.nextLine();
					System.out.print("전화번호: ");
					String phone = sc.nextLine();
					System.out.print("주소: ");
					String address = sc.nextLine();
					
					p[currentPeople] = new Person(memberNumber, name, phone, address);
					currentPeople++;
					
					break;
					
				case 2:
					/* 회원 정보 보기 */
					System.out.println();
					System.out.println("[ 전체 회원 목록 ]");
					
					if (currentPeople == 0) {
						System.out.println("등록된 회원이 없습니다.");
					} else {
						for (int i = 0; i < currentPeople; i++) {
							p[i].print();
						}
					}
					
					break;
					
				case 3:
					/* 회원 정보 검색*/
					System.out.println();
					System.out.println("[ 회원 검색 ]");
					System.out.print("검색할 회원 이름: ");
					String findingName = sc.nextLine();
					
					int indexFound;
					boolean isFound = false;
					for (indexFound = 0; indexFound < currentPeople; indexFound++) {
						if (p[indexFound].getName().equals(findingName)) {
							isFound = true;
							break;
						}
					}
					
					if (isFound) {
						p[indexFound].print();
					} else {
						System.out.println("회원 검색 결과가 없습니다.");
					}
					
					break;
					
				case 0:
					/* 프로그램 종료 */
					System.out.println();
					System.out.println("프로그램을 종료합니다.");
					isContinue = false;
					break;
					
				default:
					/* 잘못된 입력 */
					System.out.println("메뉴에 없는 번호를 입력하였습니다.");
					break;
			}
			
		} // end of while
		
		sc.close();
	}

}
