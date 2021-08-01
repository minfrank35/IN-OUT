package com.journey.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.journey.entity.Member;

public class MemberJdbcDao implements MemberDao {
	private String driver;
	private String url;
	private String userName;
	private String password;
	
	private Connection conn = null;
	private PreparedStatement stmt = null;
	private ResultSet rs = null;
	

	public MemberJdbcDao(String driver, String url, String userName, String password) {
		this.driver = driver;
		this.url = url;
		this.userName = userName;
		this.password = password;
	}
	
	public void connect() throws ClassNotFoundException, SQLException {
		Class.forName(driver);
		conn = DriverManager.getConnection(url, userName, password);
	}
	
	public void disconnect() throws SQLException {
		if (rs != null && !rs.isClosed()) {
			rs.close();
			rs = null;
		}
		if (stmt != null && !stmt.isClosed()) {
			stmt.close();
			stmt = null;
		}
		if (conn != null && !conn.isClosed()) {
			conn.close();
			conn = null;
		}
	}
	
	@Override
	public Member getMember(String id) {
		// TODO Auto-generated method stub
		
		Member member = null;
		
		String sql = "select * from member where id = ?";
		
		try {
			connect();
			
			stmt = conn.prepareStatement(sql);
			stmt.setString(1, id);
			rs = stmt.executeQuery(sql);
			
			if(rs.next()) {
				member = new Member();
				member.setId(rs.getString("id"));
				member.setPwd(rs.getString("pwd"));
				member.setName(rs.getString("name"));
				member.setGender(rs.getString("age"));
				member.setBirthday(rs.getDate("age"));
				member.setPhone(rs.getString("male"));
				member.setRegdate(rs.getDate("email"));
				member.setEmail(rs.getString("email"));
				member.setJry_id(rs.getInt("WISH_JOURNEY"));

			}
			
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				disconnect();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		return member;
	}

	@Override
	public int insertMember(Member member) {
				
		String sql = String.format("insert into member(ID,PWD,NAME,GENDER,BIRTHDAY,PHONE,REGDATE,EMAIL,WISH_JOURNEY) VALUES ("
				+ "%s,%s,%s,%s,%s,%s,%s,%d)"
				,member.getId(),member.getPwd(),member.getName(),member.getGender(),
				member.getBirthday(),member.getPhone(),member.getRegdate(),member.getEmail(),member.getJry_id());
		
		int result = 0;
		
		try {
			connect();

			result = stmt.executeUpdate(sql);

			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				disconnect();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		return result;
	}

	@Override
	public int updateMember(Member member) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteMember(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

}
