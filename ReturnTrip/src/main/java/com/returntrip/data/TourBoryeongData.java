package com.returntrip.data;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import com.returntrip.entity.Journey;

public class TourBoryeongData implements TourData {

	@Override
	public List<Journey> getTourData(int numOfRows) {
		// TODO Auto-generated method stub
		StringBuilder urlBuilder = new StringBuilder("http://apis.data.go.kr/4510000/GetTourService/getTourInfo"); /*URL*/
		
		String serviceKey = "sG%2FbwhrvSezHoVlzMv8sN9VKWRClopAR0euUWZ%2Fa1VKVNJrTQIUseLasDXz7XvhIo2Ci7LrOFvj4%2FwNL6Q23Vg%3D%3D";
		Journey journey = null;
		List<Journey> list = new ArrayList<Journey>();
		try {
			urlBuilder.append("?" + URLEncoder.encode("ServiceKey","UTF-8") + "=" + serviceKey); /*Service Key*/
	        urlBuilder.append("&" + URLEncoder.encode("pageIndex","UTF-8") + "=" + URLEncoder.encode(Integer.toString(numOfRows), "UTF-8")); /*한 페이지 결과 수*/
	        urlBuilder.append("&" + URLEncoder.encode("firstIndex","UTF-8") + "=" + URLEncoder.encode("1", "UTF-8")); /*페이지 번호*/
	        urlBuilder.append("&" + URLEncoder.encode("dataType","UTF-8") + "=" + URLEncoder.encode("XML", "UTF-8")); /*요청자료형식(XML/JSON) Default : XML*/
	        urlBuilder.append("&" + URLEncoder.encode("themecode","UTF-8") + "=" + URLEncoder.encode("1064", "UTF-8")); /*1064 : 섬 1065 : 해수욕장 1066 : 항구 1067 : 산/계곡 1068 : 호수 1069 : 축제 1070 : 체험/마을 1071 : 휴양/공원 1072 : 박물관 1073 : 보물/사적 1074 : 천연기념물 1075 : 유/무형문화재 1076 : 기념물/민속자료 1077 : 문화재자료*/
	        URL url = new URL(urlBuilder.toString());
	        
	        
	        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
	        conn.setRequestMethod("GET");
	        conn.setRequestProperty("Content-type", "application/json");	        
	        System.out.println("Response code: " + conn.getResponseCode());
	        BufferedReader rd;
	        if(conn.getResponseCode() >= 200 && conn.getResponseCode() <= 300) {
	            rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
	        } else {
	            rd = new BufferedReader(new InputStreamReader(conn.getErrorStream()));
	        }
	        rd.close();
	        conn.disconnect();
	        
	        JSONParser jsonParser = new JSONParser();
	        JSONObject jsonObject = (JSONObject) jsonParser.parse(rd);
	        
	        for(int i = 0; i < 10; i ++) {
		        journey.setRoad_base_addr((String)jsonObject.get("locationaddr"));
		        journey.setContent((String)jsonObject.get("contents"));
		        journey.setJourneyName((String)jsonObject.get("tourtile"));
		        list.add(journey);
	        }
	        
	        
	        
	        } catch (IOException | ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} /*Service Key*/
       		return list;
	}

}
