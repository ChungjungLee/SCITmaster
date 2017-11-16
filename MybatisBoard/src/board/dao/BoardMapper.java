package board.dao;

import java.util.HashMap;
import java.util.List;

import board.vo.Board;
import board.vo.Reply;

public interface BoardMapper {
	
	int insertBoard(Board board);
	
	List<Board> selectAllBoards();
	
	Board selectOneBoard(int boardNum);
	
	int updateHitnum(int boardNum);
	
	int deleteBoard(int boardNum);
	
	List<Board> searchBoards(HashMap<String, String> toFind);
	
	int updateBoard(Board board);
	
	List<Board> searchBoardTeacher(HashMap<String, Object> map);
	
	List<Reply> selectAllReplies(int boardNum);
	
	int insertReply(Reply reply);
}
