package com.dreamproject.validator;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.dreamproject.command.TravelPostDetailsCommand;

public class TravelPostValidator implements Validator {
	public boolean supports (@SuppressWarnings("rawtypes") Class clazz) {
		return clazz.equals(TravelPostDetailsCommand.class);
	}

	@Override
	public void validate(Object arg0, Errors arg1) {
		// TODO Auto-generated method stub
		ValidationUtils.rejectIfEmpty(arg1, "name", "required.state", "Please enter name");
		ValidationUtils.rejectIfEmpty(arg1, "goingFrom", "required.state", "Please enter starting location of your travel");
		ValidationUtils.rejectIfEmpty(arg1, "goingTo", "required.state", "Please enter destination of your travel");
		ValidationUtils.rejectIfEmpty(arg1, "message", "required.state", "Please enter a message for sender");
		
	}

}
