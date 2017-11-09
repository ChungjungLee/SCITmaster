package dao;

import java.util.List;

import vo.Person;

public interface PersonMapper {
	List<Person> selectPerson();
	void updateForce();
	void deletePersonAll();
}
