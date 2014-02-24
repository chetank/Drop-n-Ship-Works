package com.dreamproject.controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.validation.BindException;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.SimpleFormController;

import com.dreamproject.command.TravelPostDetailsCommand;

import dbclient.MongoDBClient;


public class HomeController extends SimpleFormController {
	
	public HomeController() {
        setCommandClass(TravelPostDetailsCommand.class);
        setCommandName("travelPostDetails");
    }
	
	@Override
	public ModelAndView handleRequest(HttpServletRequest arg0,
			HttpServletResponse arg1) throws Exception {

		ModelAndView modelAndView = new ModelAndView("baseLayout", "travelPostDetails" , new TravelPostDetailsCommand());
        return modelAndView;
	}
	
	protected ModelAndView onSubmit(Object command,BindException exception) throws Exception {
    	TravelPostDetailsCommand travelPostDetails = (TravelPostDetailsCommand) command;
    	
    	MongoDBClient mdb = new MongoDBClient();
    	mdb.insertData(travelPostDetails);
    	
        return new ModelAndView("travel-post-form-success","travelPostDetails",travelPostDetails);
    }
}
