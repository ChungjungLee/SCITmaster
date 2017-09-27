
public class KoreanSSN {
	// 123456-1234567
	String ssn;
	
	/**
	 * �ֹι�ȣ �Է¹޾� �� ������� ���
	 * @param String type ssn
	 * @return int year
	 */
	int year(String ssn) {
		// '-'���� ���ڰ�
		// case 1) 1 or 2
		// 1900 + �� ���� �� �ڸ����� 
		// case 2) 3 or 4
		// 2000 + �� ���� �� �ڸ�����
		
		char seventhDigit = ssn.charAt(7);
		int twoDigit = Integer.parseInt(ssn.substring(0, 2));
		
		if (seventhDigit == '1' || seventhDigit == '2') {
			return 1900 + twoDigit;
		} else {
			return 2000 + twoDigit;
		}
	}
	
	/**
	 * �ֹι�ȣ �Է¹޾� ������ ���
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
	 * �ֹι�ȣ �Է¹޾� ���� ���
	 * @param String ssn
	 * @return String sex
	 */
	String sex(String ssn) {
		// '-'���� ���ڰ�
		// case 1) 1 or 3
		// ���� 
		// case 2) 2 or 4
		// ����
		
		char seventhDigit = ssn.charAt(7);
		
		// seventhDigit == 1 
		// �̶�� �ϰԵǸ� ��¥ ���� 1�� ���Ѵ�
		if (seventhDigit == '1' || seventhDigit == '3') {
			return "����";
		} else {
			return "����";
		}
	}
	
	
	String legalYear(String ssn) {
		// �� ���̰� 19�� �̻��̸� ����
		int currentYear = 2017;
		int currentMonth = 9;
		int currentDay = 27;
		
		int year = year(ssn);
		int month = Integer.parseInt(ssn.substring(2, 4));
		int day = Integer.parseInt(ssn.substring(4, 6));
		
		if (currentYear - year > 19) {
			return "����";
		} else if (currentYear - year == 19) {
			if (currentMonth >= month && currentDay >= day) {
				return "����";
			} else {
				return "�̼���";
			}
		} else {
			return "�̼���";
		}
		
		/*
		 * calender c = calender.getInstance();
		 * int year = c.get(Calender.year)�� �̿��ص� ����
		 * */
	}
}
