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
		
		// Jan 1, 0001 부터 Oct 2, 2017 까지 736,605일 경과
		*/
		
		/*
		Scanner sc = new Scanner(System.in);
		
		System.out.print("연: ");
		int year = sc.nextInt();
		System.out.print("월: ");
		int month = sc.nextInt();
		*/
		
		System.out.println(736605%7);
		
		/* 
		 * 1년 1월 1일부터 해당 월 직전까지 날짜 계산
		 * 
		 * 1) 1년은 365일이므로 해당 년도-1 * 365일을 우선 더함
		 * 2) 윤년의 경우가 들어가 있기 때문에 해당 년도 / 4
		 */
		
		
	}

}
