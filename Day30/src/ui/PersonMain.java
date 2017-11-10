package ui;

import java.util.List;

import dao.PersonDAO;
import vo.Person;

public class PersonMain {

	public static void main(String[] args) {
		
		PersonDAO dao = new PersonDAO();
		
		//dao.deletePersonAll();
		
		//dao.updateForce();
		
		// ���� ���
		Person p = new Person(5, "�׽�Ʈ", 20, "01099998888", "�λ�");
		dao.insert(p);
		
		/*
		// ���� ����
		p = new Person(2, "���", 40, "01011111111", "����");
		dao.updatePerson(p);
		*/
		
		// ���� ���
		List<Person> list = dao.selectPerson();
		
		for (Person person : list) {
			System.out.println(person);
		}

		/*
		// ���� ����
		int count = dao.deletePerson(1);
		System.out.println("������: " + count);
		*/
		
		System.out.println("selectOne()�� ���:");
		System.out.println(dao.selectOnePerson(1));
		
	}

}
