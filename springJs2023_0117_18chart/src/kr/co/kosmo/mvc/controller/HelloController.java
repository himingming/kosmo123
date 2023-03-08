package kr.co.kosmo.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

//HelloController�� ������ �𵨿� �ش��� �ȴ�.
//DispatcherServlet �� ��Ʈ�� ������ ������ �����̳ʿ� ���ؼ� Model�� ���Թ޾Ƽ� ����
//HandlerMapping�� ��û������ �м����ش�. ***********
@Controller//����X -�ݵ�� �־�� �Ѵ� 
public class HelloController {

	// http://loclahost/spring0704_mvc/hello (request) : �ߺ��� �ȵ�
	//  ActionFactory ---> Spring Container -----> DispatcherServlet
	// ------------> HandlerMapping �м�
	
	//cmd = hello
	//String subcmd = request.getParameter("cmd");
	
	@RequestMapping(value = "/hello")
	public ModelAndView myHello() {
		
		
		//�⺻ forward
		ModelAndView mav = new ModelAndView();
		//request.setAttribute("key",Val);
		mav.addObject("msg", "<h1>���� ù��° spring MVC�Դϴ�</h1>");
		//new ActionForward("hello.jsp",false);
		mav.setViewName("hello");//�⺻ ���̽��� forward(view�� �̸��� �ѱ�� �ȴپƾƾƤ���)
		
		return mav;
		
	}
}
