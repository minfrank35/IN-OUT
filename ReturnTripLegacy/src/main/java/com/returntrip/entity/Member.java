package com.returntrip.entity;

import java.util.Date;

public class Member {
	private String id;
	private String pwd;
	private String name;
	private String gender;
	private Date birthday;
	private String phone;
	private String regdate;
	private String email;
	private String wishJourney;
	
	
	
	public Member() {}
	
	public Member(String id, String pwd, String name, String gender, Date birthday, String phone, String regdate,
			String email) {
		this.id = id;
		this.pwd = pwd;
		this.name = name;
		this.gender = gender;
		this.birthday = birthday;
		this.phone = phone;
		this.regdate = regdate;
		this.email = email;
	}


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


	public String getRegdate() {
		return regdate;
	}


	public void setRegdate(String regdate) {
		this.regdate = regdate;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getWishJourney() {
		return wishJourney;
	}


	public void setWishJourney(String wishJourney) {
		this.wishJourney = wishJourney;
	}


	@Override
	public String toString() {
		return "Member [id=" + id + ", pwd=" + pwd + ", name=" + name + ", gender=" + gender + ", birthday=" + birthday
				+ ", phone=" + phone + ", regdate=" + regdate + ", email=" + email + ", wishJourney=" + wishJourney
				+ "]";
	}
	
	
	
}
