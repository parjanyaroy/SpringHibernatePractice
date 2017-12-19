package com.javatpoint;

public class Employee {
	
	int id;
	String name;
	Address address;
	
	Employee()
	{
		System.out.println("Default Constructor");
	}
	
	Employee(int id)
	{
		System.out.println("ID Constructor");
		this.id=id;
	}
	
	Employee(String name)
	{
		System.out.println("Name Constructor");
		this.name=name;
	}

	public Employee(int id, String name,Address address) {
		super();
		this.id = id;
		this.name = name;
		this.address=address;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", address=" + address.toString() + "]";
	}

	
	
	
	
	

}
