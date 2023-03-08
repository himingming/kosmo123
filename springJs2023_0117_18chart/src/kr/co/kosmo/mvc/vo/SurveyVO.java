package kr.co.kosmo.mvc.vo;

import java.util.List;

public class SurveyVO {
/*
 * create table survey(
num number CONSTRAINT survey_num_pk primary key, --설문번호
sub varchar2(100),--제목
code number, --설문갯수
sdate date);--날짜
create sequence survey_seq increment by 1 start with 1;
 * */
	private int num;
	private String sub;
	private int code;
	private String sdate;
	private int surveytotal;
	private List<SurveycontentVO> subvey;

	public List<SurveycontentVO> getSubvey() {
		return subvey;
	}

	public void setSubvey(List<SurveycontentVO> subvey) {
		this.subvey = subvey;
	}
	
	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getSub() {
		return sub;
	}

	public void setSub(String sub) {
		this.sub = sub;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getSdate() {
		return sdate;
	}

	public void setSdate(String sdate) {
		this.sdate = sdate;
	}

	public int getSurveytotal() {
		return surveytotal;
	}

	public void setSurveytotal(int surveytotal) {
		this.surveytotal = surveytotal;
	}


	
}
