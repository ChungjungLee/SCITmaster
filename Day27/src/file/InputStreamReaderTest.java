package file;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputStreamReaderTest {

	// main�� throws�� �ϸ� catch�� �� �ʿ� ������
	// throws �� �ϸ� �ݵ�� catch�� ó���ؾ��Ѵ�.
	public static void main(String[] args) {

		FileInputStream fis = null;
		InputStreamReader reader = null;
		
		try {
			// byte���·� ������ �о���� ������
			fis = new FileInputStream("input.txt");
			// ���� ���·� �о���� �������� �����Ű�ڴ�
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
