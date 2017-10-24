package study;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class FileTest2 {

	public static void main(String[] args) {
		File f = new File("file3.dat");
		
		if (f.exists()) {
			// read file
			try {
				FileInputStream fis = new FileInputStream(f);
				ObjectInputStream ois = new ObjectInputStream(fis);
				
				// 오브젝트 읽기
				Human h = (Human) ois.readObject();
				
				String name = (String) ois.readObject();
				
				System.out.println(h);
				System.out.println(name);
				
				// fis, ois close()
				ois.close();
				fis.close();
				
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			} finally {
				
			}
			
		} else {
			// create file
			try {
				FileOutputStream fos = new FileOutputStream(f);
				ObjectOutputStream oos = new ObjectOutputStream(fos);
				
				Human h = new Human("아이유");
				
				oos.writeObject(h);
				
				oos.writeObject(h.getName());
				
				oos.close();
				fos.close();
				
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
		
		System.out.println("완료");
		
	}

}
