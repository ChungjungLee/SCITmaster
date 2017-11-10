package dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import vo.Person;

public class PersonDAO {
	// sqlsession�� �޾ƿ;� �Ѵ�.
	private SqlSessionFactory factory = 
			MybatisConfig.getSqlSessionFactory();
	
	public void insert(Person person) {
		// 1. ���� ����
		SqlSession session = factory.openSession();
		
		// 2. ���� ����
		PersonMapper mapper = 
				session.getMapper(PersonMapper.class);
		
		// 3. ����
		mapper.insertPerson(person);
		
		// 3-2. Ŀ��
		session.commit();
		
		// 4. ���� �ݱ�
		session.close();
	}
	
	
	// �̸��� �� ���� �ʿ�� ����.
	public List<Person> selectPerson() {
		// 1. ���� ����
		SqlSession session = factory.openSession();
		
		// 2. Mapper ��������
		// session���κ��� Mapper�� ��� �´�.
		//  
		// .class: �ش� Ŭ������ ������ ��� �´�.
		PersonMapper mapper = 
				session.getMapper(PersonMapper.class);
		
		// 3. Mapper�κ��� ���ϴ� ����� ��� ����
		// mybatis�� �˾Ƽ� ��ü�� �ʵ带 �־���
		List<Person> results = mapper.selectPerson();
		
		/*
		 * Person result = (Person) session.selectOne("dao.PersonMapper.selectPerson");
		 * 2&3 ������ �ϳ��� �ܰ�(���� ����)�� �ٲ� ���ε�,
		 * �켱 �Լ� ȣ���� ���ؼ� ���ڿ��� ��� �����ϹǷ� ���� Ȯ���� �����ϰ� ����
		 * ���� Object ������ ������ �ޱ� ������ ���� down-casting�� ���־�� ��
		 * �׸��� List<> ���·� �о���� �� List<class>�� ����ȯ�� �Ұ�����
		 * �� �� ����ȯ �ϴ� ���ŷο��� �߻�
		 */
		
		// 4. ������ ���� �ݱ�
		session.close();
		
		return results;
	}
	
	public void updateForce() {
		SqlSession session = factory.openSession();
		
		PersonMapper mapper = session.getMapper(PersonMapper.class);
		
		mapper.updateForce();
		
		session.commit();
		
		session.close();
	}
	
	public void deletePersonAll() {
		SqlSession session = factory.openSession();
		
		PersonMapper mapper = session.getMapper(PersonMapper.class);
		
		mapper.deletePersonAll();
		
		session.commit();
		
		session.close();
		
	}
	
	public int deletePerson(int num) {
		SqlSession session = null;
		int result = 0;
		
		try {
			session = factory.openSession();
			PersonMapper mapper = session.getMapper(PersonMapper.class);
			
			result = mapper.deletePerson(num);
			
			session.commit();
			
		} catch(Exception e) {
			e.printStackTrace();
			
		} finally {
			if (session != null) {
				session.close();
			}
		}
		
		return result;
	}
	
	public int updatePerson(Person person) {
		SqlSession session = null;
		int result = 0;
		
		try {
			session = factory.openSession();
			PersonMapper mapper = session.getMapper(PersonMapper.class);
			
			result = mapper.updatePerson(person);
			
			session.commit();
			
		} catch (Exception e) {
			e.printStackTrace();
			
		} finally {
			if (session != null) {
				session.close();
			}
		}
		
		return result;
	}
	
	public Person selectOnePerson(int num) {
		SqlSession session = null;
		Person result = null;
		
		try {
			session = factory.openSession();
			PersonMapper mapper = session.getMapper(PersonMapper.class);
			
			result = mapper.selectOne(num);
			
		} catch (Exception e) {
			e.printStackTrace();
			
		} finally {
			if (session != null) {
				session.close();
			}
		}
		
		return result;
	}
	
}
