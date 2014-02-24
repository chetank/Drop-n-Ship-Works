package com.dreamproject.command;

public class TravelPostDetailsCommand {
	String name;
	String goingFrom;
	String goingTo;
	String message;
	String date;
	

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getGoingFrom() {
		return goingFrom;
	}

	public void setGoingFrom(String goingFrom) {
		this.goingFrom = goingFrom;
	}

	public String getGoingTo() {
		return goingTo;
	}

	public void setGoingTo(String goingTo) {
		this.goingTo = goingTo;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
