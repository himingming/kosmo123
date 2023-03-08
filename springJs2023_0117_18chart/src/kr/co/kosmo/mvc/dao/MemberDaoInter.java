package kr.co.kosmo.mvc.dao;

import java.util.List;

import kr.co.kosmo.mvc.vo.MemberDTO;
import kr.co.kosmo.mvc.vo.MyLoginLoggerDTO;

public interface MemberDaoInter {

	public void addMember(MemberDTO dto);
	public int idcheck(String id);
	//아이디와 비번을 vo로 전송하고 반환값으로 name을 반환받음
	public MemberDTO loginCheck(MemberDTO vo);
	//AOP에서 사용될 login로깅 처리를 위한 메서드
	public void addLoginLogging(MyLoginLoggerDTO vo);
	
	public MemberDTO jsonDemo(String id);
	
	public List<MemberDTO> memberListJsonDemo();
	 
}
