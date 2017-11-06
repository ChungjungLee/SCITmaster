package gov.manager;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import gov.vo.FireStation;
import gov.vo.GovernmentOffice;
import gov.vo.PoliceOffice;

public class Manager {
	private final String FILE_NAME = "gov.dat";
	
	private ArrayList<GovernmentOffice> officeList;	// 관공서 리스트
	
	/**
	 * Constructor
	 */
	public Manager() {
		if(new File(FILE_NAME).exists()){
			loadFile();
		} else {
			officeList = new ArrayList<GovernmentOffice>();
		}
	}
	
	/**
	 * gov.dat를 저장한다
	 */
	public void saveFile() {
		// CODE HERE
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		
		try {
			fos = new FileOutputStream(FILE_NAME);
			oos = new ObjectOutputStream(fos);
			
			oos.writeObject(officeList);
			
		} catch (FileNotFoundException e1) {
			System.out.println("error in saveFile()");
			e1.printStackTrace();
			
		} catch (IOException e) {
			System.out.println("error in saveFile()");
			e.printStackTrace();
			
		} finally {
			if (oos != null) {
				try {
					oos.close();
				} catch (IOException e) {
					System.out.println("error in saveFile()");
					e.printStackTrace();
				}
			}
			
			if (fos != null) {
				try {
					fos.close();
				} catch (IOException e) {
					System.out.println("error in saveFile()");
					e.printStackTrace();
				}
			}
		}
	}
	
	/**
	 * gov.dat를 불러온다
	 */
	public void loadFile() {
		// CODE HERE
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		
		try {
			fis = new FileInputStream(FILE_NAME);
			ois = new ObjectInputStream(fis);
			
			Object o = ois.readObject();
			officeList = (ArrayList<GovernmentOffice>) o;
			
		} catch (FileNotFoundException e) {
			System.out.println("error in loadFile()");
			e.printStackTrace();
			
		} catch (IOException e) {
			System.out.println("error in loadFile()");
			e.printStackTrace();
			
		} catch (ClassNotFoundException e) {
			System.out.println("error in loadFile()");
			e.printStackTrace();
			
		} finally {
			if (ois != null) {
				try {
					ois.close();
				} catch (IOException e) {
					System.out.println("error in loadFile()");
					e.printStackTrace();
				}
			}
			
			if (fis != null) {
				try {
					fis.close();
				} catch (IOException e) {
					System.out.println("error in loadFile()");
					e.printStackTrace();
				}
			}
		}
		
	}
	
	/**
	 * 관공서 정보를 저장한다. 관공서는 관리 번호에 의해 분류되고 중복될 수 없다.
	 * @param office 저장할 관공서 정보
	 * @return 저장 여부
	 */
	public boolean insert(GovernmentOffice office) {
		// CODE HERE
		if (search(office.getOfficeId()) != null) {
			return false;
		}
		
		boolean isAdded = officeList.add(office);
		
		saveFile();
		
		return isAdded;
	}

	/**
	 * 관리 번호를 통해 관공서 정보를 찾는다.
	 * @param officeId 검색할 관공서의 관리 번호
	 * @return 일치하는 관공서 정보
	 */
	public GovernmentOffice search(String officeId) {
		// CODE HERE
		for (GovernmentOffice toFind : officeList) {
			if (toFind.getOfficeId().equals(officeId)) {
				return toFind;
			}
		}
		
		return null;
	}

	/**
	 * 관리 번호를 통해 관공서 정보를 삭제한다.
	 * @param officeId 삭제할 관공서의 관리 번호
	 * @return 삭제 여부
	 */
	public boolean delete(String officeId) {
		// CODE HERE
		GovernmentOffice toDelete = search(officeId);
		
		if (toDelete == null) {
			return false;
		}
		
		boolean isDeleted = officeList.remove(toDelete);
		
		saveFile();
		
		return isDeleted;
	}

	/**
	 * 관공서 리스트를 얻는다
	 * @return
	 */
	public ArrayList<GovernmentOffice> getOfficeList() {
		return officeList;
	}

	/**
	 * 경찰서의 갯수를 얻는다
	 * @return 경찰서의 갯수
	 */
	public int getPoliceOfficeCount() {
		int count = 0;
		
		
		// CODE HERE
		for (GovernmentOffice office : officeList) {
			if (office instanceof PoliceOffice) {
				count++;
			}
		}
		
		return count;
	}

	/**
	 * 소방서의 갯수를 얻는다
	 * @return 소방서의 갯수
	 */
	public int getFireStationCount() {
		int count = 0;
		
		// CODE HERE
		for (GovernmentOffice office : officeList) {
			if (office instanceof FireStation) {
				count++;
			}
		}
		
		return count;
	}

	/**
	 * 전체 관공서의 종사자 수를 얻는다
	 * @return 전체 관공서의 종사자 수
	 */
	public int getEmployeeCount() {
		int sum = 0;
		
		// CODE HERE
		for (GovernmentOffice office : officeList) {
			sum += office.getEmployeeCount();
		}
		return sum;
	}
}
