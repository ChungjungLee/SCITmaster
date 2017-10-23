package file;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputStreamReaderTest {

	// main이 throws를 하면 catch를 할 필요 없으나
	// throws 안 하면 반드시 catch로 처리해야한다.
	public static void main(String[] args) {

		FileInputStream fis = null;
		InputStreamReader reader = null;
		
		try {
			// byte형태로 파일을 읽어오는 파이프
			fis = new FileInputStream("input.txt");
			// 문자 형태로 읽어오는 파이프를 연결시키겠다
			reader = new InputStreamReader(fis);
			
			int c;
			
			while ( (c = reader.read()) != -1 ) {
				System.out.println((char)c);
			}
			
		} catch (IOException e) {
			e.printStackTrace();
			
		} finally {
			if (reader != null) {
				try {
					reader.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			
			if (fis != null) {
				try {
					fis.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			
		}
	}

}
