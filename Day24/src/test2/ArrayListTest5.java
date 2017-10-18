package test2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * size 입력 받고 size만큼 성적을 등록(0-100)
 * 총합과 평균을 구한다.
 * @author user
 *
 */
public class ArrayListTest5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> scores = new ArrayList<>();
		
		System.out.print("크기 입력: ");
		int size = sc.nextInt();
		
		for (int i = 0; i < size; i++) {
			System.out.print("성적 입력: ");
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
		
		System.out.println("총합: " + total);
		System.out.println("평균: " + avg);
	}

}
