package dog.ui;

import java.util.List;

import dog.dao.DogDAO;
import dog.vo.Dog;

public class UIstart {

	public static void main(String[] args) {		
		DogDAO dao = new DogDAO();
		
		//List<Dog> dogList = dao.getAllDog();
		
		for (Dog dog : dao.getAllDog()) {
			System.out.println(dog);
		}
		
	}

}
