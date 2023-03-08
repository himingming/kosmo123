package kr.co.kosmo.mvc.dao;

import java.util.List;

import kr.co.kosmo.mvc.vo.MemberDTO;
import kr.co.kosmo.mvc.vo.MyLoginLoggerDTO;

public interface MemberDaoInter {

	public void addMember(MemberDTO dto);
	public int idcheck(String id);
	//���̵�� ����� vo�� �����ϰ� ��ȯ������ name�� ��ȯ����
	public MemberDTO loginCheck(MemberDTO vo);
	//AOP���� ���� login�α� ó���� ���� �޼���
	public void addLoginLogging(MyLoginLoggerDTO vo);
	
	public MemberDTO jsonDemo(String id);
	
	public List<MemberDTO> memberListJsonDemo();
	 
}
