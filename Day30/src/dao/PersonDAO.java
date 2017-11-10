package dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import vo.Person;

public class PersonDAO {
	// sqlsession을 받아와야 한다.
	private SqlSessionFactory factory = 
			MybatisConfig.getSqlSessionFactory();
	
	public void insert(Person person) {
		// 1. 세션 열기
		SqlSession session = factory.openSession();
		
		// 2. 매퍼 열기
		PersonMapper mapper = 
				session.getMapper(PersonMapper.class);
		
		// 3. 동작
		mapper.insertPerson(person);
		
		// 3-2. 커밋
		session.commit();
		
		// 4. 세션 닫기
		session.close();
	}
	
	
	// 이름이 꼭 같을 필요는 없다.
	public List<Person> selectPerson() {
		// 1. 세션 열기
		SqlSession session = factory.openSession();
		
		// 2. Mapper 가져오기
		// session으로부터 Mapper를 얻어 온다.
		//  
		// .class: 해당 클래스의 정보를 얻어 온다.
		PersonMapper mapper = 
				session.getMapper(PersonMapper.class);
		
		// 3. Mapper로부터 원하는 결과값 얻어 오기
		// mybatis가 알아서 객체의 필드를 넣어줌
		List<Person> results = mapper.selectPerson();
		
		/*
		 * Person result = (Person) session.selectOne("dao.PersonMapper.selectPerson");
		 * 2&3 스텝을 하나의 단계(이전 버전)로 바꾼 것인데,
		 * 우선 함수 호출을 위해서 문자열을 길게 선언하므로 오류 확률이 증가하고 복잡
		 * 또한 Object 형으로 리턴을 받기 때문에 강제 down-casting을 해주어야 함
		 * 그리고 List<> 형태로 읽어들일 시 List<class>로 형변환이 불가능해
		 * 두 번 형변환 하는 번거로움이 발생
		 */
		
		// 4. 열었던 세션 닫기
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
