package com.javatpoint;

import java.util.List;

public class Address {
	
	int id;
	String city;
	String state;
	List<Integer> locationCodes;
	
	public Address(int id, String city, String state,List<Integer> locationCodes) {
		super();
		this.id = id;
		this.city = city;
		this.state = state;
		this.locationCodes=locationCodes;
	}

	@Override
	public String toString() {
		return "Address [id=" + id + ", city=" + city + ", state=" + state +", location codes "+
										locationCodes.toString()+"]";
	}
	
	
	
	
	

}
