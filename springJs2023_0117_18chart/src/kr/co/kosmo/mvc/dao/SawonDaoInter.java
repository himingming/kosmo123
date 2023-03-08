package kr.co.kosmo.mvc.dao;

import java.util.HashMap;
import java.util.List;

import org.apache.commons.collections.map.HashedMap;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;

import kr.co.kosmo.mvc.vo.DeptVO;
import kr.co.kosmo.mvc.vo.SawonVO;

public interface SawonDaoInter {


	 
	public DeptVO getDeptList(int num);
	

	public List<SawonVO> getSawonPhoneList();
	
	public List<HashMap> procedureList(int num);
	public void procedureAdd(SawonVO vo);
}
