/*
 * 연도, 월을 입력받아 해당 월의 달력을 출력한다.
 * 
 * - 입력받은 연도가 y, 월이 m인 경우
 * - 1년 1월 1일 부터 입력받은 y년 m월 1일까지의 날짜수를 구한다.
 * - 구한 날짜 수를 7로 나눈 나머지가 요일이다. (0이 일요일, 1이 월요일)
 * - 달력을 출력할 월의 첫날이 무슨 요일인지에 따라 \t 또는 스페이스를 이용하여 칸을 띄운다.
 * - 반복문을 이용하여 1일부터 해당 월의 마지막 날까지 출력한다.
 * - 토요일을 출력할 때마다 줄을 바꾼다.
 * 
 * (참고)
 * Gregorian Calendar로는 Jan 1, 0001이 월요일이다.
 * Jan 1, 0001 부터 Oct 1, 2017 까지 736,602일 경과 (끝 날짜는 미포함)
 * by https://www.epochconverter.com/seconds-days-since-y0
 * 
 */
import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) {
		// 월별로 몇 일이 되는지를 가지고 있는 배열, 1~12월
		final int[] daysInMonth = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

		Scanner sc = new Scanner(System.in);
		
		System.out.print("연: ");
		int year = sc.nextInt();
		System.out.print("월: ");
		int month = sc.nextInt();
		
		/* 
		 * 1년 1월 1일부터 해당 월 직전까지 날짜 계산
		 * 
		 * 1) 해당 년도 직전까지의 날짜를 더함
		 * 2) 해당 월 직전까지의 날짜를 추가로 더함 
		 * 
		 * */
		int total_days = 0;
		// 1)
		for (int i = 1; i < year; i++) {
			total_days += 365;
			if (isLeapYear(i)) {
				total_days += 1;
			}
		}
		// 2)
		for (int i = 1; i < month; i++) {
			total_days = total_days + daysInMonth[i - 1];
			
			if (i == 2 && isLeapYear(year)) {
				total_days++;
			}
			
		} // end of for loop
		
		/*
		 * total_days % 7의 값에 따라 무슨 요일인지 결정이 된다.
		 * 0 ~ 6 차례대로 월요일 ~ 일요일이 되는데 일요일부터 출력하고자 하기 때문에
		 * total_days에 1을  더하여 계산을 할 것이다.
		 * 즉 0 ~ 6 차례대로 일요일 ~ 토요일이 된다.
		 * 
		 * */ 
		int startDay = (total_days + 1) % 7;
		
		/*
		 * 달력 출력
		 * 
		 * */
		// 현재 달력의 어디에 출력 중인지를 나타내는 인덱스
		int printIndex = 0;
		int daysInThisMonth = daysInMonth[month - 1];
		
		if (isLeapYear(year) && month == 2) {
			daysInThisMonth++;
		} 
		
		System.out.println("\t\t" + year + "년 " + month + "월" + "\n");
		System.out.println("일\t월\t화\t수\t목\t금\t토");
		
		for (printIndex = 0; printIndex < startDay; printIndex++) {
			System.out.print("\t");
		}
		
		for (int day = 1; day <= daysInThisMonth; day++) {
			System.out.print(day + "\t");
			
			if (printIndex % 7 == 6) {
				System.out.println();
			}
			
			printIndex++;
		}
		
		System.out.println();
		
		int t1 = total_days % 7;
		int date = -1 * (t1);
		
		for (int row = 0; row < 6; row++) {
			for (int col = 0; col < 7; col++) {
				if(1 <= date && date <= 31) {
					System.out.print(date);
				}
				System.out.print("\t");
				date++;
			}
			System.out.println();
		}
		sc.close();
	}

	/**
	 * 입력 받은 연도가 윤년인지 아닌지 판별하는 함수
	 * @param year		판별하고자 하는 연도
	 * @return true;	윤년일 때
	 * 			false;	윤년이 아닐 때
	 */
	public static boolean isLeapYear(int year) {
		if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
			return true;
		} else {
			return false;
		}
	}
	
	/*
	// Calendar 객체 받아오기
	Calendar c = Calendar.getInstance();
	
	// 날짜를 세팅 ex)Sep 01
	c.set(Calendar.MONTH, Calendar.SEPTEMBER);
	c.set(Calendar.DATE, 1);
	
	// 1(일) ~ 7(토)
	System.out.println(c.get(Calendar.DAY_OF_WEEK));
	
	*/
}
