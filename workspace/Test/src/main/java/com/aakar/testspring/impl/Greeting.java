package com.aakar.testspring.impl;

public class Greeting {
	private String greeting;
	private String name;
	
	public Greeting (String greeting,String name){
		this.greeting=greeting;
		this.name=name;
	}

	public String getGreeting() {
		return greeting;
	}

	public String getName() {
		return name;
	}
}
