package com.test;

import java.util.Date;

public class DataTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date d = new Date();	//현재날짜
		System.out.println(d);
		System.out.println(1900+d.getYear());
		System.out.println(d.getMonth()+1);
		System.out.println(d.getDate());
		
		d.setHours(12);
		d.setMinutes(34);
		d.setSeconds(0);
		System.out.println(d);
		
	}

}
