package com.travelmate.persistence;

import com.travelmate.domain.MemberVO;

public interface MemberDAO {

	public String getTime();
	
	public void insertMember(MemberVO vo);
	
}
