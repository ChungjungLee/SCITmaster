package board.dao;

import java.util.HashMap;
import java.util.List;

import board.vo.Board;

public interface BoardMapper {
	int insertBoard(Board board);
	List<Board> selectAllBoards();
	Board selectOneBoard(int boardNum);
	int deleteBoard(int boardNum);
	List<Board> searchBoards(HashMap<String, String> toFind);
}
