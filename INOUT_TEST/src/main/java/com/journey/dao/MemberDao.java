package com.journey.dao;

import com.journey.entity.Member;

public interface MemberDao {
	//CRUD 연산 기반 
	
	Member getMember(String id);
	
	int insertMember(Member member);
	
	int updateMember(Member member);
	
	int deleteMember(int id);
	

	
}
