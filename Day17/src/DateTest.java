import java.util.Scanner;

class Date {
	private int year;
	private String month;
	private int day;
	
	public Date() {
		month = "1월";
		day = 1;
		year = 2009;
	}
	
	public Date(int year, String month, int day) {
		setDate(year, month, day);
	}
	
	public Date(int year) {
		setDate(year, "1월", 1);
	}
	
	// this: 현재 객체를 가리킨다
	// 메소드를 구현할 때는 어느 객체가 이걸 실행시키는지 알아야 함
	public void setDate(int year, String month, int day) {
		this.month = month;
		this.day = day;
		this.year = year;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getMonth() {
		return month;
	}

	public void setMonth(String month) {
		this.month = month;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}
	
	
}

public class DateTest {
	public static void main(String[] args) {
		Date date1 = new Date(2009, "3월", 2);
		Date date2 = new Date(2010);
		Date date3 = new Date();
		
		System.out.println();
	}
	
	
}
