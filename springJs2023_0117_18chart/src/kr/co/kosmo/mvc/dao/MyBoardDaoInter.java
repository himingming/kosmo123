package kr.co.kosmo.mvc.dao;

import java.util.List;
import java.util.Map;

import kr.co.kosmo.mvc.vo.BoardVO;
import kr.co.kosmo.mvc.vo.PagingDTO;

public interface MyBoardDaoInter {

	public void addBoard(BoardVO vo);//�Խù����
	public int getCnt();//����¡ ���Ѱ�
	public List<BoardVO> listBoard(PagingDTO vo);//����¡�� ����Ʈ
	public BoardVO detailBoard(int num);//������ �� ���°�
	public void delBoard(int num);//����
	public int getCnt2();//����¡�� �Խù� ��
	public List<BoardVO> listBoard1();


}
