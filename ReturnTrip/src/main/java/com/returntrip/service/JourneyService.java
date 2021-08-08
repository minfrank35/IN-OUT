package com.returntrip.service;

import com.returntrip.entity.Journey;

public interface JourneyService {
	
	Journey getJourneyData(String roadBaseAddr);
	
	int insertJourney(Journey journey);
	
	int updateJourney(Journey journey);
	
	int deleteJourney(String roadBaseAddr);
}
