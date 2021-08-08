package com.returntrip.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.returntrip.service.JourneyService;
import com.returntrip.service.MemberService;

public class JourneyController implements Controller {


	@Override
	public String handleRequest(HttpServletRequest request, HttpServletResponse response, MemberService memService,
			JourneyService journeyService) {
		String viewName = null;
		String method = request.getMethod().toUpperCase();
		
		if(method.equals("GET")) {
			String place = request.getParameter("place");
			
			journeyService.getJourneyData(place);
		}
		return null;
	}

}
