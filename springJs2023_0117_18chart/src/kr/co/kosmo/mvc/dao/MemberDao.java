package kr.co.kosmo.mvc.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kr.co.kosmo.mvc.vo.MemberDTO;
import kr.co.kosmo.mvc.vo.MyLoginLoggerDTO;

//Dao단은 @Repository 사용 => Dao를 빈으로 등록시켜줌
//기본이 싱글톤임
@Repository //빈 완성~~
public class MemberDao implements MemberDaoInter{
		//kosmo-web.xml 에서 정의한 bean byName
	@Autowired //ss랑 같은 이름의 빈을 찾기 위해서 오토와이어드 쓴거임!!!!!!!!!
	private SqlSessionTemplate ss;
	@Override
	public void addMember(MemberDTO dto) {
		//SqlSession 어쩌고 대신 해주는 설정이
		//<bean id="ss" class="org.mybatis.spring.SqlSessionTemplate">
		ss.insert("member.add",dto);
		
	}

	@Override
	public int idcheck(String id) {
		return ss.selectOne("member.idchk", id);
	}

	@Override
	public MemberDTO loginCheck(MemberDTO vo) {
		return ss.selectOne("member.login", vo);
	}

	@Override
	public void addLoginLogging(MyLoginLoggerDTO vo) {
		 ss.insert("member.logger_in", vo);
		
	}

	@Override
	public MemberDTO jsonDemo(String id) {
		
		return ss.selectOne("member.jsonDemo",id);
	}

	@Override
	public List<MemberDTO> memberListJsonDemo() {
		return ss.selectList("member.memberListDemo");
	}

}
