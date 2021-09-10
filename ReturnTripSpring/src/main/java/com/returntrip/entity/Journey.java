package com.returntrip.entity;

import java.sql.Timestamp;
import java.util.Arrays;
import java.util.Date;

public class Journey {
	private String journeyName;
	private String cityName;
	private String parking;
	private String road_base_addr;
	private String nomination;
	private String phone;
	private String term;
	private String latitude;
	private String longtitude;
	
	private WeatherDO weatherDO;
	private String content;
	private String homepage;
	private String fee;
	private String[] hashtag;
	private String[] img;
	private String[] category;
	private int visit;
	private int hit;


	public Journey() {
		
	}

	

	public String getJourneyName() {
		return journeyName;
	}



	public void setJourneyName(String journeyName) {
		this.journeyName = journeyName;
	}



	public String getCityName() {
		return cityName;
	}



	public void setCityName(String cityName) {
		this.cityName = cityName;
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



	public String getLatitude() {
		return latitude;
	}



	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}



	public String getLongtitude() {
		return longtitude;
	}



	public void setLongtitude(String longtitude) {
		this.longtitude = longtitude;
	}



	public WeatherDO getWeatherDO() {
		return weatherDO;
	}



	public void setWeatherDO(WeatherDO weatherDO) {
		this.weatherDO = weatherDO;
	}



	public String getContent() {
		return content;
	}



	public void setContent(String content) {
		this.content = content;
	}



	public String getHomepage() {
		return homepage;
	}



	public void setHomepage(String homepage) {
		this.homepage = homepage;
	}



	public String getFee() {
		return fee;
	}



	public void setFee(String fee) {
		this.fee = fee;
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



	public String[] getCategory() {
		return category;
	}



	public void setCategory(String[] category) {
		this.category = category;
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



	@Override
	public String toString() {
		return "Journey [journeyName=" + journeyName + ", cityName=" + cityName + ", parking=" + parking
				+ ", road_base_addr=" + road_base_addr + ", nomination=" + nomination + ", phone=" + phone + ", term="
				+ term + ", latitude=" + latitude + ", longtitude=" + longtitude + ", weatherDO=" + weatherDO
				+ ", content=" + content + ", homepage=" + homepage + ", fee=" + fee + ", hashtag="
				+ Arrays.toString(hashtag) + ", img=" + Arrays.toString(img) + ", category=" + Arrays.toString(category)
				+ ", visit=" + visit + ", hit=" + hit + "]";
	}
	
	
	
}
