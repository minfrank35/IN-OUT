package com.returntrip.webcrawl;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import com.returntrip.entity.WeatherDO;

public class WeatherNaverCrawl implements WeatherCrawl{
	@Override
	public WeatherDO getWeatherData(String location) {
		// TODO Auto-generated method stub
		WeatherDO weatherDO = null;
		Document doc;
		List<String> list;
		
		String url = "https://weather.naver.com/today/" + location;
		try {
			
			doc = Jsoup.connect(url).get();
			weatherDO = new WeatherDO();
			list = new ArrayList<String>();
			
			Elements els = doc.select("div.ttl_area");
			
			for(Element el : els.select("em")) {
				list.add(el.text());
			}
			
			weatherDO.setFine_dust(list.get(0));
			weatherDO.setUltra_fine_dust(list.get(1));
			weatherDO.setUltraviolet_ray(list.get(2));
			weatherDO.setSunset_time(list.get(3));
			

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return weatherDO;

		
	}

}
