package com.returntrip.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.returntrip.service.JourneyService;
import com.returntrip.service.MemberService;

public class LoginController implements Controller {

	@Override
	public String handleRequest(HttpServletRequest request, HttpServletResponse response, MemberService memberService, JourneyService journeyService) {
		// TODO Auto-generated method stub
		return "login.jsp";
	}

}
