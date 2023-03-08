package kr.co.kosmo.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TodayMyProfileController {

	@RequestMapping(value = "/myprofile", method = RequestMethod.GET)
	public ModelAndView todayProfile() {
		ModelAndView mav = new ModelAndView();
		mav.addObject("profile", "���Լ� �����");
		mav.setViewName("today/todayProfile");
		return mav;
		
	}
	
	@RequestMapping(value = "/today", method = RequestMethod.GET)
	public ModelAndView todayWork() {
		ModelAndView mav = new ModelAndView();
		mav.addObject("work","��¥ �����ϱ�");
		mav.setViewName("today/todayWork");
		return mav;
	}
}
