package kr.co.kosmo.mvc.exception;

import org.springframework.ui.Model;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.UnsatisfiedServletRequestParameterException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class MyExceptionHandler {

	//모든 예외 처리함
@ExceptionHandler(Exception.class)
	public String myHandelrException(Model m , Exception e) {
		e.printStackTrace();
		System.out.println("예외메세지:"+e.getMessage());
		String viewName="";
		//파라미터가 없을 때 @RequestParam 체크되어서
		//MissingServletRequestParameterException: Required String parameter 어쩌고 저쩌고
		if(e instanceof MissingServletRequestParameterException) {
			m.addAttribute("emsg", "파라미터값을 올바르게 작성하시오");
			viewName ="error/paramException";
		}else if (e instanceof UnsatisfiedServletRequestParameterException) {
			m.addAttribute("emsg", "파라미터값을 올바르게 작성하시오2");
			viewName ="error/paramException";
		}else {
			m.addAttribute("emsg", "예외발생ㄱ했나여");
			viewName ="error/paramException";
		}
		return viewName;
		
		
	}
}
