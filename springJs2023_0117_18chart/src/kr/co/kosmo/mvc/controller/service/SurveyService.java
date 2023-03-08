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
	//Dao�� ����ó���ϱ� ���� ����
	@Autowired
	private SurveyDao surveyDao;
	//�𵨿��� �޾ƿ� �� �����͸� Dao�� ���� �����ؼ� ����ó���� �ϱ����� �޼���
	
	//Transactional ��ó���� �ϱ� ���ؼ�
	//����� ���� <tx:annotation-driven>,DataSourceTransactionManager di
	@Transactional
	public void addSurvey(SurveyVO vo, List<SurveycontentVO> list) {
		//����ó������
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
