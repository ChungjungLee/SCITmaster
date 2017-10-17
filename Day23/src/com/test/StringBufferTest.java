package com.test;

public class StringBufferTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. String에 String을 더하는 것
		int count = 10000;
		String word = "Hello";
		
		long t1 = System.currentTimeMillis();
		for (int i = 0; i < count; i++) {
			word += "bye";
		}
		// 2. StringBufffer에 String 더하는 것
		
	}

}
