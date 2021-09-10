package com.returntrip.data;

import java.util.List;

import com.returntrip.entity.Journey;

public interface TourData {
	
	List<Journey> getTourData(int numOfRows);
}
