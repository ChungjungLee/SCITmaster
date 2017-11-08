package test1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Manager {
	// �����͸� ������ ���� �̸�
	private final String FILENAME = "pub.dat";
	
	// ���� ���� ������ �����ϴ� ����Ʈ
	private ArrayList<Publication> pubList;

	/**
	 * ������.
	 * ������ �����ϸ� ���Ϸκ��� ����Ʈ�� �о���̰�
	 * �������� ������ ���Ӱ� ����Ʈ�� �ۼ��Ѵ�
	 */
	public Manager() {
		//CODE HERE
		File file = new File(FILENAME);
		if (file.exists()) {
			loadFile();
		} else {
			pubList = new ArrayList<>();
		}
	}
	
	/**
	 * ���� ��� �����͸� ���Ͽ� �����Ѵ�
	 */
	private void saveFile() {
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		
		//CODE HERE
		try {
			fos = new FileOutputStream(FILENAME);
			oos = new ObjectOutputStream(fos);
			
			oos.writeObject(pubList);
			oos.flush();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			
		} catch (IOException e) {
			e.printStackTrace();
			
		} finally {
			if (oos != null) {
				try {
					oos.close();
				} catch (IOException e) {
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
	 * ���� ��� �����͸� ���Ϸκ��� �о� ���δ�
	 */
	private void loadFile() {
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		
		//CODE HERE
		try {
			fis = new FileInputStream(FILENAME);
			ois = new ObjectInputStream(fis);
			
			Object o = ois.readObject();
			pubList = (ArrayList<Publication>) o;
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			
		} catch (IOException e) {
			e.printStackTrace();
			
		} catch (ClassNotFoundException e) {
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
	 * ���� ���� ������ ����Ʈ�� �����Ѵ�
	 * @return ���� �Ϸ� �� true
	 */
	public boolean insert(Publication pub) {
		// ��ǰ��ȣ�� �ߺ��Ǹ� �������� �ʴ´�
		//CODE HERE
		Publication found = select(pub.getProductId());
		
		if (found != null) {
			return false;
		}
		
		//���Ͽ� ����
		//CODE HERE
		boolean isInserted = pubList.add(pub);
		
		saveFile();
		
		return isInserted;
	}
	
	/**
	 * ��ǰ��ȣ�� �ش��ϴ� ���� ������ ��ȯ�Ѵ�
	 * @param productId ã���� �ϴ� ��ǰ�� ��ǰ��ȣ
	 * @return ��ǰ��ȣ�� �ش��ϴ� ���� ����
	 */
	public Publication select(int productId) {
		//CODE HERE
		for (Publication pub : pubList) {
			if (pub.getProductId() == productId) {
				return pub;
			}
		}
		
		return null;
	}
	
	/**
	 * ��ǰ��ȣ�� �ش��ϴ� ���� ������ �����Ѵ�
	 * @param productId �����ϰ��� �ϴ� ��ǰ�� ��ǰ��ȣ
	 * @return ���� �Ϸ� �� true
	 */
	public boolean delete(int productId) {
		//CODE HERE
		Publication found = select(productId);
		
		if (found == null) {
			return false;
		}
		
		boolean isDeleted = pubList.remove(found);
		
		saveFile();
		
		return isDeleted;
	}
	
	/**
	 * ���� ���� ������ ������ �ִ� �����͸� ��ȯ�Ѵ�
	 * @return ���� ���� ����
	 */
	public ArrayList<Publication> getPubList() {
		//CODE HERE
		return pubList;
	}
}
