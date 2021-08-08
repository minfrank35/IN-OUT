package com.returntrip.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.returntrip.service.JourneyService;
import com.returntrip.service.MemberService;

public interface Controller {
	
	String handleRequest(HttpServletRequest request, HttpServletResponse response, MemberService memberService, JourneyService journeyService);
	
}
