package file;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class OutputStreamWriterTest {

	public static void main(String[] args) throws IOException {
		String[] words = { "안녕", "HI", "응 ㅇㅈ" };
		
		FileOutputStream fos = null;
		OutputStreamWriter writer = null;
		
		fos = new FileOutputStream("output.txt");
		writer = new OutputStreamWriter(fos);
		
		//fos.write(b); b는 String을 받을 수 없다.
		for (int i = 0; i < words.length; i++) {
			// String에는 format이라고 하는 규격이 있다.
			// 인자로 붙이는게 규칙이 된다. %n은 개행문자가 된다.(교재 629p)
			String w = String.format("%s%n", words[i]);
			
			// 실제로는 버퍼에 기록한다.
			// 버퍼는 일정 크기가 차면 내보내지만 그렇지 않으면 keep
			// 버퍼의 크기가 어느정도일까?
			writer.write(w);
		}
		
		// 버퍼라는 공간에 차근차근 쌓였던 애들을 내보낸다
		writer.flush();
		
		if (writer != null) {
			writer.close();
		}
		
		if (fos != null) {
			fos.close();
		}
		
	}

}
