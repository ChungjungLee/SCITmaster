package dog.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import dog.vo.Dog;

public class DogDAO {
	private SqlSessionFactory sessionFactory = 
			MybatisConfig.getSqlSessionFactory();
	
	public List<Dog> getAllDog() {
		SqlSession session = null;		
		List<Dog> result = null;
		
		try {
			session = sessionFactory.openSession();
			DogMapper mapper = session.getMapper(DogMapper.class);
			
			result = mapper.selectAllDog();
			
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
