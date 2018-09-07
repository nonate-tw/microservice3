package com.microservices3.models;

public class GreetingAndTime {

	private String greeting;
	private String time;
	
	public GreetingAndTime(String greeting, String time) {
		this.greeting = greeting;
		this.time = time;
	}
	
	public String getGreeting() {
		return greeting;
	}
	
	public String getTime() {
		return time;
	}
}
