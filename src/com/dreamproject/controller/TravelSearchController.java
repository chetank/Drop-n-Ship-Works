package com.dreamproject.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.validation.BindException;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import com.dreamproject.command.TravelPostDetailsCommand;

import dbclient.MongoDBClient;

public class TravelSearchController extends HomeController {
	
	public ModelAndView handleRequest(HttpServletRequest request,
            HttpServletResponse response) throws Exception {
  
        MongoDBClient mdb = new MongoDBClient();
        mdb.getListOfTravels();
        
        ModelAndView modelAndView = new ModelAndView("travel-search-form-view");
        //modelAndView.addObject("travelsList", travelsList);
        
        return modelAndView;
    }
	
	protected ModelAndView onSubmit(Object command,BindException exception) throws Exception {
    	TravelPostDetailsCommand travelPostDetails = (TravelPostDetailsCommand) command;
    	
    	//submit form details into database
    	
    	MongoDBClient mdb = new MongoDBClient();
    	mdb.insertData(travelPostDetails);
        return new ModelAndView("travel-post-form-success","travelPostDetails",travelPostDetails);
    }

}
