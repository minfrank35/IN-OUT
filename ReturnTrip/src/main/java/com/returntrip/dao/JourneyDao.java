package com.returntrip.dao;

import com.returntrip.entity.Journey;
import com.returntrip.entity.WeatherDO;

public interface JourneyDao {
	
	Journey getJourneyData(String roadBaseAddr);
	
	int insertJourney(Journey journey);
	
	int insertJourneyFromWeb(String xml);
	
	int updateJourney(Journey journey);
	
	int deleteJourney(String roadBaseAddr);

}
