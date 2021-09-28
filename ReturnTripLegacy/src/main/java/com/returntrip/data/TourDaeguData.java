package com.returntrip.data;

import java.io.IOException;

import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import com.returntrip.entity.Journey;

public class TourDaeguData implements TourData {

	@Override
	public List<Journey> getTourData(int numOfRows) {
		// TODO Auto-generated method stub
		StringBuilder urlBuilder = new StringBuilder("http://apis.data.go.kr/6270000/getTourKorAttract/getTourKorAttractList"); /*URL*/
      
		String serviceKey = "sG%2FbwhrvSezHoVlzMv8sN9VKWRClopAR0euUWZ%2Fa1VKVNJrTQIUseLasDXz7XvhIo2Ci7LrOFvj4%2FwNL6Q23Vg%3D%3D";
		Journey journey = null;
		List<Journey> list = new ArrayList<Journey>();
		try {
			urlBuilder.append("?" + URLEncoder.encode("ServiceKey","UTF-8") + "=" + serviceKey);
	        urlBuilder.append("&" + URLEncoder.encode("pageNo","UTF-8") + "=" + URLEncoder.encode("1", "UTF-8")); /*페이지번호*/
	        urlBuilder.append("&" + URLEncoder.encode("numOfRows","UTF-8") + "=" + URLEncoder.encode(Integer.toString(numOfRows), "UTF-8")); /*한 페이지 결과 수*/
	        URL url = new URL(urlBuilder.toString());
	        
	        
	        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
	        conn.setRequestMethod("GET");
	        conn.setRequestProperty("Content-type", "application/json");	        
	        String surl = conn.getHeaderField("Location");
	        
        	Document doc = Jsoup.connect(surl).get();
	        Elements els = doc.select("item");
	        
	        for(int i = 0 ; i < numOfRows; i++) {
	        	journey = new Journey();
	        	journey.setJourneyName(els.select("attractname").get(i).text());
	        	for(int j = 0; j < 5; j ++) {
	        		String temp = els.select("attr0" + Integer.toString(j+1)).get(i).text();
	        		
	        	}
	        	journey.setContent(els.select("attractcontents").get(i).text());
	        	journey.setRoad_base_addr(els.select("address").get(i).text());
	        	journey.setHomepage(els.select("homepage").get(i).text());
	        	String temp = els.select("tel").get(i).text();
	        	if(temp.length() > 15) {
	        		temp.substring(0,14);
	        	}
	        	
	        	// temp.substring(0,14);
	        	//temp.substring(1);
	        	journey.setPhone(temp);
	        	list.add(journey);
	        }
	       
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} /*Service Key*/
       		return list;
	}

}
