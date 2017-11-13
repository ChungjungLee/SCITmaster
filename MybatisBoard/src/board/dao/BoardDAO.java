package board.dao;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import board.vo.Board;

public class BoardDAO {
	private SqlSessionFactory factory = 
			MybatisConfig.getSqlSessionFactory();
	
	// mapper���� ��������� ��Ų��
	
	/**
	 * �Խñ� �Է� �޾Ƽ� ����
	 */
	public int insertBoard(Board board) {
		SqlSession session = null;
		int result = 0;
		
		try {
			session = factory.openSession();
			BoardMapper mapper = session.getMapper(BoardMapper.class);
			
			result = mapper.insertBoard(board);
			
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
	
	/**
	 * ��� �Խñ� ���
	 * @return ��� �Խñ�
	 */
	public List<Board> selectAllBoards() {
		SqlSession session = null;
		List<Board> result = null;
		
		try {
			session = factory.openSession();	
			// auto-commit ����� �ִ� openSession()�� �ִٰ� �Ѵ�.
			BoardMapper mapper = session.getMapper(BoardMapper.class);
			
			result = mapper.selectAllBoards();
			
		} catch (Exception e) {
			e.printStackTrace();
			
		} finally {
			if (session != null) {
				session.close();
			}
		}
		
		return result;
	}
	
	/**
	 * Ư�� �Խñ��� �о� ���δ�.
	 * @param boardNum ������ �Խñ��� ��ȣ
	 * @return ���õ� �Խñ�, ���ٸ� null
	 */
	public Board selectOneBoard(int boardNum) {
		SqlSession session = null;
		Board result = null;
		
		try {
			session = factory.openSession();
			BoardMapper mapper = session.getMapper(BoardMapper.class);
			
			result = mapper.selectOneBoard(boardNum);
			
		} catch (Exception e) {
			e.printStackTrace();
			
		} finally {
			if (session != null) {
				session.close();
			}
		}
		
		return result;
	}
	
	/**
	 * Ư�� �Խñ��� �����Ѵ�.
	 * @param boardNum ������ �Խñ��� ��ȣ
	 * @return ������ row ��
	 */
	public int deleteBoard(int boardNum) {
		SqlSession session = null;
		int result = 0;
		
		try {
			session = factory.openSession();
			BoardMapper mapper = session.getMapper(BoardMapper.class);
			
			result = mapper.deleteBoard(boardNum);
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
	
	/**
	 * Ư�� �з��� ���ڿ��� ������ �Խñ��� �˻��Ѵ�.
	 * @param toFind �˻��� �з��� ���ڿ��� ������ HashMap
	 * @return �˻��� �Խñ�, ���ٸ� null
	 */
	public List<Board> searchBoards(HashMap<String, String> toFind) {
		SqlSession session = null;
		List<Board> result = null;
		
		try {
			session = factory.openSession();
			BoardMapper mapper = session.getMapper(BoardMapper.class);
			
			result = mapper.searchBoards(toFind);
			
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
