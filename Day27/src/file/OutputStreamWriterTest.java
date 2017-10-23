package file;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class OutputStreamWriterTest {

	public static void main(String[] args) throws IOException {
		String[] words = { "�ȳ�", "HI", "�� ����" };
		
		FileOutputStream fos = null;
		OutputStreamWriter writer = null;
		
		fos = new FileOutputStream("output.txt");
		writer = new OutputStreamWriter(fos);
		
		//fos.write(b); b�� String�� ���� �� ����.
		for (int i = 0; i < words.length; i++) {
			// String���� format�̶�� �ϴ� �԰��� �ִ�.
			// ���ڷ� ���̴°� ��Ģ�� �ȴ�. %n�� ���๮�ڰ� �ȴ�.(���� 629p)
			String w = String.format("%s%n", words[i]);
			
			// �����δ� ���ۿ� ����Ѵ�.
			// ���۴� ���� ũ�Ⱑ ���� ���������� �׷��� ������ keep
			// ������ ũ�Ⱑ ��������ϱ�?
			writer.write(w);
		}
		
		// ���۶�� ������ �������� �׿��� �ֵ��� ��������
		writer.flush();
		
		if (writer != null) {
			writer.close();
		}
		
		if (fos != null) {
			fos.close();
		}
		
	}

}
