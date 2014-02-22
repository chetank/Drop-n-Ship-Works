package com.dreamproject.home;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import dbclient.MongoDBClient;


public class HomeController implements Controller {
	@Override
	public ModelAndView handleRequest(HttpServletRequest arg0,
			HttpServletResponse arg1) throws Exception {

		MongoDBClient obj = new MongoDBClient();
		
		ModelAndView modelAndView = new ModelAndView("baseLayout");
        
        return modelAndView;
	}
}
