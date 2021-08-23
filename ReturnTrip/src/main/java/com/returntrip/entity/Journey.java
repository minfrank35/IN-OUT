package com.returntrip.entity;

import java.sql.Timestamp;
import java.util.Date;

public class Journey {
	private String journeyName;
	private String organizerName;
	private String parking;
	private String road_base_addr;
	private String nomination;
	private String phone;
	private String term;
	private int visit;
	private int hit;
	private WeatherDO weatherDO;
	private String content;
	private String homepage;
	private String fee;
	private String[] hashtag;
	private String[] img;

	public Journey() {
		
	}
	
	public String[] getHashtag() {
		return hashtag;
	}

	public void setHashtag(String[] hashtag) {
		this.hashtag = hashtag;
	}

	public String[] getImg() {
		return img;
	}

	public void setImg(String[] img) {
		this.img = img;
	}

	public String getFee() {
		return fee;
	}

	public void setFee(String fee) {
		this.fee = fee;
	}

	public String getHomepage() {
		return homepage;
	}

	public void setHomepage(String homepage) {
		this.homepage = homepage;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	
	public WeatherDO getWeatherDO() {
		return weatherDO;
	}

	public void setWeatherDO(WeatherDO weatherDO) {
		this.weatherDO = weatherDO;
	}
	
	public int getVisit() {
		return visit;
	}

	public void setVisit(int visit) {
		this.visit = visit;
	}

	public int getHit() {
		return hit;
	}

	public void setHit(int hit) {
		this.hit = hit;
	}

	public String getJourneyName() {
		return journeyName;
	}
	public void setJourneyName(String journeyName) {
		this.journeyName = journeyName;
	}
	public String getOrganizerName() {
		return organizerName;
	}
	public void setOrganizerName(String organizerName) {
		this.organizerName = organizerName;
	}
	
	public String getParking() {
		return parking;
	}

	public void setParking(String parking) {
		this.parking = parking;
	}

	public String getRoad_base_addr() {
		return road_base_addr;
	}
	public void setRoad_base_addr(String road_base_addr) {
		this.road_base_addr = road_base_addr;
	}
	
	public String getNomination() {
		return nomination;
	}
	public void setNomination(String nomination) {
		this.nomination = nomination;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	public String getTerm() {
		return term;
	}

	public void setTerm(String term) {
		this.term = term;
	}

	
	
	
	
	
	
}
