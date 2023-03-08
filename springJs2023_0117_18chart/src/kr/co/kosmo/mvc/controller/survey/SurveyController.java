package kr.co.kosmo.mvc.controller.survey;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import kr.co.kosmo.mvc.controller.service.SurveyService;
import kr.co.kosmo.mvc.vo.SurveyVO;
import kr.co.kosmo.mvc.vo.SurveycontentVO;

@Controller
@RequestMapping("/survey")
public class SurveyController {

	@Autowired
	private SurveyService surveyService;
	
	@RequestMapping(value = "/surveyForm")
	public String surform() {
		return "survey/surveyAddform";
	}
	@PostMapping(value = "/addsurvey")
	public ModelAndView surveyadd(SurveyVO vo, HttpServletRequest request) {
		
		//같은 이름으로 넘어오는 파라미터는 배열로 받을 수 있다.
		String[] surveytitle = request.getParameterValues("surveytitle");
		
		//DB에 전달하기 위한 List 만들기
		List<SurveycontentVO> list = new ArrayList<>();
		char stype = 'A';
		for (String e : surveytitle) {
			SurveycontentVO sv = new SurveycontentVO();
			sv.setSurveytitle(e);
			sv.setSurveycnt(0);
			sv.setSubtype(String.valueOf(stype));
			System.out.println("surveytitle=>"+e);
			
			list.add(sv);
			stype++;//알파벳 증가
		}
		//SurveyVO에 설문 타이틀을 저장한 List<SurveycontentVO>인자로 전달
		vo.setSubvey(list);
		//Service에 값을 전달한다.
		surveyService.addSurvey(vo, list);
		
		ModelAndView mav = new ModelAndView("redirect:surveylist");
				 return mav;
	}
	   
	@RequestMapping(value = "/surveylist")
	public ModelAndView surveylist() {
		ModelAndView mav = new ModelAndView("survey/surveyList");
		List<SurveyVO> list = surveyService.listSurvey();
		mav.addObject("list",list);
		return mav;
	}
	
	@RequestMapping(value = "/surveyAdminDetail")
	public ModelAndView surveyDetail(int num) {
		ModelAndView mav = new ModelAndView("survey/surveyDetail");
		SurveyVO vo = surveyService.adminDetail(num);
		mav.addObject("vo", vo);
		return mav;
	}
	
	
	@RequestMapping(value = "/surveyDetail")
	public ModelAndView surveyClientDetail(int num) {
		ModelAndView mav = new ModelAndView("survey/surveyClientDetail");
		SurveyVO vo = surveyService.adminDetail(num);
		mav.addObject("vo", vo);
		return mav;
	}
	
	//addSurveyClient
	@PostMapping(value = "/addSurveyClient")
	public String clientSurveyAdd(Model m, SurveycontentVO scvo) {
		System.out.println("subcode:"+scvo.getSubcode()+"subtype: "+scvo.getSubtype() );
		surveyService.updateSurveyCnt(scvo);
		return "redirect:surveylist";
	}
}
