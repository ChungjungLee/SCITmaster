package test2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * size �Է� �ް� size��ŭ ������ ���(0-100)
 * ���հ� ����� ���Ѵ�.
 * @author user
 *
 */
public class ArrayListTest5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> scores = new ArrayList<>();
		
		System.out.print("ũ�� �Է�: ");
		int size = sc.nextInt();
		
		for (int i = 0; i < size; i++) {
			System.out.print("���� �Է�: ");
			int score = sc.nextInt();
			
			if (score < 0 || score >100) {
				i--;
			} else {
				scores.add(score);
			}
		}
		
		int total = 0;
		int avg = 0;
		for (int i = 0; i < scores.size(); i++) {
			total += scores.get(i);
		}
		avg = total / scores.size();
		
		System.out.println("����: " + total);
		System.out.println("���: " + avg);
	}

}
