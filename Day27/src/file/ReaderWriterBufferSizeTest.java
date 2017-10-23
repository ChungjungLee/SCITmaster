package file;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class ReaderWriterBufferSizeTest {

	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("input.txt");
		FileOutputStream fos = new FileOutputStream("output.txt");
		InputStreamReader reader = new InputStreamReader(fis);
		OutputStreamWriter writer = new OutputStreamWriter(fos);
		
		int c;
		//new InputStreamReader(System.in);
		
		/*
		 *  ���� InputStreamReader�� ����ϴ� ����?
		 *  
		 *  Ű����κ��� �Է��� �޴� ���� ������ 1 byte�� �о���̴� ��
		 *  �׷��� �ѱ� �� 2byte ���ڸ� �а� ���� ��찡 �ִ�.
		 *  �̷� ��쿡 ����ؾ� �Ѵ�.
		 *  Scanner ���ΰ� �� ������ �̷���� �ִ� �� ����.
		 */
		
		while ( (c = reader.read()) != -1 ) {
			writer.write(c);
		}
		
		if (reader != null) {
			// close()���� ������ flush() ��ɵ� ������ �Ǿ��ִ�.
			reader.close();
		}
		if (writer != null) {
			writer.close();
		}
		if (fis != null) {
			fis.close();
		}
		if (fos != null) {
			fos.close();
		}
		
		
	}

}
