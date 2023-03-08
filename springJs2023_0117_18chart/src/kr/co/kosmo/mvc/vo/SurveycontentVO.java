package kr.co.kosmo.mvc.vo;

public class SurveycontentVO {

	/*
	 * create table surveycontent(
subtype char(5), --타입
subcode number, --survey pk
surveytitle varchar2(100),--설문항목
surveycnt number, --투표수
CONSTRAINT surveycontent_subcode_fk foreign key(subcode)
references survey(num)
);
	 * */
	
	
	private String subtype;
	private int subcode;
	private String surveytitle;
	private int surveycnt;
	
	
	
	
	public String getSubtype() {
		return subtype;
	}
	public void setSubtype(String subtype) {
		this.subtype = subtype;
	}
	public int getSubcode() {
		return subcode;
	}
	public void setSubcode(int subcode) {
		this.subcode = subcode;
	}
	public String getSurveytitle() {
		return surveytitle;
	}
	public void setSurveytitle(String surveytitle) {
		this.surveytitle = surveytitle;
	}
	public int getSurveycnt() {
		return surveycnt;
	}
	public void setSurveycnt(int surveycnt) {
		this.surveycnt = surveycnt;
	}
	
	
}
