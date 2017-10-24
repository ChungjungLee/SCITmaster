package study;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;

/**
 * ���Ͽ� ����� ��ü�� ������ �����´�.
 * @author user
 *
 */
public class ObjectStreamTest2 {

	public static void main(String[] args) {
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		
		try {
			fis = new FileInputStream("file.dat");
			ois = new ObjectInputStream(fis);
			
			// �о� ���� ���� object Ÿ������ ��ȯ�Ѵ�.
			// �� �� �ش� object Ÿ���� Ŭ������ ���ٸ� ����(ClassNotFoundException)
			
			// ���� �о���� ���� object �ֻ��� Ÿ���̴� 
			// ArrayList Ÿ������ down-casting ���־�� �Ѵ�.
			// �ٸ�, �̰� �츮�� ���� �˰� �ֱ� ������
			Object o = ois.readObject();
			ArrayList<Human> list = (ArrayList<Human>)o;
			
			String s = (String) ois.readObject();
			System.out.println(s);
			
			/*
			 * �츮�� ��ü�� ���Ͽ� ������ �� �پ��� ������ �������ٵ�,
			 * � ������ ������ �ߴ����� ���缭 �����ؾ� �Ѵ�!!
			 */
			
			for (int i = 0; i < list.size(); i++) {
				System.out.println(list.get(i));
			}
			
			
		} catch(Exception e) {
			
		}
		
	}

}
