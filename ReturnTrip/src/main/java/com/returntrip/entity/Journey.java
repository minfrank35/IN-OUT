package com.returntrip.entity;

import java.sql.Timestamp;
import java.util.Date;

public class Journey {
	private String journeyName;
	private String organizerName;
	private boolean parking;
	private String road_base_addr;
	private int zipCode;
	private String Nomination;
	private String phone;
	private Timestamp eventStr;
	private Timestamp eventFin;
	private Date Dayoff;
	private int visit;
	private int hit;
	
	public Journey() {
		
	}
	
	public Journey(String journeyName, String organizerName, boolean parking, String road_base_addr, int zipCode,
			String nomination, String phone, Timestamp eventStr, Timestamp eventFin) {
		super();
		this.journeyName = journeyName;
		this.organizerName = organizerName;
		this.parking = parking;
		this.road_base_addr = road_base_addr;
		this.zipCode = zipCode;
		Nomination = nomination;
		this.phone = phone;
		this.eventStr = eventStr;
		this.eventFin = eventFin;
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
	public boolean isParking() {
		return parking;
	}
	public void setParking(boolean parking) {
		this.parking = parking;
	}
	public String getRoad_base_addr() {
		return road_base_addr;
	}
	public void setRoad_base_addr(String road_base_addr) {
		this.road_base_addr = road_base_addr;
	}
	public int getZipCode() {
		return zipCode;
	}
	public void setZipCode(int zipCode) {
		this.zipCode = zipCode;
	}
	public String getNomination() {
		return Nomination;
	}
	public void setNomination(String nomination) {
		Nomination = nomination;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public Timestamp getEventStr() {
		return eventStr;
	}
	public void setEventStr(Timestamp eventStr) {
		this.eventStr = eventStr;
	}
	public Timestamp getEventFin() {
		return eventFin;
	}
	public void setEventFin(Timestamp eventFin) {
		this.eventFin = eventFin;
	}
	public Date getDayoff() {
		return Dayoff;
	}
	public void setDayoff(Date dayoff) {
		Dayoff = dayoff;
	}
	
	@Override
	public String toString() {
		return "Journey [journeyName=" + journeyName + ", organizerName=" + organizerName + ", parking=" + parking
				+ ", road_base_addr=" + road_base_addr + ", zipCode=" + zipCode + ", Nomination=" + Nomination
				+ ", phone=" + phone + ", eventStr=" + eventStr + ", eventFin=" + eventFin + ", Dayoff=" + Dayoff + "]";
	}
	
	
	
	
	
}
