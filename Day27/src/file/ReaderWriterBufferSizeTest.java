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
		 *  굳이 InputStreamReader를 사용하는 이유?
		 *  
		 *  키보드로부터 입력을 받는 것은 무조건 1 byte씩 읽어들이는 것
		 *  그런데 한글 등 2byte 문자를 읽고 싶은 경우가 있다.
		 *  이런 경우에 사용해야 한다.
		 *  Scanner 내부가 이 구조로 이루어져 있는 것 같다.
		 */
		
		while ( (c = reader.read()) != -1 ) {
			writer.write(c);
		}
		
		if (reader != null) {
			// close()에는 실제로 flush() 기능도 포함이 되어있다.
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
