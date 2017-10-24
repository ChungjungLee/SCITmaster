package study;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 * 객체의 정보를 파일로 저장한다.
 * @author user
 *
 */
public class ObjectStreamTest {

	public static void main(String[] args) {
		// ArrayList 자체도 객체며, Human도 객체
		ArrayList<Human> list = new ArrayList<>();
		
		list.add(new Human("홍길동"));
		list.add(new Human("둘리"));
		list.add(new Human("희동이"));
		
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		try {
			fos = new FileOutputStream("file.dat");
			oos = new ObjectOutputStream(fos);
			
			// 자바의 모든 것은 object형태라 list 자체를 write하는 것도 가능
			oos.writeObject(list);
			
			oos.writeObject("sample input");
			oos.flush();
			
		} catch (FileNotFoundException e) {
			// come from fos
			e.printStackTrace();
			
		} catch (IOException e) {
			// come from oos
			e.printStackTrace();
			
		} finally {
			
		}
		
	}

}
