
public class KoreanSSNTest {

	public static void main(String[] args) {
		KoreanSSN koreanSSN = new KoreanSSN();
		
		String ssn1 = "881101-1234567";
		
		System.out.println(koreanSSN.year(ssn1) + "斥 积");
		System.out.println("积老: " + koreanSSN.birthday(ssn1));
		System.out.println("己喊: " + koreanSSN.sex(ssn1));
		System.out.println("己斥咯何: " + koreanSSN.legalYear(ssn1));
		
	}

}
