package com.daendev.hellospring.model;

public class Greeting {

	private int id;
	private String greeting;
	private String address;
	
	public Greeting(int id, String greeting, String address) {
		super();
		this.id = id;
		this.greeting = greeting;
		this.address = address;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getGreeting() {
		return greeting;
	}

	public void setGreeting(String greeting) {
		this.greeting = greeting;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
}
