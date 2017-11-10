package dao;

import java.util.List;

import vo.Person;

public interface PersonMapper {
	// insertPerson�� return type�� int�� ���ָ� �˾Ƽ�
	// �� ���� row�� �Է��ߴ��� ��ȯ���ش�.
	void insertPerson(Person person);
	List<Person> selectPerson();
	void updateForce();
	void deletePersonAll();
	// �Ʒ��� �޼ҵ尡 �� ������.
	int deletePerson(int num);
	int updatePerson(Person person);
	Person selectOne(int num);
}
