package study;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class ReadImage {

	public static void main(String[] args) throws Exception {
		FileInputStream fis = new FileInputStream("���̾� �λ�.jpg");
		FileOutputStream fos = new FileOutputStream("copied.jpg");
		
		byte[] buf = new byte[1024];
		
		int c;
		
		/*
		 * TODO:
		 * buf��� �迭�� �о���̰� �ִµ� �� �迭�� �ڵ�����
		 * ���� ����ó�� ���̸� �ڵ� ����ϴ� ����� �ִ°ǰ�?
		 */
		while((c = fis.read(buf)) != -1) {
			fos.write(buf);
		}
		
		fis.close();
		fos.close();
	}

}
