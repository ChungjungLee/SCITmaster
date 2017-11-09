package test.ui;

import java.util.ArrayList;

import test.dao.TestDAO;
import test.vo.Person;

public class TestMain {

	public static void main(String[] args) {
		TestDAO dao = new TestDAO();
		
		//입력
		Person p = new Person(2, "김여희", 30, "01022223333", "경기도 고양시 일산동구 백석동 222");
		dao.insertPerson(p);
		
		
		//검색
		/*
		ArrayList<Person> list = dao.selectPerson();
		for (Person p : list) {
			System.out.println(p);
		}
		*/
	}

}
