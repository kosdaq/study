package com.travelmate.app;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.travelmate.domain.MemberVO;
import com.travelmate.persistence.MemberDAO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"file:src/main/webapp/WEB-INF/spring/**/root-context.xml"})
public class MemberDAOTest {

	@Inject
	private MemberDAO dao;
	
	@Test
	public void testTime() throws Exception {
		
		System.out.println(dao.getTime());
		
	}
	
	/*@Test
	public void testInsertMember() throws Exception {
		
		MemberVO vo = new MemberVO();
		vo.setUserid("user01");
		vo.setUserpw("user01");
		vo.setUsername("USER01");
		vo.setEmail("user01@aaa.com");
		
		dao.insertMember(vo);
		
	}*/
	
}
