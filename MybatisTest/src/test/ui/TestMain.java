package test.ui;

import java.util.ArrayList;

import test.dao.TestDAO;
import test.vo.Person;

public class TestMain {

	public static void main(String[] args) {
		TestDAO dao = new TestDAO();
		
		//�Է�
		Person p = new Person(2, "�迩��", 30, "01022223333", "��⵵ ���� �ϻ굿�� �鼮�� 222");
		dao.insertPerson(p);
		
		
		//�˻�
		/*
		ArrayList<Person> list = dao.selectPerson();
		for (Person p : list) {
			System.out.println(p);
		}
		*/
	}

}
