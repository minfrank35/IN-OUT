package com.returntrip.test;

import java.io.IOException;
import java.util.List;

import com.returntrip.dao.JourneyDao;
import com.returntrip.dao.JourneyJdbcDao;
import com.returntrip.data.TourDaeguData;
import com.returntrip.data.TourData;
import com.returntrip.entity.Journey;

public class UrlTest {
	public static void main(String[] args) {
		
		/*
		 * TourData td = new TourDaeguData(); List<Journey> list = td.getTourData(223);
		 * 
		 * System.out.println(list.size()); for(int i = 0 ; i < list.size(); i++) {
		 * Journey journey = list.get(i); JourneyDao jdao = new
		 * JourneyJdbcDao("oracle.jdbc.driver.OracleDriver",
		 * "jdbc:oracle:thin:@localhost:1521/xepdb1","INOUT","oradb");
		 * jdao.initializeJourney(journey); }
		 */
		JourneyDao jdao = new JourneyJdbcDao("oracle.jdbc.driver.OracleDriver",	"jdbc:oracle:thin:@localhost:1521/xepdb1","INOUT","oradb");
		TourData td = new TourDaeguData(); List<Journey> list = td.getTourData(65);
		for(int i = 0 ; i < list.size(); i++) { 
		Journey journey = list.get(i);
		jdao.initializeJourney(journey);
		}
//		 TourData td = new TourDaeguData();
//		 List<Journey> list = td.getTourData(10);
//		 
//		 System.out.println(list.get(0).getJourneyName());
	}
}
