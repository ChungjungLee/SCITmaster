package com.test;

import java.util.Arrays;

public class ArraysTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = { 9, 4, 5, 6, 1 };
		
		// sorting 구현보다 이걸 사용하는게 더 빠름
		Arrays.sort(array);
		printArray(array);
		
		System.out.println(Arrays.binarySearch(array, 9));
		
		Arrays.fill(array, 8);
		printArray(array);
		
	}

	private static void printArray(int[] array) {
		System.out.print("[");
		for(int i = 0; i < array.length; i ++) {
			System.out.print(array[i] + " ");
		}
		System.out.println("]");
	}
}
