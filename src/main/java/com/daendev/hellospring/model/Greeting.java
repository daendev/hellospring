package com.daendev.hellospring.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Table
@Entity
public class Greeting {

	@Id
	@GeneratedValue
	private Integer id;
	private String greeting;
	private String address;
	
	public Greeting() {}
	
	public Greeting(Integer id, String greeting, String address) {
		super();
		this.id = id;
		this.greeting = greeting;
		this.address = address;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
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
