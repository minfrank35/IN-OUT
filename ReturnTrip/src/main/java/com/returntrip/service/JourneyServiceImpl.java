package com.returntrip.service;

import java.util.List;

import com.returntrip.dao.JourneyDao;
import com.returntrip.entity.Journey;
import com.returntrip.webcrawl.WeatherCrawl;

public class JourneyServiceImpl implements JourneyService {
	private JourneyDao journeyDao;
	private WeatherCrawl naverWeather;
	
	
	public JourneyServiceImpl(JourneyDao journeyDao,WeatherCrawl naverWeather) {
		super();
		this.journeyDao = journeyDao;
		this.naverWeather = naverWeather;
	}
	

	@Override
	public List<Journey> getJourneyDatas(String place) {
		// TODO Auto-generated method stub
		List<Journey> list = journeyDao.getJourneyDatas(place);
		
		for(int i = 0; i < 10; i++) {
			list.get(i).setWeatherDO(naverWeather.getWeatherData(place));
		}
		
		return list;
	}
	
	@Override
	public Journey getJourneyData(String place) {
		// TODO Auto-generated method stub
		Journey journey = journeyDao.getJourneyData(place);

		journey.setWeatherDO(naverWeather.getWeatherData(place));
		return journey ;
	}

	@Override
	public int insertJourney(Journey journey) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateJourney(Journey journey) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteJourney(String roadBaseAddr) {
		// TODO Auto-generated method stub
		return 0;
	}


	

}
