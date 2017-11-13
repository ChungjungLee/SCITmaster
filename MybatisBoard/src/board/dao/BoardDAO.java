package board.dao;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import board.vo.Board;

public class BoardDAO {
	private SqlSessionFactory factory = 
			MybatisConfig.getSqlSessionFactory();
	
	// mapper한테 가져오라고 시킨다
	
	/**
	 * 게시글 입력 받아서 저장
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
	 * 모든 게시글 출력
	 * @return 모든 게시글
	 */
	public List<Board> selectAllBoards() {
		SqlSession session = null;
		List<Board> result = null;
		
		try {
			session = factory.openSession();	
			// auto-commit 기능이 있는 openSession()도 있다고 한다.
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
	 * 특정 게시글을 읽어 들인다.
	 * @param boardNum 선택할 게시글의 번호
	 * @return 선택된 게시글, 없다면 null
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
	 * 특정 게시글을 삭제한다.
	 * @param boardNum 삭제할 게시글의 번호
	 * @return 삭제된 row 수
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
	 * 특정 분류와 문자열을 가지고 게시글을 검색한다.
	 * @param toFind 검색할 분류와 문자열을 가지는 HashMap
	 * @return 검색된 게시글, 없다면 null
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
