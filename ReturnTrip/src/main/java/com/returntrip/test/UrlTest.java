package com.returntrip.test;

import java.io.IOException;

import com.returntrip.entity.WeatherDO;
import com.returntrip.webcrawl.WeatherCrawl;
import com.returntrip.webcrawl.WeatherNaverCrawl;

public class UrlTest {
	public static void main(String[] args) throws IOException {
		WeatherCrawl wb = new WeatherNaverCrawl();
		WeatherDO weatherdo = wb.getWeatherData("장유");
		
		
	}
}
