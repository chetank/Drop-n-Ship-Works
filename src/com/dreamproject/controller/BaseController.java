package com.dreamproject.controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.validation.BindException;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.SimpleFormController;

import com.dreamproject.command.TravelPostDetailsCommand;

import dbclient.MongoDBClient;


public class BaseController extends SimpleFormController {
	
	public BaseController() {
        setCommandClass(TravelPostDetailsCommand.class);
        setCommandName("travelPostDetails");
    }

	
	protected ModelAndView onSubmit(Object command,BindException exception) throws Exception {
    	TravelPostDetailsCommand travelPostDetails = (TravelPostDetailsCommand) command;
    	
    	MongoDBClient mdb = new MongoDBClient();
    	mdb.insertData(travelPostDetails);
    	
        return new ModelAndView("baseLayout","travelPostDetails",travelPostDetails);
    }
}
