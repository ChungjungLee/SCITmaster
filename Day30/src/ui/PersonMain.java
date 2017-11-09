package ui;

import java.util.List;

import dao.PersonDAO;
import vo.Person;

public class PersonMain {

	public static void main(String[] args) {
		
		PersonDAO dao = new PersonDAO();
		
		//dao.deletePersonAll();
		
		dao.updateForce();
		
		List<Person> list = dao.selectPerson();
		
		for (Person person : list) {
			System.out.println(person);
		}

	}

}
