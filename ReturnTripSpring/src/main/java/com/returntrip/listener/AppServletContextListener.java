package com.returntrip.listener;

import javax.servlet.ServletContext;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import org.apache.catalina.mapper.Mapper;

import com.returntrip.controller.HandlerMapping;
import com.returntrip.dao.JourneyDao;
import com.returntrip.dao.JourneyJdbcDao;
import com.returntrip.dao.MemberDao;
import com.returntrip.dao.MemberJdbcDao;
import com.returntrip.service.JourneyService;
import com.returntrip.service.JourneyServiceImpl;
import com.returntrip.service.MemberService;
import com.returntrip.service.MemberServiceImpl;
import com.returntrip.webcrawl.WeatherCrawl;
import com.returntrip.webcrawl.WeatherNaverCrawl;

public class AppServletContextListener implements ServletContextListener {

	@Override
	public void contextInitialized(ServletContextEvent sce) {
		// TODO Auto-generated method stub
		ServletContextListener.super.contextInitialized(sce);
		
		ServletContext context = sce.getServletContext();
		String driver = context.getInitParameter("jdbc_driver");
		String url = context.getInitParameter("db_url");
		String userName = context.getInitParameter("db_userid");
		String password = context.getInitParameter("db_passwd");
		
		WeatherCrawl naverWeather = new WeatherNaverCrawl();
		MemberDao memberDao = new MemberJdbcDao(driver, url, userName, password);
		JourneyDao journeyDao = new JourneyJdbcDao(driver, url, userName, password);
		JourneyService journeyService = new JourneyServiceImpl(journeyDao, naverWeather);
		MemberService memberService = new MemberServiceImpl(memberDao);
		
		context.setAttribute("member_service", memberService);
		context.setAttribute("journey_service", journeyService);
		HandlerMapping mapper = new HandlerMapping();
		context.setAttribute("mapper", mapper);
	}
	
}
