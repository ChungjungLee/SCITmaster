package com.test;

public class StringBufferTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. String�� String�� ���ϴ� ��
		int count = 10000;
		String word = "Hello";
		
		long t1 = System.currentTimeMillis();
		for (int i = 0; i < count; i++) {
			word += "bye";
		}
		// 2. StringBufffer�� String ���ϴ� ��
		
	}

}
