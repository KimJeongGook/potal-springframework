package co.homework.potal.board.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import co.homework.potal.board.service.BoardMapper;
import co.homework.potal.board.service.BoardService;
import co.homework.potal.board.service.BoardVO;

@Repository("boardDao")
public class BoardServiceImpl implements BoardService {

	@Autowired
	BoardMapper map;
	
	@Override
	public List<BoardVO> boardSelectList() {
		// TODO Auto-generated method stub
		return map.boardSelectList();
	}

	@Override
	public BoardVO boardSelect(BoardVO vo) {
		// TODO Auto-generated method stub
		return map.boardSelect(vo);
	}

	@Override
	public int boardInsert(BoardVO vo) {
		// TODO Auto-generated method stub
		return map.boardInsert(vo);
	}

	@Override
	public int boardUpdate(BoardVO vo) {
		// TODO Auto-generated method stub
		return map.boardUpdate(vo);
	}

	@Override
	public int boardDelete(BoardVO vo) {
		// TODO Auto-generated method stub
		return map.boardDelete(vo);
	}

	@Override
	public void boardHit(int n) {
		// TODO Auto-generated method stub
		map.boardHit(n);
	}

	@Override
	public List<BoardVO> boardSearchList(String key, String val) {
		// TODO Auto-generated method stub
		return map.boardSearchList(key, val);
	}

}
