package ui;

import java.util.List;

import dao.PersonDAO;
import vo.Person;

public class PersonMain {

	public static void main(String[] args) {
		
		PersonDAO dao = new PersonDAO();
		
		//dao.deletePersonAll();
		
		//dao.updateForce();
		
		// 정보 등록
		Person p = new Person(5, "테스트", 20, "01099998888", "부산");
		dao.insert(p);
		
		/*
		// 정보 수정
		p = new Person(2, "사또", 40, "01011111111", "함흥");
		dao.updatePerson(p);
		*/
		
		// 정보 출력
		List<Person> list = dao.selectPerson();
		
		for (Person person : list) {
			System.out.println(person);
		}

		/*
		// 정보 삭제
		int count = dao.deletePerson(1);
		System.out.println("삭제수: " + count);
		*/
		
		System.out.println("selectOne()의 결과:");
		System.out.println(dao.selectOnePerson(1));
		
	}

}
