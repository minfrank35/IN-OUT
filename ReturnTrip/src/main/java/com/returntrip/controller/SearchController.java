package com.returntrip.controller;

import java.io.IOException;
import java.net.URLEncoder;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.returntrip.entity.Journey;
import com.returntrip.service.JourneyService;
import com.returntrip.service.MemberService;

public class SearchController implements Controller {


	@Override
	public String handleRequest(HttpServletRequest request, HttpServletResponse response, MemberService memService,
			JourneyService journeyService) {
		String viewName = null;
		String method = request.getMethod().toUpperCase();
		
		if(method.equals("GET")) {
			String category = request.getParameter("category");
			try {
				response.setCharacterEncoding("utf-8");
				response.getWriter().write(listToJson(journeyService.getSearchDatas(category)));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			viewName = "ajax";
		}
		return viewName;
	}
	
	private String listToJson(List<String> list) {
		StringBuilder sb = new StringBuilder("");
		sb.append("{\"result\" : [");
		for(int i = 0; i<list.size(); i++) {
			sb.append("\""+list.get(i) + "\"" + ", ") ;
		}
		sb.deleteCharAt(sb.lastIndexOf(", "));
		sb.append("]}");
		return sb.toString();
	}

}
