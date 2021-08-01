package com.journey.entity;

import java.util.Date;

public class Member {
	private String id;
	private String pwd;
	private String name;
	private String gender;
	private Date birthday;
	private String phone;
	private Date regdate;
	private String email;
	private int jry_id;
	
	
	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getPwd() {
		return pwd;
	}


	public void setPwd(String pwd) {
		this.pwd = pwd;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getGender() {
		return gender;
	}


	public void setGender(String gender) {
		this.gender = gender;
	}


	public Date getBirthday() {
		return birthday;
	}


	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}


	public String getPhone() {
		return phone;
	}


	public void setPhone(String phone) {
		this.phone = phone;
	}


	public Date getRegdate() {
		return regdate;
	}


	public void setRegdate(Date regdate) {
		this.regdate = regdate;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public int getJry_id() {
		return jry_id;
	}


	public void setJry_id(int jry_id) {
		this.jry_id = jry_id;
	}


	@Override
	public String toString() {
		return "Member [id=" + id + ", pwd=" + pwd + ", name=" + name + ", gender=" + gender + ", birthday=" + birthday
				+ ", phone=" + phone + ", regdate=" + regdate + ", email=" + email + ", jry_id=" + jry_id + "]";
	}
	
	
	
	
}
