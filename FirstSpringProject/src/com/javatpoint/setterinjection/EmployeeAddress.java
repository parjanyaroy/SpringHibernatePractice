package com.javatpoint.setterinjection;

import java.util.List;

public class EmployeeAddress {
	
	int id;
	String city;
	String state;
	List<Integer> locationCodes;
	
	public EmployeeAddress(int id, String city, String state,List<Integer> locationCodes) {
		super();
		this.id = id;
		this.city = city;
		this.state = state;
		this.locationCodes=locationCodes;
	}

	public String displayAddress() {
		String str=" id:"+id+"city"+city+" state"+state;
		for(Integer l : locationCodes)
		str=str+" "+l+" ";
		return str;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public List<Integer> getLocationCodes() {
		return locationCodes;
	}

	public void setLocationCodes(List<Integer> locationCodes) {
		this.locationCodes = locationCodes;
	}

	public EmployeeAddress() {
		super();
	}

	
	
	
	
	
	

}
