package kr.co.kosmo.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

//HelloController는 예전에 모델에 해당이 된다.
//DispatcherServlet 란 컨트롤 서블릿이 스프링 컨테이너에 의해서 Model을 주입받아서 실행
//HandlerMapping이 요청사항을 분석해준다. ***********
@Controller//생략X -반드시 있어야 한다 
public class HelloController {

	// http://loclahost/spring0704_mvc/hello (request) : 중복이 안됨
	//  ActionFactory ---> Spring Container -----> DispatcherServlet
	// ------------> HandlerMapping 분석
	
	//cmd = hello
	//String subcmd = request.getParameter("cmd");
	
	@RequestMapping(value = "/hello")
	public ModelAndView myHello() {
		
		
		//기본 forward
		ModelAndView mav = new ModelAndView();
		//request.setAttribute("key",Val);
		mav.addObject("msg", "<h1>나의 첫번째 spring MVC입니다</h1>");
		//new ActionForward("hello.jsp",false);
		mav.setViewName("hello");//기본 베이스는 forward(view의 이름만 넘기면 된다아아아ㅏㅏ)
		
		return mav;
		
	}
}
