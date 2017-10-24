package study;

import java.io.File;
import java.io.IOException;

public class FileTest {

	public static void main(String[] args) throws IOException {
		
		String name = "c:/eclips";
		File dir = new File(name);
		String[] fileNames = dir.list();
		
		for (String s : fileNames) {
			// 경로 구분은 윈도의 경우 역슬래시를 사용해야 하나
			// 자바 내에서는 슬래시를 써도 가능토록 만들어져 있다.
			File f = new File(name + "/" + s);
			
			System.out.println("====================================");
			System.out.println("이름: " + f.getName());
			System.out.println("경로: " + f.getPath());
			System.out.println("부모: " + f.getParent());
			System.out.println("절대경로: " + f.getAbsolutePath());
			System.out.println("정규경로: " + f.getCanonicalPath());
			System.out.println("디렉토리 여부: " + f.isDirectory());
			System.out.println("파일 여부: " + f.isFile());
			System.out.println("====================================");
		}
	}

}
