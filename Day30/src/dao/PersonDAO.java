package dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import vo.Person;

public class PersonDAO {
	// sqlsession�� �޾ƿ;� �Ѵ�.
	private SqlSessionFactory factory = 
			MybatisConfig.getSqlSessionFactory();
	
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
}
