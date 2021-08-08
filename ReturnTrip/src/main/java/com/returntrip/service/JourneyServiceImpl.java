package com.returntrip.service;

import com.returntrip.dao.JourneyDao;
import com.returntrip.entity.Journey;

public class JourneyServiceImpl implements JourneyService {
	private JourneyDao journeyDao;
	
	
	public JourneyServiceImpl(JourneyDao journeyDao) {
		super();
		this.journeyDao = journeyDao;
	}
	

	@Override
	public Journey getJourneyData(String roadBaseAddr) {
		// TODO Auto-generated method stub
		return journeyDao.getJourneyData(roadBaseAddr);
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
