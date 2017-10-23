package file;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFile1 {
	
	// main �ȿ��� ���ܰ� �߻��� ȣ���� �Լ����� ��ȯ�ϰڴ�.
	public static void main(String[] args) throws IOException {
		
		// InputStream interface�� �ְ� �װ��� ������ FileInputStream�̴�
		FileInputStream in = null;
		FileOutputStream out = null;
		
		try {
			// ��Ʈ�� �غ�
			in = new FileInputStream("input.txt");
			out = new FileOutputStream("output.txt");
			
			int c;	// ���� "����Ʈ"
					// ������ ���°� 1����Ʈ�� �� ��
			
			// read()�� ���ڸ� �д� ��
			// 1 ����Ʈ ���ڸ� �ϳ� ������ �ش��ϴ� ���ڿ� ��Ī�� �Ǵ� ���� �ִ�
			// -1�� ���´ٴ� �ǹ̴� ������ ���� �����ߴٴ� �ǹ�
			while ( (c = in.read()) != -1 ) {
				System.out.println((char)c);
				
				// ���� 1����Ʈ ���ڸ� ���Ͽ� ����
				out.write(c);
			}
			
		} finally {
			// ������ �а� ���Ⱑ ������ �׻� ������� �������� �ݾƾ� �Ѵ�.
			if (in != null) {
				in.close();
			}
			
			if (out != null) {
				out.close();
			}
		}
	}
}
