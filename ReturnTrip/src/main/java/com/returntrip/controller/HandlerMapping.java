package com.returntrip.controller;

import java.util.HashMap;
import java.util.Map;

public class HandlerMapping {
	private Map<String, Controller> handlerMapper = null;
	
	public HandlerMapping() {
		handlerMapper = new HashMap<String, Controller>();
		
		handlerMapper.put("/home", new HomeController());
		handlerMapper.put("/login", new LoginController());
		handlerMapper.put("/join", new JoinController());

	}
	
	public Controller getHandler(String path) {
		return handlerMapper.get(path);
	}
}