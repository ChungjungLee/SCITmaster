package com.test;

public class MyClass {
	private int a; 
	protected int b;
	int c;
	
	class MyInner {
		int d;
	
		// 295page, Q7
		public void m() {
			a = 1;
			b = 2;
			c = 3;
			d = 4;
			
		}
	}
}
