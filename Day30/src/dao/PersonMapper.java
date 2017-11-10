package dao;

import java.util.List;

import vo.Person;

public interface PersonMapper {
	// insertPerson의 return type을 int로 해주면 알아서
	// 몇 개의 row를 입력했는지 반환해준다.
	void insertPerson(Person person);
	List<Person> selectPerson();
	void updateForce();
	void deletePersonAll();
	// 아래의 메소드가 그 예제임.
	int deletePerson(int num);
	int updatePerson(Person person);
	Person selectOne(int num);
}
