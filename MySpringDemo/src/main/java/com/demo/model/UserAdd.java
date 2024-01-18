package com.demo.model;

public class UserAdd {
	private String city;
	private String state;
	public UserAdd() {
		super();
	}
	
	public UserAdd(String city, String state) {
		super();
		this.city = city;
		this.state = state;
	}
	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	@Override
	public String toString() {
		return "UserAdd [city=" + city + ", state=" + state + "]";
	}
}
