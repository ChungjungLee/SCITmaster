package study;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 * ��ü�� ������ ���Ϸ� �����Ѵ�.
 * @author user
 *
 */
public class ObjectStreamTest {

	public static void main(String[] args) {
		// ArrayList ��ü�� ��ü��, Human�� ��ü
		ArrayList<Human> list = new ArrayList<>();
		
		list.add(new Human("ȫ�浿"));
		list.add(new Human("�Ѹ�"));
		list.add(new Human("����"));
		
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		try {
			fos = new FileOutputStream("file.dat");
			oos = new ObjectOutputStream(fos);
			
			// �ڹ��� ��� ���� object���¶� list ��ü�� write�ϴ� �͵� ����
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
