package com.javatpoint.setterinjection;

import java.util.Map;

public class OfficeEmployee {
	
	int employeeId;
	String employeeName;
	Map<Integer,EmployeeAddress> addressMap;
	
	
	void displayEmployee()
	{
		System.out.println("Emp id:"+employeeId);
		System.out.println("Emp name:"+employeeName);
		
		addressMap.forEach((k,v)->System.out.println(k+" "+v.displayAddress()));
	}


	public int getEmployeeId() {
		return employeeId;
	}


	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}


	public String getEmployeeName() {
		return employeeName;
	}


	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}


	public Map<Integer, EmployeeAddress> getAddressMap() {
		return addressMap;
	}


	public void setAddressMap(Map<Integer, EmployeeAddress> addressMap) {
		this.addressMap = addressMap;
	}


	public OfficeEmployee(int employeeId, String employeeName, Map<Integer, EmployeeAddress> addressMap) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.addressMap = addressMap;
	}


	public OfficeEmployee() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
