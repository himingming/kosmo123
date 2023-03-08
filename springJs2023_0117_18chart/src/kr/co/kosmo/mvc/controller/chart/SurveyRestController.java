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
	 * {"num":21,"sub":"���� ��������","code":0,"sdate":"2023-01-18 14:35:10"
	 * ,"surveytotal":0,"subvey":[{"subtype":"A    ","subcode":21,
	 * "surveytitle":"�� �ɴϴ�","surveycnt":0},{},{},{},{}.....]}
	 *     KEY			VALUE
	 * chart�� �����ؾ� �Ѵٸ�,,
	 * Object => surveyDonutChart.js����
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
			//               '�񰡿ɴϴ�' : 500
			map.put(e.getSurveytitle(), e.getSurveycnt());
		}
		return map;
	}
	
	
	//Map���� ��ȯ�� json�����Ϳ� title�� �Բ� ������
	//
	@RequestMapping(value = "/surveyJsonObj2", produces = "application/json;charset=utf-8" )
	public String surveyDetailTitleJson(int num) {
		SurveyVO vo = ss.adminDetail(num);
		String subject = vo.getSub();
		//Key, Val => Map
		Map<String, Integer> map = new HashMap();
		for(SurveycontentVO e : vo.getSubvey()) {
			//               '�񰡿ɴϴ�' : 500
			map.put(e.getSurveytitle(), e.getSurveycnt());
		}
		//json����� ���ڿ��� ��ȯ
		String result = null;
		//ObjectMapper ��ü�� ������ ��ȯ�� �� �� �ִ�
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
