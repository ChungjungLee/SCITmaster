/*
 * - ������ ���� Person Ŭ������ �����Ͽ� ȸ�� 1���� ������ ���� �� �ְ� �Ѵ�.
 * 	ȸ���ּҷ� ���α׷����� �Ѹ��� ȸ�������� ��Ÿ���� Ŭ����.
 * 	ȸ����ȣ, �̸�, ��ȭ��ȣ, �ּ� �̷��� 3������ �Ӽ��� ������.
 * 	��� �ʵ�� ���� �����ڰ� private�̸�,
 * 	�� �ʵ��� ���� �����ϴ� Setter�� �� �ʵ��� ���� �о �����ϴ� Getter�� ������.
 * 	�⺻�����ڿ� ��� �ʵ尪�� ���޹޾� �ʱ�ȭ�ϴ� �����ڸ� ������.
 * 	�� �ʵ��� ���� ������ ���� ����ϴ� print()�޼ҵ带 �����Ѵ�.
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
		System.out.printf("��ȣ: %s\t�̸�: %s\t��ȭ��ȣ: %s\t�ּ�: %s\n", memberNumber, name, phone, address);
	}
	
}
