package kr.co.kosmo.mvc.controller.chart;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kr.co.kosmo.mvc.dao.MemberDaoInter;
import kr.co.kosmo.mvc.vo.MemberDTO;



//@Controller -> 스프링 컨테이너가 Model로 선택해서
//현재 시스템에서는 ViewResolver를 통해 지정
//View로 forward 방식으로 이동
//@RestController -> CustomView를 사용해서 지정한 View 즉,
//JSP를 사용하지 않고 데이터를 응답할 수 있기 때문에
//주로 JSON으로 response 할 때 사용
//@RestController :json과 같은 데이터를 서비스하기 위한 컨트럴러
@RestController
public class ChartRestController {
	@Autowired
	private MemberDaoInter memberDaoInter;
//해당 요청이 오면 가상 view에다가 반환받은 값을 전달해 응답처리를 한다.
	//produces = "text/html;charset=euc-kr" => Content-Type을 지정하는 속성
	@RequestMapping(value = "/helloView", produces = "text/html;charset=euc-kr")
	public String viewMessage() {
		return "규성아 사랑해";
	}
	//JsonType object -> javascript Object
	
	@RequestMapping(value = "/deptJsonView1", produces = "application/json;charset=utf-8")
	public MemberDTO jsonObjectDemo1(String id) {
		try {
			System.out.println("ID=>"+id);
			MemberDTO vo = memberDaoInter.jsonDemo(id);
			return vo;
		} catch (Exception e) {
			MemberDTO vo = new MemberDTO();
			vo.setName("존재하지 않는 회원입니다");
			return vo;
		}
		
		//테스트용 VO에 적절한 값 저장
		/*
		MemberDTO vo = new MemberDTO();
		vo.setName("조규성");
		vo.setNum(9);
		vo.setAge(26);
		vo.setGender("남자");
		vo.setId("whrbtjd");
		vo.setPwd("0125");
		vo.setMdate(new SimpleDateFormat("yyyy-MM-dd").format(new Date()));
		//예외확인
		//{"num":9,"id":"whrbtjd","pwd":"0125","name":"조규성",
		//"age":26,"gender":"남자","mdate":"2023-01-18"}
		 * */
		 
		
	}
	//연습문제) 회원 전체를 출력하는 JsonView를 만드시오
	@RequestMapping(value = "/memberListJson", produces = "application/json;charset=utf-8")
	public List<MemberDTO> memberListJson() {
	 return memberDaoInter.memberListJsonDemo();
	}
	
}
