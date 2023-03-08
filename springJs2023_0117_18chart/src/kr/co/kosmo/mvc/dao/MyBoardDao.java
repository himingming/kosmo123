package kr.co.kosmo.mvc.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kr.co.kosmo.mvc.vo.BoardVO;
import kr.co.kosmo.mvc.vo.PagingDTO;

@Repository
public class MyBoardDao implements MyBoardDaoInter {
	@Autowired
	private SqlSessionTemplate ss;

	@Override
	public void addBoard(BoardVO vo) {
		ss.insert("myboard.add", vo);

	}

	

	@Override
	public BoardVO detailBoard(int num) {
		BoardVO vo = ss.selectOne("myboard.detail", num);
		return vo;
	}

	@Override
	public void delBoard(int num) {
		ss.delete("myboard.delete", num);
		
	}

	@Override
	public int getCnt() {

		return ss.selectOne("myboard.totalCount");
	}



	@Override
	public List<BoardVO> listBoard(PagingDTO vo) {
		
		return ss.selectList("myboard.listpage", vo);
	}



	@Override
	public int getCnt2() {
	
		return ss.selectOne("myboard.totalCount");
	}



	@Override
	public List<BoardVO> listBoard1() {
		return ss.selectList("myboard.list");
	}

	




}
