package study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderTest {

	public static void main(String[] args) {
		// keyboard로 입력 받는 것은 System.in이라고 한다.
		// System.in은 input stream의 한 종류이다.
		
		/*
		 * 키보드로부터 읽어 들이는 system.in
		 * system.in으로부터 읽은 바이트를 문자로 읽어 들이는 inputstreamreader
		 * inputstreamreader로부터 문자를 읽어 저장하는 bufferedReader
		 * 
		 * 그래서 최종적으로 프로그램에서는 문자(2byte)단위로 읽어 들인다. 
		 */
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		
		try {
			// byte 단위로 읽어 들이는 경우 반환형이 int였는데,
			// line 단위로 읽어 들이는 경우는 String이 된다.
			System.out.print("입력: ");
			
			String s = br.readLine();
			
			System.out.println(s);
			
		} catch (IOException e) {
			e.printStackTrace();
			
		} finally {
			if (br != null) {
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			
			if (isr != null) {
				try {
					isr.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			
		}
	}

}
