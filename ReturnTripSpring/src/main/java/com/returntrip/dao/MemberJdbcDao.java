package com.returntrip.dao;

import java.util.List;

import com.returntrip.entity.Member;

public class MemberJdbcDao implements MemberDao{

	private String driver;
	private String url;
	private String username;
	private String password;
	
	
	public MemberJdbcDao(String driver, String url, String username, String password) {
		super();
		this.driver = driver;
		this.url = url;
		this.username = username;
		this.password = password;
	}

	@Override
	public Member getMemberData(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Member> getMemberDatas() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int insertMember(Member member) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateMember(Member member) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteMember(String id) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
