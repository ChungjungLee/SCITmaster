package Manager;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import VO.InterfaceClass;
import VO.Pet;

public class ManagerClass implements InterfaceClass {

	private final String FILE_NAME = "pet.dat";
	private ArrayList<Pet> petList;
	
	public ManagerClass() {
		File file = new File(FILE_NAME);
	
		if(file.exists()) {
			try {
				loadFile();
				
			} catch (ClassNotFoundException | IOException e) {
				System.out.println("error in load file");
				e.printStackTrace();
			}
			
		} else {
			petList = new ArrayList<>();
		}
	}
	
	@Override
	public boolean register(Pet pet) {
		Pet toInsert = search(pet.getName());
		
		if(toInsert != null) {
			return false;
		}
		
		boolean isInserted = petList.add(pet);
		
		return isInserted;
	}

	@Override
	public Pet search(String name) {
		for (Pet pet : petList) {
			if (pet.getName().equals(name)) {
				return pet;
			}
		}
		
		return null;
	}

	@Override
	public boolean delete(String name) {
		Pet toDelete = search(name);
		
		if (toDelete == null) {
			return false;
		}
		
		boolean isDeleted = petList.remove(toDelete);
		
		return isDeleted;
	}

	@Override
	public boolean modify(Pet pet) {
		int index;
		boolean isFound = false;
		
		for (index = 0; index < petList.size(); index++) {
			if (petList.get(index).getName().equals(pet.getName())) {
				isFound = true;
				break;
			}
		}
		
		if (!isFound) {
			return false;
		}
		
		petList.set(index, pet);
		
		return true;
	}

	@Override
	public void saveFile() throws IOException {
		FileOutputStream fos = new FileOutputStream(FILE_NAME);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		oos.writeObject(petList);
		oos.flush();
		
		if (fos != null) {
			fos.close();
		}
		
		if (oos != null) {
			oos.close();
		}
		
	}

	@Override
	public void loadFile() throws IOException, FileNotFoundException, ClassNotFoundException {
		FileInputStream fis = new FileInputStream(FILE_NAME);
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		Object o = ois.readObject();
		petList = (ArrayList<Pet>) o;
		
		if (fis != null) {
			fis.close();
		}
		
		if (ois != null) {
			ois.close();
		}
		
	}

	@Override
	public ArrayList<Pet> allPrint() {
		return petList;
	}
	
}
