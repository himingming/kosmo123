package kr.co.kosmo.mvc.controller.member;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import kr.co.kosmo.mvc.dao.MemberDaoInter;
import kr.co.kosmo.mvc.vo.MemberDTO;

// http://localhost/spring0706_mybatis/member/memberForm => /WEB-INF/views/mymember/member

@Controller
@RequestMapping(value = "/member")
public class MymemberController {
@Autowired
private MemberDaoInter memberDaoInter;

	@GetMapping(value = "/memberForm")
	public ModelAndView memberForm() {
		ModelAndView mav = new ModelAndView("mymember/memberForm");
		return mav;
	}

//String�� ��� viewName ����, Model ���ڷ� ���� �� �ִ�.
@PostMapping(value = "memberIn")
public String memberIn(MemberDTO dto) {
	System.out.println("ID:"+dto.getId());
	//System.out.println("PWD:"+dto.getPwd());
	//System.out.println("NAME:"+dto.getName());
	//System.out.println("AGE:"+dto.getAge());
	//System.out.println("GENDER:"+dto.getGender());
	memberDaoInter.addMember(dto);
//ȸ�������� ������ ���� �̵��� ������ ���� - redirect
	return "redirect:/web/main";
	
}

}
