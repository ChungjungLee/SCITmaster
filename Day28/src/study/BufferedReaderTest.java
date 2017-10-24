package study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderTest {

	public static void main(String[] args) {
		// keyboard�� �Է� �޴� ���� System.in�̶�� �Ѵ�.
		// System.in�� input stream�� �� �����̴�.
		
		/*
		 * Ű����κ��� �о� ���̴� system.in
		 * system.in���κ��� ���� ����Ʈ�� ���ڷ� �о� ���̴� inputstreamreader
		 * inputstreamreader�κ��� ���ڸ� �о� �����ϴ� bufferedReader
		 * 
		 * �׷��� ���������� ���α׷������� ����(2byte)������ �о� ���δ�. 
		 */
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		
		try {
			// byte ������ �о� ���̴� ��� ��ȯ���� int���µ�,
			// line ������ �о� ���̴� ���� String�� �ȴ�.
			System.out.print("�Է�: ");
			
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
