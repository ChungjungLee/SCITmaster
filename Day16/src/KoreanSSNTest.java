
public class KoreanSSNTest {

	public static void main(String[] args) {
		KoreanSSN koreanSSN = new KoreanSSN();
		
		String ssn1 = "881101-1234567";
		
		System.out.println(koreanSSN.year(ssn1) + "�� ��");
		System.out.println("����: " + koreanSSN.birthday(ssn1));
		System.out.println("����: " + koreanSSN.sex(ssn1));
		System.out.println("���⿩��: " + koreanSSN.legalYear(ssn1));
		
	}

}
