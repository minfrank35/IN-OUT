package com.returntrip.webcrawl;

import com.returntrip.entity.WeatherDO;

public interface WeatherCrawl {
	WeatherDO getWeatherData(String location);
}
