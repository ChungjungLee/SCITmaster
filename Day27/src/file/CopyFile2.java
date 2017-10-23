package file;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

// �ڹٴ� ���ڸ� 2����Ʈ ������ �����ϰ� �ֱ� ������
// reader, writer�� ���°� ����
public class CopyFile2 {

	public static void main(String[] args) throws IOException {
		
		FileReader inputStream = null;
		FileWriter outputStream = null;
		
		try {
			inputStream = new FileReader("input.txt");
			outputStream = new FileWriter("output.txt");
			
			int c;	// ���� "����Ʈ"
			// ������ ���°� 2����Ʈ�� �� ��
			
			
			while ( (c = inputStream.read()) != -1) {
				System.out.println((char) c);	// 2����Ʈ ���ڿ��� ������ �ʴ´�.
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
