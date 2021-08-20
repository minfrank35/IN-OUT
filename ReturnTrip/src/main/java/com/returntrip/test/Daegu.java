package com.returntrip.test;

import java.util.List;

import com.returntrip.data.TourDaeguData;
import com.returntrip.data.TourData;
import com.returntrip.entity.Journey;

public class Daegu {
	public static void main(String[] args) {
		TourData td = new TourDaeguData();
		List<Journey> list = td.getTourData(223);
		
		System.out.println(list);
	}
}
