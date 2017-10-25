package study;

import java.io.File;
import java.io.IOException;

public class FileTest {

	public static void main(String[] args) throws IOException {
		
		String name = "c:/eclips";
		File dir = new File(name);
		String[] fileNames = dir.list();
		
		for (String s : fileNames) {
			// ��� ������ ������ ��� �������ø� ����ؾ� �ϳ�
			// �ڹ� �������� �����ø� �ᵵ ������� ������� �ִ�.
			File f = new File(name + "/" + s);
			
			System.out.println("====================================");
			System.out.println("�̸�: " + f.getName());
			System.out.println("���: " + f.getPath());
			System.out.println("�θ�: " + f.getParent());
			System.out.println("������: " + f.getAbsolutePath());
			System.out.println("���԰��: " + f.getCanonicalPath());
			System.out.println("���丮 ����: " + f.isDirectory());
			System.out.println("���� ����: " + f.isFile());
			System.out.println("====================================");
		}
	}

}