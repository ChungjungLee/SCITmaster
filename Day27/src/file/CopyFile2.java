package file;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

// 자바는 문자를 2바이트 단위로 구성하고 있기 때문에
// reader, writer를 쓰는게 낫다
public class CopyFile2 {

	public static void main(String[] args) throws IOException {
		
		FileReader inputStream = null;
		FileWriter outputStream = null;
		
		try {
			inputStream = new FileReader("input.txt");
			outputStream = new FileWriter("output.txt");
			
			int c;	// 읽을 "바이트"
			// 실제로 쓰는건 2바이트만 쓸 것
			
			
			while ( (c = inputStream.read()) != -1) {
				System.out.println((char) c);	// 2바이트 글자여도 깨지지 않는다.
				outputStream.write(c);
			}
			
		} finally {
			if (inputStream != null) {
				inputStream.close();
			}
			
			if (outputStream != null) {
				outputStream.close();
			}
		}
				
	}

}
