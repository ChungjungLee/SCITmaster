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
 */
import java.util.Calendar;
import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) {
		/*
		// Calendar 객체 받아오기
		Calendar c = Calendar.getInstance();
		
		// 날짜를 세팅 ex)Sep 01
		c.set(Calendar.MONTH, Calendar.SEPTEMBER);
		c.set(Calendar.DATE, 1);
		
		// 1(일) ~ 7(토)
		System.out.println(c.get(Calendar.DAY_OF_WEEK));
		
		*/
		
		// Gregorian Calendar로는 Jan 1, 0001이 월요일이다.
		// Jan 1, 0001 부터 Oct 1, 2017 까지 736,602일 경과 (끝 날짜는 미포함)
		//System.out.println(736602%7);
		
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
		 */
		int total_days = 0;
		// 1)
		for (int i = 1; i < year; i++) {
			total_days += 365;
			if ((i % 4 == 0 && i % 100 != 0) || (i % 400 == 0)) {
				total_days += 1;
			}
		}
		// 2)
		for (int i = 1; i < month; i++) {
			switch (i) {
				case 1: case 3: case 5: case 7:
				case 8: case 10: case 12:
					total_days = total_days + 31;
					break;
					
				case 2:
					if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
						total_days = total_days + 29;
					} else {
						total_days = total_days + 28;
					}
					break;
					
				case 4: case 6: case 9: case 11:
					total_days = total_days + 30;
					break;
			}
			
		} // end of for loop
		
		System.out.println("total_days: " + total_days);
		System.out.println("day " + total_days % 7);
		
		// 0: 월, 1: 화, 2: 수, 3: 목, 4: 금, 5: 토, 6: 일 
		// 인데 계산이 복잡해지므로 하루를 더해서 계산할 것임
		int daysInWeek = total_days % 7;
		// 0: 일, 1: 월, 2: 화, 3: 수, 4: 목, 5: 금, 6: 토
		daysInWeek = (total_days + 1) % 7;
		
		/*
		 * 달력 출력
		 * */
		System.out.println("\t\t" + year + "년" + month + "월" + "\n");
		System.out.println("일\t월\t화\t수\t목\t금\t토");
		int day = 1;
		int daysInMonth;
		switch (month) {
			case 1: case 3: case 5: case 7:
			case 8: case 10: case 12:
				daysInMonth = 31;
				break;
				
			case 2:
				if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
					daysInMonth = 29;
				} else {
					daysInMonth = 28;
				}
				break;
				
			default:
				daysInMonth = 30;
				break;
		}
		int i = 0;
		for (i = 0; i < daysInWeek; i++) {
			System.out.print("\t");
		}
		for (day = 1; day <= daysInMonth; day++) {
			System.out.print(day + "\t");
			if (i % 7 == 6) {
				System.out.println();
			}
			i++;
		}
		
		System.out.println();
	}

}
