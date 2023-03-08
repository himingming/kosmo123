package kr.co.kosmo.mvc.dao;

import java.util.List;
import java.util.Map;

import kr.co.kosmo.mvc.vo.BoardVO;
import kr.co.kosmo.mvc.vo.PagingDTO;

public interface MyBoardDaoInter {

	public void addBoard(BoardVO vo);//게시물등록
	public int getCnt();//페이징 안한거
	public List<BoardVO> listBoard(PagingDTO vo);//페이징한 리스트
	public BoardVO detailBoard(int num);//디테일 글 보는거
	public void delBoard(int num);//삭제
	public int getCnt2();//페이징한 게시물 수
	public List<BoardVO> listBoard1();


}
