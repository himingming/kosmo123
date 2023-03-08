package kr.co.kosmo.mvc.controller.chart;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kr.co.kosmo.mvc.dao.MemberDaoInter;
import kr.co.kosmo.mvc.vo.MemberDTO;



//@Controller -> ������ �����̳ʰ� Model�� �����ؼ�
//���� �ý��ۿ����� ViewResolver�� ���� ����
//View�� forward ������� �̵�
//@RestController -> CustomView�� ����ؼ� ������ View ��,
//JSP�� ������� �ʰ� �����͸� ������ �� �ֱ� ������
//�ַ� JSON���� response �� �� ���
//@RestController :json�� ���� �����͸� �����ϱ� ���� ��Ʈ����
@RestController
public class ChartRestController {
	@Autowired
	private MemberDaoInter memberDaoInter;
//�ش� ��û�� ���� ���� view���ٰ� ��ȯ���� ���� ������ ����ó���� �Ѵ�.
	//produces = "text/html;charset=euc-kr" => Content-Type�� �����ϴ� �Ӽ�
	@RequestMapping(value = "/helloView", produces = "text/html;charset=euc-kr")
	public String viewMessage() {
		return "�Լ��� �����";
	}
	//JsonType object -> javascript Object
	
	@RequestMapping(value = "/deptJsonView1", produces = "application/json;charset=utf-8")
	public MemberDTO jsonObjectDemo1(String id) {
		try {
			System.out.println("ID=>"+id);
			MemberDTO vo = memberDaoInter.jsonDemo(id);
			return vo;
		} catch (Exception e) {
			MemberDTO vo = new MemberDTO();
			vo.setName("�������� �ʴ� ȸ���Դϴ�");
			return vo;
		}
		
		//�׽�Ʈ�� VO�� ������ �� ����
		/*
		MemberDTO vo = new MemberDTO();
		vo.setName("���Լ�");
		vo.setNum(9);
		vo.setAge(26);
		vo.setGender("����");
		vo.setId("whrbtjd");
		vo.setPwd("0125");
		vo.setMdate(new SimpleDateFormat("yyyy-MM-dd").format(new Date()));
		//����Ȯ��
		//{"num":9,"id":"whrbtjd","pwd":"0125","name":"���Լ�",
		//"age":26,"gender":"����","mdate":"2023-01-18"}
		 * */
		 
		
	}
	//��������) ȸ�� ��ü�� ����ϴ� JsonView�� ����ÿ�
	@RequestMapping(value = "/memberListJson", produces = "application/json;charset=utf-8")
	public List<MemberDTO> memberListJson() {
	 return memberDaoInter.memberListJsonDemo();
	}
	
}
