package makerandom;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;

/**
 * input.txt를 읽어 순서를 임의로 만드는 클래스
 * @author user
 *
 */
public class MakeProblem {

	public static void main(String[] args) throws IOException {
		ArrayList<String> list = new ArrayList<>();
		
		BufferedReader inputStream= null;
		PrintWriter outputStream= null;
		
		inputStream = new BufferedReader(new FileReader("input.txt"));
		outputStream = new PrintWriter(new FileWriter("problems.txt"));
		
		String line;
		while ((line = inputStream.readLine()) != null) {
			list.add(line);
		}
		
		/*
		 * list의 순서를 랜덤하게 바꾼다.
		 */
		Collections.shuffle(list);
		
		for (String s : list) {
			outputStream.println(s);
		}
		
		inputStream.close();
		outputStream.close();
	}

}
