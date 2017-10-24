package study;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class ReadImage {

	public static void main(String[] args) throws Exception {
		FileInputStream fis = new FileInputStream("라이언 인사.jpg");
		FileOutputStream fos = new FileOutputStream("copied.jpg");
		
		byte[] buf = new byte[1024];
		
		int c;
		
		/*
		 * TODO:
		 * buf라는 배열에 읽어들이고 있는데 이 배열은 자동으로
		 * 실제 버퍼처럼 모이면 자동 출력하는 기능이 있는건가?
		 */
		while((c = fis.read(buf)) != -1) {
			fos.write(buf);
		}
		
		fis.close();
		fos.close();
	}

}
