package com.javatpoint.autowiringannotations;



import java.util.Map;

public class AutoWiredOfficeEmployee {
	
	int employeeId;
	String employeeName;
	@AutoWired
	AutoWiredEmployeeAddress addressMap;
	
	
	void displayEmployee()
	{
		System.out.println("Emp id:"+employeeId);
		System.out.println("Emp name:"+employeeName);
		System.out.println(addressMap.displayAddress());
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


	public Map<Integer, AutoWiredEmployeeAddress> getAddressMap() {
		return addressMap;
	}


	public void setAddressMap(Map<Integer, AutoWiredEmployeeAddress> addressMap) {
		this.addressMap = addressMap;
	}


	public AutoWiredOfficeEmployee(int employeeId, String employeeName, Map<Integer, AutoWiredEmployeeAddress> addressMap) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.addressMap = addressMap;
	}


	public AutoWiredOfficeEmployee() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
