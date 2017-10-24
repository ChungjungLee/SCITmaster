package file;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class CopyLines {

	public static void main(String[] args) {
		BufferedReader inputStream = null;
		PrintWriter outputStream = null;
		
		try {
			inputStream = new BufferedReader(new FileReader("input.txt"));
			outputStream = new PrintWriter(new FileWriter("output.txt"));
			
			/*
			 * 버퍼에 입력 받은 값들을 우선 저장하고 있으니
			 * line 별로 읽어들이는 것이 가능하다.
			 */
			String line;
			while ((line = inputStream.readLine()) != null) {
				outputStream.println(line);
			}
			
		} catch(IOException e) {
			e.printStackTrace();
			
		} finally {
			if (inputStream != null) {
				try {
					inputStream.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			if (outputStream != null) {
				outputStream.close();
			}
		}
	}

}
