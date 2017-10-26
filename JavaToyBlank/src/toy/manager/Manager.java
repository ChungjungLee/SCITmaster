package toy.manager;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import toy.vo.Toy;

/**
 * 장난감 정보를 관리하는 클래스
 */
public class Manager {
	private final String FILE_NAME = "toyList.dat";
	
	private ArrayList<Toy> toyList;		// 장난감 리스트

	
	/**
	 * Constructor
	 */
	public Manager() {
		if(new File(FILE_NAME).exists()){
			loadFile();
		} else {
			toyList = new ArrayList<Toy>();
		}
	}
	
	/**
	 * toyList.dat를 저장한다
	 */
	public void saveFile() {
		// CODE HERE
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		
		try {
			fos = new FileOutputStream(FILE_NAME);
			oos = new ObjectOutputStream(fos);
			
			oos.writeObject(toyList);
			oos.flush();
			
		} catch (FileNotFoundException e) {
			System.out.println("SaveFile() error");
			e.printStackTrace();
			
		} catch (IOException e) {
			System.out.println("SaveFile() error");
			e.printStackTrace();
			
		} finally {
			if (oos != null) {
				try {
					oos.close();
				} catch (IOException e) {
					System.out.println("SaveFile() error in closing");
					e.printStackTrace();
				}
			}
			
			if (fos != null) {
				try {
					fos.close();
				} catch (IOException e) {
					System.out.println("SaveFile() error in closing");
					e.printStackTrace();
				}
			}
			
		}
		
	}
	
	/**
	 * toyList.dat를 불러온다
	 */
	public void loadFile() {
		// CODE HERE
		
		// 파일이 없다면 읽어들일 수 없다.
		if (!new File(FILE_NAME).exists()) {
			return;
		}
		
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		
		try {
			fis = new FileInputStream(FILE_NAME);
			ois = new ObjectInputStream(fis);
			
			Object o = ois.readObject();
			toyList = (ArrayList<Toy>) o;
			
		} catch (FileNotFoundException e) {
			System.out.println("LoadFile() error");
			e.printStackTrace();
			
		} catch (IOException e) {
			System.out.println("LoadFile() error");
			e.printStackTrace();
			
		} catch (ClassNotFoundException e) {
			System.out.println("LoadFile() error");
			e.printStackTrace();
			
		} finally {
			if (ois != null) {
				try {
					ois.close();
				} catch (IOException e) {
					System.out.println("LoadFile() error in closing");
					e.printStackTrace();
				}
			}
			
			if (fis != null) {
				try {
					fis.close();
				} catch (IOException e) {
					System.out.println("LoadFile() error in closing");
					e.printStackTrace();
				}
			}
		}
	}
	
	/**
	 * 장난감을 저장한다. 장난감은 code에 의해 분류되고 같은 code는 사용할 수 없다.
	 * @param toy 저장할 장난감 정보
	 * @return 저장 여부
	 */
	public boolean insert(Toy toy) {
		// CODE HERE
		
		Toy found = search(toy.getCode());
		
		if (found != null) {
			return false;
		}
		
		boolean isAdded = toyList.add(toy);
		
		saveFile();
		
		return isAdded;
	}
	
	/**
	 * code를 통해 장난감을 찾는다. 코드가 일치하는 장난감을 찾으면 그것을 반환한다.
	 * @param code 검색할 장난감 코드
	 * @return 일치하는 장난감 정보
	 */
	public Toy search(String code) {
		// CODE HERE
		for (Toy element : toyList) {
			if (element.getCode().equals(code)) {
				return element;
			}
		}
		
		return null;
	}

	/**
	 * code를 통해 장난감을 삭제한다. 코드가 일치하는 장난감을 찾으면 삭제한다. 
	 * @param code 삭제할 장난감 코드
	 * @return 삭제 여부
	 */
	public boolean delete(String code) {
		// CODE HERE
		Toy found = search(code);
		
		if (found == null) {
			return false;
		}
		
		boolean isDeleted = toyList.remove(found);
		
		saveFile();
		
		return isDeleted;
	}

	/**
	 * 장난감 리스트를 얻는다
	 * @return 장난감 리스트
	 */
	public ArrayList<Toy> getToyList() {
		loadFile();
		
		return toyList;
	}
	
}
