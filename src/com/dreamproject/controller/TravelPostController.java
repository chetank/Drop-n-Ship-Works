package com.dreamproject.controller;

import org.springframework.validation.BindException;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.SimpleFormController;

import com.dreamproject.command.TravelPostDetailsCommand;

import dbclient.MongoDBClient;

public class TravelPostController extends HomeController {
	
	public TravelPostController() {
        setCommandClass(TravelPostDetailsCommand.class);
        setCommandName("travelPostDetails");
    }
	
    protected ModelAndView onSubmit(Object command,BindException exception) throws Exception {
    	TravelPostDetailsCommand travelPostDetails = (TravelPostDetailsCommand) command;
    	
    	//submit form details into database
    	
    	MongoDBClient mdb = new MongoDBClient();
    	mdb.insertData(travelPostDetails);
        return new ModelAndView("travel-post-form-success","travelPostDetails",travelPostDetails);
    }
}
