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
	// 데이터를 저장할 파일 이름
	private final String FILENAME = "pub.dat";
	
	// 서점 관련 정보를 저장하는 리스트
	private ArrayList<Publication> pubList;

	/**
	 * 생성자.
	 * 파일이 존재하면 파일로부터 리스트를 읽어들이고
	 * 존재하지 않으면 새롭게 리스트를 작성한다
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
	 * 서점 등록 데이터를 파일에 저장한다
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
	 * 서점 등록 데이터를 파일로부터 읽어 들인다
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
	 * 서점 관련 정보를 리스트에 저장한다
	 * @return 저장 완료 시 true
	 */
	public boolean insert(Publication pub) {
		// 제품번호가 중복되면 저장하지 않는다
		//CODE HERE
		Publication found = select(pub.getProductId());
		
		if (found != null) {
			return false;
		}
		
		//파일에 저장
		//CODE HERE
		boolean isInserted = pubList.add(pub);
		
		saveFile();
		
		return isInserted;
	}
	
	/**
	 * 제품번호에 해당하는 서점 정보를 반환한다
	 * @param productId 찾고자 하는 제품의 제품번호
	 * @return 제품번호에 해당하는 서점 정보
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
	 * 제품번호에 해당하는 서점 정보를 삭제한다
	 * @param productId 삭제하고자 하는 제품의 제품번호
	 * @return 삭제 완료 시 true
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
	 * 서점 관리 정보를 가지고 있는 데이터를 반환한다
	 * @return 서점 관리 정보
	 */
	public ArrayList<Publication> getPubList() {
		//CODE HERE
		return pubList;
	}
}
