package file;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFile1 {
	
	// main 안에서 예외가 발생해 호출한 함수에게 반환하겠다.
	public static void main(String[] args) throws IOException {
		
		// InputStream interface가 있고 그것을 구현한 FileInputStream이다
		FileInputStream in = null;
		FileOutputStream out = null;
		
		try {
			// 스트림 준비
			in = new FileInputStream("input.txt");
			out = new FileOutputStream("output.txt");
			
			int c;	// 읽을 "바이트"
					// 실제로 쓰는건 1바이트만 쓸 것
			
			// read()는 글자를 읽는 것
			// 1 바이트 글자를 하나 읽으면 해당하는 글자에 매칭이 되는 값이 있다
			// -1이 나온다는 의미는 파일의 끝에 도달했다는 의미
			while ( (c = in.read()) != -1 ) {
				System.out.println((char)c);
				
				// 읽은 1바이트 글자를 파일에 쓴다
				out.write(c);
			}
			
		} finally {
			// 파일의 읽고 쓰기가 끝나면 항상 열어줬던 파이프를 닫아야 한다.
			if (in != null) {
				in.close();
			}
			
			if (out != null) {
				out.close();
			}
		}
	}
}
