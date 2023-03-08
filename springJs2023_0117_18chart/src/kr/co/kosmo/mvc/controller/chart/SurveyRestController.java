package kr.co.kosmo.mvc.controller.chart;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.ObjectMapper;

import kr.co.kosmo.mvc.controller.service.SurveyService;
import kr.co.kosmo.mvc.vo.SurveyVO;
import kr.co.kosmo.mvc.vo.SurveycontentVO;

@RestController
public class SurveyRestController {

	@Autowired
	private SurveyService ss;

	/*
	 * {"num":21,"sub":"날씨 설문조사","code":0,"sdate":"2023-01-18 14:35:10"
	 * ,"surveytotal":0,"subvey":[{"subtype":"A    ","subcode":21,
	 * "surveytitle":"비가 옵니다","surveycnt":0},{},{},{},{}.....]}
	 *     KEY			VALUE
	 * chart로 구현해야 한다면,,
	 * Object => surveyDonutChart.js에서
	 * 
	 */
	@RequestMapping(value = "/surveyJsonObjDemo1")
	public SurveyVO surveyDetail(int num) {
		SurveyVO vo = ss.adminDetail(num);
		return vo;
	}
	
	@RequestMapping(value = "/surveyJsonObj", produces = "application/json;charset=utf-8" )
	public Map<String, Integer> surveyDetailJson(int num) {
		SurveyVO vo = ss.adminDetail(num);
		//Key, Val => Map
		Map<String, Integer> map = new HashMap();
		for(SurveycontentVO e : vo.getSubvey()) {
			//               '비가옵니다' : 500
			map.put(e.getSurveytitle(), e.getSurveycnt());
		}
		return map;
	}
	
	
	//Map으로 반환한 json데이터와 title을 함께 보내기
	//
	@RequestMapping(value = "/surveyJsonObj2", produces = "application/json;charset=utf-8" )
	public String surveyDetailTitleJson(int num) {
		SurveyVO vo = ss.adminDetail(num);
		String subject = vo.getSub();
		//Key, Val => Map
		Map<String, Integer> map = new HashMap();
		for(SurveycontentVO e : vo.getSubvey()) {
			//               '비가옵니다' : 500
			map.put(e.getSurveytitle(), e.getSurveycnt());
		}
		//json결과를 문자열로 반환
		String result = null;
		//ObjectMapper 객체를 가지고 변환을 할 수 있다
		ObjectMapper mapper = new ObjectMapper();
		
		try {
			result = mapper.writeValueAsString(map);
			result = "[{\"sub\":\""+vo.getSub()+"\"},"+result+"]"; 
			System.out.println(result);
		} catch (Exception e1) {
			e1.printStackTrace();
		}
		return result;
	}
	
}
