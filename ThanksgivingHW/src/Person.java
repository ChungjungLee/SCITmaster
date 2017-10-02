/*
 * - 다음과 같은 Person 클래스를 정의하여 회원 1명의 정보를 담을 수 있게 한다.
 * 	회원주소록 프로그램에서 한명의 회원정보를 나타내는 클래스.
 * 	회원번호, 이름, 전화번호, 주소 이렇게 3가지의 속성을 가진다.
 * 	모든 필드는 접근 지정자가 private이며,
 * 	각 필드의 값을 변경하는 Setter와 각 필드의 값을 읽어서 리턴하는 Getter를 가진다.
 * 	기본생성자와 모든 필드값을 전달받아 초기화하는 생성자를 가진다.
 * 	각 필드의 값을 다음과 같이 출력하는 print()메소드를 정의한다.
 * 
 * */
public class Person {
	private String memberNumber;
	private String name;
	private String phone;
	private String address;
	
	public Person() {
		
	}
	
	public Person(String memberNumber, String name, String phone, String address) {
		this.memberNumber = memberNumber;
		this.name = name;
		this.phone = phone;
		this.address = address;
	}
	
	public String getMemberNumber() {
		return memberNumber;
	}
	
	public void setMemberNumber(String memberNumber) {
		this.memberNumber = memberNumber;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getPhone() {
		return phone;
	}
	
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	public String getAddress() {
		return address;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public void print() {
		System.out.printf("번호: %s\t이름: %s\t전화번호: %s\t주소: %s\n", memberNumber, name, phone, address);
	}
	
}
