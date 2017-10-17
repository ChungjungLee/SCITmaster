package com.test;

import java.util.Calendar;

public class CalendarTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 대문자로 시작하니 static method 라는걸 알 수 있다.
		// Calendar는 추상클래스이므로 실제로 생성하는건 그레고리안 캘린더다.
		Calendar d = Calendar.getInstance();
		System.out.println(d);
		// 대문자로만 쓰여있으니 final 변수라는걸 알 수 있다.
		System.out.println(d.get(Calendar.YEAR) + "년");
		System.out.println(d.get(Calendar.MONTH)+1 +"월");
		System.out.println(d.get(Calendar.DATE) + "일");
		
		d.set(Calendar.HOUR, 12);
		d.set(Calendar.MINUTE, 34);
		d.set(Calendar.SECOND, 0);
		System.out.println(d);
	}

}
