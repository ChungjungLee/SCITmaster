package practice;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/*
 * ������ ���
 */
public class Manager {
	private final String FILE_NAME = "file.dat";
	
	private ArrayList<Human> list;
	// �츮�� ���� 4���� Ÿ���� Ŭ���� ��ΰ� Human���� ��ȯ�� ����
	// �� �ʵ忡�� ������ �ʱ�ȭ���� �ʴ°�?
	// �Ϲ������δ� �����ڸ� ���ؼ� �ʱ�ȭ�ϱ� ����
	
	/*
	 * Constructor
	 */
	public Manager() {
		// �ʱ�ȭ�� ���� ��, ����� ������ �ִٸ� �ҷ�����
		// ����� ������ ������ ���� ����� �ʱ�ȭ�ؾ� �Ѵ�.
		File f = new File(FILE_NAME);
		
		if (f.exists()) {
			loadFile();
		} else {
			list = new ArrayList<>();
		}
		
	}
	
	/*
	 * Getter
	 */
	public ArrayList<Human> getList() {
		return this.list;
	}
	
	// UI������ ��� ����� ������ �޶�� ��û�ϴ� Ŭ�����̱� ������
	// ��ɵ��� public���� ��������� �Ѵ�.
	
	/**
	 * ��ü ������ ���Ͽ� �����Ѵ�.
	 */
	public void saveFile() {
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		
		try {
			// FileOutputStream() ���ڴ� �����̸��̰ų� File�̰ų�
			fos = new FileOutputStream(FILE_NAME);
			oos = new ObjectOutputStream(fos);
			
			// �츮�� ������ ������ list
			oos.writeObject(list);
			
			// close()�ϸ� �ڵ����� ������ Ȯ���ϰ� �ϱ� ����
			oos.flush();
			
		} catch (Exception e) {
			e.printStackTrace();
			
		} finally {
			if (oos != null) {
				try {
					oos.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			if (fos != null) {
				try {
					fos.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			
		}
	}
	
	/**
	 * ���Ϸκ��� ��ü ������ �ҷ��´�.
	 */
	public void loadFile() {
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		
		try {
			fis = new FileInputStream(FILE_NAME);
			ois = new ObjectInputStream(fis);
			
			// ���Ϸκ��� ������ object�̴�
			Object o = ois.readObject();
			
			// ���� Ÿ���� ArrayList<Human>�̹Ƿ�
			list = (ArrayList<Human>) o;
			
		} catch (Exception e) {
			e.printStackTrace();
			
		} finally {
			if (ois != null) {
				try {
					ois.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			
			if (fis != null) {
				try {
					fis.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			
		}
	}
	
	/**
	 * Human ��ü�� �����Ѵ�.
	 * @param h
	 * @return
	 */
	public boolean insert(Human h) {
		//boolean isAdded = list.add(h);
		// List�� ��Ͽ��θ� �˾Ƽ� ��ȯ
		// array�� ��Ͽ��θ� ���� Ȯ���ؾ� ��
		
		// TODO: �ֹι�ȣ�� ������ ����� �ִٸ� ��� �Ұ�
		/*
		if (select(h.getSsn()) == null) {
			// ������ ����� �����Ƿ� �׳� �־��ָ� �ȴ�
			return list.add(h);
		} else {
			return false;
		}
		*/
		// �ܼ��� if���� �츮�� �ϰ� ���� ������ ���� �ͺ��ٴ� 
		// ������Ű�� ���� ���ǵ��� ���� ���ؼ� return ��Ű�� ���� ������ ����
		if (select(h.getSsn()) != null) {
			return false;
		}
		
		boolean isAdded = list.add(h);
		
		saveFile();
		
		return isAdded;
		/*
		for (int i = 0; i < list.size(); i++) {
			Human temp = list.get(i);
			
			if (temp.getSsn().equals(h.getSsn())) {
				return false;
			}
		}
		*/
		
	}
	
	/**
	 * �ֹι�ȣ ������ Human ��ü�� �˻��Ѵ�.
	 * @param ssn
	 * @return
	 */
	public Human select(String ssn) {
		// Human result = null; �ؼ� result�� ��ȯ��� �ص� ������
		for (int i = 0; i < list.size(); i++) {
			Human temp = list.get(i);
			
			if (ssn.equals(temp.getSsn())) {
				return temp;
			}
		}
		
		return null;
	}
	
	/**
	 * �ֹι�ȣ ������ Ư�� Human ��ü�� �����Ѵ�.
	 * @param ssn
	 * @return
	 */
	public boolean delete(String ssn) {
		// ������� ����� �ִ��� �Ǻ�
		// select()�� ��ȯ���� ã�� Human�̰ų� null
		
		/*
		Human temp = select(ssn);
		
		if (temp == null) {
			return false;
		} else {
			return list.remove(temp);
		}
		*/
		
		// ArrayList.remove()�� overloading �Ǿ� �ִ�.
		// object�� �ѱ�� �ͺ��ٴ� index�� �ѱ�°� �ξ� ȿ�������� ���δ�.
		for (int i = 0; i < list.size(); i++) {
			Human temp = list.get(i);
			
			if (temp.getSsn().equals(ssn)) {
				list.remove(i);
				saveFile();
				return true;
			}
		}
		
		return false;
		
	}
	
	/**
	 * ���� ����� List�� ����� ��ȯ�Ѵ�.
	 * @return
	 */
	public int getListSize() {
		return list.size();
	}
	
	/**
	 * Ư�� index�� ��ġ�� Human ��ü�� ��ȯ�Ѵ�.
	 * @param index
	 * @return
	 */
	public Human getHuman(int index) {
		return list.get(index);
	}
	
	/**
	 * ���� ����� List�� ���� ����Ѵ�.
	 */
	public void printAll() {
		if (list.size() == 0) {
			System.out.println("��ϵ� ����� �����ϴ�.");
		} else {
			for (int index = 0; index < list.size(); index++) {
				System.out.println((index + 1) + ") " + list.get(index));
			}
		}
	}
}
