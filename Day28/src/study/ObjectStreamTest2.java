package study;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;

/**
 * 파일에 저장된 객체의 정보를 가져온다.
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
			
			// 읽어 들인 것을 object 타입으로 반환한다.
			// 이 때 해당 object 타입의 클래스가 없다면 예외(ClassNotFoundException)
			
			// 현재 읽어들인 것은 object 최상위 타입이니 
			// ArrayList 타입으로 down-casting 해주어야 한다.
			// 다만, 이건 우리가 지금 알고 있기 때문임
			Object o = ois.readObject();
			ArrayList<Human> list = (ArrayList<Human>)o;
			
			String s = (String) ois.readObject();
			System.out.println(s);
			
			/*
			 * 우리가 객체를 파일에 저장할 때 다양한 정보를 저장할텐데,
			 * 어떤 순서로 저장을 했는지에 맞춰서 복구해야 한다!!
			 */
			
			for (int i = 0; i < list.size(); i++) {
				System.out.println(list.get(i));
			}
			
			
		} catch(Exception e) {
			
		}
		
	}

}
