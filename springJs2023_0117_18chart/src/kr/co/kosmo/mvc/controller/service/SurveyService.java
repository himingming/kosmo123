package kr.co.kosmo.mvc.controller.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import kr.co.kosmo.mvc.dao.SurveyDao;
import kr.co.kosmo.mvc.vo.SurveyVO;
import kr.co.kosmo.mvc.vo.SurveycontentVO;

@Service
public class SurveyService {
	//Dao를 단위처리하기 위한 서비스
	@Autowired
	private SurveyDao surveyDao;
	//모델에서 받아온 각 데이터를 Dao에 각각 전달해서 단위처리를 하기위한 메서드
	
	//Transactional ㅣ처리를 하기 위해서
	//공통빈 설정 <tx:annotation-driven>,DataSourceTransactionManager di
	@Transactional
	public void addSurvey(SurveyVO vo, List<SurveycontentVO> list) {
		//단위처리적용
		surveyDao.addSurvey(vo);//commitX
		surveyDao.addSurveyContent(list);//commitX
		//commit
	}
	
	public SurveyVO adminDetail(int num) {
		return surveyDao.adminDetail(num);
	}
	
	public void updateSurveyCnt(SurveycontentVO scvo) {
		surveyDao.updateSurveyCnt(scvo);
	}
	
	public List<SurveyVO> listSurvey(){
		return surveyDao.listSurvey();
				
	}
}
