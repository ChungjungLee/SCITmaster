
public class KoreanSSN {
	// 123456-1234567
	String ssn;
	
	/**
	 * 주민번호 입력받아 몇 년생인지 출력
	 * @param String type ssn
	 * @return int year
	 */
	int year(String ssn) {
		// '-'뒤의 숫자가
		// case 1) 1 or 2
		// 1900 + 맨 앞의 두 자리숫자 
		// case 2) 3 or 4
		// 2000 + 맨 앞의 두 자리숫자
		
		char seventhDigit = ssn.charAt(7);
		int twoDigit = Integer.parseInt(ssn.substring(0, 2));
		
		if (seventhDigit == '1' || seventhDigit == '2') {
			return 1900 + twoDigit;
		} else {
			return 2000 + twoDigit;
		}
	}
	
	/**
	 * 주민번호 입력받아 생일을 출력
	 * @param String ssn
	 * @return String birthday
	 */
	String birthday(String ssn) {
		String birthday;
		
		String month = ssn.substring(2, 4);
		String day = ssn.substring(4, 6);
		
		birthday = "" + year(ssn) + "." + month + "." + day;
		
		return birthday;
	}
	
	/**
	 * 주민번호 입력받아 성별 출력
	 * @param String ssn
	 * @return String sex
	 */
	String sex(String ssn) {
		// '-'뒤의 숫자가
		// case 1) 1 or 3
		// 남성 
		// case 2) 2 or 4
		// 여성
		
		char seventhDigit = ssn.charAt(7);
		
		// seventhDigit == 1 
		// 이라고 하게되면 진짜 숫자 1과 비교한다
		if (seventhDigit == '1' || seventhDigit == '3') {
			return "남성";
		} else {
			return "여성";
		}
	}
	
	
	String legalYear(String ssn) {
		// 만 나이가 19세 이상이면 성년
		int currentYear = 2017;
		int currentMonth = 9;
		int currentDay = 27;
		
		int year = year(ssn);
		int month = Integer.parseInt(ssn.substring(2, 4));
		int day = Integer.parseInt(ssn.substring(4, 6));
		
		if (currentYear - year > 19) {
			return "성년";
		} else if (currentYear - year == 19) {
			if (currentMonth >= month && currentDay >= day) {
				return "성년";
			} else {
				return "미성년";
			}
		} else {
			return "미성년";
		}
		
		/*
		 * calender c = calender.getInstance();
		 * int year = c.get(Calender.year)를 이용해도 좋다
		 * */
	}
}
